package typings
package adoneLib.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BracesFunction extends js.Object {
  var MAX_LENGTH: scala.Double = js.native
  def apply(pattern: java.lang.String): js.Array[java.lang.String] = js.native
  def apply(pattern: java.lang.String, options: BracesOptions): js.Array[java.lang.String] = js.native
  def clearCache(): scala.Unit = js.native
  def expand(pattern: java.lang.String): js.Array[java.lang.String] = js.native
  def expand(pattern: java.lang.String, options: BracesOptions): js.Array[java.lang.String] = js.native
  def getCache(): js.Object = js.native
   // TODO
  def makeRe(pattern: java.lang.String): stdLib.RegExp = js.native
  def makeRe(pattern: java.lang.String, options: BracesOptions): stdLib.RegExp = js.native
  def resizeCache(newSize: scala.Double): scala.Unit = js.native
}

