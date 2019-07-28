package typings.antd

import typings.antd.libTransferMod.TransferItem
import typings.propDashTypes.propDashTypesMod.ReactNodeLike
import typings.propDashTypes.propDashTypesMod.Requireable
import typings.propDashTypes.propDashTypesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsBodyClassName extends js.Object {
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

object Anon_ArgsBodyClassName {
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
  ): Anon_ArgsBodyClassName = {
    val __obj = js.Dynamic.literal(body = body, className = className, dataSource = dataSource, disabled = disabled, filterOption = filterOption, footer = footer, height = height, listStyle = listStyle, locale = locale, notFoundContent = notFoundContent, onChange = onChange, operationStyle = operationStyle, operations = operations, prefixCls = prefixCls, render = render, rowKey = rowKey, searchPlaceholder = searchPlaceholder, showSearch = showSearch, style = style, targetKeys = targetKeys, titles = titles)
    __obj.updateDynamic("lazy")(`lazy`)
    __obj.asInstanceOf[Anon_ArgsBodyClassName]
  }
}

