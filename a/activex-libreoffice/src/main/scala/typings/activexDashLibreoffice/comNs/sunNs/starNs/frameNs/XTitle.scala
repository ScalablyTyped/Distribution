package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** an interface representing an entity with a modifyable title. */
trait XTitle extends XInterface {
  /**
    * Returns the title of the object.
    * @returns The title.
    */
  var Title: String
  /**
    * Returns the title of the object.
    * @returns The title.
    */
  def getTitle(): String
  /**
    * Sets the title of the object.
    * @param sTitle The title.
    */
  def setTitle(sTitle: String): Unit
}

object XTitle {
  @scala.inline
  def apply(
    Title: String,
    acquire: () => Unit,
    getTitle: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setTitle: String => Unit
  ): XTitle = {
    val __obj = js.Dynamic.literal(Title = Title, acquire = js.Any.fromFunction0(acquire), getTitle = js.Any.fromFunction0(getTitle), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitle = js.Any.fromFunction1(setTitle))
  
    __obj.asInstanceOf[XTitle]
  }
}

