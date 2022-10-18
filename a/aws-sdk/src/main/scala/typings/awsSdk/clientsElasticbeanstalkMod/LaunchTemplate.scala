package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplate extends StObject {
  
  /**
    * The ID of the launch template.
    */
  var Id: js.UndefOr[ResourceId] = js.undefined
}
object LaunchTemplate {
  
  inline def apply(): LaunchTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplate]
  }
  
  extension [Self <: LaunchTemplate](x: Self) {
    
    inline def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
