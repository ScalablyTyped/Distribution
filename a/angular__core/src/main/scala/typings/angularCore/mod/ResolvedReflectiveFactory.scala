package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "ResolvedReflectiveFactory")
@js.native
class ResolvedReflectiveFactory protected () extends js.Object {
  def this(
    /**
    * Factory function which can return an instance of an object represented by a key.
    */
  factory: js.Function,
    /**
    * Arguments (dependencies) to the `factory` function.
    */
  dependencies: js.Array[ɵangularPackagesCoreCoreE]
  ) = this()
  /**
    * Arguments (dependencies) to the `factory` function.
    */
  var dependencies: js.Array[ɵangularPackagesCoreCoreE] = js.native
  /**
    * Factory function which can return an instance of an object represented by a key.
    */
  var factory: js.Function = js.native
}

