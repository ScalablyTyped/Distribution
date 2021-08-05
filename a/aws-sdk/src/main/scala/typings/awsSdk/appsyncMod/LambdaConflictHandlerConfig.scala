package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaConflictHandlerConfig extends StObject {
  
  /**
    * The Arn for the Lambda function to use as the Conflict Handler.
    */
  var lambdaConflictHandlerArn: js.UndefOr[String] = js.undefined
}
object LambdaConflictHandlerConfig {
  
  inline def apply(): LambdaConflictHandlerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaConflictHandlerConfig]
  }
  
  extension [Self <: LambdaConflictHandlerConfig](x: Self) {
    
    inline def setLambdaConflictHandlerArn(value: String): Self = StObject.set(x, "lambdaConflictHandlerArn", value.asInstanceOf[js.Any])
    
    inline def setLambdaConflictHandlerArnUndefined: Self = StObject.set(x, "lambdaConflictHandlerArn", js.undefined)
  }
}
