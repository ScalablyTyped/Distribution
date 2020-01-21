package typings.activexAdodb.ADODB

import typings.activexAdodb.activexAdodbNumbers.`0`
import typings.activexAdodb.activexAdodbNumbers.`1`
import typings.activexAdodb.activexAdodbNumbers.`2`
import typings.activexAdodb.activexAdodbNumbers.`4`
import typings.activexAdodb.activexAdodbNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexAdodb.activexAdodbNumbers.`0`
  - typings.activexAdodb.activexAdodbNumbers.`2`
  - typings.activexAdodb.activexAdodbNumbers.`4`
  - typings.activexAdodb.activexAdodbNumbers.`8`
  - typings.activexAdodb.activexAdodbNumbers.`1`
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

