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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("awesomplete", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Awesomplete {
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
  inline def $(expr: String): NodeList = ^.asInstanceOf[js.Dynamic].applyDynamic("$$")(expr.asInstanceOf[js.Any]).asInstanceOf[NodeList]
  inline def $(expr: String, con: js.Any): NodeList = (^.asInstanceOf[js.Dynamic].applyDynamic("$$")(expr.asInstanceOf[js.Any], con.asInstanceOf[js.Any])).asInstanceOf[NodeList]
  inline def $(expr: ParentNode): NodeList = ^.asInstanceOf[js.Dynamic].applyDynamic("$$")(expr.asInstanceOf[js.Any]).asInstanceOf[NodeList]
  inline def $(expr: ParentNode, con: js.Any): NodeList = (^.asInstanceOf[js.Dynamic].applyDynamic("$$")(expr.asInstanceOf[js.Any], con.asInstanceOf[js.Any])).asInstanceOf[NodeList]
  
  /* static member */
  @JSImport("awesomplete", "DATA")
  @js.native
  def DATA: js.Function1[/* item */ Suggestion, Suggestion] = js.native
  inline def DATA_=(x: js.Function1[/* item */ Suggestion, Suggestion]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATA")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("awesomplete", "FILTER_CONTAINS")
  @js.native
  def FILTER_CONTAINS: js.Function2[/* text */ String, /* input */ String, Boolean] = js.native
  inline def FILTER_CONTAINS_=(x: js.Function2[/* text */ String, /* input */ String, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILTER_CONTAINS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("awesomplete", "FILTER_STARTSWITH")
  @js.native
  def FILTER_STARTSWITH: js.Function2[/* text */ String, /* input */ String, Boolean] = js.native
  inline def FILTER_STARTSWITH_=(x: js.Function2[/* text */ String, /* input */ String, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILTER_STARTSWITH")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("awesomplete", "ITEM")
  @js.native
  def ITEM: js.Function2[/* text */ String, /* input */ String, HTMLElement] = js.native
  inline def ITEM_=(x: js.Function2[/* text */ String, /* input */ String, HTMLElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ITEM")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("awesomplete", "REPLACE")
  @js.native
  def REPLACE: js.Function1[/* text */ String, Unit] = js.native
  inline def REPLACE_=(x: js.Function1[/* text */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REPLACE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("awesomplete", "SORT_BYLENGTH")
  @js.native
  def SORT_BYLENGTH: js.Function2[/* left */ Double | js.Array[js.Any], /* right */ Double | js.Array[js.Any], Double] = js.native
  inline def SORT_BYLENGTH_=(
    x: js.Function2[/* left */ Double | js.Array[js.Any], /* right */ Double | js.Array[js.Any], Double]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SORT_BYLENGTH")(x.asInstanceOf[js.Any])
  
  /* static member */
  object _empty {
    
    inline def apply(expr: String): String | Element = ^.asInstanceOf[js.Dynamic].apply(expr.asInstanceOf[js.Any]).asInstanceOf[String | Element]
    inline def apply(expr: String, con: ParentNode): String | Element = (^.asInstanceOf[js.Dynamic].apply(expr.asInstanceOf[js.Any], con.asInstanceOf[js.Any])).asInstanceOf[String | Element]
    inline def apply(expr: Element): String | Element = ^.asInstanceOf[js.Dynamic].apply(expr.asInstanceOf[js.Any]).asInstanceOf[String | Element]
    inline def apply(expr: Element, con: ParentNode): String | Element = (^.asInstanceOf[js.Dynamic].apply(expr.asInstanceOf[js.Any], con.asInstanceOf[js.Any])).asInstanceOf[String | Element]
    
    @JSImport("awesomplete", "$")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(tag: String, o: js.Any): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tag.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
    
    inline def fire(target: EventTarget, `type`: String, properties: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fire")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    inline def regExpEscape(s: Replace): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("regExpEscape")(s.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def siblingIndex(el: Element): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("siblingIndex")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  /* static member */
  @JSImport("awesomplete", "all")
  @js.native
  def all: js.Array[js.Any] = js.native
  inline def all_=(x: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
  
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
    def select(selected: Unit, originalTarget: HTMLElement): Unit = js.native
    def select(selected: HTMLElement): Unit = js.native
    def select(selected: HTMLElement, originalTarget: HTMLElement): Unit = js.native
    
    var selected: Boolean = js.native
    
    var status: HTMLElement = js.native
    
    var ul: HTMLElement = js.native
  }
  
  trait Options extends StObject {
    
    var autoFirst: js.UndefOr[Boolean] = js.undefined
    
    var data: js.UndefOr[js.Function2[/* item */ Suggestion, /* input */ String, String]] = js.undefined
    
    var filter: js.UndefOr[js.Function2[/* text */ String, /* input */ String, Boolean]] = js.undefined
    
    var item: js.UndefOr[js.Function2[/* text */ String, /* input */ String, HTMLElement]] = js.undefined
    
    var list: js.UndefOr[String | (js.Array[String | (js.Tuple2[String, String]) | Value]) | Element] = js.undefined
    
    var maxItems: js.UndefOr[Double] = js.undefined
    
    var minChars: js.UndefOr[Double] = js.undefined
    
    var replace: js.UndefOr[js.Function1[/* suggestion */ String | Suggestion, Unit]] = js.undefined
    
    var sort: js.UndefOr[Boolean | SortFunction] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAutoFirst(value: Boolean): Self = StObject.set(x, "autoFirst", value.asInstanceOf[js.Any])
      
      inline def setAutoFirstUndefined: Self = StObject.set(x, "autoFirst", js.undefined)
      
      inline def setData(value: (/* item */ Suggestion, /* input */ String) => String): Self = StObject.set(x, "data", js.Any.fromFunction2(value))
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFilter(value: (/* text */ String, /* input */ String) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setItem(value: (/* text */ String, /* input */ String) => HTMLElement): Self = StObject.set(x, "item", js.Any.fromFunction2(value))
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setList(value: String | (js.Array[String | (js.Tuple2[String, String]) | Value]) | Element): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setListVarargs(value: (String | (js.Tuple2[String, String]) | Value)*): Self = StObject.set(x, "list", js.Array(value :_*))
      
      inline def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
      
      inline def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
      
      inline def setMinChars(value: Double): Self = StObject.set(x, "minChars", value.asInstanceOf[js.Any])
      
      inline def setMinCharsUndefined: Self = StObject.set(x, "minChars", js.undefined)
      
      inline def setReplace(value: /* suggestion */ String | Suggestion => Unit): Self = StObject.set(x, "replace", js.Any.fromFunction1(value))
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setSort(value: Boolean | SortFunction): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortFunction2(value: (/* left */ Double | js.Array[js.Any], /* right */ Double | js.Array[js.Any]) => Double): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
  
  type SortFunction = js.Function2[/* left */ Double | js.Array[js.Any], /* right */ Double | js.Array[js.Any], Double]
  
  type Suggestion = String | Label | (js.Tuple2[String, String])
}
