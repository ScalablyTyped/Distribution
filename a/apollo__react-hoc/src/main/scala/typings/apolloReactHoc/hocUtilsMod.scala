package typings.apolloReactHoc

import typings.apolloReactCommon.parserMod.IDocumentDefinition
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-hoc/lib/hoc-utils", JSImport.Namespace)
@js.native
object hocUtilsMod extends js.Object {
  @js.native
  class GraphQLBase[TProps, TChildProps, TState] protected ()
    extends Component[TProps, TState, js.Any] {
    def this(props: TProps) = this()
    var withRef: Boolean = js.native
    var wrappedInstance: js.Any = js.native
    def getWrappedInstance(): js.UndefOr[ComponentClass[TChildProps, _]] = js.native
    def setWrappedInstance(ref: ComponentClass[TChildProps, ComponentState]): Unit = js.native
  }
  
  def calculateVariablesFromProps[TProps](operation: IDocumentDefinition, props: TProps): Record[String, _] = js.native
  def defaultMapPropsToOptions(): js.Object = js.native
  def defaultMapPropsToSkip(): Boolean = js.native
  def defaultMapResultToProps[P](props: P): P = js.native
  def getDisplayName[P](WrappedComponent: ComponentType[P]): String = js.native
  type RefSetter[TChildProps] = js.Function1[/* ref */ ComponentClass[TChildProps, ComponentState], Unit]
}

