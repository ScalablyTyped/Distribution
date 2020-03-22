package typings.angularCompiler.injectableCompiler2Mod

import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.r3FactoryMod.R3DependencyMetadata
import typings.angularCompiler.render3UtilMod.R3Reference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3InjectableMetadata extends js.Object {
  var internalType: Expression
  var name: String
  var providedIn: Expression
  var `type`: R3Reference
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
    internalType: Expression,
    name: String,
    providedIn: Expression,
    `type`: R3Reference,
    typeArgumentCount: Double,
    useClass: Expression = null,
    useExisting: Expression = null,
    useFactory: Expression = null,
    useValue: Expression = null,
    userDeps: js.Array[R3DependencyMetadata] = null
  ): R3InjectableMetadata = {
    val __obj = js.Dynamic.literal(internalType = internalType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], providedIn = providedIn.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (useClass != null) __obj.updateDynamic("useClass")(useClass.asInstanceOf[js.Any])
    if (useExisting != null) __obj.updateDynamic("useExisting")(useExisting.asInstanceOf[js.Any])
    if (useFactory != null) __obj.updateDynamic("useFactory")(useFactory.asInstanceOf[js.Any])
    if (useValue != null) __obj.updateDynamic("useValue")(useValue.asInstanceOf[js.Any])
    if (userDeps != null) __obj.updateDynamic("userDeps")(userDeps.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3InjectableMetadata]
  }
}

