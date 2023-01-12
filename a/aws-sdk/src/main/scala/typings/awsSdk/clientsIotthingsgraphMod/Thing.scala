package typings.awsSdk.clientsIotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Thing extends StObject {
  
  /**
    * The ARN of the thing.
    */
  var thingArn: js.UndefOr[ThingArn] = js.undefined
  
  /**
    * The name of the thing.
    */
  var thingName: js.UndefOr[ThingName] = js.undefined
}
object Thing {
  
  inline def apply(): Thing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Thing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Thing] (val x: Self) extends AnyVal {
    
    inline def setThingArn(value: ThingArn): Self = StObject.set(x, "thingArn", value.asInstanceOf[js.Any])
    
    inline def setThingArnUndefined: Self = StObject.set(x, "thingArn", js.undefined)
    
    inline def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    
    inline def setThingNameUndefined: Self = StObject.set(x, "thingName", js.undefined)
  }
}
