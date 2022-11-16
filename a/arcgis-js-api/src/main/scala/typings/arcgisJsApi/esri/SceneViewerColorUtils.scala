package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Note: reserved for internal use only, this is not part of the stable public API.
  *
  * Color utilities for the Scene Viewer application.
  */
trait SceneViewerColorUtils extends StObject {
  
  /**
    * Note: reserved for internal use only, this is not part of the stable public API.
    *
    * Return true if a color is bright.
    */
  def isBright(color: Color_): Boolean
}
object SceneViewerColorUtils {
  
  inline def apply(isBright: Color_ => Boolean): SceneViewerColorUtils = {
    val __obj = js.Dynamic.literal(isBright = js.Any.fromFunction1(isBright))
    __obj.asInstanceOf[SceneViewerColorUtils]
  }
  
  extension [Self <: SceneViewerColorUtils](x: Self) {
    
    inline def setIsBright(value: Color_ => Boolean): Self = StObject.set(x, "isBright", js.Any.fromFunction1(value))
  }
}
