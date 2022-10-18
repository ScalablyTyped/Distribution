package typings.awsSdk.clientsResourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PendingResource extends StObject {
  
  /**
    * The Amazon resource name (ARN) of the resource that's in a pending state.
    */
  var ResourceArn: js.UndefOr[typings.awsSdk.clientsResourcegroupsMod.ResourceArn] = js.undefined
}
object PendingResource {
  
  inline def apply(): PendingResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingResource]
  }
  
  extension [Self <: PendingResource](x: Self) {
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
  }
}
