package typings.actionsOnGoogle

import org.scalablytyped.runtime.StringDictionary
import typings.actionsOnGoogle.commonMod.JsonObject
import typings.actionsOnGoogle.expressMod.ExpressHandler
import typings.actionsOnGoogle.expressMod.ExpressMetadata
import typings.actionsOnGoogle.expressMod.Express_
import typings.actionsOnGoogle.lambdaMod.LambdaMetadata
import typings.actionsOnGoogle.lambdaMod.Lambda_
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object frameworkFrameworkMod {
  
  @JSImport("actions-on-google/dist/framework/framework", "builtin")
  @js.native
  val builtin: BuiltinFrameworks = js.native
  
  trait BuiltinFrameworkMetadata
    extends StObject
       with FrameworkMetadata {
    
    /** @public */
    var express: js.UndefOr[ExpressMetadata] = js.undefined
    
    /** @public */
    var lambda: js.UndefOr[LambdaMetadata] = js.undefined
  }
  object BuiltinFrameworkMetadata {
    
    inline def apply(): BuiltinFrameworkMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BuiltinFrameworkMetadata]
    }
    
    extension [Self <: BuiltinFrameworkMetadata](x: Self) {
      
      inline def setExpress(value: ExpressMetadata): Self = StObject.set(x, "express", value.asInstanceOf[js.Any])
      
      inline def setExpressUndefined: Self = StObject.set(x, "express", js.undefined)
      
      inline def setLambda(value: LambdaMetadata): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
      
      inline def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
    }
  }
  
  trait BuiltinFrameworks
    extends StObject
       with Frameworks {
    
    /**
      * Plug and play web framework support for express using body-parser
      * @public
      */
    var express: Express_
    
    /**
      * Plug and play web framework support for lambda API gateway
      * @public
      */
    var lambda: Lambda_
  }
  object BuiltinFrameworks {
    
    inline def apply(express: Express_, lambda: Lambda_): BuiltinFrameworks = {
      val __obj = js.Dynamic.literal(express = express.asInstanceOf[js.Any], lambda = lambda.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuiltinFrameworks]
    }
    
    extension [Self <: BuiltinFrameworks](x: Self) {
      
      inline def setExpress(value: Express_): Self = StObject.set(x, "express", value.asInstanceOf[js.Any])
      
      inline def setLambda(value: Lambda_): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
    }
  }
  
  trait Framework[THandler] extends StObject {
    
    /** @public */
    def check(args: Any*): Boolean
    
    /** @public */
    def handle(base: StandardHandler): THandler
  }
  object Framework {
    
    inline def apply[THandler](check: /* repeated */ Any => Boolean, handle: StandardHandler => THandler): Framework[THandler] = {
      val __obj = js.Dynamic.literal(check = js.Any.fromFunction1(check), handle = js.Any.fromFunction1(handle))
      __obj.asInstanceOf[Framework[THandler]]
    }
    
    extension [Self <: Framework[?], THandler](x: Self & Framework[THandler]) {
      
      inline def setCheck(value: /* repeated */ Any => Boolean): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
      
      inline def setHandle(value: StandardHandler => THandler): Self = StObject.set(x, "handle", js.Any.fromFunction1(value))
    }
  }
  
  type FrameworkMetadata = /** @public */
  StringDictionary[Any]
  
  type Frameworks = /** @public */
  StringDictionary[Framework[js.Function]]
  
  type Headers = /** @public */
  StringDictionary[js.UndefOr[String | js.Array[String]]]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Any because Already inherited
  - js.Object because Already inherited
  - js.Function because Already inherited
  - typings.actionsOnGoogle.lambdaMod.LambdaHandler because Already inherited */ @js.native
  trait OmniHandler
    extends StandardHandler
       with ExpressHandler {
    
    /** @public */
    def apply(args: Any*): Any = js.native
    
    /* InferMemberOverrides */
    override def apply(
      arg1: /* body */ JsonObject,
      arg2: /* headers */ Headers,
      arg3: /* metadata */ js.UndefOr[BuiltinFrameworkMetadata]
    ): js.Promise[StandardResponse] = js.native
    /* InferMemberOverrides */
    override def apply(
      arg1: /* request */ Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      arg2: /* response */ Response_[Any, Record[String, Any]]
    ): Unit = js.native
  }
  
  type StandardHandler = js.Function3[
    /* body */ JsonObject, 
    /* headers */ Headers, 
    /* metadata */ js.UndefOr[BuiltinFrameworkMetadata], 
    js.Promise[StandardResponse]
  ]
  
  trait StandardResponse extends StObject {
    
    /** @public */
    var body: JsonObject
    
    /** @public */
    var headers: js.UndefOr[Headers] = js.undefined
    
    /** @public */
    var status: Double
  }
  object StandardResponse {
    
    inline def apply(body: JsonObject, status: Double): StandardResponse = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[StandardResponse]
    }
    
    extension [Self <: StandardResponse](x: Self) {
      
      inline def setBody(value: JsonObject): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
