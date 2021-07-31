package typings.apn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Reason extends StObject {
    
    var reason: String
    
    var timestamp: js.UndefOr[String] = js.undefined
  }
  object Reason {
    
    @scala.inline
    def apply(reason: String): Reason = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reason]
    }
    
    @scala.inline
    implicit class ReasonMutableBuilder[Self <: Reason] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    }
  }
}
