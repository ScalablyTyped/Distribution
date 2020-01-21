package typings.antd.baseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.antd.antdStrings.secondary
  - typings.antd.antdStrings.danger
  - typings.antd.antdStrings.warning
*/
trait BaseType extends js.Object

object BaseType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def danger: typings.antd.antdStrings.danger = this.cast("danger")
  @scala.inline
  def secondary: typings.antd.antdStrings.secondary = this.cast("secondary")
  @scala.inline
  def warning: typings.antd.antdStrings.warning = this.cast("warning")
}

