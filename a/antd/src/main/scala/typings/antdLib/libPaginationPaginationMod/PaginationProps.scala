package typings
package antdLib.libPaginationPaginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PaginationProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var current: js.UndefOr[scala.Double] = js.undefined
  var defaultCurrent: js.UndefOr[scala.Double] = js.undefined
  var defaultPageSize: js.UndefOr[scala.Double] = js.undefined
  var hideOnSinglePage: js.UndefOr[scala.Boolean] = js.undefined
  var itemRender: js.UndefOr[
    js.Function2[
      /* page */ scala.Double, 
      /* type */ antdLib.antdLibStrings.page | antdLib.antdLibStrings.prev | antdLib.antdLibStrings.next | antdLib.antdLibStrings.`jump-prev` | antdLib.antdLibStrings.`jump-next`, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var locale: js.UndefOr[js.Object] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[/* page */ scala.Double, /* pageSize */ js.UndefOr[scala.Double], scala.Unit]
  ] = js.undefined
  var onShowSizeChange: js.UndefOr[js.Function2[/* current */ scala.Double, /* size */ scala.Double, scala.Unit]] = js.undefined
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  var pageSizeOptions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
  var selectPrefixCls: js.UndefOr[java.lang.String] = js.undefined
  var showQuickJumper: js.UndefOr[scala.Boolean] = js.undefined
  var showSizeChanger: js.UndefOr[scala.Boolean] = js.undefined
  var showTotal: js.UndefOr[
    js.Function2[
      /* total */ scala.Double, 
      /* range */ js.Tuple2[scala.Double, scala.Double], 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var simple: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var total: js.UndefOr[scala.Double] = js.undefined
}

