package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartReadSetExportJobRequest extends StObject {
  
  /**
    * To ensure that jobs don't run multiple times, specify a unique token for each job.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * A location for exported files in Amazon S3.
    */
  var destination: S3Destination
  
  /**
    * A service role for the job.
    */
  var roleArn: RoleArn
  
  /**
    * The read set's sequence store ID.
    */
  var sequenceStoreId: SequenceStoreId
  
  /**
    * The job's source files.
    */
  var sources: StartReadSetExportJobRequestSourcesList
}
object StartReadSetExportJobRequest {
  
  inline def apply(
    destination: S3Destination,
    roleArn: RoleArn,
    sequenceStoreId: SequenceStoreId,
    sources: StartReadSetExportJobRequestSourcesList
  ): StartReadSetExportJobRequest = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], sequenceStoreId = sequenceStoreId.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartReadSetExportJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartReadSetExportJobRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDestination(value: S3Destination): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setSequenceStoreId(value: SequenceStoreId): Self = StObject.set(x, "sequenceStoreId", value.asInstanceOf[js.Any])
    
    inline def setSources(value: StartReadSetExportJobRequestSourcesList): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesVarargs(value: ExportReadSet*): Self = StObject.set(x, "sources", js.Array(value*))
  }
}
