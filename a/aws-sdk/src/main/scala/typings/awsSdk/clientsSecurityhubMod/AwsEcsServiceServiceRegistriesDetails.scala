package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsServiceServiceRegistriesDetails extends StObject {
  
  /**
    * The container name value to use for the service discovery service. If the task definition uses the bridge or host network mode, you must specify ContainerName and ContainerPort. If the task definition uses the awsvpc network mode and a type SRV DNS record, you must specify either ContainerName and ContainerPort, or Port , but not both.
    */
  var ContainerName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The port value to use for the service discovery service. If the task definition uses the bridge or host network mode, you must specify ContainerName and ContainerPort. If the task definition uses the awsvpc network mode and a type SRV DNS record, you must specify either ContainerName and ContainerPort, or Port , but not both.
    */
  var ContainerPort: js.UndefOr[Integer] = js.undefined
  
  /**
    * The port value to use for a service discovery service that specifies an SRV record. This field can be used if both the awsvpcawsvpc network mode and SRV records are used.
    */
  var Port: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ARN of the service registry.
    */
  var RegistryArn: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcsServiceServiceRegistriesDetails {
  
  inline def apply(): AwsEcsServiceServiceRegistriesDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsServiceServiceRegistriesDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEcsServiceServiceRegistriesDetails] (val x: Self) extends AnyVal {
    
    inline def setContainerName(value: NonEmptyString): Self = StObject.set(x, "ContainerName", value.asInstanceOf[js.Any])
    
    inline def setContainerNameUndefined: Self = StObject.set(x, "ContainerName", js.undefined)
    
    inline def setContainerPort(value: Integer): Self = StObject.set(x, "ContainerPort", value.asInstanceOf[js.Any])
    
    inline def setContainerPortUndefined: Self = StObject.set(x, "ContainerPort", js.undefined)
    
    inline def setPort(value: Integer): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setRegistryArn(value: NonEmptyString): Self = StObject.set(x, "RegistryArn", value.asInstanceOf[js.Any])
    
    inline def setRegistryArnUndefined: Self = StObject.set(x, "RegistryArn", js.undefined)
  }
}
