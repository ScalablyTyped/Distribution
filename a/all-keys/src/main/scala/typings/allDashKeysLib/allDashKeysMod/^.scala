package typings
package allDashKeysLib.allDashKeysMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("all-keys", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Get all property keys of an object including non-enumerable and inherited ones.
    * Like [Reflect.ownKeys()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Reflect/ownKeys)
    * but traverses up the prototype-chain.
    */
  def apply(obj: js.Object): stdLib.Set[java.lang.String] = js.native
  def apply(obj: js.Object, options: allDashKeysLib.allDashKeysMod.allKeysNs.Options): stdLib.Set[java.lang.String] = js.native
}

