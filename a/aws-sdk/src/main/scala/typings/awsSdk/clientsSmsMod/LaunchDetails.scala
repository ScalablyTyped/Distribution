package typings.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchDetails extends StObject {
  
  /**
    * The latest time that this application was launched successfully.
    */
  var latestLaunchTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the latest stack launched for this application.
    */
  var stackId: js.UndefOr[StackId] = js.undefined
  
  /**
    * The name of the latest stack launched for this application.
    */
  var stackName: js.UndefOr[StackName] = js.undefined
}
object LaunchDetails {
  
  inline def apply(): LaunchDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchDetails]
  }
  
  extension [Self <: LaunchDetails](x: Self) {
    
    inline def setLatestLaunchTime(value: js.Date): Self = StObject.set(x, "latestLaunchTime", value.asInstanceOf[js.Any])
    
    inline def setLatestLaunchTimeUndefined: Self = StObject.set(x, "latestLaunchTime", js.undefined)
    
    inline def setStackId(value: StackId): Self = StObject.set(x, "stackId", value.asInstanceOf[js.Any])
    
    inline def setStackIdUndefined: Self = StObject.set(x, "stackId", js.undefined)
    
    inline def setStackName(value: StackName): Self = StObject.set(x, "stackName", value.asInstanceOf[js.Any])
    
    inline def setStackNameUndefined: Self = StObject.set(x, "stackName", js.undefined)
  }
}
