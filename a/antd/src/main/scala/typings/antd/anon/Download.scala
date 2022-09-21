package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Download extends StObject {
  
  def download(): Unit
  
  def preview(): Unit
  
  def remove(): Unit
}
object Download {
  
  inline def apply(download: () => Unit, preview: () => Unit, remove: () => Unit): Download = {
    val __obj = js.Dynamic.literal(download = js.Any.fromFunction0(download), preview = js.Any.fromFunction0(preview), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[Download]
  }
  
  extension [Self <: Download](x: Self) {
    
    inline def setDownload(value: () => Unit): Self = StObject.set(x, "download", js.Any.fromFunction0(value))
    
    inline def setPreview(value: () => Unit): Self = StObject.set(x, "preview", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
