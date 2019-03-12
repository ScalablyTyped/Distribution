package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is a factory to establish database connections. It should be registered at a {@link com.sun.star.uno.NamingService} .
  * @see com.sun.star.sdb.DatabaseContext
  */
trait DataSource
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with XCompletedConnection
     with activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XIsolatedConnection
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XFlushable
     with XQueryDefinitionsSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XDataSource
     with XBookmarksSupplier {
  /**
    * is a list of arbitrary string tag/value pairs as connection arguments
    *
    * The {@link DataSource} itself does not attempt to interpret any of those values.
    *
    * Instead, the values in this property have two use cases: Upon creating a connection, for every value in this sequence it's checked whether the {@link
    * com.sun.star.sdbc.XDriver} which is to provide the connection supports a setting with the respective name, using its {@link
    * com.sun.star.sdbc.XDriver.getPropertyInfo()} method.br/> If so, the settings is passed to the driver's {@link com.sun.star.sdbc.XDriver.connect()}
    * method. If not, the setting is ignored.External components may use the settings to carry arbitrary information with the data source. Usually, this is
    * used to control the behavior of components working with the data source.
    */
  var Info: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /** indicates that a password is always necessary. */
  var IsPasswordRequired: scala.Boolean
  /** determines whether modifications on the data source are allowed or not. */
  var IsReadOnly: scala.Boolean
  /**
    * is the name of the data source.
    *
    * If the data source is registered at the database context, then the `Name` property denotes the registration name. Otherwise, the name property
    * contains the URL of the file which the database document associated with the data source is based on.
    *
    * If the same data source is registered under different names, the value of the `Name` property is not defined.
    */
  var Name: java.lang.String
  /** provides an object for formatting numbers. */
  var NumberFormatsSupplier: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XNumberFormatsSupplier
  /** determines a users password. The password is not persistent. */
  var Password: java.lang.String
  /**
    * is a convenience wrapper around the {@link Info} property.
    *
    * Since fiddling around with a sequence of property values is somewhat uncomfortable in all known UNO language bindings (especially for tasks like
    * simply changing the value of an existing value), the {@link Settings} property wraps the {@link Info} property for easier single-value access.
    *
    * You should use the {@link Settings} property if you need to access a few properties only, and the {@link Info} property if you need access to all
    * existent settings at once.
    *
    * The object represented by this property supports the {@link com.sun.star.beans.PropertyBag} service. That is, you can at runtime add arbitrary new
    * properties to the bag.
    *
    * Additionally, the property bag supports default values of properties, and thus the {@link com.sun.star.beans.XPropertyState} interface. If you add an
    * own property to the bag using {@link com.sun.star.beans.XPropertyContainer.addProperty()} , you need to specify an initial value, which is also used
    * as default value (exceptions see below).
    *
    * Effectively, the property bag represented by `Settings` contains two classes of properties: Pre-defined ones and user-defined ones.
    *
    * **Pre-defined** properties are properties which are potentially used by the data source, the application UI for the data source, or a particular
    * backend driver employed by the data source. There's a large set of such properties, no all of them are effectively used for a concrete data source,
    * nonetheless, they're all present in the `Settings` . ;  Such properties are not removable from the bag, that is, their {@link
    * com.sun.star.beans.PropertyAttribute.REMOVABLE} attribute is **not** set. ;  Usually, you'll find that all of this properties have the
    * com::sun::star::beans::PropertyState::PropertyState_DEFAULT_VALUE state.
    *
    * **User-defined** properties are the ones which are added at runtime by any instance. They might or might not be removable, this depends on whether or
    * not the code adding them specifies the {@link com.sun.star.beans.PropertyAttribute.REMOVABLE} attribute. Also, they might or might not have a default
    * value, determined by the {@link com.sun.star.beans.PropertyAttribute.MAYBEDEFAULT} attribute at the time they're added to the bag.
    *
    * When a data source is made persistent, then properties which are not removable (which are assumed to be the pre-defined properties) are ignored when
    * they are in `DEFAULT` state. All other properties are always made persistent, except when an explicit {@link
    * com.sun.star.beans.PropertyAttribute.TRANSIENT} attribute prohibits this.
    *
    * Similar, when you obtain the {@link Info} property of a `DataSource` , the `Settings` bag is asked for all its property values, and the ones which are
    * removable and in state default are stripped, and **not** returned in the `Info` sequence.
    */
  var Settings: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /** indicates that components displaying data obtained from this data source should suppress columns used for versioning. */
  var SuppressVersionColumns: scala.Boolean
  /** defines a list of tables, on which the {@link DataSource} should have it's focus. If empty, all tables are rejected. */
  var TableFilter: stdLib.SafeArray[java.lang.String]
  /** defines a list of table types, on which the {@link DataSource} should have it's focus. If empty, all table types are rejected. */
  var TableTypeFilter: stdLib.SafeArray[java.lang.String]
  /** indicates a database url of the form ; ` jdbc:subprotocol:subname` or `sdbc:subprotocol:subname` */
  var URL: java.lang.String
  /** determines a users login name. */
  var User: java.lang.String
}

