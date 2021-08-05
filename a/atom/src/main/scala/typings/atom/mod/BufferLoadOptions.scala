package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferLoadOptions extends StObject {
  
  /** The file's encoding. */
  var encoding: js.UndefOr[String] = js.undefined
  
  /**
    *  A function that returns a boolean indicating whether the buffer should
    *  be destroyed if its file is deleted.
    */
  var shouldDestroyOnFileDelete: js.UndefOr[js.Function0[Boolean]] = js.undefined
}
object BufferLoadOptions {
  
  inline def apply(): BufferLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BufferLoadOptions]
  }
  
  extension [Self <: BufferLoadOptions](x: Self) {
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setShouldDestroyOnFileDelete(value: () => Boolean): Self = StObject.set(x, "shouldDestroyOnFileDelete", js.Any.fromFunction0(value))
    
    inline def setShouldDestroyOnFileDeleteUndefined: Self = StObject.set(x, "shouldDestroyOnFileDelete", js.undefined)
  }
}
