package typings.agDashGrid.agDashGridMod

import typings.agDashGrid.distLibMiscSimpleHttpRequestMod.SimpleHttpRequestParams
import typings.std.TypedPropertyDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def Autowired(): js.Function = js.native
  def Autowired(name: String): js.Function = js.native
  def Bean(beanName: String): js.Function = js.native
  def Listener(): js.Function = js.native
  def Listener(eventName: String): js.Function = js.native
  def Optional(): js.Function = js.native
  def Optional(name: String): js.Function = js.native
  def PostConstruct(target: js.Object, methodName: String, descriptor: TypedPropertyDescriptor[_]): Unit = js.native
  def PreConstruct(target: js.Object, methodName: String, descriptor: TypedPropertyDescriptor[_]): Unit = js.native
  def PreDestroy(target: js.Object, methodName: String, descriptor: TypedPropertyDescriptor[_]): Unit = js.native
  def Qualifier(name: String): js.Function = js.native
  def QuerySelector(): js.Function = js.native
  def QuerySelector(selector: String): js.Function = js.native
  def RefSelector(): js.Function = js.native
  def RefSelector(ref: String): js.Function = js.native
  def defaultGroupComparator(
    valueA: js.Any,
    valueB: js.Any,
    nodeA: typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode,
    nodeB: typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
  ): Double = js.native
  def defaultGroupComparator(
    valueA: js.Any,
    valueB: js.Any,
    nodeA: typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode,
    nodeB: typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode,
    accentedCompare: Boolean
  ): Double = js.native
  def initialiseAgGridWithAngular1(angular: js.Any): Unit = js.native
  def initialiseAgGridWithWebComponents(): Unit = js.native
  def simpleHttpRequest(params: SimpleHttpRequestParams): typings.agDashGrid.distLibUtilsMod.Promise[_] = js.native
}

