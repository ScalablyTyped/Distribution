package typings.algoliaTransporter

import typings.algoliaTransporter.mod.CallType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Accept extends StObject {
    
    /**
      * The type of host. Defaults to `Any`.
      */
    val accept: js.UndefOr[CallType] = js.undefined
    
    /**
      * The protocol. Defaults to `https`.
      */
    val protocol: js.UndefOr[String] = js.undefined
    
    /**
      * The url of the server, without the protocol.
      */
    val url: String
  }
  object Accept {
    
    @scala.inline
    def apply(url: String): Accept = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Accept]
    }
    
    @scala.inline
    implicit class AcceptMutableBuilder[Self <: Accept] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccept(value: CallType): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
