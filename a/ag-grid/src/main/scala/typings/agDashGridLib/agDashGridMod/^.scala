package typings
package agDashGridLib.agDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def Autowired(): js.Function = js.native
  def Autowired(name: java.lang.String): js.Function = js.native
  def Bean(beanName: java.lang.String): js.Function = js.native
  def Listener(): js.Function = js.native
  def Listener(eventName: java.lang.String): js.Function = js.native
  def Optional(): js.Function = js.native
  def Optional(name: java.lang.String): js.Function = js.native
  def PostConstruct(target: js.Object, methodName: java.lang.String, descriptor: stdLib.TypedPropertyDescriptor[_]): scala.Unit = js.native
  def PreConstruct(target: js.Object, methodName: java.lang.String, descriptor: stdLib.TypedPropertyDescriptor[_]): scala.Unit = js.native
  def PreDestroy(target: js.Object, methodName: java.lang.String, descriptor: stdLib.TypedPropertyDescriptor[_]): scala.Unit = js.native
  def Qualifier(name: java.lang.String): js.Function = js.native
  def QuerySelector(): js.Function = js.native
  def QuerySelector(selector: java.lang.String): js.Function = js.native
  def RefSelector(): js.Function = js.native
  def RefSelector(ref: java.lang.String): js.Function = js.native
  def defaultGroupComparator(
    valueA: js.Any,
    valueB: js.Any,
    nodeA: agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    nodeB: agDashGridLib.distLibEntitiesRowNodeMod.RowNode
  ): scala.Double = js.native
  def defaultGroupComparator(
    valueA: js.Any,
    valueB: js.Any,
    nodeA: agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    nodeB: agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    accentedCompare: scala.Boolean
  ): scala.Double = js.native
  def initialiseAgGridWithAngular1(angular: js.Any): scala.Unit = js.native
  def initialiseAgGridWithWebComponents(): scala.Unit = js.native
  def simpleHttpRequest(params: agDashGridLib.distLibMiscSimpleHttpRequestMod.SimpleHttpRequestParams): agDashGridLib.distLibUtilsMod.Promise[_] = js.native
}

