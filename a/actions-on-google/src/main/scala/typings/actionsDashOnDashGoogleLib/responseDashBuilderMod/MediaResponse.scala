package typings
package actionsDashOnDashGoogleLib.responseDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/response-builder", "MediaResponse")
@js.native
class MediaResponse protected () extends js.Object {
  /**
       * Constructor for MediaResponse.
       * @param mediaType Type of the media which defaults to MediaValues.Type.AUDIO
       */
  def this(mediaType: actionsDashOnDashGoogleLib.responseDashBuilderMod.MediaValuesNs.Type) = this()
  /**
       * Array of MediaObject held in the MediaResponse.
       */
  var mediaObjects: js.Array[MediaObject] = js.native
  /**
       * Type of the media within this MediaResponse
       */
  var mediaType: actionsDashOnDashGoogleLib.responseDashBuilderMod.MediaValuesNs.Type = js.native
  /**
       * Adds a single media file or list of media files to the cart.
       *
       * @param items Single or Array of MediaObject to add.
       * @return Returns current constructed MediaResponse.
       */
  def addMediaObjects(items: MediaObject): MediaResponse = js.native
  /**
       * Adds a single media file or list of media files to the cart.
       *
       * @param items Single or Array of MediaObject to add.
       * @return Returns current constructed MediaResponse.
       */
  def addMediaObjects(items: js.Array[MediaObject]): MediaResponse = js.native
}

