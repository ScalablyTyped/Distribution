package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAppInstanceRequest extends StObject {
  
  /**
    * The ARN of the AppInstance.
    */
  var AppInstanceArn: ChimeArn
  
  /**
    * The metadata that you want to change.
    */
  var Metadata: js.UndefOr[typings.awsSdk.clientsChimeMod.Metadata] = js.undefined
  
  /**
    * The name that you want to change.
    */
  var Name: NonEmptyResourceName
}
object UpdateAppInstanceRequest {
  
  inline def apply(AppInstanceArn: ChimeArn, Name: NonEmptyResourceName): UpdateAppInstanceRequest = {
    val __obj = js.Dynamic.literal(AppInstanceArn = AppInstanceArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAppInstanceRequest]
  }
  
  extension [Self <: UpdateAppInstanceRequest](x: Self) {
    
    inline def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setName(value: NonEmptyResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
