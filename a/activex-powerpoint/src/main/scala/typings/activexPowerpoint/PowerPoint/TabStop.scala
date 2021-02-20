package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabStop extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  def Clear(): Unit = js.native
  
  val Parent: js.Any = js.native
  
  var Position: Double = js.native
  
  @JSName("PowerPoint.TabStop_typekey")
  var PowerPointDotTabStop_typekey: TabStop = js.native
  
  var Type: PpTabStopType = js.native
}
object TabStop {
  
  @scala.inline
  def apply(
    Application: Application,
    Clear: () => Unit,
    Parent: js.Any,
    Position: Double,
    PowerPointDotTabStop_typekey: TabStop,
    Type: PpTabStopType
  ): TabStop = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TabStop_typekey")(PowerPointDotTabStop_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabStop]
  }
  
  @scala.inline
  implicit class TabStopMutableBuilder[Self <: TabStop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "Clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotTabStop_typekey(value: TabStop): Self = StObject.set(x, "PowerPoint.TabStop_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PpTabStopType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
