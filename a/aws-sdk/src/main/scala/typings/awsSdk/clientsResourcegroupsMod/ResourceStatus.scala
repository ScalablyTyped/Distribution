package typings.awsSdk.clientsResourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceStatus extends StObject {
  
  /**
    * The current status.
    */
  var Name: js.UndefOr[ResourceStatusValue] = js.undefined
}
object ResourceStatus {
  
  inline def apply(): ResourceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceStatus]
  }
  
  extension [Self <: ResourceStatus](x: Self) {
    
    inline def setName(value: ResourceStatusValue): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
