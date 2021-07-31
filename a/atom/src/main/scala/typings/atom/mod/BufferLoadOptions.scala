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
  
  @scala.inline
  def apply(): BufferLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BufferLoadOptions]
  }
  
  @scala.inline
  implicit class BufferLoadOptionsMutableBuilder[Self <: BufferLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setShouldDestroyOnFileDelete(value: () => Boolean): Self = StObject.set(x, "shouldDestroyOnFileDelete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShouldDestroyOnFileDeleteUndefined: Self = StObject.set(x, "shouldDestroyOnFileDelete", js.undefined)
  }
}
