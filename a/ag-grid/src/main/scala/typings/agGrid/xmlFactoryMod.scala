package typings.agGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlFactoryMod {
  
  @JSImport("ag-grid/dist/lib/xmlFactory", "XmlFactory")
  @js.native
  class XmlFactory () extends StObject {
    
    def createXml(xmlElement: XmlElement): String = js.native
    def createXml(xmlElement: XmlElement, booleanTransformer: js.Function1[/* currentValue */ Boolean, String]): String = js.native
    
    /* private */ def returnAttributeIfPopulated(key: js.Any, value: js.Any, booleanTransformer: js.Any): js.Any = js.native
  }
  
  @js.native
  trait PrefixedXmlAttributes extends StObject {
    
    var map: js.Any = js.native
    
    var prefix: String = js.native
  }
  object PrefixedXmlAttributes {
    
    @scala.inline
    def apply(map: js.Any, prefix: String): PrefixedXmlAttributes = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrefixedXmlAttributes]
    }
    
    @scala.inline
    implicit class PrefixedXmlAttributesMutableBuilder[Self <: PrefixedXmlAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMap(value: js.Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait XmlAttributes extends StObject {
    
    var prefixedAttributes: js.UndefOr[js.Array[PrefixedXmlAttributes]] = js.native
    
    var rawMap: js.UndefOr[js.Any] = js.native
  }
  object XmlAttributes {
    
    @scala.inline
    def apply(): XmlAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XmlAttributes]
    }
    
    @scala.inline
    implicit class XmlAttributesMutableBuilder[Self <: XmlAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefixedAttributes(value: js.Array[PrefixedXmlAttributes]): Self = StObject.set(x, "prefixedAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixedAttributesUndefined: Self = StObject.set(x, "prefixedAttributes", js.undefined)
      
      @scala.inline
      def setPrefixedAttributesVarargs(value: PrefixedXmlAttributes*): Self = StObject.set(x, "prefixedAttributes", js.Array(value :_*))
      
      @scala.inline
      def setRawMap(value: js.Any): Self = StObject.set(x, "rawMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawMapUndefined: Self = StObject.set(x, "rawMap", js.undefined)
    }
  }
  
  @js.native
  trait XmlElement extends StObject {
    
    var children: js.UndefOr[js.Array[XmlElement]] = js.native
    
    var name: String = js.native
    
    var properties: js.UndefOr[XmlAttributes] = js.native
    
    var textNode: js.UndefOr[String] = js.native
  }
  object XmlElement {
    
    @scala.inline
    def apply(name: String): XmlElement = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[XmlElement]
    }
    
    @scala.inline
    implicit class XmlElementMutableBuilder[Self <: XmlElement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[XmlElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: XmlElement*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperties(value: XmlAttributes): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setTextNode(value: String): Self = StObject.set(x, "textNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextNodeUndefined: Self = StObject.set(x, "textNode", js.undefined)
    }
  }
}
