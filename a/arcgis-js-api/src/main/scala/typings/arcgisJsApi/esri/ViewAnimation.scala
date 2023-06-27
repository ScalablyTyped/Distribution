package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`waiting-for-target`
import typings.arcgisJsApi.arcgisJsApiStrings.finished
import typings.arcgisJsApi.arcgisJsApiStrings.running
import typings.arcgisJsApi.arcgisJsApiStrings.stopped
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewAnimation
  extends StObject
     with Accessor
     with corePromise {
  
  /**
  		 * Finishes the view animation by immediately going to the target and sets the state of the animation to `finished`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ViewAnimation.html#finish)
  		 */
  def finish(): scala.Unit = js.native
  
  /**
  		 * The state of the animation.
  		 *
  		 * @default running
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ViewAnimation.html#state)
  		 */
  val state: running | finished | stopped | `waiting-for-target` = js.native
  
  /**
  		 * Stops the view animation at its current state and sets the state of the animation to `stopped`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ViewAnimation.html#stop)
  		 */
  def stop(): scala.Unit = js.native
  
  /**
  		 * The target of the animation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ViewAnimation.html#target)
  		 */
  var target: Viewpoint = js.native
}
