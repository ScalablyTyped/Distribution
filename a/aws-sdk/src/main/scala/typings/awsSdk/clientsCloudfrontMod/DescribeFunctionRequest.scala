package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFunctionRequest extends StObject {
  
  /**
    * The name of the function that you are getting information about.
    */
  var Name: String
  
  /**
    * The function’s stage, either DEVELOPMENT or LIVE.
    */
  var Stage: js.UndefOr[FunctionStage] = js.undefined
}
object DescribeFunctionRequest {
  
  inline def apply(Name: String): DescribeFunctionRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFunctionRequest]
  }
  
  extension [Self <: DescribeFunctionRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setStage(value: FunctionStage): Self = StObject.set(x, "Stage", value.asInstanceOf[js.Any])
    
    inline def setStageUndefined: Self = StObject.set(x, "Stage", js.undefined)
  }
}
