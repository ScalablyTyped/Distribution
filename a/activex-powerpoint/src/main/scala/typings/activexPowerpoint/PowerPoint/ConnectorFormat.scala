package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoConnectorType
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectorFormat extends js.Object {
  
  val Application: js.Any = js.native
  
  def BeginConnect(ConnectedShape: Shape, ConnectionSite: Double): Unit = js.native
  
  val BeginConnected: MsoTriState = js.native
  
  val BeginConnectedShape: Shape = js.native
  
  val BeginConnectionSite: Double = js.native
  
  def BeginDisconnect(): Unit = js.native
  
  val Creator: Double = js.native
  
  def EndConnect(ConnectedShape: Shape, ConnectionSite: Double): Unit = js.native
  
  val EndConnected: MsoTriState = js.native
  
  val EndConnectedShape: Shape = js.native
  
  val EndConnectionSite: Double = js.native
  
  def EndDisconnect(): Unit = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.ConnectorFormat_typekey")
  var PowerPointDotConnectorFormat_typekey: ConnectorFormat = js.native
  
  var Type: MsoConnectorType = js.native
}
object ConnectorFormat {
  
  @scala.inline
  def apply(
    Application: js.Any,
    BeginConnect: (Shape, Double) => Unit,
    BeginConnected: MsoTriState,
    BeginConnectedShape: Shape,
    BeginConnectionSite: Double,
    BeginDisconnect: () => Unit,
    Creator: Double,
    EndConnect: (Shape, Double) => Unit,
    EndConnected: MsoTriState,
    EndConnectedShape: Shape,
    EndConnectionSite: Double,
    EndDisconnect: () => Unit,
    Parent: js.Any,
    PowerPointDotConnectorFormat_typekey: ConnectorFormat,
    Type: MsoConnectorType
  ): ConnectorFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BeginConnect = js.Any.fromFunction2(BeginConnect), BeginConnected = BeginConnected.asInstanceOf[js.Any], BeginConnectedShape = BeginConnectedShape.asInstanceOf[js.Any], BeginConnectionSite = BeginConnectionSite.asInstanceOf[js.Any], BeginDisconnect = js.Any.fromFunction0(BeginDisconnect), Creator = Creator.asInstanceOf[js.Any], EndConnect = js.Any.fromFunction2(EndConnect), EndConnected = EndConnected.asInstanceOf[js.Any], EndConnectedShape = EndConnectedShape.asInstanceOf[js.Any], EndConnectionSite = EndConnectionSite.asInstanceOf[js.Any], EndDisconnect = js.Any.fromFunction0(EndDisconnect), Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ConnectorFormat_typekey")(PowerPointDotConnectorFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorFormat]
  }
  
  @scala.inline
  implicit class ConnectorFormatOps[Self <: ConnectorFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginConnect(value: (Shape, Double) => Unit): Self = this.set("BeginConnect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeginConnected(value: MsoTriState): Self = this.set("BeginConnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginConnectedShape(value: Shape): Self = this.set("BeginConnectedShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginConnectionSite(value: Double): Self = this.set("BeginConnectionSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginDisconnect(value: () => Unit): Self = this.set("BeginDisconnect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndConnect(value: (Shape, Double) => Unit): Self = this.set("EndConnect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEndConnected(value: MsoTriState): Self = this.set("EndConnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndConnectedShape(value: Shape): Self = this.set("EndConnectedShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndConnectionSite(value: Double): Self = this.set("EndConnectionSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDisconnect(value: () => Unit): Self = this.set("EndDisconnect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotConnectorFormat_typekey(value: ConnectorFormat): Self = this.set("PowerPoint.ConnectorFormat_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MsoConnectorType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
