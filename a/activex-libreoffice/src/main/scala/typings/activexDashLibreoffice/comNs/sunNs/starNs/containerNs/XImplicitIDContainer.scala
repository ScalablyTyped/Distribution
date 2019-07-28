package typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs

import typings.activexDashLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to insert and remove elements in/from a container using an implicit (unique) ID. */
trait XImplicitIDContainer extends XImplicitIDReplace {
  /**
    * adds a new object to the container and generates an implicit (unique) ID for this object.
    * @returns the implicit ID for the new object.
    */
  def addWithImplicitID(aElement: js.Any): String
  /** removes an object from the container which is specified by an implicit (unique) identifier. */
  def removeByImplicitID(ID: String): Unit
}

object XImplicitIDContainer {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addWithImplicitID: js.Any => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByImplicitID: String => Unit,
    replaceByUniqueID: (String, js.Any) => Unit
  ): XImplicitIDContainer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addWithImplicitID = js.Any.fromFunction1(addWithImplicitID), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByImplicitID = js.Any.fromFunction1(removeByImplicitID), replaceByUniqueID = js.Any.fromFunction2(replaceByUniqueID))
  
    __obj.asInstanceOf[XImplicitIDContainer]
  }
}

