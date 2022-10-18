package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelParameterVersionResult extends StObject {
  
  /**
    * The label doesn't meet the requirements. For information about parameter label requirements, see Labeling parameters in the Amazon Web Services Systems Manager User Guide.
    */
  var InvalidLabels: js.UndefOr[ParameterLabelList] = js.undefined
  
  /**
    * The version of the parameter that has been labeled.
    */
  var ParameterVersion: js.UndefOr[PSParameterVersion] = js.undefined
}
object LabelParameterVersionResult {
  
  inline def apply(): LabelParameterVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelParameterVersionResult]
  }
  
  extension [Self <: LabelParameterVersionResult](x: Self) {
    
    inline def setInvalidLabels(value: ParameterLabelList): Self = StObject.set(x, "InvalidLabels", value.asInstanceOf[js.Any])
    
    inline def setInvalidLabelsUndefined: Self = StObject.set(x, "InvalidLabels", js.undefined)
    
    inline def setInvalidLabelsVarargs(value: ParameterLabel*): Self = StObject.set(x, "InvalidLabels", js.Array(value*))
    
    inline def setParameterVersion(value: PSParameterVersion): Self = StObject.set(x, "ParameterVersion", value.asInstanceOf[js.Any])
    
    inline def setParameterVersionUndefined: Self = StObject.set(x, "ParameterVersion", js.undefined)
  }
}
