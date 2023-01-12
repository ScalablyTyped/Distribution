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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeUserImportJobResponse] (val x: Self) extends AnyVal {
    
    inline def setUserImportJob(value: UserImportJobType): Self = StObject.set(x, "UserImportJob", value.asInstanceOf[js.Any])
    
    inline def setUserImportJobUndefined: Self = StObject.set(x, "UserImportJob", js.undefined)
  }
}
