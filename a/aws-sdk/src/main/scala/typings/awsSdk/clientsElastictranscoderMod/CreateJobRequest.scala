package typings.awsSdk.clientsElastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateJobRequest extends StObject {
  
  /**
    * A section of the request body that provides information about the file that is being transcoded.
    */
  var Input: js.UndefOr[JobInput] = js.undefined
  
  /**
    * A section of the request body that provides information about the files that are being transcoded.
    */
  var Inputs: js.UndefOr[JobInputs] = js.undefined
  
  /**
    *  A section of the request body that provides information about the transcoded (target) file. We strongly recommend that you use the Outputs syntax instead of the Output syntax. 
    */
  var Output: js.UndefOr[CreateJobOutput] = js.undefined
  
  /**
    * The value, if any, that you want Elastic Transcoder to prepend to the names of all files that this job creates, including output files, thumbnails, and playlists.
    */
  var OutputKeyPrefix: js.UndefOr[Key] = js.undefined
  
  /**
    *  A section of the request body that provides information about the transcoded (target) files. We recommend that you use the Outputs syntax instead of the Output syntax. 
    */
  var Outputs: js.UndefOr[CreateJobOutputs] = js.undefined
  
  /**
    * The Id of the pipeline that you want Elastic Transcoder to use for transcoding. The pipeline determines several settings, including the Amazon S3 bucket from which Elastic Transcoder gets the files to transcode and the bucket into which Elastic Transcoder puts the transcoded files.
    */
  var PipelineId: Id
  
  /**
    * If you specify a preset in PresetId for which the value of Container is fmp4 (Fragmented MP4) or ts (MPEG-TS), Playlists contains information about the master playlists that you want Elastic Transcoder to create. The maximum number of master playlists in a job is 30.
    */
  var Playlists: js.UndefOr[CreateJobPlaylists] = js.undefined
  
  /**
    * User-defined metadata that you want to associate with an Elastic Transcoder job. You specify metadata in key/value pairs, and you can add up to 10 key/value pairs per job. Elastic Transcoder does not guarantee that key/value pairs are returned in the same order in which you specify them.
    */
  var UserMetadata: js.UndefOr[typings.awsSdk.clientsElastictranscoderMod.UserMetadata] = js.undefined
}
object CreateJobRequest {
  
  inline def apply(PipelineId: Id): CreateJobRequest = {
    val __obj = js.Dynamic.literal(PipelineId = PipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobRequest]
  }
  
  extension [Self <: CreateJobRequest](x: Self) {
    
    inline def setInput(value: JobInput): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
    
    inline def setInputs(value: JobInputs): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "Inputs", js.undefined)
    
    inline def setInputsVarargs(value: JobInput*): Self = StObject.set(x, "Inputs", js.Array(value*))
    
    inline def setOutput(value: CreateJobOutput): Self = StObject.set(x, "Output", value.asInstanceOf[js.Any])
    
    inline def setOutputKeyPrefix(value: Key): Self = StObject.set(x, "OutputKeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setOutputKeyPrefixUndefined: Self = StObject.set(x, "OutputKeyPrefix", js.undefined)
    
    inline def setOutputUndefined: Self = StObject.set(x, "Output", js.undefined)
    
    inline def setOutputs(value: CreateJobOutputs): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "Outputs", js.undefined)
    
    inline def setOutputsVarargs(value: CreateJobOutput*): Self = StObject.set(x, "Outputs", js.Array(value*))
    
    inline def setPipelineId(value: Id): Self = StObject.set(x, "PipelineId", value.asInstanceOf[js.Any])
    
    inline def setPlaylists(value: CreateJobPlaylists): Self = StObject.set(x, "Playlists", value.asInstanceOf[js.Any])
    
    inline def setPlaylistsUndefined: Self = StObject.set(x, "Playlists", js.undefined)
    
    inline def setPlaylistsVarargs(value: CreateJobPlaylist*): Self = StObject.set(x, "Playlists", js.Array(value*))
    
    inline def setUserMetadata(value: UserMetadata): Self = StObject.set(x, "UserMetadata", value.asInstanceOf[js.Any])
    
    inline def setUserMetadataUndefined: Self = StObject.set(x, "UserMetadata", js.undefined)
  }
}
