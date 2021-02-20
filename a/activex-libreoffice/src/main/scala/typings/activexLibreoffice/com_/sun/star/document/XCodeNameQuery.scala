package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XCodeNameQuery extends StObject {
  
  def getCodeNameForContainer(aObj: XInterface): String = js.native
  
  def getCodeNameForObject(aObj: XInterface): String = js.native
}
object XCodeNameQuery {
  
  @scala.inline
  def apply(getCodeNameForContainer: XInterface => String, getCodeNameForObject: XInterface => String): XCodeNameQuery = {
    val __obj = js.Dynamic.literal(getCodeNameForContainer = js.Any.fromFunction1(getCodeNameForContainer), getCodeNameForObject = js.Any.fromFunction1(getCodeNameForObject))
    __obj.asInstanceOf[XCodeNameQuery]
  }
  
  @scala.inline
  implicit class XCodeNameQueryMutableBuilder[Self <: XCodeNameQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCodeNameForContainer(value: XInterface => String): Self = StObject.set(x, "getCodeNameForContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCodeNameForObject(value: XInterface => String): Self = StObject.set(x, "getCodeNameForObject", js.Any.fromFunction1(value))
  }
}
