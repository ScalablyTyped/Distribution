package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShouldDestroyOnFileDelete extends StObject {
  
  /**
    *  A function that returns a Boolean indicating whether the buffer should
    *  be destroyed if its file is deleted.
    */
  var shouldDestroyOnFileDelete: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** The initial string text of the buffer. */
  var text: js.UndefOr[String] = js.undefined
}
object ShouldDestroyOnFileDelete {
  
  inline def apply(): ShouldDestroyOnFileDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShouldDestroyOnFileDelete]
  }
  
  extension [Self <: ShouldDestroyOnFileDelete](x: Self) {
    
    inline def setShouldDestroyOnFileDelete(value: () => Boolean): Self = StObject.set(x, "shouldDestroyOnFileDelete", js.Any.fromFunction0(value))
    
    inline def setShouldDestroyOnFileDeleteUndefined: Self = StObject.set(x, "shouldDestroyOnFileDelete", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
