package typings.arangodb

import typings.arangodb.ArangoDB.Collection
import typings.arangodb.Foxx.SessionStorage
import typings.arangodb.Foxx.SessionTransport
import typings.arangodb.Foxx.SessionsMiddleware
import typings.arangodb.arangodbStrings.cookie
import typings.arangodb.arangodbStrings.header
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foxxSessionsMod {
  
  inline def apply(options: SessionsOptions): SessionsMiddleware = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[SessionsMiddleware]
  
  @JSImport("@arangodb/foxx/sessions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait SessionsOptions extends StObject {
    
    var autoCreate: js.UndefOr[Boolean] = js.undefined
    
    var storage: SessionStorage | String | Collection[Any]
    
    var transport: SessionTransport | js.Array[SessionTransport] | cookie | header
  }
  object SessionsOptions {
    
    inline def apply(
      storage: SessionStorage | String | Collection[Any],
      transport: SessionTransport | js.Array[SessionTransport] | cookie | header
    ): SessionsOptions = {
      val __obj = js.Dynamic.literal(storage = storage.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[SessionsOptions]
    }
    
    extension [Self <: SessionsOptions](x: Self) {
      
      inline def setAutoCreate(value: Boolean): Self = StObject.set(x, "autoCreate", value.asInstanceOf[js.Any])
      
      inline def setAutoCreateUndefined: Self = StObject.set(x, "autoCreate", js.undefined)
      
      inline def setStorage(value: SessionStorage | String | Collection[Any]): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      inline def setTransport(value: SessionTransport | js.Array[SessionTransport] | cookie | header): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setTransportVarargs(value: SessionTransport*): Self = StObject.set(x, "transport", js.Array(value*))
    }
  }
}
