package typings
package atAngularCompilerLib.srcInjectableUnderscoreCompilerUnderscore2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3InjectableMetadata extends js.Object {
  var ctorDeps: js.Array[atAngularCompilerLib.srcRender3R3UnderscoreFactoryMod.R3DependencyMetadata] | scala.Null
  var name: java.lang.String
  var providedIn: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression
  var `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression
  var typeArgumentCount: scala.Double
  var useClass: js.UndefOr[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression] = js.undefined
  var useExisting: js.UndefOr[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression] = js.undefined
  var useFactory: js.UndefOr[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression] = js.undefined
  var useValue: js.UndefOr[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression] = js.undefined
  var userDeps: js.UndefOr[
    js.Array[atAngularCompilerLib.srcRender3R3UnderscoreFactoryMod.R3DependencyMetadata]
  ] = js.undefined
}

object R3InjectableMetadata {
  @scala.inline
  def apply(
    name: java.lang.String,
    providedIn: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    typeArgumentCount: scala.Double,
    ctorDeps: js.Array[atAngularCompilerLib.srcRender3R3UnderscoreFactoryMod.R3DependencyMetadata] = null,
    useClass: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression = null,
    useExisting: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression = null,
    useFactory: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression = null,
    useValue: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression = null,
    userDeps: js.Array[atAngularCompilerLib.srcRender3R3UnderscoreFactoryMod.R3DependencyMetadata] = null
  ): R3InjectableMetadata = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("providedIn")(providedIn)
    __obj.updateDynamic("typeArgumentCount")(typeArgumentCount)
    if (ctorDeps != null) __obj.updateDynamic("ctorDeps")(ctorDeps)
    if (useClass != null) __obj.updateDynamic("useClass")(useClass)
    if (useExisting != null) __obj.updateDynamic("useExisting")(useExisting)
    if (useFactory != null) __obj.updateDynamic("useFactory")(useFactory)
    if (useValue != null) __obj.updateDynamic("useValue")(useValue)
    if (userDeps != null) __obj.updateDynamic("userDeps")(userDeps)
    __obj.asInstanceOf[R3InjectableMetadata]
  }
}

