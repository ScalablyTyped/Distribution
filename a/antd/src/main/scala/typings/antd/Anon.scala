package typings.antd

import typings.antd.antdStrings._empty
import typings.antd.antdStrings.error
import typings.antd.antdStrings.success
import typings.antd.antdStrings.validating
import typings.antd.antdStrings.warning
import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon extends js.Object {
  var children: Requireable[ReactNodeLike]
  var className: Requireable[String]
  var colon: Requireable[Boolean]
  var hasFeedback: Requireable[Boolean]
  var help: Requireable[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray]
  var id: Requireable[String]
  var label: Requireable[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray]
  var labelCol: Requireable[js.Object]
  var prefixCls: Requireable[String]
  var validateStatus: Requireable[_empty | error | success | warning | validating]
  var wrapperCol: Requireable[js.Object]
}

object Anon {
  @scala.inline
  def apply(
    children: Requireable[ReactNodeLike],
    className: Requireable[String],
    colon: Requireable[Boolean],
    hasFeedback: Requireable[Boolean],
    help: Requireable[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray],
    id: Requireable[String],
    label: Requireable[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray],
    labelCol: Requireable[js.Object],
    prefixCls: Requireable[String],
    validateStatus: Requireable[_empty | error | success | warning | validating],
    wrapperCol: Requireable[js.Object]
  ): Anon = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], colon = colon.asInstanceOf[js.Any], hasFeedback = hasFeedback.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelCol = labelCol.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], validateStatus = validateStatus.asInstanceOf[js.Any], wrapperCol = wrapperCol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon]
  }
}

