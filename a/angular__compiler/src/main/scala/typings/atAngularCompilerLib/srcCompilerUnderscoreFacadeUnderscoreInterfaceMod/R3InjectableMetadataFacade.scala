package typings
package atAngularCompilerLib.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3InjectableMetadataFacade extends js.Object {
  var ctorDeps: js.Array[R3DependencyMetadataFacade] | scala.Null
  var name: java.lang.String
  var providedIn: js.Any
  var `type`: js.Any
  var typeArgumentCount: scala.Double
  var useClass: js.UndefOr[js.Any] = js.undefined
  var useExisting: js.UndefOr[js.Any] = js.undefined
  var useFactory: js.UndefOr[js.Any] = js.undefined
  var useValue: js.UndefOr[js.Any] = js.undefined
  var userDeps: js.UndefOr[js.Array[R3DependencyMetadataFacade]] = js.undefined
}

object R3InjectableMetadataFacade {
  @scala.inline
  def apply(
    name: java.lang.String,
    providedIn: js.Any,
    `type`: js.Any,
    typeArgumentCount: scala.Double,
    ctorDeps: js.Array[R3DependencyMetadataFacade] = null,
    useClass: js.Any = null,
    useExisting: js.Any = null,
    useFactory: js.Any = null,
    useValue: js.Any = null,
    userDeps: js.Array[R3DependencyMetadataFacade] = null
  ): R3InjectableMetadataFacade = {
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
    __obj.asInstanceOf[R3InjectableMetadataFacade]
  }
}

