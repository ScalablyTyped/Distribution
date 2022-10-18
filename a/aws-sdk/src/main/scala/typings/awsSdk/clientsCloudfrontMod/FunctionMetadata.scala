package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionMetadata extends StObject {
  
  /**
    * The date and time when the function was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the function. The ARN uniquely identifies the function.
    */
  var FunctionARN: String
  
  /**
    * The date and time when the function was most recently updated.
    */
  var LastModifiedTime: js.Date
  
  /**
    * The stage that the function is in, either DEVELOPMENT or LIVE. When a function is in the DEVELOPMENT stage, you can test the function with TestFunction, and update it with UpdateFunction. When a function is in the LIVE stage, you can attach the function to a distribution’s cache behavior, using the function’s ARN.
    */
  var Stage: js.UndefOr[FunctionStage] = js.undefined
}
object FunctionMetadata {
  
  inline def apply(FunctionARN: String, LastModifiedTime: js.Date): FunctionMetadata = {
    val __obj = js.Dynamic.literal(FunctionARN = FunctionARN.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionMetadata]
  }
  
  extension [Self <: FunctionMetadata](x: Self) {
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setFunctionARN(value: String): Self = StObject.set(x, "FunctionARN", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setStage(value: FunctionStage): Self = StObject.set(x, "Stage", value.asInstanceOf[js.Any])
    
    inline def setStageUndefined: Self = StObject.set(x, "Stage", js.undefined)
  }
}
