package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCloudFormationStackDriftInformationDetails extends StObject {
  
  /**
    * Status of the stack's actual configuration compared to its expected template configuration. 
    */
  var StackDriftStatus: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsCloudFormationStackDriftInformationDetails {
  
  inline def apply(): AwsCloudFormationStackDriftInformationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFormationStackDriftInformationDetails]
  }
  
  extension [Self <: AwsCloudFormationStackDriftInformationDetails](x: Self) {
    
    inline def setStackDriftStatus(value: NonEmptyString): Self = StObject.set(x, "StackDriftStatus", value.asInstanceOf[js.Any])
    
    inline def setStackDriftStatusUndefined: Self = StObject.set(x, "StackDriftStatus", js.undefined)
  }
}
