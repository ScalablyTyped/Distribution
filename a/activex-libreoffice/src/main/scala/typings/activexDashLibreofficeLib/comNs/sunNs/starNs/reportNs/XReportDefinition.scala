package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * identifies a {@link XReportComponent} as being a (sub-) report.
  *
  * This interface does not really provide an own functionality, it is only for easier runtime identification of report components.
  *
  * A report fulfills several tasks, like storing the structure of its report components and it provides the event environment for its contained elements.
  * @see XReportComponent
  */
trait XReportDefinition
  extends XReportComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel
     with activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XLoadable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XVisualObject
     with activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XStorageBasedDocument
     with activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XViewDataSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloseable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XUIConfigurationManagerSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XDocumentSubStorageSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.XStyleFamiliesSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifiable2
     with XFunctionsSupplier {
  /** specifies the active connection which is used to create the resulting report. */
  var ActiveConnection: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection
  /** returns a sequence of the currently supported output formats. */
  val AvailableMimeTypes: activexDashInteropLib.SafeArray[java.lang.String]
  /** Represents the title of the report in print preview. */
  var Caption: java.lang.String
  /**
    * is the command which should be executed, the type of command depends on the CommandType.
    *
    * In case of a {@link CommandType} of CommandType::COMMAND, means in case the {@link Command} specifies an SQL statement, the inherited {@link
    * com.sun.star.sdbc.RowSet.EscapeProcessing} becomes relevant: ;  It then can be to used to specify whether the SQL statement should be analyzed on the
    * client side before sending it to the database server. ;  The default value for {@link com.sun.star.sdbc.RowSet.EscapeProcessing} is `TRUE` . By
    * switching it to `FALSE` , you can pass backend-specific SQL statements, which are not standard SQL, to your database.
    * @see com.sun.star.sdb.CommandType
    */
  var Command: java.lang.String
  /**
    * specifies the type of the command to be executed to retrieve a result set.
    *
    * {@link Command} needs to be interpreted depending on the value of this property.
    *
    * This property is only meaningful together with the {@link Command} property, thus either **both** or **none** of them are present.
    * @see com.sun.star.sdb.CommandType
    */
  var CommandType: scala.Double
  /** is the name of the datasource to use, this could be a named datasource or the URL of a data access component. */
  var DataSourceName: java.lang.String
  /**
    * returns the detail section.
    * @see XSection
    */
  var Detail: XSection
  /**
    * specifies if the {@link Command} should be analyzed on the client side before sending it to the database server.
    *
    * The default value of this property is `TRUE` . By switching it to `FALSE` , you can pass backend-specific SQL statements, which are not standard SQL,
    * to your database.
    *
    * This property is usually present together with the {@link Command} and {@link CommandType} properties, and is evaluated if and only if {@link
    * CommandType} equals CommandType::COMMAND.
    */
  var EscapeProcessing: scala.Boolean
  /**
    * makes it possible to register listeners which are called whenever a document event occurs. This is a workaround due to the fact that this interface
    * can not be directly inherited from {@link com.sun.star.document.XEventBroadcaster} because the methods addEventListener and removeEventListener are
    * already defined in {@link com.sun.star.lang.XComponent} . A queryInterface call is still supported to the {@link
    * com.sun.star.document.XEventBroadcaster} interface.
    */
  val EventBroadcaster: activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XEventBroadcaster
  /**
    * specifies an additional filter to optionally use.
    *
    * The Filter string has to form a SQL WHERE-clause, **without** the WHERE-string itself.
    *
    * If a {@link DataSourceName} , {@link Command} and {@link CommandType} are specified, a RowSet can be created with this information. If the results
    * provided by the row set are to be additionally filtered, the Filter property can be used.
    *
    * Note that the Filter property does not make sense if a ResultSet has been specified in the DataAccessDescriptor.
    * @see com.sun.star.sdb.RowSet
    * @see ResultSet
    */
  var Filter: java.lang.String
  /**
    * Specifies whether groups in a multi column report are kept together.
    * @see com.sun.star.report.GroupKeepTogether
    */
  var GroupKeepTogether: scala.Double
  /** Represents the groups of the report. */
  var Groups: XGroups
  /** Represents the output format (media (mime) type) of the resulting document when executing this report. */
  var MimeType: java.lang.String
  /**
    * returns the page footer if the {@link PageFooterOn} is `TRUE` .
    * @see XSection
    * @throws com::sun::star::container::NoSuchElementException If the report has the page footer disabled.
    */
  var PageFooter: XSection
  /** Defines that the page footer is on. Default is `TRUE` . */
  var PageFooterOn: scala.Boolean
  /**
    * Represents the location of the page footer.
    * @see ReportPrintOption
    */
  var PageFooterOption: scala.Double
  /**
    * returns the page header if the {@link PageHeaderOn} is `TRUE` .
    * @see XSection
    * @throws com::sun::star::container::NoSuchElementException If the report has the page header disabled.
    */
  var PageHeader: XSection
  /** Defines that the page header is on. Default is `TRUE` . */
  var PageHeaderOn: scala.Boolean
  /**
    * Represents the location of the page header.
    * @see ReportPrintOption
    */
  var PageHeaderOption: scala.Double
  /**
    * returns the report footer if the {@link ReportFooterOn} is `TRUE` .
    * @see XSection
    * @throws com::sun::star::container::NullPointerException If the report has the report footer disabled.
    */
  var ReportFooter: XSection
  /** Defines that the report footer is on. Default is `FALSE` . */
  var ReportFooterOn: scala.Boolean
  /**
    * returns the report header if the {@link ReportHeaderOn} is `TRUE` .
    * @see XSection
    * @throws com::sun::star::container::NoSuchElementException If the report has the report header disabled.
    */
  var ReportHeader: XSection
  /** Defines that the report header is on. Default is `FALSE` . */
  var ReportHeaderOn: scala.Boolean
  /** returns a sequence of the currently supported output formats. */
  def getAvailableMimeTypes(): activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * makes it possible to register listeners which are called whenever a document event occurs. This is a workaround due to the fact that this interface
    * can not be directly inherited from {@link com.sun.star.document.XEventBroadcaster} because the methods addEventListener and removeEventListener are
    * already defined in {@link com.sun.star.lang.XComponent} . A queryInterface call is still supported to the {@link
    * com.sun.star.document.XEventBroadcaster} interface.
    */
  def getEventBroadcaster(): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XEventBroadcaster
}

