package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventResource extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the resource that emitted an event. 
    */
  var Arn: js.UndefOr[EventResourceArn] = js.undefined
  
  /**
    *  The name of the resource that emitted an event. 
    */
  var Name: js.UndefOr[EventResourceName] = js.undefined
  
  /**
    *  The type of resource that emitted an event. 
    */
  var Type: js.UndefOr[EventResourceType] = js.undefined
}
object EventResource {
  
  inline def apply(): EventResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventResource] (val x: Self) extends AnyVal {
    
    inline def setArn(value: EventResourceArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setName(value: EventResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setType(value: EventResourceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
