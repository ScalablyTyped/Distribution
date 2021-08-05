package typings.autoSni

import typings.autoSni.anon.Http
import typings.node.httpsMod.Server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(opts: Options): Server = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Server]
  inline def apply(opts: Options, app: js.Any): Server = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], app.asInstanceOf[js.Any])).asInstanceOf[Server]
  
  @JSImport("auto-sni", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var agreeTos: Boolean
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var domains: js.Array[String | js.Array[String]]
    
    var email: String
    
    var ports: js.UndefOr[Http] = js.undefined
  }
  object Options {
    
    inline def apply(agreeTos: Boolean, domains: js.Array[String | js.Array[String]], email: String): Options = {
      val __obj = js.Dynamic.literal(agreeTos = agreeTos.asInstanceOf[js.Any], domains = domains.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAgreeTos(value: Boolean): Self = StObject.set(x, "agreeTos", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDomains(value: js.Array[String | js.Array[String]]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
      
      inline def setDomainsVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "domains", js.Array(value :_*))
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setPorts(value: Http): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
      
      inline def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    }
  }
}
