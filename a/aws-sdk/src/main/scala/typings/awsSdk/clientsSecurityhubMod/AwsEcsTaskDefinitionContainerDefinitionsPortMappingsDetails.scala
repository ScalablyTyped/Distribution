package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsTaskDefinitionContainerDefinitionsPortMappingsDetails extends StObject {
  
  /**
    * The port number on the container that is bound to the user-specified or automatically assigned host port.
    */
  var ContainerPort: js.UndefOr[Integer] = js.undefined
  
  /**
    * The port number on the container instance to reserve for the container.
    */
  var HostPort: js.UndefOr[Integer] = js.undefined
  
  /**
    * The protocol used for the port mapping. The default is tcp.
    */
  var Protocol: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcsTaskDefinitionContainerDefinitionsPortMappingsDetails {
  
  inline def apply(): AwsEcsTaskDefinitionContainerDefinitionsPortMappingsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsPortMappingsDetails]
  }
  
  extension [Self <: AwsEcsTaskDefinitionContainerDefinitionsPortMappingsDetails](x: Self) {
    
    inline def setContainerPort(value: Integer): Self = StObject.set(x, "ContainerPort", value.asInstanceOf[js.Any])
    
    inline def setContainerPortUndefined: Self = StObject.set(x, "ContainerPort", js.undefined)
    
    inline def setHostPort(value: Integer): Self = StObject.set(x, "HostPort", value.asInstanceOf[js.Any])
    
    inline def setHostPortUndefined: Self = StObject.set(x, "HostPort", js.undefined)
    
    inline def setProtocol(value: NonEmptyString): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
  }
}
