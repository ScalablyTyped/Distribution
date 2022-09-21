package typings.antdMobile

import typings.antdMobile.anon.Children
import typings.react.mod.Component
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wrapperMod {
  
  @JSImport("antd-mobile/es/components/popover/wrapper", "Wrapper")
  @js.native
  open class Wrapper protected ()
    extends Component[Children, js.Object, Any] {
    def this(props: Children) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Children, context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MWrapper(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MWrapper(): Unit = js.native
    
    var element: Element | Null = js.native
  }
}
