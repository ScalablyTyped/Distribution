package typings.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "ReflectiveKey")
@js.native
class ReflectiveKey protected () extends js.Object {
  /**
    * Private
    */
  def this(token: js.Object, id: Double) = this()
  val displayName: String = js.native
  var id: Double = js.native
  var token: js.Object = js.native
}

/* static members */
@JSImport("@angular/core", "ReflectiveKey")
@js.native
object ReflectiveKey extends js.Object {
  /**
    * @returns the number of keys registered in the system.
    */
  val numberOfKeys: Double = js.native
  /**
    * Retrieves a `Key` for a token.
    */
  def get(token: js.Object): ReflectiveKey = js.native
}

