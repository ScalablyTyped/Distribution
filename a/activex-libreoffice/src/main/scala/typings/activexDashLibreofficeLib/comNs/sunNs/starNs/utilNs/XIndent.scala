package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows indentation of the object to be changed. */
trait XIndent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** shifts the indentation by one default step to the left. */
  def decrementIndent(): scala.Unit
  /** shifts the indentation by one default step to the right. */
  def incrementIndent(): scala.Unit
}

object XIndent {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    decrementIndent: () => scala.Unit,
    incrementIndent: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XIndent = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), decrementIndent = js.Any.fromFunction0(decrementIndent), incrementIndent = js.Any.fromFunction0(incrementIndent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XIndent]
  }
}

