package typings.antd.libCascaderMod

import typings.antd.antdBooleans.`false`
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowSearchType extends js.Object {
  var filter: js.UndefOr[
    js.Function3[
      /* inputValue */ String, 
      /* path */ js.Array[CascaderOptionType], 
      /* names */ FilledFieldNamesType, 
      Boolean
    ]
  ] = js.undefined
  var limit: js.UndefOr[Double | `false`] = js.undefined
  var matchInputWidth: js.UndefOr[Boolean] = js.undefined
  var render: js.UndefOr[
    js.Function4[
      /* inputValue */ String, 
      /* path */ js.Array[CascaderOptionType], 
      /* prefixCls */ js.UndefOr[String], 
      /* names */ FilledFieldNamesType, 
      ReactNode
    ]
  ] = js.undefined
  var sort: js.UndefOr[
    js.Function4[
      /* a */ js.Array[CascaderOptionType], 
      /* b */ js.Array[CascaderOptionType], 
      /* inputValue */ String, 
      /* names */ FilledFieldNamesType, 
      Double
    ]
  ] = js.undefined
}

object ShowSearchType {
  @scala.inline
  def apply(
    filter: (/* inputValue */ String, /* path */ js.Array[CascaderOptionType], /* names */ FilledFieldNamesType) => Boolean = null,
    limit: Double | `false` = null,
    matchInputWidth: js.UndefOr[Boolean] = js.undefined,
    render: (/* inputValue */ String, /* path */ js.Array[CascaderOptionType], /* prefixCls */ js.UndefOr[String], /* names */ FilledFieldNamesType) => ReactNode = null,
    sort: (/* a */ js.Array[CascaderOptionType], /* b */ js.Array[CascaderOptionType], /* inputValue */ String, /* names */ FilledFieldNamesType) => Double = null
  ): ShowSearchType = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction3(filter))
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(matchInputWidth)) __obj.updateDynamic("matchInputWidth")(matchInputWidth.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction4(render))
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction4(sort))
    __obj.asInstanceOf[ShowSearchType]
  }
}

