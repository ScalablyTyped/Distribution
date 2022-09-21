package typings.antDesignIconsAngular

import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectorDeclaration
import typings.angularCore.mod.ɵɵNgModuleDeclaration
import typings.antDesignIconsAngular.anon.TypeofCommonModule
import typings.antDesignIconsAngular.anon.TypeofIconDirective
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconModuleMod {
  
  @JSImport("@ant-design/icons-angular/component/icon.module", "IconModule")
  @js.native
  open class IconModule () extends StObject
  /* static members */
  object IconModule {
    
    @JSImport("@ant-design/icons-angular/component/icon.module", "IconModule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/icons-angular/component/icon.module", "IconModule.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[IconModule, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[IconModule, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/icons-angular/component/icon.module", "IconModule.\u0275inj")
    @js.native
    def ɵinj: ɵɵInjectorDeclaration[IconModule] = js.native
    inline def ɵinj_=(x: ɵɵInjectorDeclaration[IconModule]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275inj")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/icons-angular/component/icon.module", "IconModule.\u0275mod")
    @js.native
    def ɵmod: ɵɵNgModuleDeclaration[
        IconModule, 
        js.Array[TypeofIconDirective], 
        js.Array[TypeofCommonModule], 
        js.Array[TypeofIconDirective]
      ] = js.native
    inline def ɵmod_=(
      x: ɵɵNgModuleDeclaration[
          IconModule, 
          js.Array[TypeofIconDirective], 
          js.Array[TypeofCommonModule], 
          js.Array[TypeofIconDirective]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275mod")(x.asInstanceOf[js.Any])
  }
}
