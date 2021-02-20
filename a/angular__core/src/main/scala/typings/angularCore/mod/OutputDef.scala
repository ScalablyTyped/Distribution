package typings.angularCore.mod

import typings.angularCore.angularCoreStrings.body
import typings.angularCore.angularCoreStrings.component
import typings.angularCore.angularCoreStrings.document
import typings.angularCore.angularCoreStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputDef extends StObject {
  
  var eventName: String = js.native
  
  var propName: String | Null = js.native
  
  var target: window | document | body | component | Null = js.native
  
  var `type`: OutputType = js.native
}
object OutputDef {
  
  @scala.inline
  def apply(eventName: String, `type`: OutputType): OutputDef = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputDef]
  }
  
  @scala.inline
  implicit class OutputDefMutableBuilder[Self <: OutputDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropName(value: String): Self = StObject.set(x, "propName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropNameNull: Self = StObject.set(x, "propName", null)
    
    @scala.inline
    def setTarget(value: window | document | body | component): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNull: Self = StObject.set(x, "target", null)
    
    @scala.inline
    def setType(value: OutputType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
