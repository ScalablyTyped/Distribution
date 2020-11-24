package typings.awesomplete.mod

import typings.awesomplete.anon.Value
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var autoFirst: js.UndefOr[Boolean] = js.native
  
  var data: js.UndefOr[js.Function2[/* item */ Suggestion, /* input */ String, String]] = js.native
  
  var filter: js.UndefOr[js.Function2[/* text */ String, /* input */ String, Boolean]] = js.native
  
  var item: js.UndefOr[js.Function2[/* text */ String, /* input */ String, HTMLElement]] = js.native
  
  var list: js.UndefOr[String | (js.Array[String | (js.Tuple2[String, String]) | Value]) | Element] = js.native
  
  var maxItems: js.UndefOr[Double] = js.native
  
  var minChars: js.UndefOr[Double] = js.native
  
  var replace: js.UndefOr[js.Function1[/* suggestion */ String | Suggestion, Unit]] = js.native
  
  var sort: js.UndefOr[Boolean | SortFunction] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAutoFirst(value: Boolean): Self = this.set("autoFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFirst: Self = this.set("autoFirst", js.undefined)
    
    @scala.inline
    def setData(value: (/* item */ Suggestion, /* input */ String) => String): Self = this.set("data", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setFilter(value: (/* text */ String, /* input */ String) => Boolean): Self = this.set("filter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setItem(value: (/* text */ String, /* input */ String) => HTMLElement): Self = this.set("item", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    
    @scala.inline
    def setListVarargs(value: (String | (js.Tuple2[String, String]) | Value)*): Self = this.set("list", js.Array(value :_*))
    
    @scala.inline
    def setList(value: String | (js.Array[String | (js.Tuple2[String, String]) | Value]) | Element): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    
    @scala.inline
    def setMaxItems(value: Double): Self = this.set("maxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxItems: Self = this.set("maxItems", js.undefined)
    
    @scala.inline
    def setMinChars(value: Double): Self = this.set("minChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinChars: Self = this.set("minChars", js.undefined)
    
    @scala.inline
    def setReplace(value: /* suggestion */ String | Suggestion => Unit): Self = this.set("replace", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteReplace: Self = this.set("replace", js.undefined)
    
    @scala.inline
    def setSortFunction2(value: (/* left */ Double | js.Array[js.Any], /* right */ Double | js.Array[js.Any]) => Double): Self = this.set("sort", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSort(value: Boolean | SortFunction): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
}
