package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "SimpleChange")
@js.native
class SimpleChange protected () extends js.Object {
  def this(previousValue: js.Any, currentValue: js.Any, firstChange: scala.Boolean) = this()
  var currentValue: js.Any = js.native
  var firstChange: scala.Boolean = js.native
  var previousValue: js.Any = js.native
  /**
    * Check whether the new value is the first value assigned.
    */
  def isFirstChange(): scala.Boolean = js.native
}

