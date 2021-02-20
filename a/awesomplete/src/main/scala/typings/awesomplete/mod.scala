package typings.awesomplete

import typings.awesomplete.anon.Label
import typings.awesomplete.anon.Replace
import typings.awesomplete.anon.Value
import typings.std.Element
import typings.std.EventTarget
import typings.std.HTMLElement
import typings.std.NodeList
import typings.std.ParentNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("awesomplete", JSImport.Namespace)
  @js.native
  class ^ protected () extends Awesomplete {
    def this(input: String) = this()
    def this(input: Element) = this()
    def this(input: HTMLElement) = this()
    def this(input: String, o: Options) = this()
    def this(input: Element, o: Options) = this()
    def this(input: HTMLElement, o: Options) = this()
  }
  @JSImport("awesomplete", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("awesomplete", "$$")
  @js.native
  def $(expr: String): NodeList = js.native
  @JSImport("awesomplete", "$$")
  @js.native
  def $(expr: String, con: js.Any): NodeList = js.native
  @JSImport("awesomplete", "$$")
  @js.native
  def $(expr: ParentNode): NodeList = js.native
  @JSImport("awesomplete", "$$")
  @js.native
  def $(expr: ParentNode, con: js.Any): NodeList = js.native
  
  /* static member */
  @JSImport("awesomplete", "DATA")
  @js.native
  def DATA: js.Function1[/* item */ Suggestion, Suggestion] = js.native
  @scala.inline
  def DATA_=(x: js.Function1[/* item */ Suggestion, Suggestion]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATA")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("awesomplete", "FILTER_CONTAINS")
  @js.native
  def FILTER_CONTAINS: js.Function2[/* text */ String, /* input */ String, Boolean] = js.native
  @scala.inline
  def FILTER_CONTAINS_=(x: js.Function2[/* text */ String, /* input */ String, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILTER_CONTAINS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("awesomplete", "FILTER_STARTSWITH")
  @js.native
  def FILTER_STARTSWITH: js.Function2[/* text */ String, /* input */ String, Boolean] = js.native
  @scala.inline
  def FILTER_STARTSWITH_=(x: js.Function2[/* text */ String, /* input */ String, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILTER_STARTSWITH")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("awesomplete", "ITEM")
  @js.native
  def ITEM: js.Function2[/* text */ String, /* input */ String, HTMLElement] = js.native
  @scala.inline
  def ITEM_=(x: js.Function2[/* text */ String, /* input */ String, HTMLElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ITEM")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("awesomplete", "REPLACE")
  @js.native
  def REPLACE: js.Function1[/* text */ String, Unit] = js.native
  @scala.inline
  def REPLACE_=(x: js.Function1[/* text */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REPLACE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("awesomplete", "SORT_BYLENGTH")
  @js.native
  def SORT_BYLENGTH: js.Function2[/* left */ Double | js.Array[js.Any], /* right */ Double | js.Array[js.Any], Double] = js.native
  @scala.inline
  def SORT_BYLENGTH_=(
    x: js.Function2[/* left */ Double | js.Array[js.Any], /* right */ Double | js.Array[js.Any], Double]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SORT_BYLENGTH")(x.asInstanceOf[js.Any])
  
  /* static member */
  object _empty {
    
    @JSImport("awesomplete", "$")
    @js.native
    def apply(expr: String): String | Element = js.native
    @JSImport("awesomplete", "$")
    @js.native
    def apply(expr: String, con: ParentNode): String | Element = js.native
    @JSImport("awesomplete", "$")
    @js.native
    def apply(expr: Element): String | Element = js.native
    @JSImport("awesomplete", "$")
    @js.native
    def apply(expr: Element, con: ParentNode): String | Element = js.native
    
    @JSImport("awesomplete", "$.create")
    @js.native
    def create(tag: String, o: js.Any): HTMLElement = js.native
    
    @JSImport("awesomplete", "$.fire")
    @js.native
    def fire(target: EventTarget, `type`: String, properties: js.Any): js.Any = js.native
    
    @JSImport("awesomplete", "$.regExpEscape")
    @js.native
    def regExpEscape(s: Replace): js.Any = js.native
    
    @JSImport("awesomplete", "$.siblingIndex")
    @js.native
    def siblingIndex(el: Element): Double = js.native
  }
  
  /* static member */
  @JSImport("awesomplete", "all")
  @js.native
  def all: js.Array[js.Any] = js.native
  @scala.inline
  def all_=(x: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Awesomplete extends StObject {
    
    def close(): Unit = js.native
    
    var container: HTMLElement = js.native
    
    def destroy(): Unit = js.native
    
    def evaluate(): Unit = js.native
    
    def goto(i: Double): Unit = js.native
    
    var index: Double = js.native
    
    var input: HTMLElement | String = js.native
    
    var list: String | Element | js.Array[Suggestion] = js.native
    
    def next(): Unit = js.native
    
    def open(): Unit = js.native
    
    var opened: Double = js.native
    
    def previous(): Unit = js.native
    
    def select(): Unit = js.native
    def select(selected: js.UndefOr[scala.Nothing], originalTarget: HTMLElement): Unit = js.native
    def select(selected: HTMLElement): Unit = js.native
    def select(selected: HTMLElement, originalTarget: HTMLElement): Unit = js.native
    
    var selected: Boolean = js.native
    
    var status: HTMLElement = js.native
    
    var ul: HTMLElement = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
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
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFirst(value: Boolean): Self = StObject.set(x, "autoFirst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFirstUndefined: Self = StObject.set(x, "autoFirst", js.undefined)
      
      @scala.inline
      def setData(value: (/* item */ Suggestion, /* input */ String) => String): Self = StObject.set(x, "data", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setFilter(value: (/* text */ String, /* input */ String) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setItem(value: (/* text */ String, /* input */ String) => HTMLElement): Self = StObject.set(x, "item", js.Any.fromFunction2(value))
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      @scala.inline
      def setList(value: String | (js.Array[String | (js.Tuple2[String, String]) | Value]) | Element): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      @scala.inline
      def setListVarargs(value: (String | (js.Tuple2[String, String]) | Value)*): Self = StObject.set(x, "list", js.Array(value :_*))
      
      @scala.inline
      def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
      
      @scala.inline
      def setMinChars(value: Double): Self = StObject.set(x, "minChars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinCharsUndefined: Self = StObject.set(x, "minChars", js.undefined)
      
      @scala.inline
      def setReplace(value: /* suggestion */ String | Suggestion => Unit): Self = StObject.set(x, "replace", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      @scala.inline
      def setSort(value: Boolean | SortFunction): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortFunction2(value: (/* left */ Double | js.Array[js.Any], /* right */ Double | js.Array[js.Any]) => Double): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
  
  type SortFunction = js.Function2[/* left */ Double | js.Array[js.Any], /* right */ Double | js.Array[js.Any], Double]
  
  type Suggestion = String | Label | (js.Tuple2[String, String])
}
