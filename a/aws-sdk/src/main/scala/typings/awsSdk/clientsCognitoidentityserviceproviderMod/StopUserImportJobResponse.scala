package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopUserImportJobResponse extends StObject {
  
  /**
    * The job object that represents the user import job.
    */
  var UserImportJob: js.UndefOr[UserImportJobType] = js.undefined
}
object StopUserImportJobResponse {
  
  inline def apply(): StopUserImportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopUserImportJobResponse]
  }
  
  extension [Self <: StopUserImportJobResponse](x: Self) {
    
    inline def setUserImportJob(value: UserImportJobType): Self = StObject.set(x, "UserImportJob", value.asInstanceOf[js.Any])
    
    inline def setUserImportJobUndefined: Self = StObject.set(x, "UserImportJob", js.undefined)
  }
}
