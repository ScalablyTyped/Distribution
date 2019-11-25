package typings.antd

import typings.antd.antdStrings.default
import typings.antd.antdStrings.large
import typings.antd.antdStrings.small
import typings.propDashTypes.propDashTypesMod.ReactElementLike
import typings.propDashTypes.propDashTypesMod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName extends js.Object {
  var className: Requireable[String]
  var indicator: Requireable[ReactElementLike]
  var prefixCls: Requireable[String]
  var size: Requireable[small | default | large]
  var spinning: Requireable[Boolean]
  var wrapperClassName: Requireable[String]
}

object Anon_ClassName {
  @scala.inline
  def apply(
    className: Requireable[String],
    indicator: Requireable[ReactElementLike],
    prefixCls: Requireable[String],
    size: Requireable[small | default | large],
    spinning: Requireable[Boolean],
    wrapperClassName: Requireable[String]
  ): Anon_ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], indicator = indicator.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], spinning = spinning.asInstanceOf[js.Any], wrapperClassName = wrapperClassName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ClassName]
  }
}

