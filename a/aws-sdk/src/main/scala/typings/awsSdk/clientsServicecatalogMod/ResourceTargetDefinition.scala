package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceTargetDefinition extends StObject {
  
  /**
    * The attribute to be changed.
    */
  var Attribute: js.UndefOr[ResourceAttribute] = js.undefined
  
  /**
    * If the attribute is Properties, the value is the name of the property. Otherwise, the value is null.
    */
  var Name: js.UndefOr[PropertyName] = js.undefined
  
  /**
    * If the attribute is Properties, indicates whether a change to this property causes the resource to be re-created.
    */
  var RequiresRecreation: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.RequiresRecreation] = js.undefined
}
object ResourceTargetDefinition {
  
  inline def apply(): ResourceTargetDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceTargetDefinition]
  }
  
  extension [Self <: ResourceTargetDefinition](x: Self) {
    
    inline def setAttribute(value: ResourceAttribute): Self = StObject.set(x, "Attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "Attribute", js.undefined)
    
    inline def setName(value: PropertyName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRequiresRecreation(value: RequiresRecreation): Self = StObject.set(x, "RequiresRecreation", value.asInstanceOf[js.Any])
    
    inline def setRequiresRecreationUndefined: Self = StObject.set(x, "RequiresRecreation", js.undefined)
  }
}
