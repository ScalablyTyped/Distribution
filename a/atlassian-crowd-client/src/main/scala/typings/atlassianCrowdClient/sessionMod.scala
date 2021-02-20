package typings.atlassianCrowdClient

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessionMod {
  
  @JSImport("atlassian-crowd-client/lib/models/session", JSImport.Namespace)
  @js.native
  class ^ protected () extends Session {
    def this(token: String, createdAt: Date, expiresAt: Date) = this()
  }
  
  /* static member */
  @JSImport("atlassian-crowd-client/lib/models/session", "fromCrowd")
  @js.native
  def fromCrowd(obj: SessionObj): Session = js.native
  
  @js.native
  trait Session extends StObject {
    
    val createdAt: Date = js.native
    
    val expiresAt: Date = js.native
    
    def toCrowd(): SessionObj = js.native
    
    val token: String = js.native
  }
  object Session {
    
    @scala.inline
    def apply(createdAt: Date, expiresAt: Date, toCrowd: () => SessionObj, token: String): Session = {
      val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], expiresAt = expiresAt.asInstanceOf[js.Any], toCrowd = js.Any.fromFunction0(toCrowd), token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Session]
    }
    
    @scala.inline
    implicit class SessionMutableBuilder[Self <: Session] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreatedAt(value: Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresAt(value: Date): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToCrowd(value: () => SessionObj): Self = StObject.set(x, "toCrowd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SessionObj extends StObject {
    
    val `created-date`: Double = js.native
    
    val `expiry-date`: Double = js.native
    
    val token: String = js.native
  }
  object SessionObj {
    
    @scala.inline
    def apply(`created-date`: Double, `expiry-date`: Double, token: String): SessionObj = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
      __obj.updateDynamic("created-date")(`created-date`.asInstanceOf[js.Any])
      __obj.updateDynamic("expiry-date")(`expiry-date`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SessionObj]
    }
    
    @scala.inline
    implicit class SessionObjMutableBuilder[Self <: SessionObj] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setCreated-date`(value: Double): Self = StObject.set(x, "created-date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setExpiry-date`(value: Double): Self = StObject.set(x, "expiry-date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
