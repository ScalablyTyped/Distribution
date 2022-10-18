package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppInstanceUserSummary extends StObject {
  
  /**
    * The ARN of the AppInstanceUser.
    */
  var AppInstanceUserArn: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The metadata of the AppInstanceUser.
    */
  var Metadata: js.UndefOr[typings.awsSdk.clientsChimeMod.Metadata] = js.undefined
  
  /**
    * The name of an AppInstanceUser.
    */
  var Name: js.UndefOr[UserName] = js.undefined
}
object AppInstanceUserSummary {
  
  inline def apply(): AppInstanceUserSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppInstanceUserSummary]
  }
  
  extension [Self <: AppInstanceUserSummary](x: Self) {
    
    inline def setAppInstanceUserArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceUserArn", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceUserArnUndefined: Self = StObject.set(x, "AppInstanceUserArn", js.undefined)
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setName(value: UserName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
