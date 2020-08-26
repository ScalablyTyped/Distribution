package typings.angularCompiler.anon

import typings.angularCompiler.r3AstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NgContentSelectors extends js.Object {
  /**
    * Any ng-content selectors extracted from the template. Contains `null` when an ng-content
    * element without selector is present.
    */
  var ngContentSelectors: js.Array[String] = js.native
  /**
    * Parsed nodes of the template.
    */
  var nodes: js.Array[Node] = js.native
}

object NgContentSelectors {
  @scala.inline
  def apply(ngContentSelectors: js.Array[String], nodes: js.Array[Node]): NgContentSelectors = {
    val __obj = js.Dynamic.literal(ngContentSelectors = ngContentSelectors.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgContentSelectors]
  }
  @scala.inline
  implicit class NgContentSelectorsOps[Self <: NgContentSelectors] (val x: Self) extends AnyVal {
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
    def setNgContentSelectorsVarargs(value: String*): Self = this.set("ngContentSelectors", js.Array(value :_*))
    @scala.inline
    def setNgContentSelectors(value: js.Array[String]): Self = this.set("ngContentSelectors", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodesVarargs(value: Node*): Self = this.set("nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: js.Array[Node]): Self = this.set("nodes", value.asInstanceOf[js.Any])
  }
  
}

