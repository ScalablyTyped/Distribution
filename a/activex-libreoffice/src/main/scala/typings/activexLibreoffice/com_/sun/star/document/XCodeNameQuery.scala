package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XCodeNameQuery extends StObject {
  
  def getCodeNameForContainer(aObj: XInterface): String
  
  def getCodeNameForObject(aObj: XInterface): String
}
object XCodeNameQuery {
  
  inline def apply(getCodeNameForContainer: XInterface => String, getCodeNameForObject: XInterface => String): XCodeNameQuery = {
    val __obj = js.Dynamic.literal(getCodeNameForContainer = js.Any.fromFunction1(getCodeNameForContainer), getCodeNameForObject = js.Any.fromFunction1(getCodeNameForObject))
    __obj.asInstanceOf[XCodeNameQuery]
  }
  
  extension [Self <: XCodeNameQuery](x: Self) {
    
    inline def setGetCodeNameForContainer(value: XInterface => String): Self = StObject.set(x, "getCodeNameForContainer", js.Any.fromFunction1(value))
    
    inline def setGetCodeNameForObject(value: XInterface => String): Self = StObject.set(x, "getCodeNameForObject", js.Any.fromFunction1(value))
  }
}
