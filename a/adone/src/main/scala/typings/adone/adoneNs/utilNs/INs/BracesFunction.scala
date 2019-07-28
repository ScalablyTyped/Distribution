package typings.adone.adoneNs.utilNs.INs

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BracesFunction extends js.Object {
  var MAX_LENGTH: Double = js.native
  def apply(pattern: String): js.Array[String] = js.native
  def apply(pattern: String, options: BracesOptions): js.Array[String] = js.native
  def clearCache(): Unit = js.native
  def expand(pattern: String): js.Array[String] = js.native
  def expand(pattern: String, options: BracesOptions): js.Array[String] = js.native
  def getCache(): js.Object = js.native
   // TODO
  def makeRe(pattern: String): RegExp = js.native
  def makeRe(pattern: String, options: BracesOptions): RegExp = js.native
  def resizeCache(newSize: Double): Unit = js.native
}

