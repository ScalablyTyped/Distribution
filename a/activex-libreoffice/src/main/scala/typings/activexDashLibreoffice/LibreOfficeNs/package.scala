package typings.activexDashLibreoffice

import typings.activexDashLibreoffice.sequence
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object LibreOfficeNs {
  type InstantiableNameMap = ServicesNameMap with StructNameMap
  type SeqEquiv[T] = SafeArray[T] | sequence[T] | js.Array[T]
}
