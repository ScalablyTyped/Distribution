package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides utility methods for working with [dates](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-timeUtils.html)
  */
@js.native
trait timeUtils extends StObject {
  
  /**
    * Returns the time extent of all layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-timeUtils.html#getTimeExtentFromLayers)
    */
  def getTimeExtentFromLayers(layers: js.Array[Layer]): js.Promise[TimeExtent] = js.native
  def getTimeExtentFromLayers(layers: js.Array[Layer], signal: AbortSignal): js.Promise[TimeExtent] = js.native
  def getTimeExtentFromLayers(layers: Collection[Layer]): js.Promise[TimeExtent] = js.native
  def getTimeExtentFromLayers(layers: Collection[Layer], signal: AbortSignal): js.Promise[TimeExtent] = js.native
}
