package typings.angularCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.OpaqueValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attributes extends StObject {
  
  var attributes: js.UndefOr[StringDictionary[OpaqueValue]] = js.undefined
  
  var classAttribute: js.UndefOr[String] = js.undefined
  
  var listeners: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var properties: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var styleAttribute: js.UndefOr[String] = js.undefined
}
object Attributes {
  
  inline def apply(): Attributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: StringDictionary[OpaqueValue]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setClassAttribute(value: String): Self = StObject.set(x, "classAttribute", value.asInstanceOf[js.Any])
    
    inline def setClassAttributeUndefined: Self = StObject.set(x, "classAttribute", js.undefined)
    
    inline def setListeners(value: StringDictionary[String]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    inline def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
    
    inline def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setStyleAttribute(value: String): Self = StObject.set(x, "styleAttribute", value.asInstanceOf[js.Any])
    
    inline def setStyleAttributeUndefined: Self = StObject.set(x, "styleAttribute", js.undefined)
  }
}
