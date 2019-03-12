package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * identifies a {@link XReportEngine} which allows the creation of OpenDocument files.
  *
  * The following events are supported by the report engine. OnPageStarted Is fired when a new page started. OnReportStarted Is fired when a new report
  * started. OnGroupStarted Is fired when a new group started. OnGroupEnded Is fired when the group ended. OnReportEnded Is fired when the report ended.
  * OnPageEnded Is fired when the page ended.
  * @see com.sun.star.document.OfficeDocument
  */
trait XReportEngine
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** specifies the active connection which is used to create the resulting report. */
  var ActiveConnection: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection
  /**
    * defines the maximum number of rows which should be fetched for the report. If the limit is exceeded, the excess rows are silently dropped. ;  There is
    * no limitation, if set to zero.
    */
  var MaxRows: scala.Double
  /** specifies the report definition object which is used to create the resulting report. */
  var ReportDefinition: XReportDefinition
  /** specifies the status indicator which shows the progress of the report generation process. */
  var StatusIndicator: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XStatusIndicator
  /**
    * creates a report document.
    * @returns The URL where the new document is located.
    * @throws com::sun::star::lang::DisposedException If the report engine is already disposed.
    * @throws com::sun::star::lang::IllegalArgumentException If the report definition was not set or is `NULL` .
    */
  def createDocument(): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL
  /**
    * creates a report document.
    * @param frame The frame must have a controller set. This controller will be set at the model.
    * @throws com::sun::star::lang::DisposedException If the report engine is already disposed.
    * @throws com::sun::star::lang::IllegalArgumentException If the report definition was not set or is `NULL` . OJ: Has to be discussed if this method is useful.
    */
  def createDocumentAlive(frame: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel
  /**
    * creates a report document.
    * @throws com::sun::star::lang::DisposedException If the report engine is already disposed.
    * @throws com::sun::star::lang::IllegalArgumentException If the report definition was not set or is `NULL` .
    */
  def createDocumentModel(): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel
  /**
    * allows to interrupt the creation process of the report document.
    * @throws com::sun::star::lang::DisposedException If the report engine is already disposed.
    */
  def interrupt(): scala.Unit
}

object XReportEngine {
  @scala.inline
  def apply(
    ActiveConnection: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection,
    MaxRows: scala.Double,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    ReportDefinition: XReportDefinition,
    StatusIndicator: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XStatusIndicator,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    createDocument: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL,
    createDocumentAlive: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame => activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel,
    createDocumentModel: () => activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel,
    dispose: () => scala.Unit,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    interrupt: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit
  ): XReportEngine = {
    val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection, MaxRows = MaxRows, PropertySetInfo = PropertySetInfo, ReportDefinition = ReportDefinition, StatusIndicator = StatusIndicator, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createDocument = js.Any.fromFunction0(createDocument), createDocumentAlive = js.Any.fromFunction1(createDocumentAlive), createDocumentModel = js.Any.fromFunction0(createDocumentModel), dispose = js.Any.fromFunction0(dispose), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), interrupt = js.Any.fromFunction0(interrupt), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[XReportEngine]
  }
}

