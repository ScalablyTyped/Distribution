package typings
package atAngularCoreLib.srcViewTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/view/types", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Services: atAngularCoreLib.srcViewTypesMod.Services = js.native
  def asElementData(view: atAngularCoreLib.srcViewTypesMod.ViewData, index: scala.Double): atAngularCoreLib.srcViewTypesMod.ElementData = js.native
  def asProviderData(view: atAngularCoreLib.srcViewTypesMod.ViewData, index: scala.Double): atAngularCoreLib.srcViewTypesMod.ProviderData = js.native
  def asPureExpressionData(view: atAngularCoreLib.srcViewTypesMod.ViewData, index: scala.Double): atAngularCoreLib.srcViewTypesMod.PureExpressionData = js.native
  def asQueryList(view: atAngularCoreLib.srcViewTypesMod.ViewData, index: scala.Double): atAngularCoreLib.srcLinkerQueryUnderscoreListMod.QueryList[_] = js.native
  def asTextData(view: atAngularCoreLib.srcViewTypesMod.ViewData, index: scala.Double): atAngularCoreLib.srcViewTypesMod.TextData = js.native
  def shiftInitState(
    view: atAngularCoreLib.srcViewTypesMod.ViewData,
    priorInitState: atAngularCoreLib.srcViewTypesMod.ViewState,
    newInitState: atAngularCoreLib.srcViewTypesMod.ViewState
  ): scala.Boolean = js.native
  def shouldCallLifecycleInitHook(
    view: atAngularCoreLib.srcViewTypesMod.ViewData,
    initState: atAngularCoreLib.srcViewTypesMod.ViewState,
    index: scala.Double
  ): scala.Boolean = js.native
}

