package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Consolidation extends StObject {
  
  /**
    * A list of matching criteria.
    */
  var MatchingAttributesList: typings.awsSdk.clientsCustomerprofilesMod.MatchingAttributesList
}
object Consolidation {
  
  inline def apply(MatchingAttributesList: MatchingAttributesList): Consolidation = {
    val __obj = js.Dynamic.literal(MatchingAttributesList = MatchingAttributesList.asInstanceOf[js.Any])
    __obj.asInstanceOf[Consolidation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Consolidation] (val x: Self) extends AnyVal {
    
    inline def setMatchingAttributesList(value: MatchingAttributesList): Self = StObject.set(x, "MatchingAttributesList", value.asInstanceOf[js.Any])
    
    inline def setMatchingAttributesListVarargs(value: MatchingAttributes*): Self = StObject.set(x, "MatchingAttributesList", js.Array(value*))
  }
}
