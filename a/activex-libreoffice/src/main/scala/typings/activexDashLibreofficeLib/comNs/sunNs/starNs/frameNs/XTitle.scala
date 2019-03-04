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
    acquire: js.Function0[scala.Unit],
    getTitle: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setTitle: js.Function1[java.lang.String, scala.Unit]
  ): XTitle = {
    val __obj = js.Dynamic.literal(Title = Title, acquire = acquire, getTitle = getTitle, queryInterface = queryInterface, release = release, setTitle = setTitle)
  
    __obj.asInstanceOf[XTitle]
  }
}

