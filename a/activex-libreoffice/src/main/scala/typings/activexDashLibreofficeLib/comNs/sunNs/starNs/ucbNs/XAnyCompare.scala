package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** compares two `any` s. */
trait XAnyCompare
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * allows comparison of two `any` s.
    * @param Any1 is the first compare value
    * @param Any2 is the second compare value
    * @returns `-1` , if the first any is less than the second ( Any1 < Any2 )`0` , if the first any is equal to the second ( Any1 == Any2 )`+1` , if the first
    */
  def compare(Any1: js.Any, Any2: js.Any): scala.Double
}

object XAnyCompare {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    compare: js.Function2[js.Any, js.Any, scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XAnyCompare = {
    val __obj = js.Dynamic.literal(acquire = acquire, compare = compare, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XAnyCompare]
  }
}

