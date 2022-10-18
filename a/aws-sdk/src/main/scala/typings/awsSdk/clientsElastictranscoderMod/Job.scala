package typings.awsSdk.clientsElastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Job extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the job.
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier that Elastic Transcoder assigned to the job. You use this value to get settings for the job or to delete the job.
    */
  var Id: js.UndefOr[typings.awsSdk.clientsElastictranscoderMod.Id] = js.undefined
  
  /**
    * A section of the request or response body that provides information about the file that is being transcoded.
    */
  var Input: js.UndefOr[JobInput] = js.undefined
  
  /**
    * Information about the files that you're transcoding. If you specified multiple files for this job, Elastic Transcoder stitches the files together to make one output.
    */
  var Inputs: js.UndefOr[JobInputs] = js.undefined
  
  /**
    * If you specified one output for a job, information about that output. If you specified multiple outputs for a job, the Output object lists information about the first output. This duplicates the information that is listed for the first output in the Outputs object.  Outputs recommended instead.  A section of the request or response body that provides information about the transcoded (target) file. 
    */
  var Output: js.UndefOr[JobOutput] = js.undefined
  
  /**
    * The value, if any, that you want Elastic Transcoder to prepend to the names of all files that this job creates, including output files, thumbnails, and playlists. We recommend that you add a / or some other delimiter to the end of the OutputKeyPrefix.
    */
  var OutputKeyPrefix: js.UndefOr[Key] = js.undefined
  
  /**
    * Information about the output files. We recommend that you use the Outputs syntax for all jobs, even when you want Elastic Transcoder to transcode a file into only one format. Do not use both the Outputs and Output syntaxes in the same request. You can create a maximum of 30 outputs per job.  If you specify more than one output for a job, Elastic Transcoder creates the files for each output in the order in which you specify them in the job.
    */
  var Outputs: js.UndefOr[JobOutputs] = js.undefined
  
  /**
    *  The Id of the pipeline that you want Elastic Transcoder to use for transcoding. The pipeline determines several settings, including the Amazon S3 bucket from which Elastic Transcoder gets the files to transcode and the bucket into which Elastic Transcoder puts the transcoded files. 
    */
  var PipelineId: js.UndefOr[Id] = js.undefined
  
  /**
    *  Outputs in Fragmented MP4 or MPEG-TS format only.  If you specify a preset in PresetId for which the value of Container is fmp4 (Fragmented MP4) or ts (MPEG-TS), Playlists contains information about the master playlists that you want Elastic Transcoder to create. The maximum number of master playlists in a job is 30.
    */
  var Playlists: js.UndefOr[typings.awsSdk.clientsElastictranscoderMod.Playlists] = js.undefined
  
  /**
    *  The status of the job: Submitted, Progressing, Complete, Canceled, or Error. 
    */
  var Status: js.UndefOr[JobStatus] = js.undefined
  
  /**
    * Details about the timing of a job.
    */
  var Timing: js.UndefOr[typings.awsSdk.clientsElastictranscoderMod.Timing] = js.undefined
  
  /**
    * User-defined metadata that you want to associate with an Elastic Transcoder job. You specify metadata in key/value pairs, and you can add up to 10 key/value pairs per job. Elastic Transcoder does not guarantee that key/value pairs are returned in the same order in which you specify them. Metadata keys and values must use characters from the following list:    0-9     A-Z and a-z     Space    The following symbols: _.:/=+-%@   
    */
  var UserMetadata: js.UndefOr[typings.awsSdk.clientsElastictranscoderMod.UserMetadata] = js.undefined
}
object Job {
  
  inline def apply(): Job = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Job]
  }
  
  extension [Self <: Job](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setInput(value: JobInput): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
    
    inline def setInputs(value: JobInputs): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "Inputs", js.undefined)
    
    inline def setInputsVarargs(value: JobInput*): Self = StObject.set(x, "Inputs", js.Array(value*))
    
    inline def setOutput(value: JobOutput): Self = StObject.set(x, "Output", value.asInstanceOf[js.Any])
    
    inline def setOutputKeyPrefix(value: Key): Self = StObject.set(x, "OutputKeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setOutputKeyPrefixUndefined: Self = StObject.set(x, "OutputKeyPrefix", js.undefined)
    
    inline def setOutputUndefined: Self = StObject.set(x, "Output", js.undefined)
    
    inline def setOutputs(value: JobOutputs): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "Outputs", js.undefined)
    
    inline def setOutputsVarargs(value: JobOutput*): Self = StObject.set(x, "Outputs", js.Array(value*))
    
    inline def setPipelineId(value: Id): Self = StObject.set(x, "PipelineId", value.asInstanceOf[js.Any])
    
    inline def setPipelineIdUndefined: Self = StObject.set(x, "PipelineId", js.undefined)
    
    inline def setPlaylists(value: Playlists): Self = StObject.set(x, "Playlists", value.asInstanceOf[js.Any])
    
    inline def setPlaylistsUndefined: Self = StObject.set(x, "Playlists", js.undefined)
    
    inline def setPlaylistsVarargs(value: Playlist*): Self = StObject.set(x, "Playlists", js.Array(value*))
    
    inline def setStatus(value: JobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTiming(value: Timing): Self = StObject.set(x, "Timing", value.asInstanceOf[js.Any])
    
    inline def setTimingUndefined: Self = StObject.set(x, "Timing", js.undefined)
    
    inline def setUserMetadata(value: UserMetadata): Self = StObject.set(x, "UserMetadata", value.asInstanceOf[js.Any])
    
    inline def setUserMetadataUndefined: Self = StObject.set(x, "UserMetadata", js.undefined)
  }
}
