package typings.angularCompiler.compilerFacadeInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3InjectableMetadataFacade extends js.Object {
  var name: String
  var providedIn: js.Any
  var `type`: js.Any
  var typeArgumentCount: Double
  var useClass: js.UndefOr[js.Any] = js.undefined
  var useExisting: js.UndefOr[js.Any] = js.undefined
  var useFactory: js.UndefOr[js.Any] = js.undefined
  var useValue: js.UndefOr[js.Any] = js.undefined
  var userDeps: js.UndefOr[js.Array[R3DependencyMetadataFacade]] = js.undefined
}

object R3InjectableMetadataFacade {
  @scala.inline
  def apply(
    name: String,
    providedIn: js.Any,
    `type`: js.Any,
    typeArgumentCount: Double,
    useClass: js.Any = null,
    useExisting: js.Any = null,
    useFactory: js.Any = null,
    useValue: js.Any = null,
    userDeps: js.Array[R3DependencyMetadataFacade] = null
  ): R3InjectableMetadataFacade = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], providedIn = providedIn.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (useClass != null) __obj.updateDynamic("useClass")(useClass.asInstanceOf[js.Any])
    if (useExisting != null) __obj.updateDynamic("useExisting")(useExisting.asInstanceOf[js.Any])
    if (useFactory != null) __obj.updateDynamic("useFactory")(useFactory.asInstanceOf[js.Any])
    if (useValue != null) __obj.updateDynamic("useValue")(useValue.asInstanceOf[js.Any])
    if (userDeps != null) __obj.updateDynamic("userDeps")(userDeps.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3InjectableMetadataFacade]
  }
}

