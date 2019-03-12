package typings
package antlr4Lib.inputStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antlr4/InputStream", "InputStream")
@js.native
class InputStream protected () extends js.Object {
  def this(data: java.lang.String) = this()
  def this(data: java.lang.String, decodeToUnicodeCodePoints: scala.Boolean) = this()
  val index: scala.Double = js.native
  val size: scala.Double = js.native
  def LA(offset: scala.Double): java.lang.String = js.native
  def LT(offset: scala.Double): java.lang.String = js.native
  def consume(): scala.Unit = js.native
  def getText(start: scala.Double, stop: scala.Double): java.lang.String = js.native
  def mark(): scala.Double = js.native
  def release(marker: js.Any): scala.Double = js.native
  def reset(): scala.Unit = js.native
  def seek(index: scala.Double): scala.Unit = js.native
}

