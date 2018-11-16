package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerPolicy extends js.Object {
  val Application: js.Any = js.native
  val BlockPreview: scala.Boolean = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Description: java.lang.String = js.native
  val Id: java.lang.String = js.native
  val Name: java.lang.String = js.native
  val Parent: js.Any = js.native
  val Statement: java.lang.String = js.native
  def apply(Index: java.lang.String): PolicyItem = js.native
  def apply(Index: scala.Double): PolicyItem = js.native
  def Item(Index: java.lang.String): PolicyItem = js.native
  def Item(Index: scala.Double): PolicyItem = js.native
}

