package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceScanMetadata extends StObject {
  
  /**
    * An object that contains metadata details for an Amazon EC2 instance.
    */
  var ec2: js.UndefOr[Ec2Metadata] = js.undefined
  
  /**
    * An object that contains details about the container metadata for an Amazon ECR image.
    */
  var ecrImage: js.UndefOr[EcrContainerImageMetadata] = js.undefined
  
  /**
    * An object that contains details about the repository an Amazon ECR image resides in.
    */
  var ecrRepository: js.UndefOr[EcrRepositoryMetadata] = js.undefined
}
object ResourceScanMetadata {
  
  inline def apply(): ResourceScanMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceScanMetadata]
  }
  
  extension [Self <: ResourceScanMetadata](x: Self) {
    
    inline def setEc2(value: Ec2Metadata): Self = StObject.set(x, "ec2", value.asInstanceOf[js.Any])
    
    inline def setEc2Undefined: Self = StObject.set(x, "ec2", js.undefined)
    
    inline def setEcrImage(value: EcrContainerImageMetadata): Self = StObject.set(x, "ecrImage", value.asInstanceOf[js.Any])
    
    inline def setEcrImageUndefined: Self = StObject.set(x, "ecrImage", js.undefined)
    
    inline def setEcrRepository(value: EcrRepositoryMetadata): Self = StObject.set(x, "ecrRepository", value.asInstanceOf[js.Any])
    
    inline def setEcrRepositoryUndefined: Self = StObject.set(x, "ecrRepository", js.undefined)
  }
}
