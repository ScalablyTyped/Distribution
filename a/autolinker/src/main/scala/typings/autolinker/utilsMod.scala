package typings.autolinker

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("autolinker/dist/commonjs/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def defaults(dest: js.Any, src: js.Any): js.Any = js.native
  def ellipsis(str: String, truncateLen: Double): String = js.native
  def ellipsis(str: String, truncateLen: Double, ellipsisChars: String): String = js.native
  def indexOf[T](arr: js.Array[T], element: T): Double = js.native
  def remove[T](arr: js.Array[T], fn: js.Function1[/* item */ T, Boolean]): Unit = js.native
  def splitAndCapture(str: String, splitRegex: RegExp): js.Array[String] = js.native
  def throwUnhandledCaseError(theValue: scala.Nothing): Unit = js.native
}

