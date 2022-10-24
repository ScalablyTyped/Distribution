package typings.antDesignIconsReact

import typings.antDesignIconsReact.libComponentsIconMod.TwoToneColorPalette
import typings.antDesignIconsReact.libComponentsIconMod.TwoToneColorPaletteSetter
import typings.antDesignIconsReact.libUtilsMod.MiniMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("@ant-design/icons-react/lib", JSImport.Default)
  @js.native
  open class default ()
    extends typings.antDesignIconsReact.libComponentsIconMod.default
  object default {
    
    @JSImport("@ant-design/icons-react/lib", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def add(
      icons: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ Any)*
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(icons.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    
    /* static member */
    @JSImport("@ant-design/icons-react/lib", "default.definitions")
    @js.native
    def definitions: MiniMap[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ Any
      ] = js.native
    inline def definitions_=(
      x: MiniMap[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("definitions")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@ant-design/icons-react/lib", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def get(): js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ Any
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ Any
      ]]
    inline def get(key: String): js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ Any
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ Any
      ]]
    inline def get(key: String, colors: TwoToneColorPalette): js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ Any
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any], colors.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ Any
      ]]
    inline def get(key: Unit, colors: TwoToneColorPalette): js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ Any
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any], colors.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ Any
      ]]
    
    /* static member */
    inline def getTwoToneColors(): TwoToneColorPalette = ^.asInstanceOf[js.Dynamic].applyDynamic("getTwoToneColors")().asInstanceOf[TwoToneColorPalette]
    
    /* static member */
    inline def setTwoToneColors(param0: TwoToneColorPaletteSetter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTwoToneColors")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
