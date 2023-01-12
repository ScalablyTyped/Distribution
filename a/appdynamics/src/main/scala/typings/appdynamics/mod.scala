package typings.appdynamics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("appdynamics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def profile(config: ProfileParameter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("profile")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait ProfileParameter extends StObject {
    
    var controllerHostName: js.UndefOr[String] = js.undefined
    
    var controllerPort: js.UndefOr[Double] = js.undefined
    
    var controllerSslEnabled: js.UndefOr[Boolean] = js.undefined
    
    var nodeName: js.UndefOr[String] = js.undefined
    
    var tierName: js.UndefOr[String] = js.undefined
  }
  object ProfileParameter {
    
    inline def apply(): ProfileParameter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProfileParameter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProfileParameter] (val x: Self) extends AnyVal {
      
      inline def setControllerHostName(value: String): Self = StObject.set(x, "controllerHostName", value.asInstanceOf[js.Any])
      
      inline def setControllerHostNameUndefined: Self = StObject.set(x, "controllerHostName", js.undefined)
      
      inline def setControllerPort(value: Double): Self = StObject.set(x, "controllerPort", value.asInstanceOf[js.Any])
      
      inline def setControllerPortUndefined: Self = StObject.set(x, "controllerPort", js.undefined)
      
      inline def setControllerSslEnabled(value: Boolean): Self = StObject.set(x, "controllerSslEnabled", value.asInstanceOf[js.Any])
      
      inline def setControllerSslEnabledUndefined: Self = StObject.set(x, "controllerSslEnabled", js.undefined)
      
      inline def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      inline def setNodeNameUndefined: Self = StObject.set(x, "nodeName", js.undefined)
      
      inline def setTierName(value: String): Self = StObject.set(x, "tierName", value.asInstanceOf[js.Any])
      
      inline def setTierNameUndefined: Self = StObject.set(x, "tierName", js.undefined)
    }
  }
}
