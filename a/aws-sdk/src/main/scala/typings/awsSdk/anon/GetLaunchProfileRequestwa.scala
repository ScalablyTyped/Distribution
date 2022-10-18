package typings.awsSdk.anon

import typings.awsSdk.clientsNimbleMod.String
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/nimble.GetLaunchProfileRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait GetLaunchProfileRequestwa extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The Launch Profile ID.
    */
  var launchProfileId: String
  
  /**
    * The studio ID. 
    */
  var studioId: String
}
object GetLaunchProfileRequestwa {
  
  inline def apply(launchProfileId: String, studioId: String): GetLaunchProfileRequestwa = {
    val __obj = js.Dynamic.literal(launchProfileId = launchProfileId.asInstanceOf[js.Any], studioId = studioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchProfileRequestwa]
  }
  
  extension [Self <: GetLaunchProfileRequestwa](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setLaunchProfileId(value: String): Self = StObject.set(x, "launchProfileId", value.asInstanceOf[js.Any])
    
    inline def setStudioId(value: String): Self = StObject.set(x, "studioId", value.asInstanceOf[js.Any])
  }
}
