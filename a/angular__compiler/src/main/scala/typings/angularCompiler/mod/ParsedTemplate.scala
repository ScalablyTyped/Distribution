package typings.angularCompiler.mod

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParsedTemplate extends StObject {
  
  /**
    * Any R3 Comment Nodes extracted from the template when the `collectCommentNodes` parse template
    * option is enabled.
    */
  var commentNodes: js.UndefOr[js.Array[typings.std.Comment]] = js.undefined
  
  /**
    * Any errors from parsing the template the first time.
    *
    * `null` if there are no errors. Otherwise, the array of errors is guaranteed to be non-empty.
    */
  var errors: js.Array[ParseError] | Null
  
  /**
    * How to parse interpolation markers.
    */
  var interpolationConfig: js.UndefOr[InterpolationConfig] = js.undefined
  
  /**
    * Any ng-content selectors extracted from the template.
    */
  var ngContentSelectors: js.Array[String]
  
  /**
    * The template AST, parsed from the template.
    */
  var nodes: js.Array[Node]
  
  /**
    * Include whitespace nodes in the parsed output.
    */
  var preserveWhitespaces: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Any styleUrls extracted from the metadata.
    */
  var styleUrls: js.Array[String]
  
  /**
    * Any inline styles extracted from the metadata.
    */
  var styles: js.Array[String]
}
object ParsedTemplate {
  
  inline def apply(
    ngContentSelectors: js.Array[String],
    nodes: js.Array[Node],
    styleUrls: js.Array[String],
    styles: js.Array[String]
  ): ParsedTemplate = {
    val __obj = js.Dynamic.literal(ngContentSelectors = ngContentSelectors.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], styleUrls = styleUrls.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], errors = null)
    __obj.asInstanceOf[ParsedTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParsedTemplate] (val x: Self) extends AnyVal {
    
    inline def setCommentNodes(value: js.Array[typings.std.Comment]): Self = StObject.set(x, "commentNodes", value.asInstanceOf[js.Any])
    
    inline def setCommentNodesUndefined: Self = StObject.set(x, "commentNodes", js.undefined)
    
    inline def setCommentNodesVarargs(value: typings.std.Comment*): Self = StObject.set(x, "commentNodes", js.Array(value*))
    
    inline def setErrors(value: js.Array[ParseError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsNull: Self = StObject.set(x, "errors", null)
    
    inline def setErrorsVarargs(value: ParseError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setInterpolationConfig(value: InterpolationConfig): Self = StObject.set(x, "interpolationConfig", value.asInstanceOf[js.Any])
    
    inline def setInterpolationConfigUndefined: Self = StObject.set(x, "interpolationConfig", js.undefined)
    
    inline def setNgContentSelectors(value: js.Array[String]): Self = StObject.set(x, "ngContentSelectors", value.asInstanceOf[js.Any])
    
    inline def setNgContentSelectorsVarargs(value: String*): Self = StObject.set(x, "ngContentSelectors", js.Array(value*))
    
    inline def setNodes(value: js.Array[Node]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: Node*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setPreserveWhitespaces(value: Boolean): Self = StObject.set(x, "preserveWhitespaces", value.asInstanceOf[js.Any])
    
    inline def setPreserveWhitespacesUndefined: Self = StObject.set(x, "preserveWhitespaces", js.undefined)
    
    inline def setStyleUrls(value: js.Array[String]): Self = StObject.set(x, "styleUrls", value.asInstanceOf[js.Any])
    
    inline def setStyleUrlsVarargs(value: String*): Self = StObject.set(x, "styleUrls", js.Array(value*))
    
    inline def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value*))
  }
}
