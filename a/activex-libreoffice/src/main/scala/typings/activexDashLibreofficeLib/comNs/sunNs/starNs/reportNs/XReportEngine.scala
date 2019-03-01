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
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    createDocument: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL],
    createDocumentAlive: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel
    ],
    createDocumentModel: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel],
    dispose: js.Function0[scala.Unit],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    interrupt: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): XReportEngine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ActiveConnection")(ActiveConnection)
    __obj.updateDynamic("MaxRows")(MaxRows)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("ReportDefinition")(ReportDefinition)
    __obj.updateDynamic("StatusIndicator")(StatusIndicator)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("createDocument")(createDocument)
    __obj.updateDynamic("createDocumentAlive")(createDocumentAlive)
    __obj.updateDynamic("createDocumentModel")(createDocumentModel)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("interrupt")(interrupt)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.asInstanceOf[XReportEngine]
  }
}

