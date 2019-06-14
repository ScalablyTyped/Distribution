package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - activexDashAdodbLib.activexDashAdodbLibNumbers.`256`
  - activexDashAdodbLib.activexDashAdodbLibNumbers.`16`
  - activexDashAdodbLib.activexDashAdodbLibNumbers.`4096`
  - activexDashAdodbLib.activexDashAdodbLibNumbers.`1048576`
  - activexDashAdodbLib.activexDashAdodbLibNumbers.`65536`
  - activexDashAdodbLib.activexDashAdodbLibNumbers.`-1`
*/
trait IsolationLevelEnum extends js.Object

object IsolationLevelEnum {
  @scala.inline
  def adXactBrowse: activexDashAdodbLib.activexDashAdodbLibNumbers.`256` = this.cast(256)
  @scala.inline
  def adXactChaos: activexDashAdodbLib.activexDashAdodbLibNumbers.`16` = this.cast(16)
  @scala.inline
  def adXactCursorStability: activexDashAdodbLib.activexDashAdodbLibNumbers.`4096` = this.cast(4096)
  @scala.inline
  def adXactIsolated: activexDashAdodbLib.activexDashAdodbLibNumbers.`1048576` = this.cast(1048576)
  @scala.inline
  def adXactReadCommitted: activexDashAdodbLib.activexDashAdodbLibNumbers.`4096` = this.cast(4096)
  @scala.inline
  def adXactReadUncommitted: activexDashAdodbLib.activexDashAdodbLibNumbers.`256` = this.cast(256)
  @scala.inline
  def adXactRepeatableRead: activexDashAdodbLib.activexDashAdodbLibNumbers.`65536` = this.cast(65536)
  @scala.inline
  def adXactSerializable: activexDashAdodbLib.activexDashAdodbLibNumbers.`1048576` = this.cast(1048576)
  @scala.inline
  def adXactUnspecified: activexDashAdodbLib.activexDashAdodbLibNumbers.`-1` = this.cast(-1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

