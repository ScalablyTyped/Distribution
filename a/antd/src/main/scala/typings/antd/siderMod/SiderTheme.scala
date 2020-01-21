package typings.antd.siderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.antd.antdStrings.light
  - typings.antd.antdStrings.dark
*/
trait SiderTheme extends js.Object

object SiderTheme {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dark: typings.antd.antdStrings.dark = this.cast("dark")
  @scala.inline
  def light: typings.antd.antdStrings.light = this.cast("light")
}

