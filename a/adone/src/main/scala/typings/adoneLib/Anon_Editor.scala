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
    editor: () => java.lang.String,
    home: () => java.lang.String,
    hostname: () => java.lang.String,
    path: () => java.lang.String,
    prompt: () => java.lang.String,
    shell: () => java.lang.String,
    tmpdir: () => java.lang.String,
    user: () => java.lang.String
  ): Anon_Editor = {
    val __obj = js.Dynamic.literal(editor = js.Any.fromFunction0(editor), home = js.Any.fromFunction0(home), hostname = js.Any.fromFunction0(hostname), path = js.Any.fromFunction0(path), prompt = js.Any.fromFunction0(prompt), shell = js.Any.fromFunction0(shell), tmpdir = js.Any.fromFunction0(tmpdir), user = js.Any.fromFunction0(user))
  
    __obj.asInstanceOf[Anon_Editor]
  }
}

