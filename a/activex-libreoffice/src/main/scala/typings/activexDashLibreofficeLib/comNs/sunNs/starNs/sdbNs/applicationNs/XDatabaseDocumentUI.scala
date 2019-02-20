package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.applicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the user interface of a database document
  *
  * This interface is available when a database document has been loaded into a frame, at the controller of this frame.
  * @see com.sun.star.frame.Controller
  * @see com.sun.star.sdb.DatabaseDocument
  * @since OOo 2.2
  */
trait XDatabaseDocumentUI extends js.Object {
  /**
    * provides access to the current connection of the application
    *
    * Note that the connection returned here is really the working connection of the application. Clients should not misuse it, in particular, closing the
    * connection can yield unexpected results and should definitely be avoided. If you need a separate connection to the data source, use {@link
    * com.sun.star.sdbc.XDataSource.getConnection()} .
    */
  var ActiveConnection: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection
  /**
    * provides access to the application's main window
    *
    * Note that reading this attribute is equivalent to querying the component for the {@link com.sun.star.frame.XController} interface, asking the
    * controller for its frame, and asking this frame for its container window.
    * @see com.sun.star.frame.XController
    * @see com.sun.star.frame.XFrame
    */
  var ApplicationMainWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
  /** provides access to the data source belong to the database document */
  var DataSource: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XDataSource
  /**
    * contains all sub components of the database document
    *
    * During working with the database, the user might open different sub components: forms, reports, tables, queries. Those components are tracked by the
    * application, and provided in this attribute.
    *
    * The components here might either be documents ( {@link com.sun.star.frame.XModel} ), controllers ( {@link com.sun.star.frame.XController} ), or frames
    * ( {@link com.sun.star.frame.XFrame} ).
    * @since OOo 3.0
    */
  var SubComponents: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent]
  /**
    * closes all sub components of the database document.
    *
    * During working with the database, the user might open different sub components: forms, reports, tables, queries. If you need to close all those
    * documents, use `closeSubComponents` , which will gracefully do this.
    *
    * In a first step, the sub components will be suspended ( {@link com.sun.star.frame.XController.suspend()} ). There are basically two reasons why
    * suspending a single sub component can fail: The user might veto it (she's asked if the document is currently modified), and the component might be
    * uncloseable currently, e.g. due to an open modal dialog, or a long-lasting operation running currently (e.g. printing).
    *
    * Once all sub components have been suspended, they will, in a second step, be closed. Again, closing might be vetoed by other instances, e.g. by a
    * close listener registered at the component.
    * @returns `TRUE` if and only if both suspending and closing all sub components succeeds.
    * @since OOo 3.0
    */
  def closeSubComponents(): scala.Boolean
  /**
    * lets the application connect to the database
    *
    * If the application is already connected, nothing happens. If it is not connected, the application will try to establish a connection by using {@link
    * com.sun.star.sdbc.XDataSource.getConnection()} with the current settings, as specified in the {@link com.sun.star.sdb.DataSource.Settings} member.
    *
    * If the connection cannot be established, the respective error message is shown in the application window.
    * @throws com::sun::star::sdbc::SQLException if the connection cannot be established
    */
  def connect(): scala.Unit
  /**
    * creates a new sub component of the given type
    * @param ObjectType specifies the type of the object, must be one of the {@link DatabaseObject} constants.
    * @param DocumentDefinition Upon successful return, and if and only if ObjectType equals {@link DatabaseObject.FORM} or {@link DatabaseObject.REPORT} , th
    */
  def createComponent(
    ObjectType: scala.Double,
    DocumentDefinition: js.Array[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
  /**
    * creates a new sub component of the given type
    *
    * In opposite to {@link createComponent()} , this method allows you to specify additional arguments which are passed to the to-be-loaded component.
    * @param ObjectType specifies the type of the object, must be one of the {@link DatabaseObject} constants.
    * @param Arguments The meaning of the arguments is defined at the service which is effectively created. See the [above table]{@link url="#component_types"
    * @param DocumentDefinition Upon successful return, and if and only if ObjectType equals {@link DatabaseObject.FORM} or {@link DatabaseObject.REPORT} , th
    */
  def createComponentWithArguments(
    ObjectType: scala.Double,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    DocumentDefinition: js.Array[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
  /**
    * identifies the given sub component
    * @param SubComponent the component to identify. Must be one of the components in {@link SubComponents} .
    * @returns a record describing the sub component. The first element of the returned pair is the type of the component, denoted by one of the {@link Database
    * @throws com::sun::star::lang::IllegalArgumentException if the given component is not one of the controller's sub components
    */
  def identifySubComponent(SubComponent: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Pair[scala.Double, java.lang.String]
  /** determines whether the application is currently connected to the database */
  def isConnected(): scala.Boolean
  /**
    * loads the given sub component of the database document
    *
    * This method allows programmatic access to the functionality which is present in the UI: it allows opening a table, query, form, or report for either
    * editing or viewing.
    *
    * This method is a convenience wrapper for API which is also available otherwise. For instance, for loading forms and reports, you could use the {@link
    * com.sun.star.frame.XComponentLoader} interface of the {@link com.sun.star.sdb.Forms} resp. {@link com.sun.star.sdb.Reports} collections.
    *
    * Note there must exist a connection to the database before you can call this method.
    *
    * If an error occurs opening the given object, then this is reported to the user via an error dialog.
    * @param ObjectType specifies the type of the object, must be one of the {@link DatabaseObject} constants.
    * @param ObjectName specifies the name of the object. In case hierarchical objects are supported (as is the case form forms and reports), hierarchical nam
    * @param ForEditing specifies whether the object should be opened for editing ( `TRUE` ) or viewing ( `FALSE` ).  For the different object types, this mea
    * @returns the component which has been loaded. This is either an {@link com.sun.star.frame.XModel} , or an {@link com.sun.star.frame.XController} if the co
    * @see isConnected
    * @see connect
    * @throws com::sun::star::lang::IllegalArgumentException if ObjectType denotes an invalid object type
    * @throws com::sun::star::container::NoSuchElementException if an object with the given name and of the given type does not exist
    * @throws com::sun::star::sdbc::SQLException if there is no connection to the database at the time the method is called.
    */
  def loadComponent(ObjectType: scala.Double, ObjectName: java.lang.String, ForEditing: scala.Boolean): activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
  /**
    * loads the given sub component of the database document
    *
    * In opposite to {@link loadComponent()} , this method allows you to specify additional arguments which are passed to the to-be-loaded component.
    *
    * The meaning of the arguments is defined at the service which is effectively created. See the [above table]{@link url="#component_types"} for a list of
    * those services.
    */
  def loadComponentWithArguments(
    ObjectType: scala.Double,
    ObjectName: java.lang.String,
    ForEditing: scala.Boolean,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
}

