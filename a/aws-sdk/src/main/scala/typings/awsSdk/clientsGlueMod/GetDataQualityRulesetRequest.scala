package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataQualityRulesetRequest extends StObject {
  
  /**
    * The name of the ruleset.
    */
  var Name: NameString
}
object GetDataQualityRulesetRequest {
  
  inline def apply(Name: NameString): GetDataQualityRulesetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataQualityRulesetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDataQualityRulesetRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
