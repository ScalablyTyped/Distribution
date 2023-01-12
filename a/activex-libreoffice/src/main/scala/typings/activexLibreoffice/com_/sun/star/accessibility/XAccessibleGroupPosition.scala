package typings.activexLibreoffice.com_.sun.star.accessibility

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XAccessibleGroupPosition
  extends StObject
     with XInterface {
  
  def getGroupPosition(accoject: Any): SafeArray[Double]
  
  def getObjectLink(accoject: Any): String
}
object XAccessibleGroupPosition {
  
  inline def apply(
    acquire: () => Unit,
    getGroupPosition: Any => SafeArray[Double],
    getObjectLink: Any => String,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XAccessibleGroupPosition = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getGroupPosition = js.Any.fromFunction1(getGroupPosition), getObjectLink = js.Any.fromFunction1(getObjectLink), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAccessibleGroupPosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XAccessibleGroupPosition] (val x: Self) extends AnyVal {
    
    inline def setGetGroupPosition(value: Any => SafeArray[Double]): Self = StObject.set(x, "getGroupPosition", js.Any.fromFunction1(value))
    
    inline def setGetObjectLink(value: Any => String): Self = StObject.set(x, "getObjectLink", js.Any.fromFunction1(value))
  }
}
