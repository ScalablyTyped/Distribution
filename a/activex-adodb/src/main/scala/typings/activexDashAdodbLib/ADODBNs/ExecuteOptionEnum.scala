package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - activexDashAdodbLib.activexDashAdodbLibNumbers.`16`
  - activexDashAdodbLib.activexDashAdodbLibNumbers.`32`
  - activexDashAdodbLib.activexDashAdodbLibNumbers.`64`
  - activexDashAdodbLib.activexDashAdodbLibNumbers.`128`
  - activexDashAdodbLib.activexDashAdodbLibNumbers.`2048`
  - activexDashAdodbLib.activexDashAdodbLibNumbers.`1024`
  - activexDashAdodbLib.activexDashAdodbLibNumbers.`-1`
*/
trait ExecuteOptionEnum extends js.Object

object ExecuteOptionEnum {
  @scala.inline
  def adAsyncExecute: activexDashAdodbLib.activexDashAdodbLibNumbers.`16` = this.cast(16)
  @scala.inline
  def adAsyncFetch: activexDashAdodbLib.activexDashAdodbLibNumbers.`32` = this.cast(32)
  @scala.inline
  def adAsyncFetchNonBlocking: activexDashAdodbLib.activexDashAdodbLibNumbers.`64` = this.cast(64)
  @scala.inline
  def adExecuteNoRecords: activexDashAdodbLib.activexDashAdodbLibNumbers.`128` = this.cast(128)
  @scala.inline
  def adExecuteRecord: activexDashAdodbLib.activexDashAdodbLibNumbers.`2048` = this.cast(2048)
  @scala.inline
  def adExecuteStream: activexDashAdodbLib.activexDashAdodbLibNumbers.`1024` = this.cast(1024)
  @scala.inline
  def adOptionUnspecified: activexDashAdodbLib.activexDashAdodbLibNumbers.`-1` = this.cast(-1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

