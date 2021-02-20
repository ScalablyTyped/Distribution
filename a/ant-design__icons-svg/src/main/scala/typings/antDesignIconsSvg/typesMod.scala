package typings.antDesignIconsSvg

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignIconsSvg.antDesignIconsSvgStrings.filled_
import typings.antDesignIconsSvg.antDesignIconsSvgStrings.outlined_
import typings.antDesignIconsSvg.antDesignIconsSvgStrings.twotone_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait AbstractNode extends StObject {
    
    var attrs: StringDictionary[String] = js.native
    
    var children: js.UndefOr[js.Array[AbstractNode]] = js.native
    
    var tag: String = js.native
  }
  object AbstractNode {
    
    @scala.inline
    def apply(attrs: StringDictionary[String], tag: String): AbstractNode = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbstractNode]
    }
    
    @scala.inline
    implicit class AbstractNodeMutableBuilder[Self <: AbstractNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttrs(value: StringDictionary[String]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildren(value: js.Array[AbstractNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: AbstractNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IconDefinition extends StObject {
    
    var icon: (js.Function2[/* primaryColor */ String, /* secondaryColor */ String, AbstractNode]) | AbstractNode = js.native
    
    var name: String = js.native
    
    var theme: ThemeType = js.native
  }
  object IconDefinition {
    
    @scala.inline
    def apply(
      icon: (js.Function2[/* primaryColor */ String, /* secondaryColor */ String, AbstractNode]) | AbstractNode,
      name: String,
      theme: ThemeType
    ): IconDefinition = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconDefinition]
    }
    
    @scala.inline
    implicit class IconDefinitionMutableBuilder[Self <: IconDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(
        value: (js.Function2[/* primaryColor */ String, /* secondaryColor */ String, AbstractNode]) | AbstractNode
      ): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconFunction2(value: (/* primaryColor */ String, /* secondaryColor */ String) => AbstractNode): Self = StObject.set(x, "icon", js.Any.fromFunction2(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: ThemeType): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antDesignIconsSvg.antDesignIconsSvgStrings.filled_
    - typings.antDesignIconsSvg.antDesignIconsSvgStrings.outlined_
    - typings.antDesignIconsSvg.antDesignIconsSvgStrings.twotone_
  */
  trait ThemeType extends StObject
  object ThemeType {
    
    @scala.inline
    def filled: filled_ = "filled".asInstanceOf[filled_]
    
    @scala.inline
    def outlined: outlined_ = "outlined".asInstanceOf[outlined_]
    
    @scala.inline
    def twotone: twotone_ = "twotone".asInstanceOf[twotone_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antDesignIconsSvg.antDesignIconsSvgStrings.Filled
    - typings.antDesignIconsSvg.antDesignIconsSvgStrings.Outlined
    - typings.antDesignIconsSvg.antDesignIconsSvgStrings.TwoTone
  */
  trait ThemeTypeUpperCase extends StObject
  object ThemeTypeUpperCase {
    
    @scala.inline
    def Filled: typings.antDesignIconsSvg.antDesignIconsSvgStrings.Filled = "Filled".asInstanceOf[typings.antDesignIconsSvg.antDesignIconsSvgStrings.Filled]
    
    @scala.inline
    def Outlined: typings.antDesignIconsSvg.antDesignIconsSvgStrings.Outlined = "Outlined".asInstanceOf[typings.antDesignIconsSvg.antDesignIconsSvgStrings.Outlined]
    
    @scala.inline
    def TwoTone: typings.antDesignIconsSvg.antDesignIconsSvgStrings.TwoTone = "TwoTone".asInstanceOf[typings.antDesignIconsSvg.antDesignIconsSvgStrings.TwoTone]
  }
}
