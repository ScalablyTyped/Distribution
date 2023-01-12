package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDriveConfiguration extends StObject {
  
  /**
    * A list of MIME types to exclude from the index. All documents matching the specified MIME type are excluded.  For a list of MIME types, see Using a Google Workspace Drive data source.
    */
  var ExcludeMimeTypes: js.UndefOr[ExcludeMimeTypesList] = js.undefined
  
  /**
    * A list of identifiers or shared drives to exclude from the index. All files and folders stored on the shared drive are excluded.
    */
  var ExcludeSharedDrives: js.UndefOr[ExcludeSharedDrivesList] = js.undefined
  
  /**
    * A list of email addresses of the users. Documents owned by these users are excluded from the index. Documents shared with excluded users are indexed unless they are excluded in another way.
    */
  var ExcludeUserAccounts: js.UndefOr[ExcludeUserAccountsList] = js.undefined
  
  /**
    * A list of regular expression patterns to exclude certain items in your Google Drive, including shared drives and users' My Drives. Items that match the patterns are excluded from the index. Items that don't match the patterns are included in the index. If an item matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the item isn't included in the index.
    */
  var ExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
  
  /**
    * Maps Google Drive data source attributes or field names to Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Google Drive fields. For more information, see Mapping data source fields. The Google Drive data source field names must exist in your Google Drive custom metadata.
    */
  var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
  
  /**
    * A list of regular expression patterns to include certain items in your Google Drive, including shared drives and users' My Drives. Items that match the patterns are included in the index. Items that don't match the patterns are excluded from the index. If an item matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the item isn't included in the index.
    */
  var InclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of a Secrets Managersecret that contains the credentials required to connect to Google Drive. For more information, see Using a Google Workspace Drive data source.
    */
  var SecretArn: typings.awsSdk.clientsKendraMod.SecretArn
}
object GoogleDriveConfiguration {
  
  inline def apply(SecretArn: SecretArn): GoogleDriveConfiguration = {
    val __obj = js.Dynamic.literal(SecretArn = SecretArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleDriveConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleDriveConfiguration] (val x: Self) extends AnyVal {
    
    inline def setExcludeMimeTypes(value: ExcludeMimeTypesList): Self = StObject.set(x, "ExcludeMimeTypes", value.asInstanceOf[js.Any])
    
    inline def setExcludeMimeTypesUndefined: Self = StObject.set(x, "ExcludeMimeTypes", js.undefined)
    
    inline def setExcludeMimeTypesVarargs(value: MimeType*): Self = StObject.set(x, "ExcludeMimeTypes", js.Array(value*))
    
    inline def setExcludeSharedDrives(value: ExcludeSharedDrivesList): Self = StObject.set(x, "ExcludeSharedDrives", value.asInstanceOf[js.Any])
    
    inline def setExcludeSharedDrivesUndefined: Self = StObject.set(x, "ExcludeSharedDrives", js.undefined)
    
    inline def setExcludeSharedDrivesVarargs(value: SharedDriveId*): Self = StObject.set(x, "ExcludeSharedDrives", js.Array(value*))
    
    inline def setExcludeUserAccounts(value: ExcludeUserAccountsList): Self = StObject.set(x, "ExcludeUserAccounts", value.asInstanceOf[js.Any])
    
    inline def setExcludeUserAccountsUndefined: Self = StObject.set(x, "ExcludeUserAccounts", js.undefined)
    
    inline def setExcludeUserAccountsVarargs(value: UserAccount*): Self = StObject.set(x, "ExcludeUserAccounts", js.Array(value*))
    
    inline def setExclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "ExclusionPatterns", value.asInstanceOf[js.Any])
    
    inline def setExclusionPatternsUndefined: Self = StObject.set(x, "ExclusionPatterns", js.undefined)
    
    inline def setExclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "ExclusionPatterns", js.Array(value*))
    
    inline def setFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "FieldMappings", value.asInstanceOf[js.Any])
    
    inline def setFieldMappingsUndefined: Self = StObject.set(x, "FieldMappings", js.undefined)
    
    inline def setFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "FieldMappings", js.Array(value*))
    
    inline def setInclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "InclusionPatterns", value.asInstanceOf[js.Any])
    
    inline def setInclusionPatternsUndefined: Self = StObject.set(x, "InclusionPatterns", js.undefined)
    
    inline def setInclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "InclusionPatterns", js.Array(value*))
    
    inline def setSecretArn(value: SecretArn): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
  }
}