object DataSource {
  @scala.inline
  def apply(
    Bookmarks: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    Info: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    IsPasswordRequired: scala.Boolean,
    IsReadOnly: scala.Boolean,
    LoginTimeout: scala.Double,
    Name: java.lang.String,
    NumberFormatsSupplier: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XNumberFormatsSupplier,
    Password: java.lang.String,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    QueryDefinitions: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    Settings: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    SuppressVersionColumns: scala.Boolean,
    TableFilter: stdLib.SafeArray[java.lang.String],
    TableTypeFilter: stdLib.SafeArray[java.lang.String],
    URL: java.lang.String,
    User: java.lang.String,
    acquire: () => scala.Unit,
    addFlushListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XFlushListener => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    connectWithCompletion: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection,
    flush: () => scala.Unit,
    getBookmarks: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    getConnection: (java.lang.String, java.lang.String) => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection,
    getIsolatedConnection: (java.lang.String, java.lang.String) => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection,
    getIsolatedConnectionWithCompletion: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection,
    getLoginTimeout: () => scala.Double,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    getQueryDefinitions: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeFlushListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XFlushListener => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setLoginTimeout: scala.Double => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit
  ): DataSource = {
    val __obj = js.Dynamic.literal(Bookmarks = Bookmarks, Info = Info, IsPasswordRequired = IsPasswordRequired, IsReadOnly = IsReadOnly, LoginTimeout = LoginTimeout, Name = Name, NumberFormatsSupplier = NumberFormatsSupplier, Password = Password, PropertySetInfo = PropertySetInfo, QueryDefinitions = QueryDefinitions, Settings = Settings, SuppressVersionColumns = SuppressVersionColumns, TableFilter = TableFilter, TableTypeFilter = TableTypeFilter, URL = URL, User = User, acquire = js.Any.fromFunction0(acquire), addFlushListener = js.Any.fromFunction1(addFlushListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), connectWithCompletion = js.Any.fromFunction1(connectWithCompletion), flush = js.Any.fromFunction0(flush), getBookmarks = js.Any.fromFunction0(getBookmarks), getConnection = js.Any.fromFunction2(getConnection), getIsolatedConnection = js.Any.fromFunction2(getIsolatedConnection), getIsolatedConnectionWithCompletion = js.Any.fromFunction1(getIsolatedConnectionWithCompletion), getLoginTimeout = js.Any.fromFunction0(getLoginTimeout), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getQueryDefinitions = js.Any.fromFunction0(getQueryDefinitions), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeFlushListener = js.Any.fromFunction1(removeFlushListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setLoginTimeout = js.Any.fromFunction1(setLoginTimeout), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[DataSource]
  }
}

