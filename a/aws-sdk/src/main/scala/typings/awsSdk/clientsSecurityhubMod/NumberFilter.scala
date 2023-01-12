package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberFilter extends StObject {
  
  /**
    * The equal-to condition to be applied to a single field when querying for findings.
    */
  var Eq: js.UndefOr[Double] = js.undefined
  
  /**
    * The greater-than-equal condition to be applied to a single field when querying for findings. 
    */
  var Gte: js.UndefOr[Double] = js.undefined
  
  /**
    * The less-than-equal condition to be applied to a single field when querying for findings. 
    */
  var Lte: js.UndefOr[Double] = js.undefined
}
object NumberFilter {
  
  inline def apply(): NumberFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumberFilter] (val x: Self) extends AnyVal {
    
    inline def setEq(value: Double): Self = StObject.set(x, "Eq", value.asInstanceOf[js.Any])
    
    inline def setEqUndefined: Self = StObject.set(x, "Eq", js.undefined)
    
    inline def setGte(value: Double): Self = StObject.set(x, "Gte", value.asInstanceOf[js.Any])
    
    inline def setGteUndefined: Self = StObject.set(x, "Gte", js.undefined)
    
    inline def setLte(value: Double): Self = StObject.set(x, "Lte", value.asInstanceOf[js.Any])
    
    inline def setLteUndefined: Self = StObject.set(x, "Lte", js.undefined)
  }
}
