package typings.antd.libIconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.antd.antdStrings.filled
  - typings.antd.antdStrings.outlined
  - typings.antd.antdStrings.twoTone
*/
trait ThemeType extends js.Object

object ThemeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def filled: typings.antd.antdStrings.filled = this.cast("filled")
  @scala.inline
  def outlined: typings.antd.antdStrings.outlined = this.cast("outlined")
  @scala.inline
  def twoTone: typings.antd.antdStrings.twoTone = this.cast("twoTone")
}

