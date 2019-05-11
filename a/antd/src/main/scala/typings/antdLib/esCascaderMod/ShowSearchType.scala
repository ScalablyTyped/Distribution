package typings
package antdLib.esCascaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowSearchType extends js.Object {
  var filter: js.UndefOr[
    js.Function3[
      /* inputValue */ java.lang.String, 
      /* path */ js.Array[CascaderOptionType], 
      /* names */ FilledFieldNamesType, 
      scala.Boolean
    ]
  ] = js.undefined
  var limit: js.UndefOr[scala.Double | antdLib.antdLibNumbers.`false`] = js.undefined
  var matchInputWidth: js.UndefOr[scala.Boolean] = js.undefined
  var render: js.UndefOr[
    js.Function4[
      /* inputValue */ java.lang.String, 
      /* path */ js.Array[CascaderOptionType], 
      /* prefixCls */ js.UndefOr[java.lang.String], 
      /* names */ FilledFieldNamesType, 
      reactLib.reactMod.ReactNode
    ]
  ] = js.undefined
  var sort: js.UndefOr[
    js.Function4[
      /* a */ js.Array[CascaderOptionType], 
      /* b */ js.Array[CascaderOptionType], 
      /* inputValue */ java.lang.String, 
      /* names */ FilledFieldNamesType, 
      scala.Double
    ]
  ] = js.undefined
}

object ShowSearchType {
  @scala.inline
  def apply(
    filter: (/* inputValue */ java.lang.String, /* path */ js.Array[CascaderOptionType], /* names */ FilledFieldNamesType) => scala.Boolean = null,
    limit: scala.Double | antdLib.antdLibNumbers.`false` = null,
    matchInputWidth: js.UndefOr[scala.Boolean] = js.undefined,
    render: (/* inputValue */ java.lang.String, /* path */ js.Array[CascaderOptionType], /* prefixCls */ js.UndefOr[java.lang.String], /* names */ FilledFieldNamesType) => reactLib.reactMod.ReactNode = null,
    sort: (/* a */ js.Array[CascaderOptionType], /* b */ js.Array[CascaderOptionType], /* inputValue */ java.lang.String, /* names */ FilledFieldNamesType) => scala.Double = null
  ): ShowSearchType = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction3(filter))
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(matchInputWidth)) __obj.updateDynamic("matchInputWidth")(matchInputWidth)
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction4(render))
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction4(sort))
    __obj.asInstanceOf[ShowSearchType]
  }
}

