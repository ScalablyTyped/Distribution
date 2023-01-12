package typings.actionsOnGoogle

import typings.actionsOnGoogle.distFrameworkFrameworkMod.Framework
import typings.actionsOnGoogle.distFrameworkFrameworkMod.StandardHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFrameworkExpressMod {
  
  @JSImport("actions-on-google/dist/framework/express", "Express")
  @js.native
  open class Express_ ()
    extends StObject
       with Framework[ExpressHandler] {
    
    /** @public */
    /* CompleteClass */
    override def check(args: Any*): Boolean = js.native
    def check(first: js.Object, second: js.Object): Boolean = js.native
    
    /** @public */
    /* CompleteClass */
    override def handle(base: StandardHandler): ExpressHandler = js.native
    
    def isRequest(first: js.Object): /* is express.express.Request</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary * / any, any, any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query * / any, std.Record<string, any>> */ Boolean = js.native
    
    def isResponse(second: js.Object): /* is express.express.Response<any, std.Record<string, any>> */ Boolean = js.native
  }
  
  @JSImport("actions-on-google/dist/framework/express", "express")
  @js.native
  val express: Express_ = js.native
  
  type ExpressHandler = js.Function2[
    /* request */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* response */ Response_[Any, Record[String, Any]], 
    Unit
  ]
  
  trait ExpressMetadata extends StObject {
    
    /** @public */
    var request: Request_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ]
    
    /** @public */
    var response: Response_[Any, Record[String, Any]]
  }
  object ExpressMetadata {
    
    inline def apply(
      request: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      response: Response_[Any, Record[String, Any]]
    ): ExpressMetadata = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpressMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExpressMetadata] (val x: Self) extends AnyVal {
      
      inline def setRequest(
        value: Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ]
      ): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Response_[Any, Record[String, Any]]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
}
