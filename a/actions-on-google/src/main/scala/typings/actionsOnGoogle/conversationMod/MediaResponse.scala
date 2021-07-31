package typings.actionsOnGoogle.conversationMod

import typings.actionsOnGoogle.responseMediaMod.MediaObjectString
import typings.actionsOnGoogle.responseMediaMod.MediaResponseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("actions-on-google/dist/service/actionssdk/conversation", "MediaResponse")
@js.native
class MediaResponse protected ()
  extends typings.actionsOnGoogle.responseMod.MediaResponse {
  /**
    * @param objects MediaObjects
    * @public
    */
  def this(objects: MediaObjectString*) = this()
  /**
    * @param objects MediaObjects
    * @public
    */
  def this(objects: js.Array[MediaObjectString]) = this()
  /**
    * @param options MediaResponse options
    * @public
    */
  def this(options: MediaResponseOptions) = this()
}
