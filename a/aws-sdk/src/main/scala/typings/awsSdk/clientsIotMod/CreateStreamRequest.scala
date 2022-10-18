package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStreamRequest extends StObject {
  
  /**
    * A description of the stream.
    */
  var description: js.UndefOr[StreamDescription] = js.undefined
  
  /**
    * The files to stream.
    */
  var files: StreamFiles
  
  /**
    * An IAM role that allows the IoT service principal to access your S3 files.
    */
  var roleArn: RoleArn
  
  /**
    * The stream ID.
    */
  var streamId: StreamId
  
  /**
    * Metadata which can be used to manage streams.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateStreamRequest {
  
  inline def apply(files: StreamFiles, roleArn: RoleArn, streamId: StreamId): CreateStreamRequest = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStreamRequest]
  }
  
  extension [Self <: CreateStreamRequest](x: Self) {
    
    inline def setDescription(value: StreamDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFiles(value: StreamFiles): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesVarargs(value: StreamFile*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setStreamId(value: StreamId): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
