package typings
package adlerDash32Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adler-32", JSImport.Namespace)
@js.native
object adlerDash32Mod extends js.Object {
  val version: java.lang.String = js.native
  def bstr(data: java.lang.String): scala.Double = js.native
  def bstr(data: java.lang.String, seed: scala.Double): scala.Double = js.native
  def buf(data: js.Array[scala.Double]): scala.Double = js.native
  def buf(data: js.Array[scala.Double], seed: scala.Double): scala.Double = js.native
  def buf(data: stdLib.Uint8Array): scala.Double = js.native
  def buf(data: stdLib.Uint8Array, seed: scala.Double): scala.Double = js.native
  def str(data: java.lang.String): scala.Double = js.native
  def str(data: java.lang.String, seed: scala.Double): scala.Double = js.native
}

