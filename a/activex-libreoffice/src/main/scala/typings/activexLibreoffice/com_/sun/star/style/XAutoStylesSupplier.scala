package typings.activexLibreoffice.com_.sun.star.style

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface provides access to the style families within the container document. */
trait XAutoStylesSupplier extends XInterface {
  /**
    * This method returns the collection of automatic style families available in the container document.
    * @see AutoStyles
    */
  val AutoStyles: XAutoStyles
  /**
    * This method returns the collection of automatic style families available in the container document.
    * @see AutoStyles
    */
  def getAutoStyles(): XAutoStyles
}

object XAutoStylesSupplier {
  @scala.inline
  def apply(
    AutoStyles: XAutoStyles,
    acquire: () => Unit,
    getAutoStyles: () => XAutoStyles,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAutoStylesSupplier = {
    val __obj = js.Dynamic.literal(AutoStyles = AutoStyles.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAutoStyles = js.Any.fromFunction0(getAutoStyles), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAutoStylesSupplier]
  }
}

