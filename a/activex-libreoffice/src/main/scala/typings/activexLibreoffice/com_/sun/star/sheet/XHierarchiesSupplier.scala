package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the collection of hierarchies of a data pilot source dimension.
  * @see com.sun.star.sheet.DataPilotSourceDimension
  * @see com.sun.star.sheet.DataPilotSource
  */
trait XHierarchiesSupplier extends XInterface {
  /**
    * returns the collection of hierarchies.
    * @see com.sun.star.sheet.DataPilotSourceHierarchies
    */
  val Hierarchies: XNameAccess
  /**
    * returns the collection of hierarchies.
    * @see com.sun.star.sheet.DataPilotSourceHierarchies
    */
  def getHierarchies(): XNameAccess
}

object XHierarchiesSupplier {
  @scala.inline
  def apply(
    Hierarchies: XNameAccess,
    acquire: () => Unit,
    getHierarchies: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XHierarchiesSupplier = {
    val __obj = js.Dynamic.literal(Hierarchies = Hierarchies.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getHierarchies = js.Any.fromFunction0(getHierarchies), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XHierarchiesSupplier]
  }
}

