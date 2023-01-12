package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginOptions extends StObject {
  
  /*
    * Whether to auto close the login prompt.
    */
  var autoClose: js.UndefOr[Boolean] = js.undefined
  
  /*
    * The height of the login prompt window.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /*
    * The left of the login prompt window.
    */
  var left: js.UndefOr[Double] = js.undefined
  
  /*
    * The top of the login prompt window.
    */
  var top: js.UndefOr[Double] = js.undefined
  
  /*
    * The width of the login prompt window.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object LoginOptions {
  
  inline def apply(): LoginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoginOptions] (val x: Self) extends AnyVal {
    
    inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
