package typings.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateChangeSetRequest extends StObject {
  
  /**
    * The ID of the application associated with the change set.
    */
  var appId: js.UndefOr[AppId] = js.undefined
  
  /**
    * The format for the change set.
    */
  var changesetFormat: js.UndefOr[OutputFormat] = js.undefined
}
object GenerateChangeSetRequest {
  
  inline def apply(): GenerateChangeSetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateChangeSetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenerateChangeSetRequest] (val x: Self) extends AnyVal {
    
    inline def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setChangesetFormat(value: OutputFormat): Self = StObject.set(x, "changesetFormat", value.asInstanceOf[js.Any])
    
    inline def setChangesetFormatUndefined: Self = StObject.set(x, "changesetFormat", js.undefined)
  }
}
