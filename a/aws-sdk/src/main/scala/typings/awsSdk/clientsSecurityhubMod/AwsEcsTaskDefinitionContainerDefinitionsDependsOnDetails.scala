package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsTaskDefinitionContainerDefinitionsDependsOnDetails extends StObject {
  
  /**
    * The dependency condition of the dependent container. Indicates the required status of the dependent container before the current container can start. Valid values are as follows:    COMPLETE     HEALTHY     SUCCESS     START   
    */
  var Condition: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the dependent container.
    */
  var ContainerName: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcsTaskDefinitionContainerDefinitionsDependsOnDetails {
  
  inline def apply(): AwsEcsTaskDefinitionContainerDefinitionsDependsOnDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsDependsOnDetails]
  }
  
  extension [Self <: AwsEcsTaskDefinitionContainerDefinitionsDependsOnDetails](x: Self) {
    
    inline def setCondition(value: NonEmptyString): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "Condition", js.undefined)
    
    inline def setContainerName(value: NonEmptyString): Self = StObject.set(x, "ContainerName", value.asInstanceOf[js.Any])
    
    inline def setContainerNameUndefined: Self = StObject.set(x, "ContainerName", js.undefined)
  }
}
