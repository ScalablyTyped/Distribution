package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides a mapping from `string` to `string` */
trait XStringMapping
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** provides a mapping for a given sequence of strings to a sequence of belonging strings. */
  def mapStrings(Parameter: js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]]): scala.Boolean
}

object XStringMapping {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    mapStrings: js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]] => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XStringMapping = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), mapStrings = js.Any.fromFunction1(mapStrings), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XStringMapping]
  }
}

