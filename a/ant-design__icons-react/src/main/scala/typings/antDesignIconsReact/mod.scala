package typings.antDesignIconsReact

import typings.antDesignIconsReact.iconMod.TwoToneColorPalette
import typings.antDesignIconsReact.iconMod.TwoToneColorPaletteSetter
import typings.antDesignIconsReact.utilsMod.MiniMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    @scala.inline
    def add(
      icons: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ js.Any)*
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(icons.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    @scala.inline
    def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    
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
}
