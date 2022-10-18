package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsOpenSearchServiceDomainMasterUserOptionsDetails extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the master user. 
    */
  var MasterUserArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The username for the master user. 
    */
  var MasterUserName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The password for the master user. 
    */
  var MasterUserPassword: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsOpenSearchServiceDomainMasterUserOptionsDetails {
  
  inline def apply(): AwsOpenSearchServiceDomainMasterUserOptionsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsOpenSearchServiceDomainMasterUserOptionsDetails]
  }
  
  extension [Self <: AwsOpenSearchServiceDomainMasterUserOptionsDetails](x: Self) {
    
    inline def setMasterUserArn(value: NonEmptyString): Self = StObject.set(x, "MasterUserArn", value.asInstanceOf[js.Any])
    
    inline def setMasterUserArnUndefined: Self = StObject.set(x, "MasterUserArn", js.undefined)
    
    inline def setMasterUserName(value: NonEmptyString): Self = StObject.set(x, "MasterUserName", value.asInstanceOf[js.Any])
    
    inline def setMasterUserNameUndefined: Self = StObject.set(x, "MasterUserName", js.undefined)
    
    inline def setMasterUserPassword(value: NonEmptyString): Self = StObject.set(x, "MasterUserPassword", value.asInstanceOf[js.Any])
    
    inline def setMasterUserPasswordUndefined: Self = StObject.set(x, "MasterUserPassword", js.undefined)
  }
}
