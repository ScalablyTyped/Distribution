package typings.antd.esUploadInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.antd.antdStrings.error
  - typings.antd.antdStrings.success
  - typings.antd.antdStrings.done
  - typings.antd.antdStrings.uploading
  - typings.antd.antdStrings.removed
*/
trait UploadFileStatus extends js.Object

object UploadFileStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def done: typings.antd.antdStrings.done = this.cast("done")
  @scala.inline
  def error: typings.antd.antdStrings.error = this.cast("error")
  @scala.inline
  def removed: typings.antd.antdStrings.removed = this.cast("removed")
  @scala.inline
  def success: typings.antd.antdStrings.success = this.cast("success")
  @scala.inline
  def uploading: typings.antd.antdStrings.uploading = this.cast("uploading")
}

