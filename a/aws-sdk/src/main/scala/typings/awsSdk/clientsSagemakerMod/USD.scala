package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait USD extends StObject {
  
  /**
    * The fractional portion, in cents, of the amount. 
    */
  var Cents: js.UndefOr[typings.awsSdk.clientsSagemakerMod.Cents] = js.undefined
  
  /**
    * The whole number of dollars in the amount.
    */
  var Dollars: js.UndefOr[typings.awsSdk.clientsSagemakerMod.Dollars] = js.undefined
  
  /**
    * Fractions of a cent, in tenths.
    */
  var TenthFractionsOfACent: js.UndefOr[typings.awsSdk.clientsSagemakerMod.TenthFractionsOfACent] = js.undefined
}
object USD {
  
  inline def apply(): USD = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[USD]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: USD] (val x: Self) extends AnyVal {
    
    inline def setCents(value: Cents): Self = StObject.set(x, "Cents", value.asInstanceOf[js.Any])
    
    inline def setCentsUndefined: Self = StObject.set(x, "Cents", js.undefined)
    
    inline def setDollars(value: Dollars): Self = StObject.set(x, "Dollars", value.asInstanceOf[js.Any])
    
    inline def setDollarsUndefined: Self = StObject.set(x, "Dollars", js.undefined)
    
    inline def setTenthFractionsOfACent(value: TenthFractionsOfACent): Self = StObject.set(x, "TenthFractionsOfACent", value.asInstanceOf[js.Any])
    
    inline def setTenthFractionsOfACentUndefined: Self = StObject.set(x, "TenthFractionsOfACent", js.undefined)
  }
}
