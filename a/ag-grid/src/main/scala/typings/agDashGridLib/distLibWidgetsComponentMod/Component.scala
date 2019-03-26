package typings
package agDashGridLib.distLibWidgetsComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- agDashGridLib.distLibInterfacesIComponentMod.IComponent because var conflicts: destroy. Inlined getGui, afterGuiAttached, init */ @JSImport("ag-grid/dist/lib/widgets/component", "Component")
@js.native
class Component ()
  extends agDashGridLib.distLibContextBeanStubMod.BeanStub {
  def this(template: java.lang.String) = this()
  /** A hook to perform any necessary operation just after the gui for this component has been renderer
    in the screen.
    If the filter popup is closed and reopened, this method is called each time the filter is shown.
    This is useful for any
    logic that requires attachment before executing, such as putting focus on a particular DOM
    element. The params has one callback method 'hidePopup', which you can call at any later
    point to hide the popup - good if you have an 'Apply' button and you want to hide the popup
    after it is pressed. */
  var afterGuiAttached: js.UndefOr[
    js.Function1[
      /* params */ js.UndefOr[agDashGridLib.distLibInterfacesIComponentMod.IAfterGuiAttachedParams], 
      scala.Unit
    ]
  ] = js.native
  var annotatedEventListeners: js.Any = js.native
  var childComponents: js.Any = js.native
  var compId: js.Any = js.native
  var eGui: js.Any = js.native
  /** The init(params) method is called on the filter once. See below for details on the parameters. */
  var init: js.UndefOr[
    js.Function1[js.Any, agDashGridLib.distLibUtilsMod.Promise[scala.Unit] | scala.Unit]
  ] = js.native
  var visible: js.Any = js.native
  /* private */ def addAnnotatedEventListeners(): js.Any = js.native
  def addCssClass(className: java.lang.String): scala.Unit = js.native
  /* private */ def addEventListenerCommon(attrLists: js.Any, callback: js.Any): js.Any = js.native
  /* private */ def addEventListenersToComponent(attrLists: js.Any, component: js.Any): js.Any = js.native
  /* private */ def addEventListenersToElement(attrLists: js.Any, element: js.Any): js.Any = js.native
  def addFeature(
    context: agDashGridLib.distLibContextContextMod.Context,
    feature: agDashGridLib.distLibContextBeanStubMod.BeanStub
  ): scala.Unit = js.native
  def addGuiEventListener(event: java.lang.String, listener: js.Function1[/* event */ js.Any, scala.Unit]): scala.Unit = js.native
  def addOrRemoveCssClass(className: java.lang.String, addOrRemove: scala.Boolean): scala.Unit = js.native
  def appendChild(newChild: agDashGridLib.distLibInterfacesIComponentMod.IComponent[_]): scala.Unit = js.native
  def appendChild(newChild: stdLib.Node): scala.Unit = js.native
  /* private */ def copyAttributesFromNode(attrLists: js.Any, childNode: js.Any): js.Any = js.native
  /* private */ def createChildAttributes(attrLists: js.Any, child: js.Any): js.Any = js.native
  /* private */ def getAgComponentMetaData(key: js.Any): js.Any = js.native
  /* private */ def getAttrLists(child: js.Any): js.Any = js.native
  def getAttribute(key: java.lang.String): java.lang.String = js.native
  def getCompId(): scala.Double = js.native
  /** Return the DOM element of your editor, this is what the grid puts into the DOM */
  def getGui(): stdLib.HTMLElement = js.native
  def getRefElement(refName: java.lang.String): stdLib.HTMLElement = js.native
  def instantiate(context: agDashGridLib.distLibContextContextMod.Context): scala.Unit = js.native
  /* private */ def instantiateRecurse(parentNode: js.Any, context: js.Any): js.Any = js.native
  def isVisible(): scala.Boolean = js.native
  /* protected */ def queryForHtmlElement(cssSelector: java.lang.String): stdLib.HTMLElement = js.native
  /* protected */ def queryForHtmlInputElement(cssSelector: java.lang.String): stdLib.HTMLInputElement = js.native
  /* private */ def removeAnnotatedEventListeners(): js.Any = js.native
  def removeCssClass(className: java.lang.String): scala.Unit = js.native
  /* protected */ def setGui(eGui: stdLib.HTMLElement): scala.Unit = js.native
  def setTemplate(template: java.lang.String): scala.Unit = js.native
  def setTemplateFromElement(element: stdLib.HTMLElement): scala.Unit = js.native
  def setVisible(visible: scala.Boolean): scala.Unit = js.native
  /* private */ def swapComponentForNode(newComponent: js.Any, parentNode: js.Any, childNode: js.Any): js.Any = js.native
  /* private */ def swapInComponentForQuerySelectors(newComponent: js.Any, childNode: js.Any): js.Any = js.native
  /* protected */ def wireQuerySelectors(): scala.Unit = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/widgets/component", "Component")
@js.native
object Component extends js.Object {
  var EVENT_VISIBLE_CHANGED: java.lang.String = js.native
}

