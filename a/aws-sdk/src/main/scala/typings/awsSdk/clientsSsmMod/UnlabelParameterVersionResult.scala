package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnlabelParameterVersionResult extends StObject {
  
  /**
    * The labels that aren't attached to the given parameter version.
    */
  var InvalidLabels: js.UndefOr[ParameterLabelList] = js.undefined
  
  /**
    * A list of all labels deleted from the parameter.
    */
  var RemovedLabels: js.UndefOr[ParameterLabelList] = js.undefined
}
object UnlabelParameterVersionResult {
  
  inline def apply(): UnlabelParameterVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnlabelParameterVersionResult]
  }
  
  extension [Self <: UnlabelParameterVersionResult](x: Self) {
    
    inline def setInvalidLabels(value: ParameterLabelList): Self = StObject.set(x, "InvalidLabels", value.asInstanceOf[js.Any])
    
    inline def setInvalidLabelsUndefined: Self = StObject.set(x, "InvalidLabels", js.undefined)
    
    inline def setInvalidLabelsVarargs(value: ParameterLabel*): Self = StObject.set(x, "InvalidLabels", js.Array(value*))
    
    inline def setRemovedLabels(value: ParameterLabelList): Self = StObject.set(x, "RemovedLabels", value.asInstanceOf[js.Any])
    
    inline def setRemovedLabelsUndefined: Self = StObject.set(x, "RemovedLabels", js.undefined)
    
    inline def setRemovedLabelsVarargs(value: ParameterLabel*): Self = StObject.set(x, "RemovedLabels", js.Array(value*))
  }
}
