package typings.activexLibreoffice.com_.sun.star.style

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typings.activexLibreoffice.com_.sun.star.container.XEnumeration
import typings.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class XAutoStyleFamilyMutableBuilder[Self <: XAutoStyleFamily] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsertStyle(value: PropertyValues => XAutoStyle): Self = StObject.set(x, "insertStyle", js.Any.fromFunction1(value))
  }
}
