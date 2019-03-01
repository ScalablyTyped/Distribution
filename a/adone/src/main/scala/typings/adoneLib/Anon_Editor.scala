package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Editor extends js.Object {
  def editor(): java.lang.String
  def home(): java.lang.String
  def hostname(): java.lang.String
  def path(): java.lang.String
  def prompt(): java.lang.String
  def shell(): java.lang.String
  def tmpdir(): java.lang.String
  def user(): java.lang.String
}

object Anon_Editor {
  @scala.inline
  def apply(
    editor: js.Function0[java.lang.String],
    home: js.Function0[java.lang.String],
    hostname: js.Function0[java.lang.String],
    path: js.Function0[java.lang.String],
    prompt: js.Function0[java.lang.String],
    shell: js.Function0[java.lang.String],
    tmpdir: js.Function0[java.lang.String],
    user: js.Function0[java.lang.String]
  ): Anon_Editor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("editor")(editor)
    __obj.updateDynamic("home")(home)
    __obj.updateDynamic("hostname")(hostname)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("prompt")(prompt)
    __obj.updateDynamic("shell")(shell)
    __obj.updateDynamic("tmpdir")(tmpdir)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Anon_Editor]
  }
}

