package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedQuery extends js.Object {
  
  var ast: js.Array[QueryAstNode] = js.native
  
  var bindVars: js.Array[String] = js.native
  
  var collections: js.Array[String] = js.native
  
  var parameters: js.Array[String] = js.native
  
  var parsed: Boolean = js.native
}
object ParsedQuery {
  
  @scala.inline
  def apply(
    ast: js.Array[QueryAstNode],
    bindVars: js.Array[String],
    collections: js.Array[String],
    parameters: js.Array[String],
    parsed: Boolean
  ): ParsedQuery = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], bindVars = bindVars.asInstanceOf[js.Any], collections = collections.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], parsed = parsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedQuery]
  }
  
  @scala.inline
  implicit class ParsedQueryOps[Self <: ParsedQuery] (val x: Self) extends AnyVal {
    
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
    def setAstVarargs(value: QueryAstNode*): Self = this.set("ast", js.Array(value :_*))
    
    @scala.inline
    def setAst(value: js.Array[QueryAstNode]): Self = this.set("ast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindVarsVarargs(value: String*): Self = this.set("bindVars", js.Array(value :_*))
    
    @scala.inline
    def setBindVars(value: js.Array[String]): Self = this.set("bindVars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionsVarargs(value: String*): Self = this.set("collections", js.Array(value :_*))
    
    @scala.inline
    def setCollections(value: js.Array[String]): Self = this.set("collections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersVarargs(value: String*): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: js.Array[String]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParsed(value: Boolean): Self = this.set("parsed", value.asInstanceOf[js.Any])
  }
}
