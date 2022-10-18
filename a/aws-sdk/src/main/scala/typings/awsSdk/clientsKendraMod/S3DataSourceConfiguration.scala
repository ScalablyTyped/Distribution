package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3DataSourceConfiguration extends StObject {
  
  /**
    * Provides the path to the S3 bucket that contains the user context filtering files for the data source. For the format of the file, see Access control for S3 data sources.
    */
  var AccessControlListConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.AccessControlListConfiguration] = js.undefined
  
  /**
    * The name of the bucket that contains the documents.
    */
  var BucketName: S3BucketName
  
  var DocumentsMetadataConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.DocumentsMetadataConfiguration] = js.undefined
  
  /**
    * A list of glob patterns for documents that should not be indexed. If a document that matches an inclusion prefix or inclusion pattern also matches an exclusion pattern, the document is not indexed. Some examples are:    *.png , *.jpg will exclude all PNG and JPEG image files in a directory (files with the extensions .png and .jpg).    *internal* will exclude all files in a directory that contain 'internal' in the file name, such as 'internal', 'internal_only', 'company_internal'.    ***internal* will exclude all internal-related files in a directory and its subdirectories.  
    */
  var ExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
  
  /**
    * A list of glob patterns for documents that should be indexed. If a document that matches an inclusion pattern also matches an exclusion pattern, the document is not indexed. Some examples are:    *.txt will include all text files in a directory (files with the extension .txt).    ***.txt will include all text files in a directory and its subdirectories.    *tax* will include all files in a directory that contain 'tax' in the file name, such as 'tax', 'taxes', 'income_tax'.  
    */
  var InclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
  
  /**
    * A list of S3 prefixes for the documents that should be included in the index.
    */
  var InclusionPrefixes: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
}
object S3DataSourceConfiguration {
  
  inline def apply(BucketName: S3BucketName): S3DataSourceConfiguration = {
    val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3DataSourceConfiguration]
  }
  
  extension [Self <: S3DataSourceConfiguration](x: Self) {
    
    inline def setAccessControlListConfiguration(value: AccessControlListConfiguration): Self = StObject.set(x, "AccessControlListConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAccessControlListConfigurationUndefined: Self = StObject.set(x, "AccessControlListConfiguration", js.undefined)
    
    inline def setBucketName(value: S3BucketName): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    inline def setDocumentsMetadataConfiguration(value: DocumentsMetadataConfiguration): Self = StObject.set(x, "DocumentsMetadataConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDocumentsMetadataConfigurationUndefined: Self = StObject.set(x, "DocumentsMetadataConfiguration", js.undefined)
    
    inline def setExclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "ExclusionPatterns", value.asInstanceOf[js.Any])
    
    inline def setExclusionPatternsUndefined: Self = StObject.set(x, "ExclusionPatterns", js.undefined)
    
    inline def setExclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "ExclusionPatterns", js.Array(value*))
    
    inline def setInclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "InclusionPatterns", value.asInstanceOf[js.Any])
    
    inline def setInclusionPatternsUndefined: Self = StObject.set(x, "InclusionPatterns", js.undefined)
    
    inline def setInclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "InclusionPatterns", js.Array(value*))
    
    inline def setInclusionPrefixes(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "InclusionPrefixes", value.asInstanceOf[js.Any])
    
    inline def setInclusionPrefixesUndefined: Self = StObject.set(x, "InclusionPrefixes", js.undefined)
    
    inline def setInclusionPrefixesVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "InclusionPrefixes", js.Array(value*))
  }
}
