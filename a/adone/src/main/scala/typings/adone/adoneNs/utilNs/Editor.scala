package typings.adone.adoneNs.utilNs

import typings.adone.adoneNs.utilNs.INs.EditorOptions
import typings.node.childUnderscoreProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.util.Editor")
@js.native
class Editor () extends js.Object {
  def this(options: EditorOptions) = this()
  def cleanup(): js.Promise[Unit] = js.native
  def run(): js.Promise[String] = js.native
  def spawn(): js.Promise[ChildProcess] = js.native
}

/* static members */
@JSGlobal("adone.util.Editor")
@js.native
object Editor extends js.Object {
  var DEFAULT: String = js.native
  def edit(): js.Promise[String] = js.native
  def edit(options: EditorOptions): js.Promise[String] = js.native
}

