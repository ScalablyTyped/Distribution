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
    acquire: js.Function0[scala.Unit],
    mapStrings: js.Function1[
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]], 
      scala.Boolean
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XStringMapping = {
    val __obj = js.Dynamic.literal(acquire = acquire, mapStrings = mapStrings, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XStringMapping]
  }
}

