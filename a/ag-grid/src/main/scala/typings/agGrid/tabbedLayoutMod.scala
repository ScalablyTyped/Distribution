package typings.agGrid

import typings.agGrid.utilsMod.Promise
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabbedLayoutMod {
  
  @JSImport("ag-grid/dist/lib/layout/tabbedLayout", "TabbedLayout")
  @js.native
  class TabbedLayout protected () extends StObject {
    def this(params: TabbedLayoutParams) = this()
    
    /* private */ var activeItem: js.Any = js.native
    
    /* private */ def addItem(item: js.Any): js.Any = js.native
    
    /* private */ var afterAttachedParams: js.Any = js.native
    
    /* private */ var eBody: js.Any = js.native
    
    /* private */ var eGui: js.Any = js.native
    
    /* private */ var eHeader: js.Any = js.native
    
    def getGui(): HTMLElement = js.native
    
    def getMinWidth(): Double = js.native
    
    /* private */ var items: js.Any = js.native
    
    /* private */ var params: js.Any = js.native
    
    def setAfterAttachedParams(params: js.Any): Unit = js.native
    
    def showFirstItem(): Unit = js.native
    
    def showItem(tabbedItem: TabbedItem): Unit = js.native
    
    /* private */ def showItemWrapper(wrapper: js.Any): js.Any = js.native
  }
  /* static members */
  object TabbedLayout {
    
    @JSImport("ag-grid/dist/lib/layout/tabbedLayout", "TabbedLayout")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/layout/tabbedLayout", "TabbedLayout.TEMPLATE")
    @js.native
    def TEMPLATE: js.Any = js.native
    inline def TEMPLATE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEMPLATE")(x.asInstanceOf[js.Any])
  }
  
  trait TabbedItem extends StObject {
    
    var afterAttachedCallback: js.UndefOr[js.Function] = js.undefined
    
    var bodyPromise: Promise[HTMLElement]
    
    var name: String
    
    var title: Element
  }
  object TabbedItem {
    
    inline def apply(bodyPromise: Promise[HTMLElement], name: String, title: Element): TabbedItem = {
      val __obj = js.Dynamic.literal(bodyPromise = bodyPromise.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabbedItem]
    }
    
    extension [Self <: TabbedItem](x: Self) {
      
      inline def setAfterAttachedCallback(value: js.Function): Self = StObject.set(x, "afterAttachedCallback", value.asInstanceOf[js.Any])
      
      inline def setAfterAttachedCallbackUndefined: Self = StObject.set(x, "afterAttachedCallback", js.undefined)
      
      inline def setBodyPromise(value: Promise[HTMLElement]): Self = StObject.set(x, "bodyPromise", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: Element): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait TabbedLayoutParams extends StObject {
    
    var cssClass: js.UndefOr[String] = js.undefined
    
    var items: js.Array[TabbedItem]
    
    var onActiveItemClicked: js.UndefOr[js.Function] = js.undefined
    
    var onItemClicked: js.UndefOr[js.Function] = js.undefined
  }
  object TabbedLayoutParams {
    
    inline def apply(items: js.Array[TabbedItem]): TabbedLayoutParams = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabbedLayoutParams]
    }
    
    extension [Self <: TabbedLayoutParams](x: Self) {
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setItems(value: js.Array[TabbedItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: TabbedItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setOnActiveItemClicked(value: js.Function): Self = StObject.set(x, "onActiveItemClicked", value.asInstanceOf[js.Any])
      
      inline def setOnActiveItemClickedUndefined: Self = StObject.set(x, "onActiveItemClicked", js.undefined)
      
      inline def setOnItemClicked(value: js.Function): Self = StObject.set(x, "onItemClicked", value.asInstanceOf[js.Any])
      
      inline def setOnItemClickedUndefined: Self = StObject.set(x, "onItemClicked", js.undefined)
    }
  }
}
