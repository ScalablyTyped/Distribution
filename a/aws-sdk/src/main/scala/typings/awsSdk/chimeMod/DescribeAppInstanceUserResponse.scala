package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAppInstanceUserResponse extends StObject {
  
  /**
    * The name of the app instance user.
    */
  var AppInstanceUser: js.UndefOr[typings.awsSdk.chimeMod.AppInstanceUser] = js.undefined
}
object DescribeAppInstanceUserResponse {
  
  @scala.inline
  def apply(): DescribeAppInstanceUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAppInstanceUserResponse]
  }
  
  @scala.inline
  implicit class DescribeAppInstanceUserResponseMutableBuilder[Self <: DescribeAppInstanceUserResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInstanceUser(value: AppInstanceUser): Self = StObject.set(x, "AppInstanceUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppInstanceUserUndefined: Self = StObject.set(x, "AppInstanceUser", js.undefined)
  }
}
