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
    @scala.inline
    def add(
      icons: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ js.Any)*
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(icons.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    @scala.inline
    def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    
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
    @scala.inline
    def get(): js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ js.Any
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ js.Any
      ]]
    @scala.inline
    def get(key: String): js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ js.Any
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ js.Any
      ]]
    @scala.inline
    def get(key: String, colors: TwoToneColorPalette): js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ js.Any
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any], colors.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ js.Any
      ]]
    @scala.inline
    def get(key: Unit, colors: TwoToneColorPalette): js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ js.Any
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any], colors.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ js.Any
      ]]
    
    /* static member */
    @scala.inline
    def getTwoToneColors(): TwoToneColorPalette = ^.asInstanceOf[js.Dynamic].applyDynamic("getTwoToneColors")().asInstanceOf[TwoToneColorPalette]
    
    /* static member */
    @scala.inline
    def setTwoToneColors(hasPrimaryColorSecondaryColor: TwoToneColorPaletteSetter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTwoToneColors")(hasPrimaryColorSecondaryColor.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @js.native
  trait Icon
    extends Component[IconProps, js.Object, js.Any]
  
  trait IconProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var focusable: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
    
    var primaryColor: js.UndefOr[String] = js.undefined
    
    var secondaryColor: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var `type`: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ js.Any)
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
  
  trait TwoToneColorPalette
    extends StObject
       with TwoToneColorPaletteSetter {
    
    @JSName("secondaryColor")
    var secondaryColor_TwoToneColorPalette: String
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
  
  trait TwoToneColorPaletteSetter extends StObject {
    
    var primaryColor: String
    
    var secondaryColor: js.UndefOr[String] = js.undefined
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
