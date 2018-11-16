package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchFolders extends js.Object {
  val Application: js.Any = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  def apply(Index: scala.Double): ScopeFolder = js.native
  def Add(ScopeFolder: ScopeFolder): scala.Unit = js.native
  def Item(Index: scala.Double): ScopeFolder = js.native
  def Remove(Index: scala.Double): scala.Unit = js.native
}

