package typings.asciify

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asciify", JSImport.Namespace)
@js.native
object asciifyMod extends js.Object {
  def apply(text: String, callback: AsciifyCallback): Unit = js.native
  def apply(text: String, options: String, callback: AsciifyCallback): Unit = js.native
  def apply(text: String, options: AsciifyOptions, callback: AsciifyCallback): Unit = js.native
  def getFonts(callback: js.Function2[/* err */ Error, /* fonts */ js.Array[String], Unit]): Unit = js.native
}

