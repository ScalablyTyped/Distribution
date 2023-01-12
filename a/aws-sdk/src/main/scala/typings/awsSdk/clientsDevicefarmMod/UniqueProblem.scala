package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UniqueProblem extends StObject {
  
  /**
    * A message about the unique problems' result.
    */
  var message: js.UndefOr[Message] = js.undefined
  
  /**
    * Information about the problems.
    */
  var problems: js.UndefOr[Problems] = js.undefined
}
object UniqueProblem {
  
  inline def apply(): UniqueProblem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UniqueProblem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UniqueProblem] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setProblems(value: Problems): Self = StObject.set(x, "problems", value.asInstanceOf[js.Any])
    
    inline def setProblemsUndefined: Self = StObject.set(x, "problems", js.undefined)
    
    inline def setProblemsVarargs(value: Problem*): Self = StObject.set(x, "problems", js.Array(value*))
  }
}
