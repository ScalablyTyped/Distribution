package typings.antd.cascaderMod

import typings.antd.antdBooleans.`false`
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShowSearchType extends js.Object {
  var filter: js.UndefOr[
    js.Function3[
      /* inputValue */ String, 
      /* path */ js.Array[CascaderOptionType], 
      /* names */ FilledFieldNamesType, 
      Boolean
    ]
  ] = js.native
  var limit: js.UndefOr[Double | `false`] = js.native
  var matchInputWidth: js.UndefOr[Boolean] = js.native
  var render: js.UndefOr[
    js.Function4[
      /* inputValue */ String, 
      /* path */ js.Array[CascaderOptionType], 
      /* prefixCls */ js.UndefOr[String], 
      /* names */ FilledFieldNamesType, 
      ReactNode
    ]
  ] = js.native
  var sort: js.UndefOr[
    js.Function4[
      /* a */ js.Array[CascaderOptionType], 
      /* b */ js.Array[CascaderOptionType], 
      /* inputValue */ String, 
      /* names */ FilledFieldNamesType, 
      Double
    ]
  ] = js.native
}

object ShowSearchType {
  @scala.inline
  def apply(): ShowSearchType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowSearchType]
  }
  @scala.inline
  implicit class ShowSearchTypeOps[Self <: ShowSearchType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFilter(
      value: (/* inputValue */ String, /* path */ js.Array[CascaderOptionType], /* names */ FilledFieldNamesType) => Boolean
    ): Self = this.set("filter", js.Any.fromFunction3(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setLimit(value: Double | `false`): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setMatchInputWidth(value: Boolean): Self = this.set("matchInputWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchInputWidth: Self = this.set("matchInputWidth", js.undefined)
    @scala.inline
    def setRender(
      value: (/* inputValue */ String, /* path */ js.Array[CascaderOptionType], /* prefixCls */ js.UndefOr[String], /* names */ FilledFieldNamesType) => ReactNode
    ): Self = this.set("render", js.Any.fromFunction4(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    @scala.inline
    def setSort(
      value: (/* a */ js.Array[CascaderOptionType], /* b */ js.Array[CascaderOptionType], /* inputValue */ String, /* names */ FilledFieldNamesType) => Double
    ): Self = this.set("sort", js.Any.fromFunction4(value))
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
  
}

