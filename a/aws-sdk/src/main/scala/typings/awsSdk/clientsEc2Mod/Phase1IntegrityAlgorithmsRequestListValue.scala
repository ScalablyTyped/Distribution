package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Phase1IntegrityAlgorithmsRequestListValue extends StObject {
  
  /**
    * The value for the integrity algorithm.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object Phase1IntegrityAlgorithmsRequestListValue {
  
  inline def apply(): Phase1IntegrityAlgorithmsRequestListValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Phase1IntegrityAlgorithmsRequestListValue]
  }
  
  extension [Self <: Phase1IntegrityAlgorithmsRequestListValue](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
