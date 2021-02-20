package typings.actionsOnGoogle

import typings.actionsOnGoogle.commonMod.JsonObject
import typings.actionsOnGoogle.frameworkFrameworkMod.Framework
import typings.awsLambda.handlerMod.Callback
import typings.awsLambda.handlerMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lambdaMod {
  
  @JSImport("actions-on-google/dist/framework/lambda", "Lambda")
  @js.native
  class Lambda_ () extends Framework[LambdaHandler] {
    
    def check(first: js.Object, second: js.Object, third: js.Object): Boolean = js.native
    
    def isCallback(third: js.Object): /* is aws-lambda.aws-lambda/handler.Callback<any> */ Boolean = js.native
    
    def isContext(second: js.Object): /* is aws-lambda.aws-lambda/handler.Context */ Boolean = js.native
  }
  
  @JSImport("actions-on-google/dist/framework/lambda", "lambda")
  @js.native
  val lambda: Lambda_ = js.native
  
  type LambdaHandler = js.Function3[
    /* event */ JsonObject, 
    /* context */ Context, 
    /* callback */ Callback[js.Any], 
    js.Promise[Unit]
  ]
  
  @js.native
  trait LambdaMetadata extends StObject {
    
    /** @public */
    var context: Context = js.native
    
    /** @public */
    var event: JsonObject = js.native
  }
  object LambdaMetadata {
    
    @scala.inline
    def apply(context: Context, event: JsonObject): LambdaMetadata = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[LambdaMetadata]
    }
    
    @scala.inline
    implicit class LambdaMetadataMutableBuilder[Self <: LambdaMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvent(value: JsonObject): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    }
  }
}
