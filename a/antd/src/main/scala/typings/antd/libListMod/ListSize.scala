package typings.antd.libListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.antd.antdStrings.small
  - typings.antd.antdStrings.default
  - typings.antd.antdStrings.large
*/
trait ListSize extends js.Object

object ListSize {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typings.antd.antdStrings.default = this.cast("default")
  @scala.inline
  def large: typings.antd.antdStrings.large = this.cast("large")
  @scala.inline
  def small: typings.antd.antdStrings.small = this.cast("small")
}