object XReportDefinition {
  @scala.inline
  def apply(
    ActiveConnection: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection,
    Args: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    AvailableMimeTypes: activexDashInteropLib.SafeArray[java.lang.String],
    Caption: java.lang.String,
    Command: java.lang.String,
    CommandType: scala.Double,
    ControlBorder: scala.Double,
    ControlBorderColor: scala.Double,
    CurrentController: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController,
    CurrentSelection: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    DataSourceName: java.lang.String,
    Detail: XSection,
    DetailFields: activexDashInteropLib.SafeArray[java.lang.String],
    DocumentStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage,
    DocumentSubStoragesNames: activexDashInteropLib.SafeArray[java.lang.String],
    EscapeProcessing: scala.Boolean,
    EventBroadcaster: activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XEventBroadcaster,
    Filter: java.lang.String,
    Functions: XFunctions,
    GroupKeepTogether: scala.Double,
    Groups: XGroups,
    Height: scala.Double,
    MasterFields: activexDashInteropLib.SafeArray[java.lang.String],
    MimeType: java.lang.String,
    Name: java.lang.String,
    PageFooter: XSection,
    PageFooterOn: scala.Boolean,
    PageFooterOption: scala.Double,
    PageHeader: XSection,
    PageHeaderOn: scala.Boolean,
    PageHeaderOption: scala.Double,
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    PositionX: scala.Double,
    PositionY: scala.Double,
    PrintRepeatedValues: scala.Boolean,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    ReportFooter: XSection,
    ReportFooterOn: scala.Boolean,
    ReportHeader: XSection,
    ReportHeaderOn: scala.Boolean,
    Section: XSection,
    ShapeType: java.lang.String,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    StyleFamilies: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    UIConfigurationManager: activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XUIConfigurationManager,
    URL: java.lang.String,
    ViewData: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    Width: scala.Double,
    acquire: js.Function0[scala.Unit],
    addCloseListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloseListener, scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addModifyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener, scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addStorageChangeListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XStorageChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    attachResource: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Boolean
    ],
    close: js.Function1[scala.Boolean, scala.Unit],
    connectController: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController, scala.Unit],
    createClone: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloneable],
    disableSetModified: js.Function0[scala.Boolean],
    disconnectController: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController, scala.Unit],
    dispose: js.Function0[scala.Unit],
    enableSetModified: js.Function0[scala.Boolean],
    getArgs: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    getAvailableMimeTypes: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getCurrentController: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController],
    getCurrentSelection: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getDocumentStorage: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage],
    getDocumentSubStorage: js.Function2[
      java.lang.String, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage
    ],
    getDocumentSubStoragesNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getEventBroadcaster: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XEventBroadcaster],
    getMapUnit: js.Function1[scala.Double, scala.Double],
    getParent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getPosition: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point],
    getPreferredVisualRepresentation: js.Function1[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.VisualRepresentation
    ],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getShapeType: js.Function0[java.lang.String],
    getSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
    getStyleFamilies: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    getUIConfigurationManager: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XUIConfigurationManager],
    getURL: js.Function0[java.lang.String],
    getViewData: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    getVisualAreaSize: js.Function1[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
    hasControllersLocked: js.Function0[scala.Boolean],
    initNew: js.Function0[scala.Unit],
    isModified: js.Function0[scala.Boolean],
    isSetModifiedEnabled: js.Function0[scala.Boolean],
    load: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    loadFromStorage: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    lockControllers: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeCloseListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloseListener, scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeModifyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener, scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeStorageChangeListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XStorageChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setCurrentController: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController, scala.Unit],
    setModified: js.Function1[scala.Boolean, scala.Unit],
    setParent: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit],
    setPosition: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setSize: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size, scala.Unit],
    setViewData: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess, scala.Unit],
    setVisualAreaSize: js.Function2[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size, scala.Unit],
    storeToStorage: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    switchToStorage: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, scala.Unit],
    unlockControllers: js.Function0[scala.Unit]
  ): XReportDefinition = {
    val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection, Args = Args, AvailableMimeTypes = AvailableMimeTypes, Caption = Caption, Command = Command, CommandType = CommandType, ControlBorder = ControlBorder, ControlBorderColor = ControlBorderColor, CurrentController = CurrentController, CurrentSelection = CurrentSelection, DataSourceName = DataSourceName, Detail = Detail, DetailFields = DetailFields, DocumentStorage = DocumentStorage, DocumentSubStoragesNames = DocumentSubStoragesNames, EscapeProcessing = EscapeProcessing, EventBroadcaster = EventBroadcaster, Filter = Filter, Functions = Functions, GroupKeepTogether = GroupKeepTogether, Groups = Groups, Height = Height, MasterFields = MasterFields, MimeType = MimeType, Name = Name, PageFooter = PageFooter, PageFooterOn = PageFooterOn, PageFooterOption = PageFooterOption, PageHeader = PageHeader, PageHeaderOn = PageHeaderOn, PageHeaderOption = PageHeaderOption, Parent = Parent, Position = Position, PositionX = PositionX, PositionY = PositionY, PrintRepeatedValues = PrintRepeatedValues, PropertySetInfo = PropertySetInfo, ReportFooter = ReportFooter, ReportFooterOn = ReportFooterOn, ReportHeader = ReportHeader, ReportHeaderOn = ReportHeaderOn, Section = Section, ShapeType = ShapeType, Size = Size, StyleFamilies = StyleFamilies, UIConfigurationManager = UIConfigurationManager, URL = URL, ViewData = ViewData, Width = Width, acquire = acquire, addCloseListener = addCloseListener, addEventListener = addEventListener, addModifyListener = addModifyListener, addPropertyChangeListener = addPropertyChangeListener, addStorageChangeListener = addStorageChangeListener, addVetoableChangeListener = addVetoableChangeListener, attachResource = attachResource, close = close, connectController = connectController, createClone = createClone, disableSetModified = disableSetModified, disconnectController = disconnectController, dispose = dispose, enableSetModified = enableSetModified, getArgs = getArgs, getAvailableMimeTypes = getAvailableMimeTypes, getCurrentController = getCurrentController, getCurrentSelection = getCurrentSelection, getDocumentStorage = getDocumentStorage, getDocumentSubStorage = getDocumentSubStorage, getDocumentSubStoragesNames = getDocumentSubStoragesNames, getEventBroadcaster = getEventBroadcaster, getMapUnit = getMapUnit, getParent = getParent, getPosition = getPosition, getPreferredVisualRepresentation = getPreferredVisualRepresentation, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getShapeType = getShapeType, getSize = getSize, getStyleFamilies = getStyleFamilies, getUIConfigurationManager = getUIConfigurationManager, getURL = getURL, getViewData = getViewData, getVisualAreaSize = getVisualAreaSize, hasControllersLocked = hasControllersLocked, initNew = initNew, isModified = isModified, isSetModifiedEnabled = isSetModifiedEnabled, load = load, loadFromStorage = loadFromStorage, lockControllers = lockControllers, queryInterface = queryInterface, release = release, removeCloseListener = removeCloseListener, removeEventListener = removeEventListener, removeModifyListener = removeModifyListener, removePropertyChangeListener = removePropertyChangeListener, removeStorageChangeListener = removeStorageChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setCurrentController = setCurrentController, setModified = setModified, setParent = setParent, setPosition = setPosition, setPropertyValue = setPropertyValue, setSize = setSize, setViewData = setViewData, setVisualAreaSize = setVisualAreaSize, storeToStorage = storeToStorage, switchToStorage = switchToStorage, unlockControllers = unlockControllers)
  
    __obj.asInstanceOf[XReportDefinition]
  }
}

