package typings.actionsOnGoogle

import typings.actionsOnGoogle.frameworkFrameworkMod.Framework
import typings.actionsOnGoogle.frameworkFrameworkMod.StandardHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expressMod {
  
  @JSImport("actions-on-google/dist/framework/express", "Express")
  @js.native
  class Express_ ()
    extends StObject
       with Framework[ExpressHandler] {
    
    /** @public */
    /* CompleteClass */
    override def check(args: js.Any*): Boolean = js.native
    def check(first: js.Object, second: js.Object): Boolean = js.native
    
    /** @public */
    /* CompleteClass */
    override def handle(base: StandardHandler): ExpressHandler = js.native
    
    def isRequest(first: js.Object): /* is express.express.Request<express-serve-static-core.express-serve-static-core.ParamsDictionary, any, any, express-serve-static-core.express-serve-static-core.Query> */ Boolean = js.native
    
    def isResponse(second: js.Object): /* is express.express.Response<any> */ Boolean = js.native
  }
  
  @JSImport("actions-on-google/dist/framework/express", "express")
  @js.native
  val express: Express_ = js.native
  
  type ExpressHandler = js.Function2[
    /* request */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* response */ Response_[js.Any], 
    Unit
  ]
  
  trait ExpressMetadata extends StObject {
    
    /** @public */
    var request: Request_[ParamsDictionary, js.Any, js.Any, Query]
    
    /** @public */
    var response: Response_[js.Any]
  }
  object ExpressMetadata {
    
    @scala.inline
    def apply(request: Request_[ParamsDictionary, js.Any, js.Any, Query], response: Response_[js.Any]): ExpressMetadata = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpressMetadata]
    }
    
    @scala.inline
    implicit class ExpressMetadataMutableBuilder[Self <: ExpressMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequest(value: Request_[ParamsDictionary, js.Any, js.Any, Query]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: Response_[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
}
