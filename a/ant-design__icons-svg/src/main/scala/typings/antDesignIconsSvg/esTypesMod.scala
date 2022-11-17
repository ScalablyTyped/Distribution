package typings.antDesignIconsSvg

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTypesMod {
  
  trait AbstractNode extends StObject {
    
    var attrs: StringDictionary[String]
    
    var children: js.UndefOr[js.Array[AbstractNode]] = js.undefined
    
    var tag: String
  }
  object AbstractNode {
    
    inline def apply(attrs: StringDictionary[String], tag: String): AbstractNode = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbstractNode]
    }
    
    extension [Self <: AbstractNode](x: Self) {
      
      inline def setAttrs(value: StringDictionary[String]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: js.Array[AbstractNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: AbstractNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  trait IconDefinition extends StObject {
    
    var icon: (js.Function2[/* primaryColor */ String, /* secondaryColor */ String, AbstractNode]) | AbstractNode
    
    var name: String
    
    var theme: ThemeType
  }
  object IconDefinition {
    
    inline def apply(
      icon: (js.Function2[/* primaryColor */ String, /* secondaryColor */ String, AbstractNode]) | AbstractNode,
      name: String,
      theme: ThemeType
    ): IconDefinition = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconDefinition]
    }
    
    extension [Self <: IconDefinition](x: Self) {
      
      inline def setIcon(
        value: (js.Function2[/* primaryColor */ String, /* secondaryColor */ String, AbstractNode]) | AbstractNode
      ): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconFunction2(value: (/* primaryColor */ String, /* secondaryColor */ String) => AbstractNode): Self = StObject.set(x, "icon", js.Any.fromFunction2(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: ThemeType): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  object ThemeType {
    
    inline def filled: "filled" = "filled".asInstanceOf["filled"]
    
    inline def outlined: "outlined" = "outlined".asInstanceOf["outlined"]
    
    inline def twotone: "twotone" = "twotone".asInstanceOf["twotone"]
  }
  type ThemeType = "filled" | "outlined" | "twotone"
  
  object ThemeTypeUpperCase {
    
    inline def Filled: "Filled" = "Filled".asInstanceOf["Filled"]
    
    inline def Outlined: "Outlined" = "Outlined".asInstanceOf["Outlined"]
    
    inline def TwoTone: "TwoTone" = "TwoTone".asInstanceOf["TwoTone"]
  }
  type ThemeTypeUpperCase = "Filled" | "Outlined" | "TwoTone"
}
