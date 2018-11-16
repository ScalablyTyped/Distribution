package typings
package atAngularCoreLib.srcViewTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/view/types", JSImport.Namespace)
@js.native
object srcViewTypesModMembers extends js.Object {
  val Services: Services = js.native
  def asElementData(view: ViewData, index: scala.Double): ElementData = js.native
  def asProviderData(view: ViewData, index: scala.Double): ProviderData = js.native
  def asPureExpressionData(view: ViewData, index: scala.Double): PureExpressionData = js.native
  def asQueryList(view: ViewData, index: scala.Double): atAngularCoreLib.srcLinkerQueryUnderscoreListMod.QueryList[_] = js.native
  def asTextData(view: ViewData, index: scala.Double): TextData = js.native
  def shiftInitState(view: ViewData, priorInitState: ViewState, newInitState: ViewState): scala.Boolean = js.native
  def shouldCallLifecycleInitHook(view: ViewData, initState: ViewState, index: scala.Double): scala.Boolean = js.native
}

