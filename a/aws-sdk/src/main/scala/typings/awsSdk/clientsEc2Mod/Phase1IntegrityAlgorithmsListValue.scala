package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Phase1IntegrityAlgorithmsListValue extends StObject {
  
  /**
    * The value for the integrity algorithm.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object Phase1IntegrityAlgorithmsListValue {
  
  inline def apply(): Phase1IntegrityAlgorithmsListValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Phase1IntegrityAlgorithmsListValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Phase1IntegrityAlgorithmsListValue] (val x: Self) extends AnyVal {
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
