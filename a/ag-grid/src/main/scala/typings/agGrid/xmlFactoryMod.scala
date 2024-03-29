package typings.agGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlFactoryMod {
  
  @JSImport("ag-grid/dist/lib/xmlFactory", "XmlFactory")
  @js.native
  class XmlFactory () extends StObject {
    
    def createXml(xmlElement: XmlElement): String = js.native
    def createXml(xmlElement: XmlElement, booleanTransformer: js.Function1[/* currentValue */ Boolean, String]): String = js.native
    
    /* private */ def returnAttributeIfPopulated(key: js.Any, value: js.Any, booleanTransformer: js.Any): js.Any = js.native
  }
  
  trait PrefixedXmlAttributes extends StObject {
    
    var map: js.Any
    
    var prefix: String
  }
  object PrefixedXmlAttributes {
    
    inline def apply(map: js.Any, prefix: String): PrefixedXmlAttributes = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrefixedXmlAttributes]
    }
    
    extension [Self <: PrefixedXmlAttributes](x: Self) {
      
      inline def setMap(value: js.Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
  
  trait XmlAttributes extends StObject {
    
    var prefixedAttributes: js.UndefOr[js.Array[PrefixedXmlAttributes]] = js.undefined
    
    var rawMap: js.UndefOr[js.Any] = js.undefined
  }
  object XmlAttributes {
    
    inline def apply(): XmlAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XmlAttributes]
    }
    
    extension [Self <: XmlAttributes](x: Self) {
      
      inline def setPrefixedAttributes(value: js.Array[PrefixedXmlAttributes]): Self = StObject.set(x, "prefixedAttributes", value.asInstanceOf[js.Any])
      
      inline def setPrefixedAttributesUndefined: Self = StObject.set(x, "prefixedAttributes", js.undefined)
      
      inline def setPrefixedAttributesVarargs(value: PrefixedXmlAttributes*): Self = StObject.set(x, "prefixedAttributes", js.Array(value :_*))
      
      inline def setRawMap(value: js.Any): Self = StObject.set(x, "rawMap", value.asInstanceOf[js.Any])
      
      inline def setRawMapUndefined: Self = StObject.set(x, "rawMap", js.undefined)
    }
  }
  
  trait XmlElement extends StObject {
    
    var children: js.UndefOr[js.Array[XmlElement]] = js.undefined
    
    var name: String
    
    var properties: js.UndefOr[XmlAttributes] = js.undefined
    
    var textNode: js.UndefOr[String] = js.undefined
  }
  object XmlElement {
    
    inline def apply(name: String): XmlElement = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[XmlElement]
    }
    
    extension [Self <: XmlElement](x: Self) {
      
      inline def setChildren(value: js.Array[XmlElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: XmlElement*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: XmlAttributes): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setTextNode(value: String): Self = StObject.set(x, "textNode", value.asInstanceOf[js.Any])
      
      inline def setTextNodeUndefined: Self = StObject.set(x, "textNode", js.undefined)
    }
  }
}
