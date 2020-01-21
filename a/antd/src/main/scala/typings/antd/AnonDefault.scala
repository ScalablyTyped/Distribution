package typings.antd

import typings.antd.antdStrings.default
import typings.antd.antdStrings.large
import typings.antd.antdStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefault extends js.Object {
  var size: small | default | large
  var spinning: Boolean
  var wrapperClassName: String
}

object AnonDefault {
  @scala.inline
  def apply(size: small | default | large, spinning: Boolean, wrapperClassName: String): AnonDefault = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], spinning = spinning.asInstanceOf[js.Any], wrapperClassName = wrapperClassName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDefault]
  }
}

