package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTieringInput extends StObject {
  
  /**
    *  The possible Amazon Web Services Free Tier configurations. 
    */
  var FreeTier: CreateFreeTierConfig
}
object CreateTieringInput {
  
  inline def apply(FreeTier: CreateFreeTierConfig): CreateTieringInput = {
    val __obj = js.Dynamic.literal(FreeTier = FreeTier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTieringInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTieringInput] (val x: Self) extends AnyVal {
    
    inline def setFreeTier(value: CreateFreeTierConfig): Self = StObject.set(x, "FreeTier", value.asInstanceOf[js.Any])
  }
}
