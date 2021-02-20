package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundImage extends StObject {
  
  var backgroundImage: String = js.native
}
object BackgroundImage {
  
  @scala.inline
  def apply(backgroundImage: String): BackgroundImage = {
    val __obj = js.Dynamic.literal(backgroundImage = backgroundImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundImage]
  }
  
  @scala.inline
  implicit class BackgroundImageMutableBuilder[Self <: BackgroundImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundImage(value: String): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
  }
}
