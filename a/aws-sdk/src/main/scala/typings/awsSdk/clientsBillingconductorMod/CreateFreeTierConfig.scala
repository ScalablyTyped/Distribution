package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFreeTierConfig extends StObject {
  
  /**
    *  Activate or deactivate Amazon Web Services Free Tier. 
    */
  var Activated: TieringActivated
}
object CreateFreeTierConfig {
  
  inline def apply(Activated: TieringActivated): CreateFreeTierConfig = {
    val __obj = js.Dynamic.literal(Activated = Activated.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFreeTierConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateFreeTierConfig] (val x: Self) extends AnyVal {
    
    inline def setActivated(value: TieringActivated): Self = StObject.set(x, "Activated", value.asInstanceOf[js.Any])
  }
}
