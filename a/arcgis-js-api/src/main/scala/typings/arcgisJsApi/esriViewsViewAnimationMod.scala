package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ViewAnimation
import typings.arcgisJsApi.esri.ViewAnimationProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsViewAnimationMod {
  
  @JSImport("esri/views/ViewAnimation", JSImport.Namespace)
  @js.native
  /**
    * Contains a [state](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ViewAnimation.html#state) property used for checking the state of the animation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ViewAnimation.html)
    */
  open class ^ ()
    extends StObject
       with ViewAnimation {
    def this(properties: ViewAnimationProperties) = this()
  }
}
