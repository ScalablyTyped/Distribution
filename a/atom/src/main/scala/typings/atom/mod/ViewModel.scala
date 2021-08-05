package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewModel extends StObject {
  
  def getTitle(): String
}
object ViewModel {
  
  inline def apply(getTitle: () => String): ViewModel = {
    val __obj = js.Dynamic.literal(getTitle = js.Any.fromFunction0(getTitle))
    __obj.asInstanceOf[ViewModel]
  }
  
  extension [Self <: ViewModel](x: Self) {
    
    inline def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
  }
}
