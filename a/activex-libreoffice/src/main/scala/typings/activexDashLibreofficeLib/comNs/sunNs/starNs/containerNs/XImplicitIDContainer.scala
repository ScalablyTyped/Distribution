package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to insert and remove elements in/from a container using an implicit (unique) ID. */
trait XImplicitIDContainer extends XImplicitIDReplace {
  /**
    * adds a new object to the container and generates an implicit (unique) ID for this object.
    * @returns the implicit ID for the new object.
    */
  def addWithImplicitID(aElement: js.Any): java.lang.String
  /** removes an object from the container which is specified by an implicit (unique) identifier. */
  def removeByImplicitID(ID: java.lang.String): scala.Unit
}

object XImplicitIDContainer {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addWithImplicitID: js.Function1[js.Any, java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeByImplicitID: js.Function1[java.lang.String, scala.Unit],
    replaceByUniqueID: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): XImplicitIDContainer = {
    val __obj = js.Dynamic.literal(acquire = acquire, addWithImplicitID = addWithImplicitID, queryInterface = queryInterface, release = release, removeByImplicitID = removeByImplicitID, replaceByUniqueID = replaceByUniqueID)
  
    __obj.asInstanceOf[XImplicitIDContainer]
  }
}

