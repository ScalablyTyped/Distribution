package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundImage extends StObject {
  
  var backgroundImage: String
}
object BackgroundImage {
  
  inline def apply(backgroundImage: String): BackgroundImage = {
    val __obj = js.Dynamic.literal(backgroundImage = backgroundImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundImage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundImage] (val x: Self) extends AnyVal {
    
    inline def setBackgroundImage(value: String): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
  }
}
