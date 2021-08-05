package typings.angularCore.anon

import typings.typescript.mod.CallExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailureMessage extends StObject {
  
  /** Failure message which is set when the query could not be transformed successfully. */
  var failureMessage: String | Null
  
  /** Transformed call expression. */
  var node: CallExpression
}
object FailureMessage {
  
  inline def apply(node: CallExpression): FailureMessage = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], failureMessage = null)
    __obj.asInstanceOf[FailureMessage]
  }
  
  extension [Self <: FailureMessage](x: Self) {
    
    inline def setFailureMessage(value: String): Self = StObject.set(x, "failureMessage", value.asInstanceOf[js.Any])
    
    inline def setFailureMessageNull: Self = StObject.set(x, "failureMessage", null)
    
    inline def setNode(value: CallExpression): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
