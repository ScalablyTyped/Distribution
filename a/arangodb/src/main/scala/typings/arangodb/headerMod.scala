package typings.arangodb

import typings.arangodb.Foxx.SessionTransport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerMod {
  
  @JSImport("@arangodb/foxx/sessions/transports/header", JSImport.Namespace)
  @js.native
  def apply(): SessionTransport = js.native
  @JSImport("@arangodb/foxx/sessions/transports/header", JSImport.Namespace)
  @js.native
  def apply(name: String): SessionTransport = js.native
  @JSImport("@arangodb/foxx/sessions/transports/header", JSImport.Namespace)
  @js.native
  def apply(options: HeaderTransportOptions): SessionTransport = js.native
  
  @js.native
  trait HeaderTransportOptions extends StObject {
    
    var name: js.UndefOr[String] = js.native
  }
  object HeaderTransportOptions {
    
    @scala.inline
    def apply(): HeaderTransportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderTransportOptions]
    }
    
    @scala.inline
    implicit class HeaderTransportOptionsMutableBuilder[Self <: HeaderTransportOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
