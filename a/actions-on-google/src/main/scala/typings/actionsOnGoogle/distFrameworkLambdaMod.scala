package typings.actionsOnGoogle

import typings.actionsOnGoogle.distCommonMod.JsonObject
import typings.actionsOnGoogle.distFrameworkFrameworkMod.Framework
import typings.actionsOnGoogle.distFrameworkFrameworkMod.StandardHandler
import typings.awsLambda.handlerMod.Callback
import typings.awsLambda.handlerMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFrameworkLambdaMod {
  
  @JSImport("actions-on-google/dist/framework/lambda", "Lambda")
  @js.native
  open class Lambda_ ()
    extends StObject
       with Framework[LambdaHandler] {
    
    /** @public */
    /* CompleteClass */
    override def check(args: Any*): Boolean = js.native
    def check(first: js.Object, second: js.Object, third: js.Object): Boolean = js.native
    
    /** @public */
    /* CompleteClass */
    override def handle(base: StandardHandler): LambdaHandler = js.native
    
    def isCallback(third: js.Object): /* is aws-lambda.aws-lambda/handler.Callback<any> */ Boolean = js.native
    
    def isContext(second: js.Object): /* is aws-lambda.aws-lambda/handler.Context */ Boolean = js.native
  }
  
  @JSImport("actions-on-google/dist/framework/lambda", "lambda")
  @js.native
  val lambda: Lambda_ = js.native
  
  type LambdaHandler = js.Function3[
    /* event */ JsonObject, 
    /* context */ Context, 
    /* callback */ Callback[Any], 
    js.Promise[Unit]
  ]
  
  trait LambdaMetadata extends StObject {
    
    /** @public */
    var context: Context
    
    /** @public */
    var event: JsonObject
  }
  object LambdaMetadata {
    
    inline def apply(context: Context, event: JsonObject): LambdaMetadata = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[LambdaMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LambdaMetadata] (val x: Self) extends AnyVal {
      
      inline def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: JsonObject): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    }
  }
}
