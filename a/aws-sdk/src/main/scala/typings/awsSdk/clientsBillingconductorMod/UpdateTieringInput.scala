package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTieringInput extends StObject {
  
  /**
    *  The possible Amazon Web Services Free Tier configurations. 
    */
  var FreeTier: UpdateFreeTierConfig
}
object UpdateTieringInput {
  
  inline def apply(FreeTier: UpdateFreeTierConfig): UpdateTieringInput = {
    val __obj = js.Dynamic.literal(FreeTier = FreeTier.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTieringInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateTieringInput] (val x: Self) extends AnyVal {
    
    inline def setFreeTier(value: UpdateFreeTierConfig): Self = StObject.set(x, "FreeTier", value.asInstanceOf[js.Any])
  }
}
