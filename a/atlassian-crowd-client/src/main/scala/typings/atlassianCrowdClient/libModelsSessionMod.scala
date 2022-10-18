package typings.atlassianCrowdClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsSessionMod {
  
  @JSImport("atlassian-crowd-client/lib/models/session", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Session {
    def this(token: String, createdAt: js.Date, expiresAt: js.Date) = this()
    
    /* CompleteClass */
    override val createdAt: js.Date = js.native
    
    /* CompleteClass */
    override val expiresAt: js.Date = js.native
    
    /* CompleteClass */
    override def toCrowd(): SessionObj = js.native
    
    /* CompleteClass */
    override val token: String = js.native
  }
  @JSImport("atlassian-crowd-client/lib/models/session", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromCrowd(obj: SessionObj): Session = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCrowd")(obj.asInstanceOf[js.Any]).asInstanceOf[Session]
  
  trait Session extends StObject {
    
    val createdAt: js.Date
    
    val expiresAt: js.Date
    
    def toCrowd(): SessionObj
    
    val token: String
  }
  object Session {
    
    inline def apply(createdAt: js.Date, expiresAt: js.Date, toCrowd: () => SessionObj, token: String): Session = {
      val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], expiresAt = expiresAt.asInstanceOf[js.Any], toCrowd = js.Any.fromFunction0(toCrowd), token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Session]
    }
    
    extension [Self <: Session](x: Self) {
      
      inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      inline def setExpiresAt(value: js.Date): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
      
      inline def setToCrowd(value: () => SessionObj): Self = StObject.set(x, "toCrowd", js.Any.fromFunction0(value))
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  trait SessionObj extends StObject {
    
    val `created-date`: Double
    
    val `expiry-date`: Double
    
    val token: String
  }
  object SessionObj {
    
    inline def apply(`created-date`: Double, `expiry-date`: Double, token: String): SessionObj = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
      __obj.updateDynamic("created-date")(`created-date`.asInstanceOf[js.Any])
      __obj.updateDynamic("expiry-date")(`expiry-date`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SessionObj]
    }
    
    extension [Self <: SessionObj](x: Self) {
      
      inline def `setCreated-date`(value: Double): Self = StObject.set(x, "created-date", value.asInstanceOf[js.Any])
      
      inline def `setExpiry-date`(value: Double): Self = StObject.set(x, "expiry-date", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
