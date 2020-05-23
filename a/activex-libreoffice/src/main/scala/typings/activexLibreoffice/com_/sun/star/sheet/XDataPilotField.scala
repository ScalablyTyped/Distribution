package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to control a data pilot field which has already been created.
  * @see com.sun.star.sheet.DataPilotField
  */
trait XDataPilotField extends XInterface {
  /**
    * returns the collection of the data pilot items.
    * @see com.sun.star.sheet.DataPilotItems
    */
  val Items: XIndexAccess
  /**
    * returns the collection of the data pilot items.
    * @see com.sun.star.sheet.DataPilotItems
    */
  def getItems(): XIndexAccess
}

object XDataPilotField {
  @scala.inline
  def apply(
    Items: XIndexAccess,
    acquire: () => Unit,
    getItems: () => XIndexAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDataPilotField = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getItems = js.Any.fromFunction0(getItems), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDataPilotField]
  }
}

