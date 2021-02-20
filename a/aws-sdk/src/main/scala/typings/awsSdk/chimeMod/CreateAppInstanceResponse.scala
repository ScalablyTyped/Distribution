package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAppInstanceResponse extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of the app instance.
    */
  var AppInstanceArn: js.UndefOr[ChimeArn] = js.native
}
object CreateAppInstanceResponse {
  
  @scala.inline
  def apply(): CreateAppInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAppInstanceResponse]
  }
  
  @scala.inline
  implicit class CreateAppInstanceResponseMutableBuilder[Self <: CreateAppInstanceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppInstanceArnUndefined: Self = StObject.set(x, "AppInstanceArn", js.undefined)
  }
}
