package typings
package adoneLib.adoneNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.util.Editor")
@js.native
class Editor () extends js.Object {
  def this(options: adoneLib.adoneNs.utilNs.INs.EditorOptions) = this()
  def cleanup(): js.Promise[scala.Unit] = js.native
  def run(): js.Promise[java.lang.String] = js.native
  def spawn(): js.Promise[nodeLib.childUnderscoreProcessMod.ChildProcess] = js.native
}

/* static members */
@JSGlobal("adone.util.Editor")
@js.native
object Editor extends js.Object {
  var DEFAULT: java.lang.String = js.native
  def edit(): js.Promise[java.lang.String] = js.native
  def edit(options: adoneLib.adoneNs.utilNs.INs.EditorOptions): js.Promise[java.lang.String] = js.native
}

