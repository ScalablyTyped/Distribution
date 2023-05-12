package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDataQualityRulesetRequest extends StObject {
  
  /**
    * A name for the data quality ruleset.
    */
  var Name: NameString
}
object DeleteDataQualityRulesetRequest {
  
  inline def apply(Name: NameString): DeleteDataQualityRulesetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDataQualityRulesetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDataQualityRulesetRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
