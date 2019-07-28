package typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows indentation of the object to be changed. */
trait XIndent extends XInterface {
  /** shifts the indentation by one default step to the left. */
  def decrementIndent(): Unit
  /** shifts the indentation by one default step to the right. */
  def incrementIndent(): Unit
}

object XIndent {
  @scala.inline
  def apply(
    acquire: () => Unit,
    decrementIndent: () => Unit,
    incrementIndent: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XIndent = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), decrementIndent = js.Any.fromFunction0(decrementIndent), incrementIndent = js.Any.fromFunction0(incrementIndent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XIndent]
  }
}

