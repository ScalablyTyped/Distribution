package typings.antDesignIconsVue

import typings.antDesignIconsSvg.typesMod.IconDefinition
import typings.antDesignIconsVue.iconMod.IconBaseProps
import typings.antDesignIconsVue.twoTonePrimaryColorMod.TwoToneColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object antdIconMod {
  
  object default {
    
    inline def apply(
      props: IconComponentProps,
      context: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SetupContext */ js.Any
    ): js.Any = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @JSImport("@ant-design/icons-vue/lib/components/AntdIcon", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/icons-vue/lib/components/AntdIcon", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def getTwoToneColor(): TwoToneColor = ^.asInstanceOf[js.Dynamic].applyDynamic("getTwoToneColor")().asInstanceOf[TwoToneColor]
    @JSImport("@ant-design/icons-vue/lib/components/AntdIcon", "default.getTwoToneColor")
    @js.native
    def getTwoToneColor_Fdefault: js.Function0[TwoToneColor] = js.native
    
    inline def getTwoToneColor_Fdefault_=(x: js.Function0[TwoToneColor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getTwoToneColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/icons-vue/lib/components/AntdIcon", "default.inheritAttrs")
    @js.native
    def inheritAttrs: Boolean = js.native
    inline def inheritAttrs_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inheritAttrs")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/icons-vue/lib/components/AntdIcon", "default.setTwoToneColor")
    @js.native
    def setTwoToneColor: js.Function1[/* twoToneColor */ TwoToneColor, Unit] = js.native
    inline def setTwoToneColor(twoToneColor: TwoToneColor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTwoToneColor")(twoToneColor.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setTwoToneColor_=(x: js.Function1[/* twoToneColor */ TwoToneColor, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setTwoToneColor")(x.asInstanceOf[js.Any])
  }
  
  trait AntdIconProps
    extends StObject
       with IconBaseProps {
    
    var twoToneColor: js.UndefOr[TwoToneColor] = js.undefined
  }
  object AntdIconProps {
    
    inline def apply(): AntdIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AntdIconProps]
    }
    
    extension [Self <: AntdIconProps](x: Self) {
      
      inline def setTwoToneColor(value: TwoToneColor): Self = StObject.set(x, "twoToneColor", value.asInstanceOf[js.Any])
      
      inline def setTwoToneColorUndefined: Self = StObject.set(x, "twoToneColor", js.undefined)
    }
  }
  
  trait IconComponentProps
    extends StObject
       with AntdIconProps {
    
    var icon: IconDefinition
  }
  object IconComponentProps {
    
    inline def apply(icon: IconDefinition): IconComponentProps = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconComponentProps]
    }
    
    extension [Self <: IconComponentProps](x: Self) {
      
      inline def setIcon(value: IconDefinition): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    }
  }
}
