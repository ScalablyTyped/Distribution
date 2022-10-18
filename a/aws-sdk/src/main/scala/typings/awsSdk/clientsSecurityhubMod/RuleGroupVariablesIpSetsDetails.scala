package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupVariablesIpSetsDetails extends StObject {
  
  /**
    * The list of IP addresses and ranges.
    */
  var Definition: js.UndefOr[NonEmptyStringList] = js.undefined
}
object RuleGroupVariablesIpSetsDetails {
  
  inline def apply(): RuleGroupVariablesIpSetsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupVariablesIpSetsDetails]
  }
  
  extension [Self <: RuleGroupVariablesIpSetsDetails](x: Self) {
    
    inline def setDefinition(value: NonEmptyStringList): Self = StObject.set(x, "Definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "Definition", js.undefined)
    
    inline def setDefinitionVarargs(value: NonEmptyString*): Self = StObject.set(x, "Definition", js.Array(value*))
  }
}
