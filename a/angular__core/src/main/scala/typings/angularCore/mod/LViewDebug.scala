package typings.angularCore.mod

import typings.angularCore.anon.Attached
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
trait LViewDebug extends js.Object {
  
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
  implicit class LViewDebugOps[Self <: LViewDebug] (val x: Self) extends AnyVal {
    
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
    def setChildViewsVarargs(value: (LViewDebug | LContainerDebug)*): Self = this.set("childViews", js.Array(value :_*))
    
    @scala.inline
    def setChildViews(value: js.Array[LViewDebug | LContainerDebug]): Self = this.set("childViews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecls(value: LViewDebugRange): Self = this.set("decls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpando(value: LViewDebugRange): Self = this.set("expando", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: Attached): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: DebugNode2*): Self = this.set("nodes", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[DebugNode2]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTView(value: TView): Self = this.set("tView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVars(value: LViewDebugRange): Self = this.set("vars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: js.Object): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextNull: Self = this.set("context", null)
    
    @scala.inline
    def setHostHTML(value: String): Self = this.set("hostHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostHTMLNull: Self = this.set("hostHTML", null)
    
    @scala.inline
    def setNext(value: LViewDebug | LContainerDebug): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextNull: Self = this.set("next", null)
    
    @scala.inline
    def setParent(value: LViewDebug | LContainerDebug): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = this.set("parent", null)
  }
}
