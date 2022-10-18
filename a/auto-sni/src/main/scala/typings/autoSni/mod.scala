package typings.autoSni

import org.scalablytyped.runtime.Instantiable1
import typings.autoSni.anon.Http
import typings.node.httpsMod.Server
import typings.node.nodeColonhttpMod.IncomingMessage
import typings.node.nodeColonhttpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(opts: Options): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[typings.node.httpMod.IncomingMessage]
    ]
  ] = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[typings.node.httpMod.IncomingMessage]
    ]
  ]]
  inline def apply(opts: Options, app: Any): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[typings.node.httpMod.IncomingMessage]
    ]
  ] = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], app.asInstanceOf[js.Any])).asInstanceOf[Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[typings.node.httpMod.IncomingMessage]
    ]
  ]]
  
  @JSImport("auto-sni", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DomainList = js.Array[String | js.Array[String]]
  
  trait Options extends StObject {
    
    var agreeTos: Boolean
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var domains: DomainList | (js.Function0[DomainList | js.Promise[DomainList]])
    
    var email: String
    
    var ports: js.UndefOr[Http] = js.undefined
  }
  object Options {
    
    inline def apply(
      agreeTos: Boolean,
      domains: DomainList | (js.Function0[DomainList | js.Promise[DomainList]]),
      email: String
    ): Options = {
      val __obj = js.Dynamic.literal(agreeTos = agreeTos.asInstanceOf[js.Any], domains = domains.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAgreeTos(value: Boolean): Self = StObject.set(x, "agreeTos", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDomains(value: DomainList | (js.Function0[DomainList | js.Promise[DomainList]])): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
      
      inline def setDomainsFunction0(value: () => DomainList | js.Promise[DomainList]): Self = StObject.set(x, "domains", js.Any.fromFunction0(value))
      
      inline def setDomainsVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "domains", js.Array(value*))
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setPorts(value: Http): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
      
      inline def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    }
  }
}
