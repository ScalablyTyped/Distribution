package typings.atAngularCommon.atAngularCommonMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.TopLevel
import typings.atAngularCore.atAngularCoreMod.ElementRef
import typings.atAngularCore.atAngularCoreMod.KeyValueDiffers
import typings.atAngularCore.atAngularCoreMod.Renderer2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "ɵangular_packages_common_common_k")
@js.native
object ɵangular_packages_common_common_k extends js.Object {
  @js.native
  class provide () extends ɵNgStyleImpl
  
  @js.native
  class useClass protected () extends ɵNgStyleR2Impl {
    def this(_ngEl: ElementRef[_], _differs: KeyValueDiffers, _renderer: Renderer2) = this()
  }
  
  @js.native
  object provide extends TopLevel[Instantiable0[ɵNgStyleImpl]]
  
  @js.native
  object useClass
    extends TopLevel[
          Instantiable3[
            /* _ngEl */ ElementRef[js.Any], 
            /* _differs */ KeyValueDiffers, 
            /* _renderer */ Renderer2, 
            ɵNgStyleR2Impl
          ]
        ]
  
}

