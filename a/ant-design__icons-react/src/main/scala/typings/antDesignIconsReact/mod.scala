package typings.antDesignIconsReact

import typings.antDesignIconsReact.iconMod.TwoToneColorPalette
import typings.antDesignIconsReact.iconMod.TwoToneColorPaletteSetter
import typings.antDesignIconsReact.utilsMod.MiniMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ant-design/icons-react/lib", JSImport.Default)
  @js.native
  class default ()
    extends typings.antDesignIconsReact.iconMod.default
  object default {
    
    @JSImport("@ant-design/icons-react/lib", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ant-design/icons-react/lib", "default.add")
    @js.native
    def add(
      icons: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ js.Any)*
    ): Unit = js.native
    
    /* static member */
    @JSImport("@ant-design/icons-react/lib", "default.clear")
    @js.native
    def clear(): Unit = js.native
    
    /* static member */
    @JSImport("@ant-design/icons-react/lib", "default.definitions")
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
    @JSImport("@ant-design/icons-react/lib", "default.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@ant-design/icons-react/lib", "default.get")
    @js.native
    def get(): js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ js.Any
      ] = js.native
    @JSImport("@ant-design/icons-react/lib", "default.get")
    @js.native
    def get(key: js.UndefOr[scala.Nothing], colors: TwoToneColorPalette): js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ js.Any
      ] = js.native
    @JSImport("@ant-design/icons-react/lib", "default.get")
    @js.native
    def get(key: String): js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ js.Any
      ] = js.native
    @JSImport("@ant-design/icons-react/lib", "default.get")
    @js.native
    def get(key: String, colors: TwoToneColorPalette): js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ js.Any
      ] = js.native
    
    /* static member */
    @JSImport("@ant-design/icons-react/lib", "default.getTwoToneColors")
    @js.native
    def getTwoToneColors(): TwoToneColorPalette = js.native
    
    /* static member */
    @JSImport("@ant-design/icons-react/lib", "default.setTwoToneColors")
    @js.native
    def setTwoToneColors(hasPrimaryColorSecondaryColor: TwoToneColorPaletteSetter): Unit = js.native
  }
}
