package typings.awsSdk.clientsEfsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAccountPreferencesResponse extends StObject {
  
  var ResourceIdPreference: js.UndefOr[typings.awsSdk.clientsEfsMod.ResourceIdPreference] = js.undefined
}
object PutAccountPreferencesResponse {
  
  inline def apply(): PutAccountPreferencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAccountPreferencesResponse]
  }
  
  extension [Self <: PutAccountPreferencesResponse](x: Self) {
    
    inline def setResourceIdPreference(value: ResourceIdPreference): Self = StObject.set(x, "ResourceIdPreference", value.asInstanceOf[js.Any])
    
    inline def setResourceIdPreferenceUndefined: Self = StObject.set(x, "ResourceIdPreference", js.undefined)
  }
}
