package typings.awsSdk.chimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAppInstanceAdminResponse extends StObject {
  
  /**
    * The ARN and name of the AppInstanceUser, the ARN of the AppInstance, and the created and last-updated timestamps. All timestamps use epoch milliseconds.
    */
  var AppInstanceAdmin: js.UndefOr[typings.awsSdk.chimesdkidentityMod.AppInstanceAdmin] = js.undefined
}
object DescribeAppInstanceAdminResponse {
  
  inline def apply(): DescribeAppInstanceAdminResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAppInstanceAdminResponse]
  }
  
  extension [Self <: DescribeAppInstanceAdminResponse](x: Self) {
    
    inline def setAppInstanceAdmin(value: AppInstanceAdmin): Self = StObject.set(x, "AppInstanceAdmin", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceAdminUndefined: Self = StObject.set(x, "AppInstanceAdmin", js.undefined)
  }
}
