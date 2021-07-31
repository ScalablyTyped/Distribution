package typings.activexExcel.Excel

import typings.activexOffice.Office.MsoConnectorType
import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectorFormat extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  def BeginConnect(ConnectedShape: Shape, ConnectionSite: Double): Unit
  
  val BeginConnected: MsoTriState
  
  val BeginConnectedShape: Shape
  
  val BeginConnectionSite: Double
  
  def BeginDisconnect(): Unit
  
  val Creator: XlCreator
  
  def EndConnect(ConnectedShape: Shape, ConnectionSite: Double): Unit
  
  val EndConnected: MsoTriState
  
  val EndConnectedShape: Shape
  
  val EndConnectionSite: Double
  
  def EndDisconnect(): Unit
  
  @JSName("Excel.ConnectorFormat_typekey")
  var ExcelDotConnectorFormat_typekey: ConnectorFormat
  
  val Parent: js.Any
  
  var Type: MsoConnectorType
}
object ConnectorFormat {
  
  @scala.inline
  def apply(
    Application: Application,
    BeginConnect: (Shape, Double) => Unit,
    BeginConnected: MsoTriState,
    BeginConnectedShape: Shape,
    BeginConnectionSite: Double,
    BeginDisconnect: () => Unit,
    Creator: XlCreator,
    EndConnect: (Shape, Double) => Unit,
    EndConnected: MsoTriState,
    EndConnectedShape: Shape,
    EndConnectionSite: Double,
    EndDisconnect: () => Unit,
    ExcelDotConnectorFormat_typekey: ConnectorFormat,
    Parent: js.Any,
    Type: MsoConnectorType
  ): ConnectorFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BeginConnect = js.Any.fromFunction2(BeginConnect), BeginConnected = BeginConnected.asInstanceOf[js.Any], BeginConnectedShape = BeginConnectedShape.asInstanceOf[js.Any], BeginConnectionSite = BeginConnectionSite.asInstanceOf[js.Any], BeginDisconnect = js.Any.fromFunction0(BeginDisconnect), Creator = Creator.asInstanceOf[js.Any], EndConnect = js.Any.fromFunction2(EndConnect), EndConnected = EndConnected.asInstanceOf[js.Any], EndConnectedShape = EndConnectedShape.asInstanceOf[js.Any], EndConnectionSite = EndConnectionSite.asInstanceOf[js.Any], EndDisconnect = js.Any.fromFunction0(EndDisconnect), Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.ConnectorFormat_typekey")(ExcelDotConnectorFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorFormat]
  }
  
  @scala.inline
  implicit class ConnectorFormatMutableBuilder[Self <: ConnectorFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginConnect(value: (Shape, Double) => Unit): Self = StObject.set(x, "BeginConnect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeginConnected(value: MsoTriState): Self = StObject.set(x, "BeginConnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginConnectedShape(value: Shape): Self = StObject.set(x, "BeginConnectedShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginConnectionSite(value: Double): Self = StObject.set(x, "BeginConnectionSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginDisconnect(value: () => Unit): Self = StObject.set(x, "BeginDisconnect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndConnect(value: (Shape, Double) => Unit): Self = StObject.set(x, "EndConnect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEndConnected(value: MsoTriState): Self = StObject.set(x, "EndConnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndConnectedShape(value: Shape): Self = StObject.set(x, "EndConnectedShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndConnectionSite(value: Double): Self = StObject.set(x, "EndConnectionSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDisconnect(value: () => Unit): Self = StObject.set(x, "EndDisconnect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExcelDotConnectorFormat_typekey(value: ConnectorFormat): Self = StObject.set(x, "Excel.ConnectorFormat_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MsoConnectorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
