package typings.antDesignReactNative

import typings.antDesignReactNative.anon.Checked
import typings.antDesignReactNative.anon.Part1Value
import typings.antDesignReactNative.anon.`1`
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioDemoBasicMod {
  
  @JSImport("@ant-design/react-native/lib/radio/demo/basic", JSImport.Default)
  @js.native
  open class default () extends BasicRadioExample
  
  @js.native
  trait BasicRadioExample extends Component[Any, Any, Any] {
    
    def onChange(part1Value: Any, e: EventRadioItem): Unit = js.native
    
    def onGroupChange2(e: EventRadioGroup): Unit = js.native
    
    def onGroupChange3(e: EventRadioGroup): Unit = js.native
    
    @JSName("state")
    var state_BasicRadioExample: Part1Value = js.native
    
    def toggleDisabled(): Unit = js.native
  }
  
  trait EventRadioGroup extends StObject {
    
    var target: `1`
  }
  object EventRadioGroup {
    
    inline def apply(target: `1`): EventRadioGroup = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventRadioGroup]
    }
    
    extension [Self <: EventRadioGroup](x: Self) {
      
      inline def setTarget(value: `1`): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventRadioItem extends StObject {
    
    var target: Checked
  }
  object EventRadioItem {
    
    inline def apply(target: Checked): EventRadioItem = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventRadioItem]
    }
    
    extension [Self <: EventRadioItem](x: Self) {
      
      inline def setTarget(value: Checked): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  type RadioValue = String | Double
}
