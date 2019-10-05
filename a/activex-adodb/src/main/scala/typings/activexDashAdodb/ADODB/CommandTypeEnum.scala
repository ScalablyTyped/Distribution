package typings.activexDashAdodb.ADODB

import typings.activexDashAdodb.activexDashAdodbNumbers.`-1`
import typings.activexDashAdodb.activexDashAdodbNumbers.`1`
import typings.activexDashAdodb.activexDashAdodbNumbers.`256`
import typings.activexDashAdodb.activexDashAdodbNumbers.`2`
import typings.activexDashAdodb.activexDashAdodbNumbers.`4`
import typings.activexDashAdodb.activexDashAdodbNumbers.`512`
import typings.activexDashAdodb.activexDashAdodbNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexDashAdodb.activexDashAdodbNumbers.`256`
  - typings.activexDashAdodb.activexDashAdodbNumbers.`4`
  - typings.activexDashAdodb.activexDashAdodbNumbers.`2`
  - typings.activexDashAdodb.activexDashAdodbNumbers.`512`
  - typings.activexDashAdodb.activexDashAdodbNumbers.`1`
  - typings.activexDashAdodb.activexDashAdodbNumbers.`8`
  - typings.activexDashAdodb.activexDashAdodbNumbers.`-1`
*/
trait CommandTypeEnum extends js.Object

object CommandTypeEnum {
  @scala.inline
  def adCmdFile: `256` = this.cast(256)
  @scala.inline
  def adCmdStoredProc: `4` = this.cast(4)
  @scala.inline
  def adCmdTable: `2` = this.cast(2)
  @scala.inline
  def adCmdTableDirect: `512` = this.cast(512)
  @scala.inline
  def adCmdText: `1` = this.cast(1)
  @scala.inline
  def adCmdUnknown: `8` = this.cast(8)
  @scala.inline
  def adCmdUnspecified: `-1` = this.cast(-1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

