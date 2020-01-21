package typings.antd

import typings.antd.antdStrings.default
import typings.antd.antdStrings.small
import typings.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClassNameDefault extends js.Object {
  var className: Requireable[String]
  var prefixCls: Requireable[String]
  var size: Requireable[js.UndefOr[small | default]]
}

object AnonClassNameDefault {
  @scala.inline
  def apply(
    className: Requireable[String],
    prefixCls: Requireable[String],
    size: Requireable[js.UndefOr[small | default]]
  ): AnonClassNameDefault = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonClassNameDefault]
  }
}

