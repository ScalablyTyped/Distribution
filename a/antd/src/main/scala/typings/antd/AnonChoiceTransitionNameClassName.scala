package typings.antd

import typings.antd.antdStrings.default
import typings.antd.antdStrings.large
import typings.antd.antdStrings.small
import typings.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChoiceTransitionNameClassName extends js.Object {
  var choiceTransitionName: Requireable[String]
  var className: Requireable[String]
  var id: Requireable[String]
  var notFoundContent: Requireable[_]
  var optionLabelProp: Requireable[String]
  var prefixCls: Requireable[String]
  var showSearch: Requireable[Boolean]
  var size: Requireable[small | default | large]
  var transitionName: Requireable[String]
}

object AnonChoiceTransitionNameClassName {
  @scala.inline
  def apply(
    choiceTransitionName: Requireable[String],
    className: Requireable[String],
    id: Requireable[String],
    notFoundContent: Requireable[_],
    optionLabelProp: Requireable[String],
    prefixCls: Requireable[String],
    showSearch: Requireable[Boolean],
    size: Requireable[small | default | large],
    transitionName: Requireable[String]
  ): AnonChoiceTransitionNameClassName = {
    val __obj = js.Dynamic.literal(choiceTransitionName = choiceTransitionName.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], notFoundContent = notFoundContent.asInstanceOf[js.Any], optionLabelProp = optionLabelProp.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], showSearch = showSearch.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChoiceTransitionNameClassName]
  }
}

