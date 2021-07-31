package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`base-dynamic`
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseDynamicLayer
  extends StObject
     with Layer
     with ScaleRangeLayer
     with RefreshableLayer
     with BlendLayer {
  
  /**
    * Adds a promise to the layer's [loadable](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#loadable) chain.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseDynamicLayer.html#addResolvingPromise)
    */
  def addResolvingPromise(promiseToLoad: js.Promise[js.Any]): js.Promise[js.Any] = js.native
  
  /**
    * This method fetches the image for the specified extent and size.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseDynamicLayer.html#fetchImage)
    */
  def fetchImage(extent: Extent, width: Double, height: Double): js.Promise[HTMLImageElement | HTMLCanvasElement] = js.native
  def fetchImage(extent: Extent, width: Double, height: Double, options: BaseDynamicLayerFetchImageOptions): js.Promise[HTMLImageElement | HTMLCanvasElement] = js.native
  
  /**
    * This method returns a URL to an image for a given extent, width, and height.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseDynamicLayer.html#getImageUrl)
    */
  def getImageUrl(extent: Extent, width: Double, height: Double): js.Promise[String] | String = js.native
  
  @JSName("type")
  val type_BaseDynamicLayer: `base-dynamic` = js.native
}
