package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThingTypeProperties extends StObject {
  
  /**
    * A list of searchable thing attribute names.
    */
  var searchableAttributes: js.UndefOr[SearchableAttributes] = js.undefined
  
  /**
    * The description of the thing type.
    */
  var thingTypeDescription: js.UndefOr[ThingTypeDescription] = js.undefined
}
object ThingTypeProperties {
  
  inline def apply(): ThingTypeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingTypeProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThingTypeProperties] (val x: Self) extends AnyVal {
    
    inline def setSearchableAttributes(value: SearchableAttributes): Self = StObject.set(x, "searchableAttributes", value.asInstanceOf[js.Any])
    
    inline def setSearchableAttributesUndefined: Self = StObject.set(x, "searchableAttributes", js.undefined)
    
    inline def setSearchableAttributesVarargs(value: AttributeName*): Self = StObject.set(x, "searchableAttributes", js.Array(value*))
    
    inline def setThingTypeDescription(value: ThingTypeDescription): Self = StObject.set(x, "thingTypeDescription", value.asInstanceOf[js.Any])
    
    inline def setThingTypeDescriptionUndefined: Self = StObject.set(x, "thingTypeDescription", js.undefined)
  }
}
