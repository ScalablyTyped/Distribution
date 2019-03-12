package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** an interface representing an entity with a modifyable title. */
trait XTitle
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Returns the title of the object.
    * @returns The title.
    */
  var Title: java.lang.String
  /**
    * Returns the title of the object.
    * @returns The title.
    */
  def getTitle(): java.lang.String
  /**
    * Sets the title of the object.
    * @param sTitle The title.
    */
  def setTitle(sTitle: java.lang.String): scala.Unit
}

object XTitle {
  @scala.inline
  def apply(
    Title: java.lang.String,
    acquire: () => scala.Unit,
    getTitle: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setTitle: java.lang.String => scala.Unit
  ): XTitle = {
    val __obj = js.Dynamic.literal(Title = Title, acquire = js.Any.fromFunction0(acquire), getTitle = js.Any.fromFunction0(getTitle), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitle = js.Any.fromFunction1(setTitle))
  
    __obj.asInstanceOf[XTitle]
  }
}

