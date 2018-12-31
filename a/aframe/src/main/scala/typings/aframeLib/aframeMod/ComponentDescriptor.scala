package typings
package aframeLib.aframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentDescriptor[T /* <: Component[_, System[_]] */] extends js.Object {
  var Component: ComponentConstructor[T]
  var dependencies: js.UndefOr[js.Array[java.lang.String]]
  var multiple: js.UndefOr[scala.Boolean]
}

