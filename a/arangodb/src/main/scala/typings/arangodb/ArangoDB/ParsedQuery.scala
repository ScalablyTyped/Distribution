package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParsedQuery extends StObject {
  
  var ast: js.Array[QueryAstNode]
  
  var bindVars: js.Array[String]
  
  var collections: js.Array[String]
  
  var parameters: js.Array[String]
  
  var parsed: Boolean
}
object ParsedQuery {
  
  inline def apply(
    ast: js.Array[QueryAstNode],
    bindVars: js.Array[String],
    collections: js.Array[String],
    parameters: js.Array[String],
    parsed: Boolean
  ): ParsedQuery = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], bindVars = bindVars.asInstanceOf[js.Any], collections = collections.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], parsed = parsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedQuery]
  }
  
  extension [Self <: ParsedQuery](x: Self) {
    
    inline def setAst(value: js.Array[QueryAstNode]): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    inline def setAstVarargs(value: QueryAstNode*): Self = StObject.set(x, "ast", js.Array(value*))
    
    inline def setBindVars(value: js.Array[String]): Self = StObject.set(x, "bindVars", value.asInstanceOf[js.Any])
    
    inline def setBindVarsVarargs(value: String*): Self = StObject.set(x, "bindVars", js.Array(value*))
    
    inline def setCollections(value: js.Array[String]): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
    
    inline def setCollectionsVarargs(value: String*): Self = StObject.set(x, "collections", js.Array(value*))
    
    inline def setParameters(value: js.Array[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: String*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setParsed(value: Boolean): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
  }
}
