package typings
package activexDashLibreofficeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object LibreOfficeNs {
  type InstantiableNameMap = ServicesNameMap with StructNameMap
  type SeqEquiv[T] = activexDashInteropLib.SafeArray[T] | activexDashLibreofficeLib.sequence[T] | js.Array[T]
}
