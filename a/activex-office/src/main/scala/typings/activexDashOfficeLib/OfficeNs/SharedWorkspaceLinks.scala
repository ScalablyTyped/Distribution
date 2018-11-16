package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedWorkspaceLinks extends js.Object {
  val Application: js.Any = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val ItemCountExceeded: scala.Boolean = js.native
  val Parent: js.Any = js.native
  def apply(Index: scala.Double): SharedWorkspaceLink = js.native
  def Add(URL: java.lang.String): SharedWorkspaceLink = js.native
  def Add(URL: java.lang.String, Description: java.lang.String): SharedWorkspaceLink = js.native
  def Add(URL: java.lang.String, Description: java.lang.String, Notes: java.lang.String): SharedWorkspaceLink = js.native
  def Item(Index: scala.Double): SharedWorkspaceLink = js.native
}

