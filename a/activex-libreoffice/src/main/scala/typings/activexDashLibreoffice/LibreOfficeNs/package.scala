package typings.activexDashLibreoffice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object LibreOfficeNs {
  import typings.activexDashLibreoffice.sequence
  import typings.std.SafeArray

  type InstantiableNameMap = ServicesNameMap with StructNameMap
  type SeqEquiv[T] = SafeArray[T] | sequence[T] | js.Array[T]
}
