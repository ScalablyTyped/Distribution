package typings
package atAngularCoreLib.srcDiProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticClassSansProvider extends js.Object {
  /**
    * A list of `token`s which need to be resolved by the injector. The list of values is then
    * used as arguments to the `useClass` constructor.
    */
  var deps: js.Array[_]
  /**
    * An optional class to instantiate for the `token`. (If not provided `provide` is assumed to be a
    * class to instantiate)
    */
  var useClass: atAngularCoreLib.srcTypeMod.Type[_]
}

