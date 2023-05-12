package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FreeTierConfig extends StObject {
  
  /**
    *  Activate or deactivate Amazon Web Services Free Tier application. 
    */
  var Activated: TieringActivated
}
object FreeTierConfig {
  
  inline def apply(Activated: TieringActivated): FreeTierConfig = {
    val __obj = js.Dynamic.literal(Activated = Activated.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeTierConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FreeTierConfig] (val x: Self) extends AnyVal {
    
    inline def setActivated(value: TieringActivated): Self = StObject.set(x, "Activated", value.asInstanceOf[js.Any])
  }
}
