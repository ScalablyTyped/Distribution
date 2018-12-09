package typings
package atAngularCoreLib.srcViewServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/view/services", "DebugRendererFactory2")
@js.native
class DebugRendererFactory2 protected ()
  extends atAngularCoreLib.srcRenderApiMod.RendererFactory2 {
  def this(delegate: atAngularCoreLib.srcRenderApiMod.RendererFactory2) = this()
  var delegate: js.Any = js.native
  @JSName("begin")
  def begin_MDebugRendererFactory2(): scala.Unit = js.native
  @JSName("end")
  def end_MDebugRendererFactory2(): scala.Unit = js.native
  @JSName("whenRenderingDone")
  def whenRenderingDone_MDebugRendererFactory2(): js.Promise[_] = js.native
}

