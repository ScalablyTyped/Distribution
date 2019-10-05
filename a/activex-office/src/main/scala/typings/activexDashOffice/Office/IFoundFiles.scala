package typings.activexDashOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** For Macintosh only */
// tslint:disable-next-line:interface-name
@js.native
trait IFoundFiles extends js.Object {
  val Count: Double = js.native
  def apply(Index: Double): String = js.native
  def Item(Index: Double): String = js.native
}

