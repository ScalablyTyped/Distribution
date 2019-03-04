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
    acquire: js.Function0[scala.Unit],
    decrementIndent: js.Function0[scala.Unit],
    incrementIndent: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XIndent = {
    val __obj = js.Dynamic.literal(acquire = acquire, decrementIndent = decrementIndent, incrementIndent = incrementIndent, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XIndent]
  }
}

