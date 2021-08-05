package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  /**
    * The name of the filter. The valid values are: auto-scaling-group, key, value, and propagate-at-launch.
    */
  var Name: js.UndefOr[XmlString] = js.undefined
  
  /**
    * One or more filter values. Filter values are case-sensitive.
    */
  var Values: js.UndefOr[typings.awsSdk.autoscalingMod.Values] = js.undefined
}
object Filter {
  
  inline def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  
  extension [Self <: Filter](x: Self) {
    
    inline def setName(value: XmlString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValues(value: Values): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: XmlString*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
