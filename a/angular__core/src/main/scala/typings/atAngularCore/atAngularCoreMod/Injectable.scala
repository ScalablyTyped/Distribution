package typings.atAngularCore.atAngularCoreMod

import org.scalablytyped.runtime.TopLevel
import typings.atAngularCore.atAngularCoreStrings.root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Injectable extends js.Object {
  /**
    * Determines which injectors will provide the injectable,
    * by either associating it with an @NgModule or other `InjectorType`,
    * or by specifying that this injectable should be provided in the
    * 'root' injector, which will be the application-level injector in most apps.
    */
  var providedIn: js.UndefOr[Type[_] | root | Null] = js.undefined
}

@JSImport("@angular/core", "Injectable")
@js.native
object Injectable extends TopLevel[InjectableDecorator]

