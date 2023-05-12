package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortCriteria extends StObject {
  
  /**
    * Represents the finding attribute, such as accountId, that sorts the findings.
    */
  var AttributeName: js.UndefOr[String] = js.undefined
  
  /**
    * The order by which the sorted findings are to be displayed.
    */
  var OrderBy: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.OrderBy] = js.undefined
}
object SortCriteria {
  
  inline def apply(): SortCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortCriteria]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SortCriteria] (val x: Self) extends AnyVal {
    
    inline def setAttributeName(value: String): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
    
    inline def setOrderBy(value: OrderBy): Self = StObject.set(x, "OrderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "OrderBy", js.undefined)
  }
}
