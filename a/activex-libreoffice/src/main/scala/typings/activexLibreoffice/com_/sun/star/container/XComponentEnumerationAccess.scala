package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides a factory for a typified enumeration through a collection of components. */
@js.native
trait XComponentEnumerationAccess extends XEnumerationAccess {
  /** creates a new instance of enumeration through components. */
  def createComponentEnumeration(): XComponentEnumeration = js.native
}

object XComponentEnumerationAccess {
  @scala.inline
  def apply(
    ElementType: `type`,
    acquire: () => Unit,
    createComponentEnumeration: () => XComponentEnumeration,
    createEnumeration: () => XEnumeration,
    getElementType: () => `type`,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XComponentEnumerationAccess = {
    val __obj = js.Dynamic.literal(ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createComponentEnumeration = js.Any.fromFunction0(createComponentEnumeration), createEnumeration = js.Any.fromFunction0(createEnumeration), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XComponentEnumerationAccess]
  }
  @scala.inline
  implicit class XComponentEnumerationAccessOps[Self <: XComponentEnumerationAccess] (val x: Self) extends AnyVal {
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
    def setCreateComponentEnumeration(value: () => XComponentEnumeration): Self = this.set("createComponentEnumeration", js.Any.fromFunction0(value))
  }
  
}

