package typings.absoluteUrl

import org.scalablytyped.runtime.Shortcut
import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("absolute-url", JSImport.Namespace)
  @js.native
  val ^ : AbsoluteUrl = js.native
  
  @js.native
  trait AbsoluteUrl extends StObject {
    
    def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    
    def attach(req: Request_[ParamsDictionary, _, _, Query]): Unit = js.native
  }
  
  type _To = AbsoluteUrl
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: AbsoluteUrl = ^
  
  object expressServeStaticCoreAugmentingMod {
    
    @js.native
    trait Request extends StObject {
      
      def absoluteUrl(): String = js.native
    }
    object Request {
      
      @scala.inline
      def apply(absoluteUrl: () => String): Request = {
        val __obj = js.Dynamic.literal(absoluteUrl = js.Any.fromFunction0(absoluteUrl))
        __obj.asInstanceOf[Request]
      }
      
      @scala.inline
      implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAbsoluteUrl(value: () => String): Self = StObject.set(x, "absoluteUrl", js.Any.fromFunction0(value))
      }
    }
  }
}
