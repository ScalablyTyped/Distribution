package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** contains the settings of the line numbering in a text document. */
trait XLineNumberingProperties
  extends StObject
     with XInterface {
  
  /** @returns the {@link LineNumberingProperties} of the object. */
  val LineNumberingProperties: XPropertySet
  
  /** @returns the {@link LineNumberingProperties} of the object. */
  def getLineNumberingProperties(): XPropertySet
}
object XLineNumberingProperties {
  
  inline def apply(
    LineNumberingProperties: XPropertySet,
    acquire: () => Unit,
    getLineNumberingProperties: () => XPropertySet,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XLineNumberingProperties = {
    val __obj = js.Dynamic.literal(LineNumberingProperties = LineNumberingProperties.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getLineNumberingProperties = js.Any.fromFunction0(getLineNumberingProperties), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XLineNumberingProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XLineNumberingProperties] (val x: Self) extends AnyVal {
    
    inline def setGetLineNumberingProperties(value: () => XPropertySet): Self = StObject.set(x, "getLineNumberingProperties", js.Any.fromFunction0(value))
    
    inline def setLineNumberingProperties(value: XPropertySet): Self = StObject.set(x, "LineNumberingProperties", value.asInstanceOf[js.Any])
  }
}
