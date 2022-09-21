package typings.absoluteUrl

import org.scalablytyped.runtime.Shortcut
import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("absolute-url", JSImport.Namespace)
  @js.native
  val ^ : AbsoluteUrl = js.native
  
  @js.native
  trait AbsoluteUrl extends StObject {
    
    def apply(): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    
    def attach(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): Unit = js.native
  }
  
  type _To = AbsoluteUrl
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: AbsoluteUrl = ^
  
  object expressServeStaticCoreAugmentingMod {
    
    trait Request extends StObject {
      
      def absoluteUrl(): String
    }
    object Request {
      
      inline def apply(absoluteUrl: () => String): Request = {
        val __obj = js.Dynamic.literal(absoluteUrl = js.Any.fromFunction0(absoluteUrl))
        __obj.asInstanceOf[Request]
      }
      
      extension [Self <: Request](x: Self) {
        
        inline def setAbsoluteUrl(value: () => String): Self = StObject.set(x, "absoluteUrl", js.Any.fromFunction0(value))
      }
    }
  }
}
