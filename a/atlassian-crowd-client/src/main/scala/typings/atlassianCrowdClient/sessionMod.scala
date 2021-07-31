package typings.atlassianCrowdClient

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessionMod {
  
  @JSImport("atlassian-crowd-client/lib/models/session", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Session {
    def this(token: String, createdAt: Date, expiresAt: Date) = this()
    
    /* CompleteClass */
    override val createdAt: Date = js.native
    
    /* CompleteClass */
    override val expiresAt: Date = js.native
    
    /* CompleteClass */
    override def toCrowd(): SessionObj = js.native
    
    /* CompleteClass */
    override val token: String = js.native
  }
  @JSImport("atlassian-crowd-client/lib/models/session", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def fromCrowd(obj: SessionObj): Session = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCrowd")(obj.asInstanceOf[js.Any]).asInstanceOf[Session]
  
  trait Session extends StObject {
    
    val createdAt: Date
    
    val expiresAt: Date
    
    def toCrowd(): SessionObj
    
    val token: String
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
  
  trait SessionObj extends StObject {
    
    val `created-date`: Double
    
    val `expiry-date`: Double
    
    val token: String
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
