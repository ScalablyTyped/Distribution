package typings.arangodb

import typings.arangodb.Foxx.SessionTransport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerMod {
  
  @scala.inline
  def apply(): SessionTransport = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[SessionTransport]
  @scala.inline
  def apply(name: String): SessionTransport = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[SessionTransport]
  @scala.inline
  def apply(options: HeaderTransportOptions): SessionTransport = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[SessionTransport]
  
  @JSImport("@arangodb/foxx/sessions/transports/header", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait HeaderTransportOptions extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
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
