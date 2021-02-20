package typings.angularCore.mod

import typings.angularCore.anon.Attached
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Human readable version of the `LView`.
  *
  * `LView` is a data structure used internally to keep track of views. The `LView` is designed for
  * efficiency and so at times it is difficult to read or write tests which assert on its values. For
  * this reason when `ngDevMode` is true we patch a `LView.debug` property which points to
  * `LViewDebug` for easier debugging and test writing. It is the intent of `LViewDebug` to be used
  * in tests.
  */
@js.native
trait LViewDebug extends StObject {
  
  /**
    * Child `LView`s
    */
  val childViews: js.Array[LViewDebug | LContainerDebug] = js.native
  
  /**
    * The context used for evaluation of the `LView`
    *
    * (Usually the component)
    */
  val context: js.Object | Null = js.native
  
  /**
    * Sub range of `LView` containing decls (DOM elements).
    */
  val decls: LViewDebugRange = js.native
  
  /**
    * Sub range of `LView` containing expando (used by DI).
    */
  val expando: LViewDebugRange = js.native
  
  /**
    * Flags associated with the `LView` unpacked into a more readable state.
    *
    * See `LViewFlags` for the flag meanings.
    */
  val flags: Attached = js.native
  
  /**
    * The host element to which this `LView` is attached.
    */
  val hostHTML: String | Null = js.native
  
  /**
    * HTML representation of the `LView`.
    *
    * This is only approximate to actual HTML as child `LView`s are removed.
    */
  val html: String = js.native
  
  /**
    * Next sibling to the `LView`.
    */
  val next: LViewDebug | LContainerDebug | Null = js.native
  
  /**
    * Hierarchical tree of nodes.
    */
  val nodes: js.Array[DebugNode2] = js.native
  
  /**
    * Parent view (or container)
    */
  val parent: LViewDebug | LContainerDebug | Null = js.native
  
  /**
    * Associated TView
    */
  val tView: TView = js.native
  
  /**
    * Template structure (no instance data).
    * (Shows how TNodes are connected)
    */
  val template: String = js.native
  
  /**
    * Sub range of `LView` containing vars (bindings).
    */
  val vars: LViewDebugRange = js.native
}
object LViewDebug {
  
  @scala.inline
  def apply(
    childViews: js.Array[LViewDebug | LContainerDebug],
    decls: LViewDebugRange,
    expando: LViewDebugRange,
    flags: Attached,
    html: String,
    nodes: js.Array[DebugNode2],
    tView: TView,
    template: String,
    vars: LViewDebugRange
  ): LViewDebug = {
    val __obj = js.Dynamic.literal(childViews = childViews.asInstanceOf[js.Any], decls = decls.asInstanceOf[js.Any], expando = expando.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], tView = tView.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], vars = vars.asInstanceOf[js.Any])
    __obj.asInstanceOf[LViewDebug]
  }
  
  @scala.inline
  implicit class LViewDebugMutableBuilder[Self <: LViewDebug] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildViews(value: js.Array[LViewDebug | LContainerDebug]): Self = StObject.set(x, "childViews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildViewsVarargs(value: (LViewDebug | LContainerDebug)*): Self = StObject.set(x, "childViews", js.Array(value :_*))
    
    @scala.inline
    def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextNull: Self = StObject.set(x, "context", null)
    
    @scala.inline
    def setDecls(value: LViewDebugRange): Self = StObject.set(x, "decls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpando(value: LViewDebugRange): Self = StObject.set(x, "expando", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: Attached): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostHTML(value: String): Self = StObject.set(x, "hostHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostHTMLNull: Self = StObject.set(x, "hostHTML", null)
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: LViewDebug | LContainerDebug): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextNull: Self = StObject.set(x, "next", null)
    
    @scala.inline
    def setNodes(value: js.Array[DebugNode2]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: DebugNode2*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    @scala.inline
    def setParent(value: LViewDebug | LContainerDebug): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = StObject.set(x, "parent", null)
    
    @scala.inline
    def setTView(value: TView): Self = StObject.set(x, "tView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVars(value: LViewDebugRange): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
  }
}
