package typings.activexAdodb.ADODB

import typings.activexAdodb.activexAdodbNumbers.`-1`
import typings.activexAdodb.activexAdodbNumbers.`-2147483648`
import typings.activexAdodb.activexAdodbNumbers.`0`
import typings.activexAdodb.activexAdodbNumbers.`33554432`
import typings.activexAdodb.activexAdodbNumbers.`67108864`
import typings.activexAdodb.activexAdodbNumbers.`8192`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexAdodb.activexAdodbNumbers.`8192`
  - typings.activexAdodb.activexAdodbNumbers.`0`
  - typings.activexAdodb.activexAdodbNumbers.`67108864`
  - typings.activexAdodb.activexAdodbNumbers.`-2147483648`
  - typings.activexAdodb.activexAdodbNumbers.`-1`
  - typings.activexAdodb.activexAdodbNumbers.`33554432`
*/
trait RecordCreateOptionsEnum extends js.Object

object RecordCreateOptionsEnum {
  @scala.inline
  def adCreateCollection: `8192` = this.cast(8192)
  @scala.inline
  def adCreateNonCollection: `0` = this.cast(0)
  @scala.inline
  def adCreateOverwrite: `67108864` = this.cast(67108864)
  @scala.inline
  def adCreateStructDoc: `-2147483648` = this.cast(-2147483648)
  @scala.inline
  def adFailIfNotExists: `-1` = this.cast(-1)
  @scala.inline
  def adOpenIfExists: `33554432` = this.cast(33554432)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

