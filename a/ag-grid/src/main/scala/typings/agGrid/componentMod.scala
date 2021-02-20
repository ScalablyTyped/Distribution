package typings.agGrid

import typings.agGrid.beanStubMod.BeanStub
import typings.agGrid.contextMod.Context
import typings.agGrid.eventsMod.AgEvent
import typings.agGrid.iComponentMod.IAfterGuiAttachedParams
import typings.agGrid.iComponentMod.IComponent
import typings.agGrid.utilsMod.Promise
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.agGrid.iComponentMod.IComponent because var conflicts: destroy. Inlined getGui, afterGuiAttached, init */ @JSImport("ag-grid/dist/lib/widgets/component", "Component")
  @js.native
  class Component () extends BeanStub {
    def this(template: String) = this()
    
    /* private */ def addAnnotatedEventListeners(): js.Any = js.native
    
    def addCssClass(className: String): Unit = js.native
    
    /* private */ def addEventListenerCommon(attrLists: js.Any, callback: js.Any): js.Any = js.native
    
    /* private */ def addEventListenersToComponent(attrLists: js.Any, component: js.Any): js.Any = js.native
    
    /* private */ def addEventListenersToElement(attrLists: js.Any, element: js.Any): js.Any = js.native
    
    def addFeature(context: Context, feature: BeanStub): Unit = js.native
    
    def addGuiEventListener(event: String, listener: js.Function1[/* event */ js.Any, Unit]): Unit = js.native
    
    def addOrRemoveCssClass(className: String, addOrRemove: Boolean): Unit = js.native
    
    /** A hook to perform any necessary operation just after the gui for this component has been renderer
      in the screen.
      If the filter popup is closed and reopened, this method is called each time the filter is shown.
      This is useful for any
      logic that requires attachment before executing, such as putting focus on a particular DOM
      element. The params has one callback method 'hidePopup', which you can call at any later
      point to hide the popup - good if you have an 'Apply' button and you want to hide the popup
      after it is pressed. */
    var afterGuiAttached: js.UndefOr[js.Function1[/* params */ js.UndefOr[IAfterGuiAttachedParams], Unit]] = js.native
    
    var annotatedEventListeners: js.Any = js.native
    
    def appendChild(newChild: IComponent[_]): Unit = js.native
    def appendChild(newChild: Node): Unit = js.native
    
    var childComponents: js.Any = js.native
    
    var compId: js.Any = js.native
    
    /* private */ def copyAttributesFromNode(attrLists: js.Any, childNode: js.Any): js.Any = js.native
    
    /* private */ def createChildAttributes(attrLists: js.Any, child: js.Any): js.Any = js.native
    
    var eGui: js.Any = js.native
    
    /* private */ def getAgComponentMetaData(key: js.Any): js.Any = js.native
    
    /* private */ def getAttrLists(child: js.Any): js.Any = js.native
    
    def getAttribute(key: String): String = js.native
    
    def getCompId(): Double = js.native
    
    /** Return the DOM element of your editor, this is what the grid puts into the DOM */
    def getGui(): HTMLElement = js.native
    
    def getRefElement(refName: String): HTMLElement = js.native
    
    /** The init(params) method is called on the filter once. See below for details on the parameters. */
    var init: js.UndefOr[js.Function1[js.Any, Promise[Unit] | Unit]] = js.native
    
    def instantiate(context: Context): Unit = js.native
    
    /* private */ def instantiateRecurse(parentNode: js.Any, context: js.Any): js.Any = js.native
    
    def isVisible(): Boolean = js.native
    
    /* protected */ def queryForHtmlElement(cssSelector: String): HTMLElement = js.native
    
    /* protected */ def queryForHtmlInputElement(cssSelector: String): HTMLInputElement = js.native
    
    /* private */ def removeAnnotatedEventListeners(): js.Any = js.native
    
    def removeCssClass(className: String): Unit = js.native
    
    /* protected */ def setGui(eGui: HTMLElement): Unit = js.native
    
    def setTemplate(template: String): Unit = js.native
    
    def setTemplateFromElement(element: HTMLElement): Unit = js.native
    
    def setVisible(visible: Boolean): Unit = js.native
    
    /* private */ def swapComponentForNode(newComponent: js.Any, parentNode: js.Any, childNode: js.Any): js.Any = js.native
    
    /* private */ def swapInComponentForQuerySelectors(newComponent: js.Any, childNode: js.Any): js.Any = js.native
    
    var visible: js.Any = js.native
    
    /* protected */ def wireQuerySelectors(): Unit = js.native
  }
  /* static members */
  object Component {
    
    @JSImport("ag-grid/dist/lib/widgets/component", "Component")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/widgets/component", "Component.EVENT_VISIBLE_CHANGED")
    @js.native
    def EVENT_VISIBLE_CHANGED: String = js.native
    @scala.inline
    def EVENT_VISIBLE_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_VISIBLE_CHANGED")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait VisibleChangedEvent extends AgEvent {
    
    var visible: Boolean = js.native
  }
  object VisibleChangedEvent {
    
    @scala.inline
    def apply(`type`: String, visible: Boolean): VisibleChangedEvent = {
      val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[VisibleChangedEvent]
    }
    
    @scala.inline
    implicit class VisibleChangedEventMutableBuilder[Self <: VisibleChangedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
