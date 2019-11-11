package typings.antd

import typings.antd.antdStrings.Empty
import typings.antd.antdStrings.error
import typings.antd.antdStrings.success
import typings.antd.antdStrings.validating
import typings.antd.antdStrings.warning
import typings.propDashTypes.propDashTypesMod.ReactElementLike
import typings.propDashTypes.propDashTypesMod.ReactNodeArray
import typings.propDashTypes.propDashTypesMod.ReactNodeLike
import typings.propDashTypes.propDashTypesMod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ extends js.Object {
  var children: Requireable[ReactNodeLike]
  var className: Requireable[String]
  var colon: Requireable[Boolean]
  var hasFeedback: Requireable[Boolean]
  var help: Requireable[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray]
  var id: Requireable[String]
  var label: Requireable[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray]
  var labelCol: Requireable[js.Object]
  var prefixCls: Requireable[String]
  var validateStatus: Requireable[Empty | error | success | warning | validating]
  var wrapperCol: Requireable[js.Object]
}

object Anon_ {
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
    validateStatus: Requireable[Empty | error | success | warning | validating],
    wrapperCol: Requireable[js.Object]
  ): Anon_ = {
    val __obj = js.Dynamic.literal(children = children, className = className, colon = colon, hasFeedback = hasFeedback, help = help, id = id, label = label, labelCol = labelCol, prefixCls = prefixCls, validateStatus = validateStatus, wrapperCol = wrapperCol)
  
    __obj.asInstanceOf[Anon_]
  }
}

