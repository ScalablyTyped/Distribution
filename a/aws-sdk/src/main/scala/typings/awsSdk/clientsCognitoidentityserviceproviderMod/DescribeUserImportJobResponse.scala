package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUserImportJobResponse extends StObject {
  
  /**
    * The job object that represents the user import job.
    */
  var UserImportJob: js.UndefOr[UserImportJobType] = js.undefined
}
object DescribeUserImportJobResponse {
  
  inline def apply(): DescribeUserImportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserImportJobResponse]
  }
  
  extension [Self <: DescribeUserImportJobResponse](x: Self) {
    
    inline def setUserImportJob(value: UserImportJobType): Self = StObject.set(x, "UserImportJob", value.asInstanceOf[js.Any])
    
    inline def setUserImportJobUndefined: Self = StObject.set(x, "UserImportJob", js.undefined)
  }
}
