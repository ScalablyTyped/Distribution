package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "SimpleChange")
@js.native
class SimpleChange protected () extends js.Object {
  def this(previousValue: js.Any, currentValue: js.Any, firstChange: Boolean) = this()
  var currentValue: js.Any = js.native
  var firstChange: Boolean = js.native
  var previousValue: js.Any = js.native
  /**
    * Check whether the new value is the first value assigned.
    */
  def isFirstChange(): Boolean = js.native
}

