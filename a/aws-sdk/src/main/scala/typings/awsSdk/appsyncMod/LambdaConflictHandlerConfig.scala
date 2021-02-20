package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LambdaConflictHandlerConfig extends StObject {
  
  /**
    * The Arn for the Lambda function to use as the Conflict Handler.
    */
  var lambdaConflictHandlerArn: js.UndefOr[String] = js.native
}
object LambdaConflictHandlerConfig {
  
  @scala.inline
  def apply(): LambdaConflictHandlerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaConflictHandlerConfig]
  }
  
  @scala.inline
  implicit class LambdaConflictHandlerConfigMutableBuilder[Self <: LambdaConflictHandlerConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLambdaConflictHandlerArn(value: String): Self = StObject.set(x, "lambdaConflictHandlerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaConflictHandlerArnUndefined: Self = StObject.set(x, "lambdaConflictHandlerArn", js.undefined)
  }
}
