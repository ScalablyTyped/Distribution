package typings.antd

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.antd.esLayoutLayoutMod.BasicProps
import typings.antd.esLayoutSiderMod.SiderProps
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.Context
import typings.react.reactMod.GetDerivedStateFromError
import typings.react.reactMod.GetDerivedStateFromProps
import typings.react.reactMod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/es/layout", JSImport.Namespace)
@js.native
object esLayoutMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[BasicProps, ComponentState, js.Any] {
    def this(props: BasicProps) = this()
    def this(props: BasicProps, context: js.Any) = this()
  }
  
  @js.native
  object default
    extends Instantiable1[/* props */ BasicProps, Component[BasicProps, ComponentState, js.Any]]
       with Instantiable2[
          /* props */ BasicProps, 
          /* context */ js.Any, 
          Component[BasicProps, ComponentState, js.Any]
        ] {
    var Content: ComponentClass[BasicProps, ComponentState] = js.native
    var Footer: ComponentClass[BasicProps, ComponentState] = js.native
    var Header: ComponentClass[BasicProps, ComponentState] = js.native
    var Sider: ComponentClass[SiderProps, ComponentState] = js.native
    var childContextTypes: js.UndefOr[ValidationMap[_]] = js.native
    var contextType: js.UndefOr[Context[_]] = js.native
    var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
    var defaultProps: js.UndefOr[PartialBasicProps] = js.native
    var displayName: js.UndefOr[String] = js.native
    var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[BasicProps, ComponentState]] = js.native
    var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[BasicProps, ComponentState]] = js.native
    var propTypes: js.UndefOr[WeakValidationMapBasicProps] = js.native
  }
  
}

