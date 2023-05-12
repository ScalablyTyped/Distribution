package typings.adblockRs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ALL extends StObject {
    
    var ALL: String
    
    var COSMETIC_ONLY: String
    
    var NETWORK_ONLY: String
  }
  object ALL {
    
    inline def apply(ALL: String, COSMETIC_ONLY: String, NETWORK_ONLY: String): ALL = {
      val __obj = js.Dynamic.literal(ALL = ALL.asInstanceOf[js.Any], COSMETIC_ONLY = COSMETIC_ONLY.asInstanceOf[js.Any], NETWORK_ONLY = NETWORK_ONLY.asInstanceOf[js.Any])
      __obj.asInstanceOf[ALL]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ALL] (val x: Self) extends AnyVal {
      
      inline def setALL(value: String): Self = StObject.set(x, "ALL", value.asInstanceOf[js.Any])
      
      inline def setCOSMETIC_ONLY(value: String): Self = StObject.set(x, "COSMETIC_ONLY", value.asInstanceOf[js.Any])
      
      inline def setNETWORK_ONLY(value: String): Self = StObject.set(x, "NETWORK_ONLY", value.asInstanceOf[js.Any])
    }
  }
  
  trait HOSTS extends StObject {
    
    var HOSTS: String
    
    var STANDARD: String
  }
  object HOSTS {
    
    inline def apply(HOSTS: String, STANDARD: String): HOSTS = {
      val __obj = js.Dynamic.literal(HOSTS = HOSTS.asInstanceOf[js.Any], STANDARD = STANDARD.asInstanceOf[js.Any])
      __obj.asInstanceOf[HOSTS]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HOSTS] (val x: Self) extends AnyVal {
      
      inline def setHOSTS(value: String): Self = StObject.set(x, "HOSTS", value.asInstanceOf[js.Any])
      
      inline def setSTANDARD(value: String): Self = StObject.set(x, "STANDARD", value.asInstanceOf[js.Any])
    }
  }
}
