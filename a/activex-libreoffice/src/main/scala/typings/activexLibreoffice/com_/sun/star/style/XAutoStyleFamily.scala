package typings.activexLibreoffice.com_.sun.star.style

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typings.activexLibreoffice.com_.sun.star.container.XEnumeration
import typings.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service contains the collection of automatic style families within the container document. */
@js.native
trait XAutoStyleFamily extends XEnumerationAccess {
  def insertStyle(Values: PropertyValues): XAutoStyle = js.native
}

object XAutoStyleFamily {
  @scala.inline
  def apply(
    ElementType: `type`,
    acquire: () => Unit,
    createEnumeration: () => XEnumeration,
    getElementType: () => `type`,
    hasElements: () => Boolean,
    insertStyle: PropertyValues => XAutoStyle,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAutoStyleFamily = {
    val __obj = js.Dynamic.literal(ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createEnumeration = js.Any.fromFunction0(createEnumeration), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), insertStyle = js.Any.fromFunction1(insertStyle), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAutoStyleFamily]
  }
  @scala.inline
  implicit class XAutoStyleFamilyOps[Self <: XAutoStyleFamily] (val x: Self) extends AnyVal {
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
    def setInsertStyle(value: PropertyValues => XAutoStyle): Self = this.set("insertStyle", js.Any.fromFunction1(value))
  }
  
}

