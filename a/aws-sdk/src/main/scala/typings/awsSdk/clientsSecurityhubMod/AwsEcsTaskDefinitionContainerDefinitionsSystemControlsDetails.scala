package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsTaskDefinitionContainerDefinitionsSystemControlsDetails extends StObject {
  
  /**
    * The namespaced kernel parameter for which to set a value.
    */
  var Namespace: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The value of the parameter.
    */
  var Value: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcsTaskDefinitionContainerDefinitionsSystemControlsDetails {
  
  inline def apply(): AwsEcsTaskDefinitionContainerDefinitionsSystemControlsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsSystemControlsDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEcsTaskDefinitionContainerDefinitionsSystemControlsDetails] (val x: Self) extends AnyVal {
    
    inline def setNamespace(value: NonEmptyString): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
    
    inline def setValue(value: NonEmptyString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
