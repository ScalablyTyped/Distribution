package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofenv extends js.Object {
  def editor(): String
  def home(): String
  def hostname(): String
  def path(): String
  def prompt(): String
  def shell(): String
  def tmpdir(): String
  def user(): String
}

object Typeofenv {
  @scala.inline
  def apply(
    editor: () => String,
    home: () => String,
    hostname: () => String,
    path: () => String,
    prompt: () => String,
    shell: () => String,
    tmpdir: () => String,
    user: () => String
  ): Typeofenv = {
    val __obj = js.Dynamic.literal(editor = js.Any.fromFunction0(editor), home = js.Any.fromFunction0(home), hostname = js.Any.fromFunction0(hostname), path = js.Any.fromFunction0(path), prompt = js.Any.fromFunction0(prompt), shell = js.Any.fromFunction0(shell), tmpdir = js.Any.fromFunction0(tmpdir), user = js.Any.fromFunction0(user))
  
    __obj.asInstanceOf[Typeofenv]
  }
}

