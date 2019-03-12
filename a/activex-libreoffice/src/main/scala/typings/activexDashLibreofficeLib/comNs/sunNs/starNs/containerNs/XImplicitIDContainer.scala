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
    acquire: () => scala.Unit,
    addWithImplicitID: js.Any => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeByImplicitID: java.lang.String => scala.Unit,
    replaceByUniqueID: (java.lang.String, js.Any) => scala.Unit
  ): XImplicitIDContainer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addWithImplicitID = js.Any.fromFunction1(addWithImplicitID), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByImplicitID = js.Any.fromFunction1(removeByImplicitID), replaceByUniqueID = js.Any.fromFunction2(replaceByUniqueID))
  
    __obj.asInstanceOf[XImplicitIDContainer]
  }
}

