package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** used to enumerate objects in a container which contains objects. */
@js.native
trait XEnumerationAccess extends XElementAccess {
  /** @returns a new enumeration object for this container. It returns NULL if there are no objects in this container. */
  def createEnumeration(): XEnumeration = js.native
}

object XEnumerationAccess {
  @scala.inline
  def apply(
    ElementType: `type`,
    acquire: () => Unit,
    createEnumeration: () => XEnumeration,
    getElementType: () => `type`,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XEnumerationAccess = {
    val __obj = js.Dynamic.literal(ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createEnumeration = js.Any.fromFunction0(createEnumeration), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XEnumerationAccess]
  }
  @scala.inline
  implicit class XEnumerationAccessOps[Self <: XEnumerationAccess] (val x: Self) extends AnyVal {
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
    def setCreateEnumeration(value: () => XEnumeration): Self = this.set("createEnumeration", js.Any.fromFunction0(value))
  }
  
}

