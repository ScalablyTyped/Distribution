package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortCriterion extends StObject {
  
  /**
    * The finding attribute used to sort findings.
    */
  var Field: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The order used to sort findings.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.SortOrder] = js.undefined
}
object SortCriterion {
  
  inline def apply(): SortCriterion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortCriterion]
  }
  
  extension [Self <: SortCriterion](x: Self) {
    
    inline def setField(value: NonEmptyString): Self = StObject.set(x, "Field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "Field", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}
