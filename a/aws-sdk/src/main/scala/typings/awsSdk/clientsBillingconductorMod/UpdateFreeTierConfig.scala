package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFreeTierConfig extends StObject {
  
  /**
    *  Activate or deactivate application of Amazon Web Services Free Tier. 
    */
  var Activated: TieringActivated
}
object UpdateFreeTierConfig {
  
  inline def apply(Activated: TieringActivated): UpdateFreeTierConfig = {
    val __obj = js.Dynamic.literal(Activated = Activated.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFreeTierConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFreeTierConfig] (val x: Self) extends AnyVal {
    
    inline def setActivated(value: TieringActivated): Self = StObject.set(x, "Activated", value.asInstanceOf[js.Any])
  }
}
