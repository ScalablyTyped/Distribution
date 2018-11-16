package typings
package atAngularCoreLib.srcDiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/di", "ReflectiveKey")
@js.native
class ReflectiveKey protected ()
  extends atAngularCoreLib.srcDiReflectiveUnderscoreKeyMod.ReflectiveKey {
  /**
       * Private
       */
  def this(token: js.Object, id: scala.Double) = this()
}

@JSImport("@angular/core/src/di", "ReflectiveKey")
@js.native
object ReflectiveKey extends js.Object {
  /**
       * @returns the number of keys registered in the system.
       */
  val numberOfKeys: scala.Double = js.native
  /**
       * Retrieves a `Key` for a token.
       */
  def get(token: js.Object): atAngularCoreLib.srcDiReflectiveUnderscoreKeyMod.ReflectiveKey = js.native
}

