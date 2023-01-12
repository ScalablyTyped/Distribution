package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobResource extends StObject {
  
  /**
    * The Amazon Machine Images (AMIs) associated with this job.
    */
  var Ec2AmiResources: js.UndefOr[Ec2AmiResourceList] = js.undefined
  
  /**
    * The Python-language Lambda functions for this job.
    */
  var LambdaResources: js.UndefOr[LambdaResourceList] = js.undefined
  
  /**
    * An array of S3Resource objects.
    */
  var S3Resources: js.UndefOr[S3ResourceList] = js.undefined
}
object JobResource {
  
  inline def apply(): JobResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobResource] (val x: Self) extends AnyVal {
    
    inline def setEc2AmiResources(value: Ec2AmiResourceList): Self = StObject.set(x, "Ec2AmiResources", value.asInstanceOf[js.Any])
    
    inline def setEc2AmiResourcesUndefined: Self = StObject.set(x, "Ec2AmiResources", js.undefined)
    
    inline def setEc2AmiResourcesVarargs(value: Ec2AmiResource*): Self = StObject.set(x, "Ec2AmiResources", js.Array(value*))
    
    inline def setLambdaResources(value: LambdaResourceList): Self = StObject.set(x, "LambdaResources", value.asInstanceOf[js.Any])
    
    inline def setLambdaResourcesUndefined: Self = StObject.set(x, "LambdaResources", js.undefined)
    
    inline def setLambdaResourcesVarargs(value: LambdaResource*): Self = StObject.set(x, "LambdaResources", js.Array(value*))
    
    inline def setS3Resources(value: S3ResourceList): Self = StObject.set(x, "S3Resources", value.asInstanceOf[js.Any])
    
    inline def setS3ResourcesUndefined: Self = StObject.set(x, "S3Resources", js.undefined)
    
    inline def setS3ResourcesVarargs(value: S3Resource*): Self = StObject.set(x, "S3Resources", js.Array(value*))
  }
}
