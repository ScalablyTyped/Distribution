package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAppInstanceUserResponse extends StObject {
  
  /**
    * The name of the AppInstanceUser.
    */
  var AppInstanceUser: js.UndefOr[typings.awsSdk.clientsChimeMod.AppInstanceUser] = js.undefined
}
object DescribeAppInstanceUserResponse {
  
  inline def apply(): DescribeAppInstanceUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAppInstanceUserResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAppInstanceUserResponse] (val x: Self) extends AnyVal {
    
    inline def setAppInstanceUser(value: AppInstanceUser): Self = StObject.set(x, "AppInstanceUser", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceUserUndefined: Self = StObject.set(x, "AppInstanceUser", js.undefined)
  }
}
