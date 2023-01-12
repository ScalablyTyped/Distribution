package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRegionAction extends StObject {
  
  /**
    * The name of the Amazon Web Services Region you're deleting from the replication set.
    */
  var regionName: RegionName
}
object DeleteRegionAction {
  
  inline def apply(regionName: RegionName): DeleteRegionAction = {
    val __obj = js.Dynamic.literal(regionName = regionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRegionAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteRegionAction] (val x: Self) extends AnyVal {
    
    inline def setRegionName(value: RegionName): Self = StObject.set(x, "regionName", value.asInstanceOf[js.Any])
  }
}
