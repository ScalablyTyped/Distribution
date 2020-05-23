package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides a method to apply TableAutoFormats to a cell range. */
trait XAutoFormattable extends XInterface {
  /**
    * applies an AutoFormat to the cell range of the current context.
    * @param aName is the name of the AutoFormat to apply.
    * @throws com::sun::star::lang::IllegalArgumentException if the specified AutoFormat does not exist.
    */
  def autoFormat(aName: String): Unit
}

object XAutoFormattable {
  @scala.inline
  def apply(
    acquire: () => Unit,
    autoFormat: String => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAutoFormattable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), autoFormat = js.Any.fromFunction1(autoFormat), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAutoFormattable]
  }
}

