package typings.atAngularCompiler.srcInjectableUnderscoreCompilerUnderscore2Mod

import typings.atAngularCompiler.atAngularCompilerStrings.invalid
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import typings.atAngularCompiler.srcRender3R3UnderscoreFactoryMod.R3DependencyMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3InjectableMetadata extends js.Object {
  var ctorDeps: js.Array[R3DependencyMetadata] | invalid | Null
  var name: String
  var providedIn: Expression
  var `type`: Expression
  var typeArgumentCount: Double
  var useClass: js.UndefOr[Expression] = js.undefined
  var useExisting: js.UndefOr[Expression] = js.undefined
  var useFactory: js.UndefOr[Expression] = js.undefined
  var useValue: js.UndefOr[Expression] = js.undefined
  var userDeps: js.UndefOr[js.Array[R3DependencyMetadata]] = js.undefined
}

object R3InjectableMetadata {
  @scala.inline
  def apply(
    name: String,
    providedIn: Expression,
    `type`: Expression,
    typeArgumentCount: Double,
    ctorDeps: js.Array[R3DependencyMetadata] | invalid = null,
    useClass: Expression = null,
    useExisting: Expression = null,
    useFactory: Expression = null,
    useValue: Expression = null,
    userDeps: js.Array[R3DependencyMetadata] = null
  ): R3InjectableMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], providedIn = providedIn.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ctorDeps != null) __obj.updateDynamic("ctorDeps")(ctorDeps.asInstanceOf[js.Any])
    if (useClass != null) __obj.updateDynamic("useClass")(useClass.asInstanceOf[js.Any])
    if (useExisting != null) __obj.updateDynamic("useExisting")(useExisting.asInstanceOf[js.Any])
    if (useFactory != null) __obj.updateDynamic("useFactory")(useFactory.asInstanceOf[js.Any])
    if (useValue != null) __obj.updateDynamic("useValue")(useValue.asInstanceOf[js.Any])
    if (userDeps != null) __obj.updateDynamic("userDeps")(userDeps.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3InjectableMetadata]
  }
}

