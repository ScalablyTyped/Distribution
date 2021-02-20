package typings.activexLibreoffice.com_.sun.star.accessibility

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XAccessibleExtendedAttributes extends XInterface {
  
  val ExtendedAttributes: js.Any = js.native
  
  def getExtendedAttributes(): js.Any = js.native
}
object XAccessibleExtendedAttributes {
  
  @scala.inline
  def apply(
    ExtendedAttributes: js.Any,
    acquire: () => Unit,
    getExtendedAttributes: () => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAccessibleExtendedAttributes = {
    val __obj = js.Dynamic.literal(ExtendedAttributes = ExtendedAttributes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getExtendedAttributes = js.Any.fromFunction0(getExtendedAttributes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAccessibleExtendedAttributes]
  }
  
  @scala.inline
  implicit class XAccessibleExtendedAttributesMutableBuilder[Self <: XAccessibleExtendedAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtendedAttributes(value: js.Any): Self = StObject.set(x, "ExtendedAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetExtendedAttributes(value: () => js.Any): Self = StObject.set(x, "getExtendedAttributes", js.Any.fromFunction0(value))
  }
}
