package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDataQualityRulesetResponse extends StObject {
  
  /**
    * A unique name for the data quality ruleset.
    */
  var Name: js.UndefOr[NameString] = js.undefined
}
object CreateDataQualityRulesetResponse {
  
  inline def apply(): CreateDataQualityRulesetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDataQualityRulesetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDataQualityRulesetResponse] (val x: Self) extends AnyVal {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
