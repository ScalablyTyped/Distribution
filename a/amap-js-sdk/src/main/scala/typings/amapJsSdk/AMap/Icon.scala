package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Icon extends StObject {
  
  def getImageSize(): Size
  
  def setImageSize(size: Size): Unit
}
object Icon {
  
  @scala.inline
  def apply(getImageSize: () => Size, setImageSize: Size => Unit): Icon = {
    val __obj = js.Dynamic.literal(getImageSize = js.Any.fromFunction0(getImageSize), setImageSize = js.Any.fromFunction1(setImageSize))
    __obj.asInstanceOf[Icon]
  }
  
  @scala.inline
  implicit class IconMutableBuilder[Self <: Icon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetImageSize(value: () => Size): Self = StObject.set(x, "getImageSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetImageSize(value: Size => Unit): Self = StObject.set(x, "setImageSize", js.Any.fromFunction1(value))
  }
}
