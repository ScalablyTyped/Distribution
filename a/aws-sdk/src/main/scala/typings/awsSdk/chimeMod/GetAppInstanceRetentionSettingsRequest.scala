package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAppInstanceRetentionSettingsRequest extends StObject {
  
  /**
    * The ARN of the app instance.
    */
  var AppInstanceArn: ChimeArn
}
object GetAppInstanceRetentionSettingsRequest {
  
  @scala.inline
  def apply(AppInstanceArn: ChimeArn): GetAppInstanceRetentionSettingsRequest = {
    val __obj = js.Dynamic.literal(AppInstanceArn = AppInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppInstanceRetentionSettingsRequest]
  }
  
  @scala.inline
  implicit class GetAppInstanceRetentionSettingsRequestMutableBuilder[Self <: GetAppInstanceRetentionSettingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
  }
}
