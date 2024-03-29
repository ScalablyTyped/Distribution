package typings.antDesignReactNative

import typings.antDesignReactNative.anon.ActiveSections
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAccordionDemoBasicMod {
  
  @JSImport("@ant-design/react-native/lib/accordion/demo/basic", JSImport.Default)
  @js.native
  open class default () extends AccordionExmple
  
  @js.native
  trait AccordionExmple extends Component[Any, Any, Any] {
    
    def onChange(activeSections: js.Array[Double]): Unit = js.native
    
    @JSName("state")
    var state_AccordionExmple: ActiveSections = js.native
  }
}
