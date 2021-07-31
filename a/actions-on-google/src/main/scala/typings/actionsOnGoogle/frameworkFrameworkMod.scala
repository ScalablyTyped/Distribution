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
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
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
    
    @scala.inline
    def apply(): BuiltinFrameworkMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BuiltinFrameworkMetadata]
    }
    
    @scala.inline
    implicit class BuiltinFrameworkMetadataMutableBuilder[Self <: BuiltinFrameworkMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpress(value: ExpressMetadata): Self = StObject.set(x, "express", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressUndefined: Self = StObject.set(x, "express", js.undefined)
      
      @scala.inline
      def setLambda(value: LambdaMetadata): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
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
    
    @scala.inline
    def apply(express: Express_, lambda: Lambda_): BuiltinFrameworks = {
      val __obj = js.Dynamic.literal(express = express.asInstanceOf[js.Any], lambda = lambda.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuiltinFrameworks]
    }
    
    @scala.inline
    implicit class BuiltinFrameworksMutableBuilder[Self <: BuiltinFrameworks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpress(value: Express_): Self = StObject.set(x, "express", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambda(value: Lambda_): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
    }
  }
  
  trait Framework[THandler] extends StObject {
    
    /** @public */
    def check(args: js.Any*): Boolean
    
    /** @public */
    def handle(base: StandardHandler): THandler
  }
  object Framework {
    
    @scala.inline
    def apply[THandler](check: /* repeated */ js.Any => Boolean, handle: StandardHandler => THandler): Framework[THandler] = {
      val __obj = js.Dynamic.literal(check = js.Any.fromFunction1(check), handle = js.Any.fromFunction1(handle))
      __obj.asInstanceOf[Framework[THandler]]
    }
    
    @scala.inline
    implicit class FrameworkMutableBuilder[Self <: Framework[?], THandler] (val x: Self & Framework[THandler]) extends AnyVal {
      
      @scala.inline
      def setCheck(value: /* repeated */ js.Any => Boolean): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandle(value: StandardHandler => THandler): Self = StObject.set(x, "handle", js.Any.fromFunction1(value))
    }
  }
  
  type FrameworkMetadata = /** @public */
  StringDictionary[js.Any]
  
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
    def apply(args: js.Any*): js.Any = js.native
    
    /* InferMemberOverrides */
    override def apply(
      arg1: /* body */ JsonObject,
      arg2: /* headers */ Headers,
      arg3: /* metadata */ js.UndefOr[BuiltinFrameworkMetadata]
    ): js.Promise[StandardResponse] = js.native
    /* InferMemberOverrides */
    override def apply(
      arg1: /* request */ Request_[ParamsDictionary, js.Any, js.Any, Query],
      arg2: /* response */ Response_[js.Any]
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
    
    @scala.inline
    def apply(body: JsonObject, status: Double): StandardResponse = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[StandardResponse]
    }
    
    @scala.inline
    implicit class StandardResponseMutableBuilder[Self <: StandardResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: JsonObject): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
