package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnomalyResource extends StObject {
  
  /**
    * The name of the Amazon Web Services resource.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The type of the Amazon Web Services resource.
    */
  var Type: js.UndefOr[ResourceType] = js.undefined
}
object AnomalyResource {
  
  inline def apply(): AnomalyResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnomalyResource]
  }
  
  extension [Self <: AnomalyResource](x: Self) {
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setType(value: ResourceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
