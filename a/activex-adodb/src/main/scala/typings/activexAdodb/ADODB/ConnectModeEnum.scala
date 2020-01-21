package typings.activexAdodb.ADODB

import typings.activexAdodb.activexAdodbNumbers.`0`
import typings.activexAdodb.activexAdodbNumbers.`12`
import typings.activexAdodb.activexAdodbNumbers.`16`
import typings.activexAdodb.activexAdodbNumbers.`1`
import typings.activexAdodb.activexAdodbNumbers.`2`
import typings.activexAdodb.activexAdodbNumbers.`3`
import typings.activexAdodb.activexAdodbNumbers.`4194304`
import typings.activexAdodb.activexAdodbNumbers.`4`
import typings.activexAdodb.activexAdodbNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexAdodb.activexAdodbNumbers.`1`
  - typings.activexAdodb.activexAdodbNumbers.`3`
  - typings.activexAdodb.activexAdodbNumbers.`4194304`
  - typings.activexAdodb.activexAdodbNumbers.`16`
  - typings.activexAdodb.activexAdodbNumbers.`4`
  - typings.activexAdodb.activexAdodbNumbers.`8`
  - typings.activexAdodb.activexAdodbNumbers.`12`
  - typings.activexAdodb.activexAdodbNumbers.`0`
  - typings.activexAdodb.activexAdodbNumbers.`2`
*/
trait ConnectModeEnum extends js.Object

object ConnectModeEnum {
  @scala.inline
  def adModeRead: `1` = this.cast(1)
  @scala.inline
  def adModeReadWrite: `3` = this.cast(3)
  @scala.inline
  def adModeRecursive: `4194304` = this.cast(4194304)
  @scala.inline
  def adModeShareDenyNone: `16` = this.cast(16)
  @scala.inline
  def adModeShareDenyRead: `4` = this.cast(4)
  @scala.inline
  def adModeShareDenyWrite: `8` = this.cast(8)
  @scala.inline
  def adModeShareExclusive: `12` = this.cast(12)
  @scala.inline
  def adModeUnknown: `0` = this.cast(0)
  @scala.inline
  def adModeWrite: `2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

