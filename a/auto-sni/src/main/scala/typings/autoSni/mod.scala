package typings.autoSni

import typings.autoSni.anon.Http
import typings.node.httpsMod.Server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("auto-sni", JSImport.Namespace)
  @js.native
  def apply(opts: Options): Server = js.native
  @JSImport("auto-sni", JSImport.Namespace)
  @js.native
  def apply(opts: Options, app: js.Any): Server = js.native
  
  @js.native
  trait Options extends StObject {
    
    var agreeTos: Boolean = js.native
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var domains: js.Array[String | js.Array[String]] = js.native
    
    var email: String = js.native
    
    var ports: js.UndefOr[Http] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(agreeTos: Boolean, domains: js.Array[String | js.Array[String]], email: String): Options = {
      val __obj = js.Dynamic.literal(agreeTos = agreeTos.asInstanceOf[js.Any], domains = domains.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgreeTos(value: Boolean): Self = StObject.set(x, "agreeTos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDomains(value: js.Array[String | js.Array[String]]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainsVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "domains", js.Array(value :_*))
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPorts(value: Http): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    }
  }
}
