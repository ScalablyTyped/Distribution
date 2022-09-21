package typings.awesomplete

import typings.awesomplete.anon.Replace
import typings.awesomplete.mod.Options
import typings.awesomplete.mod.Suggestion
import typings.std.Element
import typings.std.EventTarget
import typings.std.HTMLElement
import typings.std.NodeList
import typings.std.ParentNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Awesomplete {
    
    @JSGlobal("Awesomplete")
    @js.native
    open class ^ protected ()
      extends typings.awesomplete.mod.^ {
      def this(input: String) = this()
      def this(input: Element) = this()
      def this(input: HTMLElement) = this()
      def this(input: String, o: Options) = this()
      def this(input: Element, o: Options) = this()
      def this(input: HTMLElement, o: Options) = this()
    }
    
    @JSGlobal("Awesomplete")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def $(expr: String): NodeList = ^.asInstanceOf[js.Dynamic].applyDynamic("$$")(expr.asInstanceOf[js.Any]).asInstanceOf[NodeList]
    inline def $(expr: String, con: Any): NodeList = (^.asInstanceOf[js.Dynamic].applyDynamic("$$")(expr.asInstanceOf[js.Any], con.asInstanceOf[js.Any])).asInstanceOf[NodeList]
    inline def $(expr: ParentNode): NodeList = ^.asInstanceOf[js.Dynamic].applyDynamic("$$")(expr.asInstanceOf[js.Any]).asInstanceOf[NodeList]
    inline def $(expr: ParentNode, con: Any): NodeList = (^.asInstanceOf[js.Dynamic].applyDynamic("$$")(expr.asInstanceOf[js.Any], con.asInstanceOf[js.Any])).asInstanceOf[NodeList]
    
    /* static member */
    @JSGlobal("Awesomplete.DATA")
    @js.native
    def DATA: js.Function1[/* item */ Suggestion, Suggestion] = js.native
    inline def DATA_=(x: js.Function1[/* item */ Suggestion, Suggestion]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATA")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Awesomplete.FILTER_CONTAINS")
    @js.native
    def FILTER_CONTAINS: js.Function2[/* text */ String, /* input */ String, Boolean] = js.native
    inline def FILTER_CONTAINS_=(x: js.Function2[/* text */ String, /* input */ String, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILTER_CONTAINS")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Awesomplete.FILTER_STARTSWITH")
    @js.native
    def FILTER_STARTSWITH: js.Function2[/* text */ String, /* input */ String, Boolean] = js.native
    inline def FILTER_STARTSWITH_=(x: js.Function2[/* text */ String, /* input */ String, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILTER_STARTSWITH")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Awesomplete.ITEM")
    @js.native
    def ITEM: js.Function2[/* text */ String, /* input */ String, HTMLElement] = js.native
    inline def ITEM_=(x: js.Function2[/* text */ String, /* input */ String, HTMLElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ITEM")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Awesomplete.REPLACE")
    @js.native
    def REPLACE: js.Function1[/* text */ String, Unit] = js.native
    inline def REPLACE_=(x: js.Function1[/* text */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REPLACE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Awesomplete.SORT_BYLENGTH")
    @js.native
    def SORT_BYLENGTH: js.Function2[/* left */ Double | js.Array[Any], /* right */ Double | js.Array[Any], Double] = js.native
    inline def SORT_BYLENGTH_=(x: js.Function2[/* left */ Double | js.Array[Any], /* right */ Double | js.Array[Any], Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SORT_BYLENGTH")(x.asInstanceOf[js.Any])
    
    /* static member */
    object _empty {
      
      inline def apply(expr: String): String | Element = ^.asInstanceOf[js.Dynamic].apply(expr.asInstanceOf[js.Any]).asInstanceOf[String | Element]
      inline def apply(expr: String, con: ParentNode): String | Element = (^.asInstanceOf[js.Dynamic].apply(expr.asInstanceOf[js.Any], con.asInstanceOf[js.Any])).asInstanceOf[String | Element]
      inline def apply(expr: Element): String | Element = ^.asInstanceOf[js.Dynamic].apply(expr.asInstanceOf[js.Any]).asInstanceOf[String | Element]
      inline def apply(expr: Element, con: ParentNode): String | Element = (^.asInstanceOf[js.Dynamic].apply(expr.asInstanceOf[js.Any], con.asInstanceOf[js.Any])).asInstanceOf[String | Element]
      
      @JSGlobal("Awesomplete.$")
      @js.native
      val ^ : js.Any = js.native
      
      inline def create(tag: String, o: Any): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tag.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
      
      inline def fire(target: EventTarget, `type`: String, properties: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fire")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      inline def regExpEscape(s: Replace): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("regExpEscape")(s.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      inline def siblingIndex(el: Element): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("siblingIndex")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
    }
    
    /* static member */
    @JSGlobal("Awesomplete.all")
    @js.native
    def all: js.Array[Any] = js.native
    inline def all_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
  }
}
