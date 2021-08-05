package typings.activexLibreoffice.com_.sun.star.report

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.frame.XFrame
import typings.activexLibreoffice.com_.sun.star.frame.XModel
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typings.activexLibreoffice.com_.sun.star.task.XStatusIndicator
import typings.activexLibreoffice.com_.sun.star.util.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * identifies a {@link XReportEngine} which allows the creation of OpenDocument files.
  *
  * The following events are supported by the report engine. OnPageStarted Is fired when a new page started. OnReportStarted Is fired when a new report
  * started. OnGroupStarted Is fired when a new group started. OnGroupEnded Is fired when the group ended. OnReportEnded Is fired when the report ended.
  * OnPageEnded Is fired when the page ended.
  * @see com.sun.star.document.OfficeDocument
  */
trait XReportEngine
  extends StObject
     with XComponent
     with XPropertySet {
  
  /** specifies the active connection which is used to create the resulting report. */
  var ActiveConnection: XConnection
  
  /**
    * defines the maximum number of rows which should be fetched for the report. If the limit is exceeded, the excess rows are silently dropped. ;  There is
    * no limitation, if set to zero.
    */
  var MaxRows: Double
  
  /** specifies the report definition object which is used to create the resulting report. */
  var ReportDefinition: XReportDefinition
  
  /** specifies the status indicator which shows the progress of the report generation process. */
  var StatusIndicator: XStatusIndicator
  
  /**
    * creates a report document.
    * @returns The URL where the new document is located.
    * @throws com::sun::star::lang::DisposedException If the report engine is already disposed.
    * @throws com::sun::star::lang::IllegalArgumentException If the report definition was not set or is `NULL` .
    */
  def createDocument(): URL
  
  /**
    * creates a report document.
    * @param frame The frame must have a controller set. This controller will be set at the model.
    * @throws com::sun::star::lang::DisposedException If the report engine is already disposed.
    * @throws com::sun::star::lang::IllegalArgumentException If the report definition was not set or is `NULL` . OJ: Has to be discussed if this method is useful.
    */
  def createDocumentAlive(frame: XFrame): XModel
  
  /**
    * creates a report document.
    * @throws com::sun::star::lang::DisposedException If the report engine is already disposed.
    * @throws com::sun::star::lang::IllegalArgumentException If the report definition was not set or is `NULL` .
    */
  def createDocumentModel(): XModel
  
  /**
    * allows to interrupt the creation process of the report document.
    * @throws com::sun::star::lang::DisposedException If the report engine is already disposed.
    */
  def interrupt(): Unit
}
object XReportEngine {
  
  inline def apply(
    ActiveConnection: XConnection,
    MaxRows: Double,
    PropertySetInfo: XPropertySetInfo,
    ReportDefinition: XReportDefinition,
    StatusIndicator: XStatusIndicator,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createDocument: () => URL,
    createDocumentAlive: XFrame => XModel,
    createDocumentModel: () => XModel,
    dispose: () => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    interrupt: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): XReportEngine = {
    val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection.asInstanceOf[js.Any], MaxRows = MaxRows.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ReportDefinition = ReportDefinition.asInstanceOf[js.Any], StatusIndicator = StatusIndicator.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createDocument = js.Any.fromFunction0(createDocument), createDocumentAlive = js.Any.fromFunction1(createDocumentAlive), createDocumentModel = js.Any.fromFunction0(createDocumentModel), dispose = js.Any.fromFunction0(dispose), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), interrupt = js.Any.fromFunction0(interrupt), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[XReportEngine]
  }
  
  extension [Self <: XReportEngine](x: Self) {
    
    inline def setActiveConnection(value: XConnection): Self = StObject.set(x, "ActiveConnection", value.asInstanceOf[js.Any])
    
    inline def setCreateDocument(value: () => URL): Self = StObject.set(x, "createDocument", js.Any.fromFunction0(value))
    
    inline def setCreateDocumentAlive(value: XFrame => XModel): Self = StObject.set(x, "createDocumentAlive", js.Any.fromFunction1(value))
    
    inline def setCreateDocumentModel(value: () => XModel): Self = StObject.set(x, "createDocumentModel", js.Any.fromFunction0(value))
    
    inline def setInterrupt(value: () => Unit): Self = StObject.set(x, "interrupt", js.Any.fromFunction0(value))
    
    inline def setMaxRows(value: Double): Self = StObject.set(x, "MaxRows", value.asInstanceOf[js.Any])
    
    inline def setReportDefinition(value: XReportDefinition): Self = StObject.set(x, "ReportDefinition", value.asInstanceOf[js.Any])
    
    inline def setStatusIndicator(value: XStatusIndicator): Self = StObject.set(x, "StatusIndicator", value.asInstanceOf[js.Any])
  }
}
