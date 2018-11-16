package typings
package atAngularCoreLib.srcDiReflectiveUnderscoreKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/di/reflective_key", "ReflectiveKey")
@js.native
class ReflectiveKey protected () extends js.Object {
  /**
       * Private
       */
  def this(token: js.Object, id: scala.Double) = this()
  val displayName: java.lang.String = js.native
  var id: scala.Double = js.native
  var token: js.Object = js.native
}

@JSImport("@angular/core/src/di/reflective_key", "ReflectiveKey")
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

