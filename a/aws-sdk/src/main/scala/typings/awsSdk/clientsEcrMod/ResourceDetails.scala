package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceDetails extends StObject {
  
  /**
    * An object that contains details about the Amazon ECR container image involved in the finding.
    */
  var awsEcrContainerImage: js.UndefOr[AwsEcrContainerImageDetails] = js.undefined
}
object ResourceDetails {
  
  inline def apply(): ResourceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceDetails] (val x: Self) extends AnyVal {
    
    inline def setAwsEcrContainerImage(value: AwsEcrContainerImageDetails): Self = StObject.set(x, "awsEcrContainerImage", value.asInstanceOf[js.Any])
    
    inline def setAwsEcrContainerImageUndefined: Self = StObject.set(x, "awsEcrContainerImage", js.undefined)
  }
}
