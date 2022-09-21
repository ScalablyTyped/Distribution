package typings.authmosphere

import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object precedenceMod {
  
  /**
    * Must return a promise that return true or false.
    * If the result is true the scope checking will be skipped and next is called
    */
  type PrecedenceFunction = js.Function3[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* res */ Response_[Any, Record[String, Any]], 
    /* next */ NextFunction, 
    js.Promise[Boolean]
  ]
  
  trait PrecedenceOptions extends StObject {
    
    def precedenceFunction(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      res: Response_[Any, Record[String, Any]],
      next: NextFunction
    ): js.Promise[Boolean]
    @JSName("precedenceFunction")
    var precedenceFunction_Original: PrecedenceFunction
  }
  object PrecedenceOptions {
    
    inline def apply(
      precedenceFunction: (/* req */ Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ], /* res */ Response_[Any, Record[String, Any]], /* next */ NextFunction) => js.Promise[Boolean]
    ): PrecedenceOptions = {
      val __obj = js.Dynamic.literal(precedenceFunction = js.Any.fromFunction3(precedenceFunction))
      __obj.asInstanceOf[PrecedenceOptions]
    }
    
    extension [Self <: PrecedenceOptions](x: Self) {
      
      inline def setPrecedenceFunction(
        value: (/* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* res */ Response_[Any, Record[String, Any]], /* next */ NextFunction) => js.Promise[Boolean]
      ): Self = StObject.set(x, "precedenceFunction", js.Any.fromFunction3(value))
    }
  }
}
