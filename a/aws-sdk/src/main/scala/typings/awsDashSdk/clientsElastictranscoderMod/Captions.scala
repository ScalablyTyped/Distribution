package typings.awsDashSdk.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Captions extends js.Object {
  /**
    * The array of file formats for the output captions. If you leave this value blank, Elastic Transcoder returns an error.
    */
  var CaptionFormats: js.UndefOr[typings.awsDashSdk.clientsElastictranscoderMod.CaptionFormats] = js.native
  /**
    * Source files for the input sidecar captions used during the transcoding process. To omit all sidecar captions, leave CaptionSources blank.
    */
  var CaptionSources: js.UndefOr[typings.awsDashSdk.clientsElastictranscoderMod.CaptionSources] = js.native
  /**
    * A policy that determines how Elastic Transcoder handles the existence of multiple captions.    MergeOverride: Elastic Transcoder transcodes both embedded and sidecar captions into outputs. If captions for a language are embedded in the input file and also appear in a sidecar file, Elastic Transcoder uses the sidecar captions and ignores the embedded captions for that language.    MergeRetain: Elastic Transcoder transcodes both embedded and sidecar captions into outputs. If captions for a language are embedded in the input file and also appear in a sidecar file, Elastic Transcoder uses the embedded captions and ignores the sidecar captions for that language. If CaptionSources is empty, Elastic Transcoder omits all sidecar captions from the output files.    Override: Elastic Transcoder transcodes only the sidecar captions that you specify in CaptionSources.    MergePolicy cannot be null.
    */
  var MergePolicy: js.UndefOr[CaptionMergePolicy] = js.native
}

object Captions {
  @scala.inline
  def apply(
    CaptionFormats: CaptionFormats = null,
    CaptionSources: CaptionSources = null,
    MergePolicy: CaptionMergePolicy = null
  ): Captions = {
    val __obj = js.Dynamic.literal()
    if (CaptionFormats != null) __obj.updateDynamic("CaptionFormats")(CaptionFormats.asInstanceOf[js.Any])
    if (CaptionSources != null) __obj.updateDynamic("CaptionSources")(CaptionSources.asInstanceOf[js.Any])
    if (MergePolicy != null) __obj.updateDynamic("MergePolicy")(MergePolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Captions]
  }
}

