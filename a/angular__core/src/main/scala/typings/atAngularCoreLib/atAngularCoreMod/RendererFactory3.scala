package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RendererFactory3 extends js.Object {
  var begin: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var end: js.UndefOr[js.Function0[scala.Unit]] = js.native
  def createRenderer(): Renderer3 = js.native
  def createRenderer(hostElement: RElement): Renderer3 = js.native
  def createRenderer(hostElement: RElement, rendererType: RendererType2): Renderer3 = js.native
  def createRenderer(hostElement: scala.Null, rendererType: RendererType2): Renderer3 = js.native
}

