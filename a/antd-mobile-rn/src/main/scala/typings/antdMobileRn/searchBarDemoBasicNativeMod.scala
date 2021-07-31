package typings.antdMobileRn

import typings.antdMobileRn.anon.ValueString
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchBarDemoBasicNativeMod {
  
  @JSImport("antd-mobile-rn/lib/search-bar/demo/basic.native", JSImport.Default)
  @js.native
  class default () extends SearchBarDemo
  
  @js.native
  trait SearchBarDemo
    extends Component[js.Any, js.Any, js.Any] {
    
    def clear(): Unit = js.native
    
    def onChange(value: js.Any): Unit = js.native
    
    @JSName("state")
    var state_SearchBarDemo: ValueString = js.native
  }
}
