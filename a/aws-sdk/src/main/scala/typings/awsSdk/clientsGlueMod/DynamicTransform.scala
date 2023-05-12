package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicTransform extends StObject {
  
  /**
    * Specifies the name of the function of the dynamic transform.
    */
  var FunctionName: EnclosedInStringProperty
  
  /**
    * Specifies the inputs for the dynamic transform that are required.
    */
  var Inputs: OneInput
  
  /**
    * Specifies the name of the dynamic transform.
    */
  var Name: EnclosedInStringProperty
  
  /**
    * Specifies the data schema for the dynamic transform.
    */
  var OutputSchemas: js.UndefOr[GlueSchemas] = js.undefined
  
  /**
    * Specifies the parameters of the dynamic transform.
    */
  var Parameters: js.UndefOr[TransformConfigParameterList] = js.undefined
  
  /**
    * Specifies the path of the dynamic transform source and config files.
    */
  var Path: EnclosedInStringProperty
  
  /**
    * Specifies the name of the dynamic transform as it appears in the Glue Studio visual editor.
    */
  var TransformName: EnclosedInStringProperty
  
  /**
    * This field is not used and will be deprecated in future release.
    */
  var Version: js.UndefOr[EnclosedInStringProperty] = js.undefined
}
object DynamicTransform {
  
  inline def apply(
    FunctionName: EnclosedInStringProperty,
    Inputs: OneInput,
    Name: EnclosedInStringProperty,
    Path: EnclosedInStringProperty,
    TransformName: EnclosedInStringProperty
  ): DynamicTransform = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], Inputs = Inputs.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], TransformName = TransformName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicTransform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DynamicTransform] (val x: Self) extends AnyVal {
    
    inline def setFunctionName(value: EnclosedInStringProperty): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: OneInput): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: NodeId*): Self = StObject.set(x, "Inputs", js.Array(value*))
    
    inline def setName(value: EnclosedInStringProperty): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutputSchemas(value: GlueSchemas): Self = StObject.set(x, "OutputSchemas", value.asInstanceOf[js.Any])
    
    inline def setOutputSchemasUndefined: Self = StObject.set(x, "OutputSchemas", js.undefined)
    
    inline def setOutputSchemasVarargs(value: GlueSchema*): Self = StObject.set(x, "OutputSchemas", js.Array(value*))
    
    inline def setParameters(value: TransformConfigParameterList): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setParametersVarargs(value: TransformConfigParameter*): Self = StObject.set(x, "Parameters", js.Array(value*))
    
    inline def setPath(value: EnclosedInStringProperty): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setTransformName(value: EnclosedInStringProperty): Self = StObject.set(x, "TransformName", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: EnclosedInStringProperty): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
