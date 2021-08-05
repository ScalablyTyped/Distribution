package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewAnimationProperties extends StObject {
  
  /**
    * The target of the animation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ViewAnimation.html#target)
    */
  var target: js.UndefOr[ViewpointProperties] = js.undefined
}
object ViewAnimationProperties {
  
  inline def apply(): ViewAnimationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewAnimationProperties]
  }
  
  extension [Self <: ViewAnimationProperties](x: Self) {
    
    inline def setTarget(value: ViewpointProperties): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
