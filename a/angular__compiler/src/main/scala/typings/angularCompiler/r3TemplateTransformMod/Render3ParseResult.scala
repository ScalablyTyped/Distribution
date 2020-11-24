package typings.angularCompiler.r3TemplateTransformMod

import typings.angularCompiler.r3AstMod.Node
import typings.angularCompiler.srcParseUtilMod.ParseError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Render3ParseResult extends js.Object {
  
  var errors: js.Array[ParseError] = js.native
  
  var ngContentSelectors: js.Array[String] = js.native
  
  var nodes: js.Array[Node] = js.native
  
  var styleUrls: js.Array[String] = js.native
  
  var styles: js.Array[String] = js.native
}
object Render3ParseResult {
  
  @scala.inline
  def apply(
    errors: js.Array[ParseError],
    ngContentSelectors: js.Array[String],
    nodes: js.Array[Node],
    styleUrls: js.Array[String],
    styles: js.Array[String]
  ): Render3ParseResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], ngContentSelectors = ngContentSelectors.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], styleUrls = styleUrls.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Render3ParseResult]
  }
  
  @scala.inline
  implicit class Render3ParseResultOps[Self <: Render3ParseResult] (val x: Self) extends AnyVal {
    
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
    def setErrorsVarargs(value: ParseError*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[ParseError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNgContentSelectorsVarargs(value: String*): Self = this.set("ngContentSelectors", js.Array(value :_*))
    
    @scala.inline
    def setNgContentSelectors(value: js.Array[String]): Self = this.set("ngContentSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: Node*): Self = this.set("nodes", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[Node]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUrlsVarargs(value: String*): Self = this.set("styleUrls", js.Array(value :_*))
    
    @scala.inline
    def setStyleUrls(value: js.Array[String]): Self = this.set("styleUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesVarargs(value: String*): Self = this.set("styles", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: js.Array[String]): Self = this.set("styles", value.asInstanceOf[js.Any])
  }
}
