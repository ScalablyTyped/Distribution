package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FsxConfiguration extends StObject {
  
  /**
    * A list of regular expression patterns to exclude certain files in your Amazon FSx file system. Files that match the patterns are excluded from the index. Files that don't match the patterns are included in the index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the file isn't included in the index.
    */
  var ExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
  
  /**
    * A list of DataSourceToIndexFieldMapping objects that map Amazon FSx data source attributes or field names to Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Amazon FSx fields. For more information, see Mapping data source fields. The Amazon FSx data source field names must exist in your Amazon FSx custom metadata.
    */
  var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
  
  /**
    * The identifier of the Amazon FSx file system. You can find your file system ID on the file system dashboard in the Amazon FSx console. For information on how to create a file system in Amazon FSx console, using Windows File Server as an example, see Amazon FSx Getting started guide.
    */
  var FileSystemId: typings.awsSdk.clientsKendraMod.FileSystemId
  
  /**
    * The Amazon FSx file system type. Windows is currently the only supported type.
    */
  var FileSystemType: FsxFileSystemType
  
  /**
    * A list of regular expression patterns to include certain files in your Amazon FSx file system. Files that match the patterns are included in the index. Files that don't match the patterns are excluded from the index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the file isn't included in the index.
    */
  var InclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to connect to your Amazon FSx file system. Windows is currently the only supported type. The secret must contain a JSON structure with the following keys:   username—The Active Directory user name, along with the Domain Name System (DNS) domain name. For example, user@corp.example.com. The Active Directory user account must have read and mounting access to the Amazon FSx file system for Windows.   password—The password of the Active Directory user account with read and mounting access to the Amazon FSx Windows file system.  
    */
  var SecretArn: js.UndefOr[typings.awsSdk.clientsKendraMod.SecretArn] = js.undefined
  
  /**
    * Configuration information for an Amazon Virtual Private Cloud to connect to your Amazon FSx. Your Amazon FSx instance must reside inside your VPC.
    */
  var VpcConfiguration: DataSourceVpcConfiguration
}
object FsxConfiguration {
  
  inline def apply(
    FileSystemId: FileSystemId,
    FileSystemType: FsxFileSystemType,
    VpcConfiguration: DataSourceVpcConfiguration
  ): FsxConfiguration = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any], FileSystemType = FileSystemType.asInstanceOf[js.Any], VpcConfiguration = VpcConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[FsxConfiguration]
  }
  
  extension [Self <: FsxConfiguration](x: Self) {
    
    inline def setExclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "ExclusionPatterns", value.asInstanceOf[js.Any])
    
    inline def setExclusionPatternsUndefined: Self = StObject.set(x, "ExclusionPatterns", js.undefined)
    
    inline def setExclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "ExclusionPatterns", js.Array(value*))
    
    inline def setFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "FieldMappings", value.asInstanceOf[js.Any])
    
    inline def setFieldMappingsUndefined: Self = StObject.set(x, "FieldMappings", js.undefined)
    
    inline def setFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "FieldMappings", js.Array(value*))
    
    inline def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    inline def setFileSystemType(value: FsxFileSystemType): Self = StObject.set(x, "FileSystemType", value.asInstanceOf[js.Any])
    
    inline def setInclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "InclusionPatterns", value.asInstanceOf[js.Any])
    
    inline def setInclusionPatternsUndefined: Self = StObject.set(x, "InclusionPatterns", js.undefined)
    
    inline def setInclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "InclusionPatterns", js.Array(value*))
    
    inline def setSecretArn(value: SecretArn): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    inline def setSecretArnUndefined: Self = StObject.set(x, "SecretArn", js.undefined)
    
    inline def setVpcConfiguration(value: DataSourceVpcConfiguration): Self = StObject.set(x, "VpcConfiguration", value.asInstanceOf[js.Any])
  }
}
