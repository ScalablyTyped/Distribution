package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamInfo extends StObject {
  
  /**
    * The date when the stream was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the stream.
    */
  var description: js.UndefOr[StreamDescription] = js.undefined
  
  /**
    * The files to stream.
    */
  var files: js.UndefOr[StreamFiles] = js.undefined
  
  /**
    * The date when the stream was last updated.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An IAM role IoT assumes to access your S3 files.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The stream ARN.
    */
  var streamArn: js.UndefOr[StreamArn] = js.undefined
  
  /**
    * The stream ID.
    */
  var streamId: js.UndefOr[StreamId] = js.undefined
  
  /**
    * The stream version.
    */
  var streamVersion: js.UndefOr[StreamVersion] = js.undefined
}
object StreamInfo {
  
  inline def apply(): StreamInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamInfo]
  }
  
  extension [Self <: StreamInfo](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setDescription(value: StreamDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFiles(value: StreamFiles): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: StreamFile*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    inline def setStreamArn(value: StreamArn): Self = StObject.set(x, "streamArn", value.asInstanceOf[js.Any])
    
    inline def setStreamArnUndefined: Self = StObject.set(x, "streamArn", js.undefined)
    
    inline def setStreamId(value: StreamId): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    inline def setStreamIdUndefined: Self = StObject.set(x, "streamId", js.undefined)
    
    inline def setStreamVersion(value: StreamVersion): Self = StObject.set(x, "streamVersion", value.asInstanceOf[js.Any])
    
    inline def setStreamVersionUndefined: Self = StObject.set(x, "streamVersion", js.undefined)
  }
}
