package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewAnimation
  extends Accessor
     with corePromise {
  /**
    * The state of the animation.  The animation terminates when the state is either `finished` or `stopped` and cannot transition again to `running`. The `finished` state indicates the animation has successfully ended, while the `stopped` state indicates that the animation was interrupted before it reached its final target.  **Possible Values:** running | finished | stopped | waiting-for-target
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ViewAnimation.html#state)
    *
    * @default running
    */
  val state: java.lang.String = js.native
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
  def finish(): scala.Unit = js.native
  /**
    * Stops the view animation at its current state and sets the state of the animation to `stopped`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ViewAnimation.html#stop)
    *
    *
    */
  def stop(): scala.Unit = js.native
}

@JSGlobal("__esri.ViewAnimation")
@js.native
/**
  * Contains a [state](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ViewAnimation.html#state) property used for checking the state of the animation. The view animation is resolved when the animation has `finished` and is rejected if it is `stopped`.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ViewAnimation.html)
  */
class ViewAnimationCls () extends ViewAnimation {
  def this(properties: ViewAnimationProperties) = this()
}

