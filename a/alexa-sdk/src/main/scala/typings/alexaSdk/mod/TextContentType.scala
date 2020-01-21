package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.alexaSdk.alexaSdkStrings.PlainText
  - typings.alexaSdk.alexaSdkStrings.RichText
*/
trait TextContentType extends js.Object

object TextContentType {
  @scala.inline
  def PlainText: typings.alexaSdk.alexaSdkStrings.PlainText = this.cast("PlainText")
  @scala.inline
  def RichText: typings.alexaSdk.alexaSdkStrings.RichText = this.cast("RichText")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

