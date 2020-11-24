package typings.actionsOnGoogle.conversationMod

import typings.actionsOnGoogle.responseMediaMod.MediaObjectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("actions-on-google/dist/service/actionssdk/conversation", "MediaObject")
@js.native
class MediaObject protected ()
  extends typings.actionsOnGoogle.responseMod.MediaObject {
  def this(options: String) = this()
  /**
    * @param options MediaObject options or just a string for the url
    * @public
    */
  def this(options: MediaObjectOptions) = this()
}
