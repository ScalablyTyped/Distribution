package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDataRepositoryAssociationRequest extends StObject {
  
  /**
    * The ID of the data repository association that you are updating.
    */
  var AssociationId: DataRepositoryAssociationId
  
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsFsxMod.ClientRequestToken] = js.undefined
  
  /**
    * For files imported from a data repository, this value determines the stripe count and maximum amount of data per file (in MiB) stored on a single physical disk. The maximum number of disks that a single file can be striped across is limited by the total number of disks that make up the file system. The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3 objects have a maximum size of 5 TB.
    */
  var ImportedFileChunkSize: js.UndefOr[Megabytes] = js.undefined
  
  /**
    * The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre file system with a data repository association. The configuration defines which file events (new, changed, or deleted files or directories) are automatically imported from the linked data repository to the file system or automatically exported from the file system to the data repository.
    */
  var S3: js.UndefOr[S3DataRepositoryConfiguration] = js.undefined
}
object UpdateDataRepositoryAssociationRequest {
  
  inline def apply(AssociationId: DataRepositoryAssociationId): UpdateDataRepositoryAssociationRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDataRepositoryAssociationRequest]
  }
  
  extension [Self <: UpdateDataRepositoryAssociationRequest](x: Self) {
    
    inline def setAssociationId(value: DataRepositoryAssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setImportedFileChunkSize(value: Megabytes): Self = StObject.set(x, "ImportedFileChunkSize", value.asInstanceOf[js.Any])
    
    inline def setImportedFileChunkSizeUndefined: Self = StObject.set(x, "ImportedFileChunkSize", js.undefined)
    
    inline def setS3(value: S3DataRepositoryConfiguration): Self = StObject.set(x, "S3", value.asInstanceOf[js.Any])
    
    inline def setS3Undefined: Self = StObject.set(x, "S3", js.undefined)
  }
}
