package typings
package aframeLib.aframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinglePropertySchema[T] extends js.Object {
  var default: js.UndefOr[T] = js.undefined
  var parse: js.UndefOr[js.Function1[/* value */ java.lang.String, T]] = js.undefined
  var stringify: js.UndefOr[js.Function1[/* value */ T, java.lang.String]] = js.undefined
  var `type`: js.UndefOr[PropertyTypes] = js.undefined
}

