package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThingAttribute extends StObject {
  
  /**
    * A list of thing attributes which are name-value pairs.
    */
  var attributes: js.UndefOr[Attributes] = js.undefined
  
  /**
    * The thing ARN.
    */
  var thingArn: js.UndefOr[ThingArn] = js.undefined
  
  /**
    * The name of the thing.
    */
  var thingName: js.UndefOr[ThingName] = js.undefined
  
  /**
    * The name of the thing type, if the thing has been associated with a type.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
  
  /**
    * The version of the thing record in the registry.
    */
  var version: js.UndefOr[Version] = js.undefined
}
object ThingAttribute {
  
  inline def apply(): ThingAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingAttribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThingAttribute] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setThingArn(value: ThingArn): Self = StObject.set(x, "thingArn", value.asInstanceOf[js.Any])
    
    inline def setThingArnUndefined: Self = StObject.set(x, "thingArn", js.undefined)
    
    inline def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    
    inline def setThingNameUndefined: Self = StObject.set(x, "thingName", js.undefined)
    
    inline def setThingTypeName(value: ThingTypeName): Self = StObject.set(x, "thingTypeName", value.asInstanceOf[js.Any])
    
    inline def setThingTypeNameUndefined: Self = StObject.set(x, "thingTypeName", js.undefined)
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
