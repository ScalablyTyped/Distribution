package typings
package atAngularCoreLib.srcRender3JitCompilerUnderscoreFacadeUnderscoreInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3NgModuleMetadataFacade extends js.Object {
  var bootstrap: js.Array[js.Function]
  var declarations: js.Array[js.Function]
  var emitInline: scala.Boolean
  var exports: js.Array[js.Function]
  var imports: js.Array[js.Function]
  var `type`: js.Any
}

object R3NgModuleMetadataFacade {
  @scala.inline
  def apply(
    bootstrap: js.Array[js.Function],
    declarations: js.Array[js.Function],
    emitInline: scala.Boolean,
    exports: js.Array[js.Function],
    imports: js.Array[js.Function],
    `type`: js.Any
  ): R3NgModuleMetadataFacade = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("bootstrap")(bootstrap)
    __obj.updateDynamic("declarations")(declarations)
    __obj.updateDynamic("emitInline")(emitInline)
    __obj.updateDynamic("exports")(exports)
    __obj.updateDynamic("imports")(imports)
    __obj.asInstanceOf[R3NgModuleMetadataFacade]
  }
}

