package typings.arangodb

import typings.arangodb.Foxx.SessionTransport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foxxSessionsTransportsHeaderMod {
  
  inline def apply(): SessionTransport = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[SessionTransport]
  inline def apply(name: String): SessionTransport = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[SessionTransport]
  inline def apply(options: HeaderTransportOptions): SessionTransport = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[SessionTransport]
  
  @JSImport("@arangodb/foxx/sessions/transports/header", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait HeaderTransportOptions extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
  }
  object HeaderTransportOptions {
    
    inline def apply(): HeaderTransportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderTransportOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeaderTransportOptions] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
