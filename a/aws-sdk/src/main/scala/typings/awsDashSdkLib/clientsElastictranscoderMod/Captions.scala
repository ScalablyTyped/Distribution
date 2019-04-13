package typings
package awsDashSdkLib.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Captions extends js.Object {
  /**
    * The array of file formats for the output captions. If you leave this value blank, Elastic Transcoder returns an error.
    */
  var CaptionFormats: js.UndefOr[CaptionFormats] = js.undefined
  /**
    * Source files for the input sidecar captions used during the transcoding process. To omit all sidecar captions, leave CaptionSources blank.
    */
  var CaptionSources: js.UndefOr[CaptionSources] = js.undefined
  /**
    * A policy that determines how Elastic Transcoder handles the existence of multiple captions.    MergeOverride: Elastic Transcoder transcodes both embedded and sidecar captions into outputs. If captions for a language are embedded in the input file and also appear in a sidecar file, Elastic Transcoder uses the sidecar captions and ignores the embedded captions for that language.    MergeRetain: Elastic Transcoder transcodes both embedded and sidecar captions into outputs. If captions for a language are embedded in the input file and also appear in a sidecar file, Elastic Transcoder uses the embedded captions and ignores the sidecar captions for that language. If CaptionSources is empty, Elastic Transcoder omits all sidecar captions from the output files.    Override: Elastic Transcoder transcodes only the sidecar captions that you specify in CaptionSources.    MergePolicy cannot be null.
    */
  var MergePolicy: js.UndefOr[CaptionMergePolicy] = js.undefined
}

object Captions {
  @scala.inline
  def apply(
    CaptionFormats: CaptionFormats = null,
    CaptionSources: CaptionSources = null,
    MergePolicy: CaptionMergePolicy = null
  ): Captions = {
    val __obj = js.Dynamic.literal()
    if (CaptionFormats != null) __obj.updateDynamic("CaptionFormats")(CaptionFormats)
    if (CaptionSources != null) __obj.updateDynamic("CaptionSources")(CaptionSources)
    if (MergePolicy != null) __obj.updateDynamic("MergePolicy")(MergePolicy)
    __obj.asInstanceOf[Captions]
  }
}

