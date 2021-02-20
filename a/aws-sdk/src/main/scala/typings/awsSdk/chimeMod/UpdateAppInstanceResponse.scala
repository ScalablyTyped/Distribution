package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAppInstanceResponse extends StObject {
  
  /**
    * The ARN of the app instance.
    */
  var AppInstanceArn: js.UndefOr[ChimeArn] = js.native
}
object UpdateAppInstanceResponse {
  
  @scala.inline
  def apply(): UpdateAppInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAppInstanceResponse]
  }
  
  @scala.inline
  implicit class UpdateAppInstanceResponseMutableBuilder[Self <: UpdateAppInstanceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppInstanceArnUndefined: Self = StObject.set(x, "AppInstanceArn", js.undefined)
  }
}
