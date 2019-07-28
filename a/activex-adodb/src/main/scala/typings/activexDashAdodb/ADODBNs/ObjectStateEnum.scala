package typings.activexDashAdodb.ADODBNs

import typings.activexDashAdodb.activexDashAdodbNumbers.`0`
import typings.activexDashAdodb.activexDashAdodbNumbers.`1`
import typings.activexDashAdodb.activexDashAdodbNumbers.`2`
import typings.activexDashAdodb.activexDashAdodbNumbers.`4`
import typings.activexDashAdodb.activexDashAdodbNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexDashAdodb.activexDashAdodbNumbers.`0`
  - typings.activexDashAdodb.activexDashAdodbNumbers.`2`
  - typings.activexDashAdodb.activexDashAdodbNumbers.`4`
  - typings.activexDashAdodb.activexDashAdodbNumbers.`8`
  - typings.activexDashAdodb.activexDashAdodbNumbers.`1`
*/
trait ObjectStateEnum extends js.Object

object ObjectStateEnum {
  @scala.inline
  def adStateClosed: `0` = this.cast(0)
  @scala.inline
  def adStateConnecting: `2` = this.cast(2)
  @scala.inline
  def adStateExecuting: `4` = this.cast(4)
  @scala.inline
  def adStateFetching: `8` = this.cast(8)
  @scala.inline
  def adStateOpen: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

