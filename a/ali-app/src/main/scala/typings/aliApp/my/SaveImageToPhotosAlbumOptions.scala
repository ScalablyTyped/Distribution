package typings.aliApp.my

import typings.aliApp.anon.ErrMsg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveImageToPhotosAlbumOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /**
    * 要保存的图片链接
    */
  var filePath: String
  
  @JSName("success")
  var success_SaveImageToPhotosAlbumOptions: js.UndefOr[js.Function1[/* res */ ErrMsg, Unit]] = js.undefined
}
object SaveImageToPhotosAlbumOptions {
  
  inline def apply(filePath: String): SaveImageToPhotosAlbumOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveImageToPhotosAlbumOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SaveImageToPhotosAlbumOptions] (val x: Self) extends AnyVal {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ ErrMsg => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
