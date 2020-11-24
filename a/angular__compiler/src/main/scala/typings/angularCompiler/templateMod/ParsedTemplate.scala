package typings.angularCompiler.templateMod

import typings.angularCompiler.interpolationConfigMod.InterpolationConfig
import typings.angularCompiler.r3AstMod.Node
import typings.angularCompiler.srcParseUtilMod.ParseError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedTemplate extends js.Object {
  
  /**
    * Any errors from parsing the template the first time.
    *
    * `null` if there are no errors. Otherwise, the array of errors is guaranteed to be non-empty.
    */
  var errors: js.Array[ParseError] | Null = js.native
  
  /**
    * How to parse interpolation markers.
    */
  var interpolationConfig: js.UndefOr[InterpolationConfig] = js.native
  
  /**
    * Any ng-content selectors extracted from the template.
    */
  var ngContentSelectors: js.Array[String] = js.native
  
  /**
    * The template AST, parsed from the template.
    */
  var nodes: js.Array[Node] = js.native
  
  /**
    * Include whitespace nodes in the parsed output.
    */
  var preserveWhitespaces: js.UndefOr[Boolean] = js.native
  
  /**
    * Any styleUrls extracted from the metadata.
    */
  var styleUrls: js.Array[String] = js.native
  
  /**
    * Any inline styles extracted from the metadata.
    */
  var styles: js.Array[String] = js.native
  
  /**
    * The string contents of the template.
    *
    * This is the "logical" template string, after expansion of any escaped characters (for inline
    * templates). This may differ from the actual template bytes as they appear in the .ts file.
    */
  var template: String = js.native
}
object ParsedTemplate {
  
  @scala.inline
  def apply(
    ngContentSelectors: js.Array[String],
    nodes: js.Array[Node],
    styleUrls: js.Array[String],
    styles: js.Array[String],
    template: String
  ): ParsedTemplate = {
    val __obj = js.Dynamic.literal(ngContentSelectors = ngContentSelectors.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], styleUrls = styleUrls.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedTemplate]
  }
  
  @scala.inline
  implicit class ParsedTemplateOps[Self <: ParsedTemplate] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setStyleUrlsVarargs(value: String*): Self = this.set("styleUrls", js.Array(value :_*))
    
    @scala.inline
    def setStyleUrls(value: js.Array[String]): Self = this.set("styleUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesVarargs(value: String*): Self = this.set("styles", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: js.Array[String]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: ParseError*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[ParseError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsNull: Self = this.set("errors", null)
    
    @scala.inline
    def setInterpolationConfig(value: InterpolationConfig): Self = this.set("interpolationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterpolationConfig: Self = this.set("interpolationConfig", js.undefined)
    
    @scala.inline
    def setPreserveWhitespaces(value: Boolean): Self = this.set("preserveWhitespaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveWhitespaces: Self = this.set("preserveWhitespaces", js.undefined)
  }
}
