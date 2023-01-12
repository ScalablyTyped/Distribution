package typings.awsSdk.clientsApplicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProblemResponse extends StObject {
  
  /**
    * Information about the problem. 
    */
  var Problem: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.Problem] = js.undefined
}
object DescribeProblemResponse {
  
  inline def apply(): DescribeProblemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProblemResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeProblemResponse] (val x: Self) extends AnyVal {
    
    inline def setProblem(value: Problem): Self = StObject.set(x, "Problem", value.asInstanceOf[js.Any])
    
    inline def setProblemUndefined: Self = StObject.set(x, "Problem", js.undefined)
  }
}
