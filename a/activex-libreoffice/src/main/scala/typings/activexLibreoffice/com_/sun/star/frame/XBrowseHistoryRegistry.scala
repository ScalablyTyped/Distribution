package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XBrowseHistoryRegistry extends XInterface {
  /** @deprecated Deprecated */
  def createNewEntry(URL: String, Arguments: SeqEquiv[PropertyValue], Title: String): Unit
  /** @deprecated Deprecated */
  def updateViewData(Value: js.Any): Unit
}

object XBrowseHistoryRegistry {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createNewEntry: (String, SeqEquiv[PropertyValue], String) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    updateViewData: js.Any => Unit
  ): XBrowseHistoryRegistry = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createNewEntry = js.Any.fromFunction3(createNewEntry), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), updateViewData = js.Any.fromFunction1(updateViewData))
    __obj.asInstanceOf[XBrowseHistoryRegistry]
  }
}

