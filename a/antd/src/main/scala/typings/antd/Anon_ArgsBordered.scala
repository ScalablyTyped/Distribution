package typings.antd

import typings.antd.antdStrings.default
import typings.antd.antdStrings.middle
import typings.antd.antdStrings.small
import typings.propDashTypes.propDashTypesMod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsBordered extends js.Object {
  var bordered: Requireable[Boolean]
  var className: Requireable[String]
  var columns: Requireable[js.Array[_]]
  var dataSource: Requireable[js.Array[_]]
  var dropdownPrefixCls: Requireable[String]
  var getPopupContainer: Requireable[js.Function1[/* repeated */ _, _]]
  var loading: Requireable[Boolean | js.Object]
  var locale: Requireable[js.Object]
  var onChange: Requireable[js.Function1[/* repeated */ _, _]]
  var prefixCls: Requireable[String]
  var rowSelection: Requireable[js.Object]
  var size: Requireable[small | default | middle]
  var sortDirections: Requireable[js.Array[_]]
  var useFixedHeader: Requireable[Boolean]
}

object Anon_ArgsBordered {
  @scala.inline
  def apply(
    bordered: Requireable[Boolean],
    className: Requireable[String],
    columns: Requireable[js.Array[_]],
    dataSource: Requireable[js.Array[_]],
    dropdownPrefixCls: Requireable[String],
    getPopupContainer: Requireable[js.Function1[/* repeated */ _, _]],
    loading: Requireable[Boolean | js.Object],
    locale: Requireable[js.Object],
    onChange: Requireable[js.Function1[/* repeated */ _, _]],
    prefixCls: Requireable[String],
    rowSelection: Requireable[js.Object],
    size: Requireable[small | default | middle],
    sortDirections: Requireable[js.Array[_]],
    useFixedHeader: Requireable[Boolean]
  ): Anon_ArgsBordered = {
    val __obj = js.Dynamic.literal(bordered = bordered, className = className, columns = columns, dataSource = dataSource, dropdownPrefixCls = dropdownPrefixCls, getPopupContainer = getPopupContainer, loading = loading, locale = locale, onChange = onChange, prefixCls = prefixCls, rowSelection = rowSelection, size = size, sortDirections = sortDirections, useFixedHeader = useFixedHeader)
  
    __obj.asInstanceOf[Anon_ArgsBordered]
  }
}

