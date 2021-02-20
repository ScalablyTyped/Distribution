package typings.antDesignIconsReact

import typings.antDesignIconsReact.utilsMod.MiniMap
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconMod {
  
  @JSImport("@ant-design/icons-react/lib/components/Icon", JSImport.Default)
  @js.native
  class default () extends Icon
  object default {
    
    @JSImport("@ant-design/icons-react/lib/components/Icon", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ant-design/icons-react/lib/components/Icon", "default.add")
    @js.native
    def add(
      icons: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ js.Any)*
    ): Unit = js.native
    
    /* static member */
    @JSImport("@ant-design/icons-react/lib/components/Icon", "default.clear")
    @js.native
    def clear(): Unit = js.native
    
    /* static member */
    @JSImport("@ant-design/icons-react/lib/components/Icon", "default.definitions")
    @js.native
    def definitions: MiniMap[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ js.Any
      ] = js.native
    @scala.inline
    def definitions_=(
      x: MiniMap[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ js.Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("definitions")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@ant-design/icons-react/lib/components/Icon", "default.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@ant-design/icons-react/lib/components/Icon", "default.get")
    @js.native
    def get(): js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ js.Any
      ] = js.native
    @JSImport("@ant-design/icons-react/lib/components/Icon", "default.get")
    @js.native
    def get(key: js.UndefOr[scala.Nothing], colors: TwoToneColorPalette): js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ js.Any
      ] = js.native
    @JSImport("@ant-design/icons-react/lib/components/Icon", "default.get")
    @js.native
    def get(key: String): js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ js.Any
      ] = js.native
    @JSImport("@ant-design/icons-react/lib/components/Icon", "default.get")
    @js.native
    def get(key: String, colors: TwoToneColorPalette): js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ js.Any
      ] = js.native
    
    /* static member */
    @JSImport("@ant-design/icons-react/lib/components/Icon", "default.getTwoToneColors")
    @js.native
    def getTwoToneColors(): TwoToneColorPalette = js.native
    
    /* static member */
    @JSImport("@ant-design/icons-react/lib/components/Icon", "default.setTwoToneColors")
    @js.native
    def setTwoToneColors(hasPrimaryColorSecondaryColor: TwoToneColorPaletteSetter): Unit = js.native
  }
  
  @js.native
  trait Icon
    extends Component[IconProps, js.Object, js.Any]
  
  @js.native
  trait IconProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var focusable: js.UndefOr[String] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
    
    var primaryColor: js.UndefOr[String] = js.native
    
    var secondaryColor: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var `type`: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ js.Any) = js.native
  }
  object IconProps {
    
    @scala.inline
    def apply(
      `type`: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ js.Any)
    ): IconProps = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconProps]
    }
    
    @scala.inline
    implicit class IconPropsMutableBuilder[Self <: IconProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setFocusable(value: String): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      @scala.inline
      def setOnClick(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryColorUndefined: Self = StObject.set(x, "primaryColor", js.undefined)
      
      @scala.inline
      def setSecondaryColor(value: String): Self = StObject.set(x, "secondaryColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryColorUndefined: Self = StObject.set(x, "secondaryColor", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setType(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ js.Any)
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TwoToneColorPalette extends TwoToneColorPaletteSetter {
    
    @JSName("secondaryColor")
    var secondaryColor_TwoToneColorPalette: String = js.native
  }
  object TwoToneColorPalette {
    
    @scala.inline
    def apply(primaryColor: String, secondaryColor: String): TwoToneColorPalette = {
      val __obj = js.Dynamic.literal(primaryColor = primaryColor.asInstanceOf[js.Any], secondaryColor = secondaryColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[TwoToneColorPalette]
    }
    
    @scala.inline
    implicit class TwoToneColorPaletteMutableBuilder[Self <: TwoToneColorPalette] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSecondaryColor(value: String): Self = StObject.set(x, "secondaryColor", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TwoToneColorPaletteSetter extends StObject {
    
    var primaryColor: String = js.native
    
    var secondaryColor: js.UndefOr[String] = js.native
  }
  object TwoToneColorPaletteSetter {
    
    @scala.inline
    def apply(primaryColor: String): TwoToneColorPaletteSetter = {
      val __obj = js.Dynamic.literal(primaryColor = primaryColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[TwoToneColorPaletteSetter]
    }
    
    @scala.inline
    implicit class TwoToneColorPaletteSetterMutableBuilder[Self <: TwoToneColorPaletteSetter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryColor(value: String): Self = StObject.set(x, "secondaryColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryColorUndefined: Self = StObject.set(x, "secondaryColor", js.undefined)
    }
  }
}
