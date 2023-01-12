package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomCode extends StObject {
  
  /**
    * The name defined for the custom code node class.
    */
  var ClassName: EnclosedInStringProperty
  
  /**
    * The custom code that is used to perform the data transformation.
    */
  var Code: ExtendedString
  
  /**
    * The data inputs identified by their node names.
    */
  var Inputs: ManyInputs
  
  /**
    * The name of the transform node.
    */
  var Name: NodeName
  
  /**
    * Specifies the data schema for the custom code transform.
    */
  var OutputSchemas: js.UndefOr[GlueSchemas] = js.undefined
}
object CustomCode {
  
  inline def apply(ClassName: EnclosedInStringProperty, Code: ExtendedString, Inputs: ManyInputs, Name: NodeName): CustomCode = {
    val __obj = js.Dynamic.literal(ClassName = ClassName.asInstanceOf[js.Any], Code = Code.asInstanceOf[js.Any], Inputs = Inputs.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomCode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomCode] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: EnclosedInStringProperty): Self = StObject.set(x, "ClassName", value.asInstanceOf[js.Any])
    
    inline def setCode(value: ExtendedString): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: ManyInputs): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: NodeId*): Self = StObject.set(x, "Inputs", js.Array(value*))
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutputSchemas(value: GlueSchemas): Self = StObject.set(x, "OutputSchemas", value.asInstanceOf[js.Any])
    
    inline def setOutputSchemasUndefined: Self = StObject.set(x, "OutputSchemas", js.undefined)
    
    inline def setOutputSchemasVarargs(value: GlueSchema*): Self = StObject.set(x, "OutputSchemas", js.Array(value*))
  }
}
