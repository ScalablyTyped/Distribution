package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAppInstanceAdminResponse extends StObject {
  
  /**
    * The ARN and name of the app instance user, the ARN of the app instance, and the created and last-updated timestamps. All timestamps use epoch milliseconds.
    */
  var AppInstanceAdmin: js.UndefOr[typings.awsSdk.chimeMod.AppInstanceAdmin] = js.native
}
object DescribeAppInstanceAdminResponse {
  
  @scala.inline
  def apply(): DescribeAppInstanceAdminResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAppInstanceAdminResponse]
  }
  
  @scala.inline
  implicit class DescribeAppInstanceAdminResponseMutableBuilder[Self <: DescribeAppInstanceAdminResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInstanceAdmin(value: AppInstanceAdmin): Self = StObject.set(x, "AppInstanceAdmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppInstanceAdminUndefined: Self = StObject.set(x, "AppInstanceAdmin", js.undefined)
  }
}
