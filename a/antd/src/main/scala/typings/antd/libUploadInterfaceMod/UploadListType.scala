package typings.antd.libUploadInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.antd.antdStrings.text
  - typings.antd.antdStrings.picture
  - typings.antd.antdStrings.`picture-card`
*/
trait UploadListType extends js.Object

object UploadListType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def picture: typings.antd.antdStrings.picture = this.cast("picture")
  @scala.inline
  def `picture-card`: typings.antd.antdStrings.`picture-card` = this.cast("picture-card")
  @scala.inline
  def text: typings.antd.antdStrings.text = this.cast("text")
}

