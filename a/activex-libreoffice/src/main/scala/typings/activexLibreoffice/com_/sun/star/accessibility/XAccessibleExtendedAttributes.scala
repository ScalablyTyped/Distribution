package typings.activexLibreoffice.com_.sun.star.accessibility

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XAccessibleExtendedAttributes
  extends StObject
     with XInterface {
  
  val ExtendedAttributes: Any
  
  def getExtendedAttributes(): Any
}
object XAccessibleExtendedAttributes {
  
  inline def apply(
    ExtendedAttributes: Any,
    acquire: () => Unit,
    getExtendedAttributes: () => Any,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XAccessibleExtendedAttributes = {
    val __obj = js.Dynamic.literal(ExtendedAttributes = ExtendedAttributes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getExtendedAttributes = js.Any.fromFunction0(getExtendedAttributes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAccessibleExtendedAttributes]
  }
  
  extension [Self <: XAccessibleExtendedAttributes](x: Self) {
    
    inline def setExtendedAttributes(value: Any): Self = StObject.set(x, "ExtendedAttributes", value.asInstanceOf[js.Any])
    
    inline def setGetExtendedAttributes(value: () => Any): Self = StObject.set(x, "getExtendedAttributes", js.Any.fromFunction0(value))
  }
}
