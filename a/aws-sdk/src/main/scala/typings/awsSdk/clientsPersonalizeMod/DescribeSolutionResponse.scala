package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSolutionResponse extends StObject {
  
  /**
    * An object that describes the solution.
    */
  var solution: js.UndefOr[Solution] = js.undefined
}
object DescribeSolutionResponse {
  
  inline def apply(): DescribeSolutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSolutionResponse]
  }
  
  extension [Self <: DescribeSolutionResponse](x: Self) {
    
    inline def setSolution(value: Solution): Self = StObject.set(x, "solution", value.asInstanceOf[js.Any])
    
    inline def setSolutionUndefined: Self = StObject.set(x, "solution", js.undefined)
  }
}
