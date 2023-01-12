package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupVariablesPortSetsDetails extends StObject {
  
  /**
    * The list of port ranges.
    */
  var Definition: js.UndefOr[NonEmptyStringList] = js.undefined
}
object RuleGroupVariablesPortSetsDetails {
  
  inline def apply(): RuleGroupVariablesPortSetsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupVariablesPortSetsDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleGroupVariablesPortSetsDetails] (val x: Self) extends AnyVal {
    
    inline def setDefinition(value: NonEmptyStringList): Self = StObject.set(x, "Definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "Definition", js.undefined)
    
    inline def setDefinitionVarargs(value: NonEmptyString*): Self = StObject.set(x, "Definition", js.Array(value*))
  }
}
