package typings.angularCore.mod

import typings.angularCore.anon.Attached
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait LViewDebug extends StObject {
  
  /**
    * Child `LView`s
    */
  val childViews: js.Array[LViewDebug | LContainerDebug]
  
  /**
    * The context used for evaluation of the `LView`
    *
    * (Usually the component)
    */
  val context: js.Object | Null
  
  /**
    * Sub range of `LView` containing decls (DOM elements).
    */
  val decls: LViewDebugRange
  
  /**
    * Sub range of `LView` containing expando (used by DI).
    */
  val expando: LViewDebugRange
  
  /**
    * Flags associated with the `LView` unpacked into a more readable state.
    *
    * See `LViewFlags` for the flag meanings.
    */
  val flags: Attached
  
  /**
    * The host element to which this `LView` is attached.
    */
  val hostHTML: String | Null
  
  /**
    * HTML representation of the `LView`.
    *
    * This is only approximate to actual HTML as child `LView`s are removed.
    */
  val html: String
  
  /**
    * Next sibling to the `LView`.
    */
  val next: LViewDebug | LContainerDebug | Null
  
  /**
    * Hierarchical tree of nodes.
    */
  val nodes: js.Array[DebugNode2]
  
  /**
    * Parent view (or container)
    */
  val parent: LViewDebug | LContainerDebug | Null
  
  /**
    * Associated TView
    */
  val tView: TView
  
  /**
    * Template structure (no instance data).
    * (Shows how TNodes are connected)
    */
  val template: String
  
  /**
    * Sub range of `LView` containing vars (bindings).
    */
  val vars: LViewDebugRange
}
object LViewDebug {
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(childViews = childViews.asInstanceOf[js.Any], decls = decls.asInstanceOf[js.Any], expando = expando.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], tView = tView.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], vars = vars.asInstanceOf[js.Any], context = null, hostHTML = null, next = null, parent = null)
    __obj.asInstanceOf[LViewDebug]
  }
  
  extension [Self <: LViewDebug](x: Self) {
    
    inline def setChildViews(value: js.Array[LViewDebug | LContainerDebug]): Self = StObject.set(x, "childViews", value.asInstanceOf[js.Any])
    
    inline def setChildViewsVarargs(value: (LViewDebug | LContainerDebug)*): Self = StObject.set(x, "childViews", js.Array(value :_*))
    
    inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextNull: Self = StObject.set(x, "context", null)
    
    inline def setDecls(value: LViewDebugRange): Self = StObject.set(x, "decls", value.asInstanceOf[js.Any])
    
    inline def setExpando(value: LViewDebugRange): Self = StObject.set(x, "expando", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: Attached): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setHostHTML(value: String): Self = StObject.set(x, "hostHTML", value.asInstanceOf[js.Any])
    
    inline def setHostHTMLNull: Self = StObject.set(x, "hostHTML", null)
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setNext(value: LViewDebug | LContainerDebug): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextNull: Self = StObject.set(x, "next", null)
    
    inline def setNodes(value: js.Array[DebugNode2]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: DebugNode2*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    inline def setParent(value: LViewDebug | LContainerDebug): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setTView(value: TView): Self = StObject.set(x, "tView", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setVars(value: LViewDebugRange): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
  }
}
