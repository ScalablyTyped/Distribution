package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`waiting-for-target`
import typings.arcgisJsApi.arcgisJsApiStrings.finished
import typings.arcgisJsApi.arcgisJsApiStrings.running
import typings.arcgisJsApi.arcgisJsApiStrings.stopped
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewAnimation
  extends Accessor
     with corePromise {
  /**
    * The state of the animation.  The animation terminates when the state is either `finished` or `stopped` and cannot transition again to `running`. The `finished` state indicates the animation has successfully ended, while the `stopped` state indicates that the animation was interrupted before it reached its final target.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ViewAnimation.html#state)
    *
    * @default running
    */
  val state: running | finished | stopped | `waiting-for-target` = js.native
  /**
    * The target of the animation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ViewAnimation.html#target)
    */
  var target: Viewpoint = js.native
  /**
    * Finishes the view animation by immediately going to the target and sets the state of the animation to `finished`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ViewAnimation.html#finish)
    *
    *
    */
  def finish(): Unit = js.native
  /**
    * Stops the view animation at its current state and sets the state of the animation to `stopped`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ViewAnimation.html#stop)
    *
    *
    */
  def stop(): Unit = js.native
}

