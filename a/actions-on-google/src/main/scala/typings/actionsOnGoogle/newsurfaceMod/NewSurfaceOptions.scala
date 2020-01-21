package typings.actionsOnGoogle.newsurfaceMod

import typings.actionsOnGoogle.surfaceMod.SurfaceCapability
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewSurfaceOptions extends js.Object {
  /**
    * The list of capabilities required in the surface.
    * @public
    */
  var capabilities: SurfaceCapability | js.Array[SurfaceCapability]
  /**
    * Context why new surface is requested.
    * It's the TTS prompt prefix (action phrase) we ask the user.
    * @public
    */
  var context: String
  /**
    * Title of the notification appearing on new surface device.
    * @public
    */
  var notification: String
}

object NewSurfaceOptions {
  @scala.inline
  def apply(
    capabilities: SurfaceCapability | js.Array[SurfaceCapability],
    context: String,
    notification: String
  ): NewSurfaceOptions = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NewSurfaceOptions]
  }
}

