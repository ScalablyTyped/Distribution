package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the generic interface for supporting the insertion and removal of elements.
  * @see XContainer
  */
@js.native
trait XSet extends XEnumerationAccess {
  /** @returns `TRUE` if the given element is a member of this container, otherwise `FALSE` . */
  def has(aElement: js.Any): Boolean = js.native
  /** inserts the given element into this container. */
  def insert(aElement: js.Any): Unit = js.native
  /** removes the given element from this container. */
  def remove(aElement: js.Any): Unit = js.native
}

object XSet {
  @scala.inline
  def apply(
    ElementType: `type`,
    acquire: () => Unit,
    createEnumeration: () => XEnumeration,
    getElementType: () => `type`,
    has: js.Any => Boolean,
    hasElements: () => Boolean,
    insert: js.Any => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    remove: js.Any => Unit
  ): XSet = {
    val __obj = js.Dynamic.literal(ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createEnumeration = js.Any.fromFunction0(createEnumeration), getElementType = js.Any.fromFunction0(getElementType), has = js.Any.fromFunction1(has), hasElements = js.Any.fromFunction0(hasElements), insert = js.Any.fromFunction1(insert), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[XSet]
  }
  @scala.inline
  implicit class XSetOps[Self <: XSet] (val x: Self) extends AnyVal {
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
    def setHas(value: js.Any => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: js.Any => Unit): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: js.Any => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
  }
  
}

