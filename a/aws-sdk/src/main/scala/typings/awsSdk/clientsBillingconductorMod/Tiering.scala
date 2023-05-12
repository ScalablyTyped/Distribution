package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tiering extends StObject {
  
  /**
    *  The possible Amazon Web Services Free Tier configurations. 
    */
  var FreeTier: FreeTierConfig
}
object Tiering {
  
  inline def apply(FreeTier: FreeTierConfig): Tiering = {
    val __obj = js.Dynamic.literal(FreeTier = FreeTier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tiering]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tiering] (val x: Self) extends AnyVal {
    
    inline def setFreeTier(value: FreeTierConfig): Self = StObject.set(x, "FreeTier", value.asInstanceOf[js.Any])
  }
}
