package typings
package angularLib.angularMod.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChangesObject[T] extends js.Object {
  var currentValue: T
  var previousValue: T
  def isFirstChange(): scala.Boolean
}

