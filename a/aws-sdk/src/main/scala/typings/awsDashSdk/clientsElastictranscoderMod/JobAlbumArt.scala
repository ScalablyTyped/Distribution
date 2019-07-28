package typings.awsDashSdk.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobAlbumArt extends js.Object {
  /**
    * The file to be used as album art. There can be multiple artworks associated with an audio file, to a maximum of 20. Valid formats are .jpg and .png 
    */
  var Artwork: js.UndefOr[Artworks] = js.undefined
  /**
    * A policy that determines how Elastic Transcoder handles the existence of multiple album artwork files.    Replace: The specified album art replaces any existing album art.    Prepend: The specified album art is placed in front of any existing album art.    Append: The specified album art is placed after any existing album art.    Fallback: If the original input file contains artwork, Elastic Transcoder uses that artwork for the output. If the original input does not contain artwork, Elastic Transcoder uses the specified album art file.  
    */
  var MergePolicy: js.UndefOr[typings.awsDashSdk.clientsElastictranscoderMod.MergePolicy] = js.undefined
}

object JobAlbumArt {
  @scala.inline
  def apply(Artwork: Artworks = null, MergePolicy: MergePolicy = null): JobAlbumArt = {
    val __obj = js.Dynamic.literal()
    if (Artwork != null) __obj.updateDynamic("Artwork")(Artwork)
    if (MergePolicy != null) __obj.updateDynamic("MergePolicy")(MergePolicy)
    __obj.asInstanceOf[JobAlbumArt]
  }
}

