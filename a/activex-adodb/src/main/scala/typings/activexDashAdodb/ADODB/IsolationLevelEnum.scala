package typings.activexDashAdodb.ADODB

import typings.activexDashAdodb.activexDashAdodbNumbers.`-1`
import typings.activexDashAdodb.activexDashAdodbNumbers.`1048576`
import typings.activexDashAdodb.activexDashAdodbNumbers.`16`
import typings.activexDashAdodb.activexDashAdodbNumbers.`256`
import typings.activexDashAdodb.activexDashAdodbNumbers.`4096`
import typings.activexDashAdodb.activexDashAdodbNumbers.`65536`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexDashAdodb.activexDashAdodbNumbers.`256`
  - typings.activexDashAdodb.activexDashAdodbNumbers.`16`
  - typings.activexDashAdodb.activexDashAdodbNumbers.`4096`
  - typings.activexDashAdodb.activexDashAdodbNumbers.`1048576`
  - typings.activexDashAdodb.activexDashAdodbNumbers.`65536`
  - typings.activexDashAdodb.activexDashAdodbNumbers.`-1`
*/
trait IsolationLevelEnum extends js.Object

object IsolationLevelEnum {
  @scala.inline
  def adXactBrowse: `256` = this.cast(256)
  @scala.inline
  def adXactChaos: `16` = this.cast(16)
  @scala.inline
  def adXactCursorStability: `4096` = this.cast(4096)
  @scala.inline
  def adXactIsolated: `1048576` = this.cast(1048576)
  @scala.inline
  def adXactReadCommitted: `4096` = this.cast(4096)
  @scala.inline
  def adXactReadUncommitted: `256` = this.cast(256)
  @scala.inline
  def adXactRepeatableRead: `65536` = this.cast(65536)
  @scala.inline
  def adXactSerializable: `1048576` = this.cast(1048576)
  @scala.inline
  def adXactUnspecified: `-1` = this.cast(-1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

