package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataRepositoryConfiguration extends StObject {
  
  /**
    * Describes the file system's linked S3 data repository's AutoImportPolicy. The AutoImportPolicy configures how Amazon FSx keeps your file and directory listings up to date as you add or modify objects in your linked S3 bucket. AutoImportPolicy can have the following values:    NONE - (Default) AutoImport is off. Amazon FSx only updates file and directory listings from the linked S3 bucket when the file system is created. FSx does not update file and directory listings for any new or changed objects after choosing this option.    NEW - AutoImport is on. Amazon FSx automatically imports directory listings of any new objects added to the linked S3 bucket that do not currently exist in the FSx file system.     NEW_CHANGED - AutoImport is on. Amazon FSx automatically imports file and directory listings of any new objects added to the S3 bucket and any existing objects that are changed in the S3 bucket after you choose this option.    NEW_CHANGED_DELETED - AutoImport is on. Amazon FSx automatically imports file and directory listings of any new objects added to the S3 bucket, any existing objects that are changed in the S3 bucket, and any objects that were deleted in the S3 bucket.  
    */
  var AutoImportPolicy: js.UndefOr[AutoImportPolicyType] = js.undefined
  
  /**
    * The export path to the Amazon S3 bucket (and prefix) that you are using to store new and changed Lustre file system files in S3.
    */
  var ExportPath: js.UndefOr[ArchivePath] = js.undefined
  
  var FailureDetails: js.UndefOr[DataRepositoryFailureDetails] = js.undefined
  
  /**
    * The import path to the Amazon S3 bucket (and optional prefix) that you're using as the data repository for your FSx for Lustre file system, for example s3://import-bucket/optional-prefix. If a prefix is specified after the Amazon S3 bucket name, only object keys with that prefix are loaded into the file system.
    */
  var ImportPath: js.UndefOr[ArchivePath] = js.undefined
  
  /**
    * For files imported from a data repository, this value determines the stripe count and maximum amount of data per file (in MiB) stored on a single physical disk. The maximum number of disks that a single file can be striped across is limited by the total number of disks that make up the file system. The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3 objects have a maximum size of 5 TB.
    */
  var ImportedFileChunkSize: js.UndefOr[Megabytes] = js.undefined
  
  /**
    * Describes the state of the file system's S3 durable data repository, if it is configured with an S3 repository. The lifecycle can have the following values:    CREATING - The data repository configuration between the FSx file system and the linked S3 data repository is being created. The data repository is unavailable.    AVAILABLE - The data repository is available for use.    MISCONFIGURED - Amazon FSx cannot automatically import updates from the S3 bucket until the data repository configuration is corrected. For more information, see Troubleshooting a Misconfigured linked S3 bucket.     UPDATING - The data repository is undergoing a customer initiated update and availability may be impacted.    FAILED - The data repository is in a terminal state that cannot be recovered.  
    */
  var Lifecycle: js.UndefOr[DataRepositoryLifecycle] = js.undefined
}
object DataRepositoryConfiguration {
  
  inline def apply(): DataRepositoryConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataRepositoryConfiguration]
  }
  
  extension [Self <: DataRepositoryConfiguration](x: Self) {
    
    inline def setAutoImportPolicy(value: AutoImportPolicyType): Self = StObject.set(x, "AutoImportPolicy", value.asInstanceOf[js.Any])
    
    inline def setAutoImportPolicyUndefined: Self = StObject.set(x, "AutoImportPolicy", js.undefined)
    
    inline def setExportPath(value: ArchivePath): Self = StObject.set(x, "ExportPath", value.asInstanceOf[js.Any])
    
    inline def setExportPathUndefined: Self = StObject.set(x, "ExportPath", js.undefined)
    
    inline def setFailureDetails(value: DataRepositoryFailureDetails): Self = StObject.set(x, "FailureDetails", value.asInstanceOf[js.Any])
    
    inline def setFailureDetailsUndefined: Self = StObject.set(x, "FailureDetails", js.undefined)
    
    inline def setImportPath(value: ArchivePath): Self = StObject.set(x, "ImportPath", value.asInstanceOf[js.Any])
    
    inline def setImportPathUndefined: Self = StObject.set(x, "ImportPath", js.undefined)
    
    inline def setImportedFileChunkSize(value: Megabytes): Self = StObject.set(x, "ImportedFileChunkSize", value.asInstanceOf[js.Any])
    
    inline def setImportedFileChunkSizeUndefined: Self = StObject.set(x, "ImportedFileChunkSize", js.undefined)
    
    inline def setLifecycle(value: DataRepositoryLifecycle): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLifecycleUndefined: Self = StObject.set(x, "Lifecycle", js.undefined)
  }
}
