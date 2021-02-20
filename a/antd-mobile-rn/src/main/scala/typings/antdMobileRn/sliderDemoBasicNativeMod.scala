package typings.antdMobileRn

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderDemoBasicNativeMod {
  
  @JSImport("antd-mobile-rn/lib/slider/demo/basic.native", JSImport.Default)
  @js.native
  class default protected () extends BasicSliderExample {
    def this(props: js.Any) = this()
  }
  
  @js.native
  trait BasicSliderExample
    extends Component[js.Any, js.Any, js.Any] {
    
    def handleChange(value: js.Any): Unit = js.native
    
    def minMaxChange(value: js.Any): Unit = js.native
    
    def onAfterChange(value: js.Any): Unit = js.native
  }
}
