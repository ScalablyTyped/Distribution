package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewModel extends StObject {
  
  def getTitle(): String = js.native
}
object ViewModel {
  
  @scala.inline
  def apply(getTitle: () => String): ViewModel = {
    val __obj = js.Dynamic.literal(getTitle = js.Any.fromFunction0(getTitle))
    __obj.asInstanceOf[ViewModel]
  }
  
  @scala.inline
  implicit class ViewModelMutableBuilder[Self <: ViewModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
  }
}
