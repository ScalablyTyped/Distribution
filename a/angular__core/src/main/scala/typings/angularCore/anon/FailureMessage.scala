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
  
  @scala.inline
  def apply(node: CallExpression): FailureMessage = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], failureMessage = null)
    __obj.asInstanceOf[FailureMessage]
  }
  
  @scala.inline
  implicit class FailureMessageMutableBuilder[Self <: FailureMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailureMessage(value: String): Self = StObject.set(x, "failureMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureMessageNull: Self = StObject.set(x, "failureMessage", null)
    
    @scala.inline
    def setNode(value: CallExpression): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
