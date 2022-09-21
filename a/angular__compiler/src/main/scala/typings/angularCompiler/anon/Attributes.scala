package typings.angularCompiler.anon

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attributes extends StObject {
  
  /**
    * A mapping of attribute names to their value expression.
    */
  var attributes: js.UndefOr[StringDictionary[Expression]] = js.undefined
  
  /**
    * The value of the class attribute, if present. This is stored outside of `attributes` as its
    * string value must be known statically.
    */
  var classAttribute: js.UndefOr[String] = js.undefined
  
  /**
    * A mapping of event names to their unparsed event handler expression.
    */
  var listeners: StringDictionary[String]
  
  /**
    * A mapping of bound properties to their unparsed binding expression.
    */
  var properties: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The value of the style attribute, if present. This is stored outside of `attributes` as its
    * string value must be known statically.
    */
  var styleAttribute: js.UndefOr[String] = js.undefined
}
object Attributes {
  
  inline def apply(listeners: StringDictionary[String]): Attributes = {
    val __obj = js.Dynamic.literal(listeners = listeners.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
  
  extension [Self <: Attributes](x: Self) {
    
    inline def setAttributes(value: StringDictionary[Expression]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setClassAttribute(value: String): Self = StObject.set(x, "classAttribute", value.asInstanceOf[js.Any])
    
    inline def setClassAttributeUndefined: Self = StObject.set(x, "classAttribute", js.undefined)
    
    inline def setListeners(value: StringDictionary[String]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setStyleAttribute(value: String): Self = StObject.set(x, "styleAttribute", value.asInstanceOf[js.Any])
    
    inline def setStyleAttributeUndefined: Self = StObject.set(x, "styleAttribute", js.undefined)
  }
}
