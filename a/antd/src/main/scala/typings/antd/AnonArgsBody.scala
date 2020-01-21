package typings.antd

import typings.antd.transferMod.TransferItem
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgsBody extends js.Object {
  var body: Requireable[js.Function1[/* repeated */ _, _]]
  var className: Requireable[String]
  var dataSource: Validator[js.Array[TransferItem]]
  var disabled: Requireable[Boolean]
  var filterOption: Requireable[js.Function1[/* repeated */ _, _]]
  var footer: Requireable[js.Function1[/* repeated */ _, _]]
  var height: Requireable[Double]
  var `lazy`: Requireable[Boolean | js.Object]
  var listStyle: Requireable[js.Object]
  var locale: Requireable[js.Object]
  var notFoundContent: Requireable[ReactNodeLike]
  var onChange: Requireable[js.Function1[/* repeated */ _, _]]
  var operationStyle: Requireable[js.Object]
  var operations: Requireable[js.Array[_]]
  var prefixCls: Requireable[String]
  var render: Requireable[js.Function1[/* repeated */ _, _]]
  var rowKey: Requireable[js.Function1[/* repeated */ _, _]]
  var searchPlaceholder: Requireable[String]
  var showSearch: Requireable[Boolean]
  var style: Requireable[js.Object]
  var targetKeys: Requireable[js.Array[_]]
  var titles: Requireable[js.Array[_]]
}

object AnonArgsBody {
  @scala.inline
  def apply(
    body: Requireable[js.Function1[/* repeated */ _, _]],
    className: Requireable[String],
    dataSource: Validator[js.Array[TransferItem]],
    disabled: Requireable[Boolean],
    filterOption: Requireable[js.Function1[/* repeated */ _, _]],
    footer: Requireable[js.Function1[/* repeated */ _, _]],
    height: Requireable[Double],
    `lazy`: Requireable[Boolean | js.Object],
    listStyle: Requireable[js.Object],
    locale: Requireable[js.Object],
    notFoundContent: Requireable[ReactNodeLike],
    onChange: Requireable[js.Function1[/* repeated */ _, _]],
    operationStyle: Requireable[js.Object],
    operations: Requireable[js.Array[_]],
    prefixCls: Requireable[String],
    render: Requireable[js.Function1[/* repeated */ _, _]],
    rowKey: Requireable[js.Function1[/* repeated */ _, _]],
    searchPlaceholder: Requireable[String],
    showSearch: Requireable[Boolean],
    style: Requireable[js.Object],
    targetKeys: Requireable[js.Array[_]],
    titles: Requireable[js.Array[_]]
  ): AnonArgsBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], filterOption = filterOption.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], listStyle = listStyle.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], notFoundContent = notFoundContent.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], operationStyle = operationStyle.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], rowKey = rowKey.asInstanceOf[js.Any], searchPlaceholder = searchPlaceholder.asInstanceOf[js.Any], showSearch = showSearch.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], targetKeys = targetKeys.asInstanceOf[js.Any], titles = titles.asInstanceOf[js.Any])
    __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArgsBody]
  }
}

