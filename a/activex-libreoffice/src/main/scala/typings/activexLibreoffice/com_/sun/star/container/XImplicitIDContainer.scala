package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to insert and remove elements in/from a container using an implicit (unique) ID. */
@js.native
trait XImplicitIDContainer extends XImplicitIDReplace {
  /**
    * adds a new object to the container and generates an implicit (unique) ID for this object.
    * @returns the implicit ID for the new object.
    */
  def addWithImplicitID(aElement: js.Any): String = js.native
  /** removes an object from the container which is specified by an implicit (unique) identifier. */
  def removeByImplicitID(ID: String): Unit = js.native
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
  @scala.inline
  implicit class XImplicitIDContainerOps[Self <: XImplicitIDContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddWithImplicitID(value: js.Any => String): Self = this.set("addWithImplicitID", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveByImplicitID(value: String => Unit): Self = this.set("removeByImplicitID", js.Any.fromFunction1(value))
  }
  
}

