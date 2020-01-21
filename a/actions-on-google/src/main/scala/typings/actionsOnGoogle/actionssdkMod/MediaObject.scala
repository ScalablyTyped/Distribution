package typings.actionsOnGoogle.actionssdkMod

import typings.actionsOnGoogle.responseMediaMod.MediaObjectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk", "MediaObject")
@js.native
class MediaObject protected ()
  extends typings.actionsOnGoogle.conversationMod.MediaObject {
  def this(options: String) = this()
  /**
    * @param options MediaObject options or just a string for the url
    * @public
    */
  def this(options: MediaObjectOptions) = this()
}

