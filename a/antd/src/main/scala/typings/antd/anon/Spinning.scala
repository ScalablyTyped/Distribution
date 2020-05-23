package typings.antd.anon

import typings.antd.antdStrings.default
import typings.antd.antdStrings.large
import typings.antd.antdStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spinning extends js.Object {
  var size: small | large | default
  var spinning: Boolean
  var wrapperClassName: String
}

object Spinning {
  @scala.inline
  def apply(size: small | large | default, spinning: Boolean, wrapperClassName: String): Spinning = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], spinning = spinning.asInstanceOf[js.Any], wrapperClassName = wrapperClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spinning]
  }
}

