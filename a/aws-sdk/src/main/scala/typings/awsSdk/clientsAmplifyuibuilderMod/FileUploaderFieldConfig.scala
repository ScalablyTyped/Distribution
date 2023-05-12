package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileUploaderFieldConfig extends StObject {
  
  /**
    * The file types that are allowed to be uploaded by the file uploader. Provide this information in an array of strings specifying the valid file extensions.
    */
  var acceptedFileTypes: StrValues
  
  /**
    * The access level to assign to the uploaded files in the Amazon S3 bucket where they are stored. The valid values for this property are private, protected, or public. For detailed information about the permissions associated with each access level, see File access levels in the Amplify documentation.
    */
  var accessLevel: StorageAccessLevel
  
  /**
    * Allows the file upload operation to be paused and resumed. The default value is false. When isResumable is set to true, the file uploader uses a multipart upload to break the files into chunks before upload. The progress of the upload isn't continuous, because the file uploader uploads a chunk at a time.
    */
  var isResumable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the maximum number of files that can be selected to upload. The default value is an unlimited number of files.
    */
  var maxFileCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The maximum file size in bytes that the file uploader will accept. The default value is an unlimited file size.
    */
  var maxSize: js.UndefOr[Integer] = js.undefined
  
  /**
    * Specifies whether to display or hide the image preview after selecting a file for upload. The default value is true to display the image preview.
    */
  var showThumbnails: js.UndefOr[Boolean] = js.undefined
}
object FileUploaderFieldConfig {
  
  inline def apply(acceptedFileTypes: StrValues, accessLevel: StorageAccessLevel): FileUploaderFieldConfig = {
    val __obj = js.Dynamic.literal(acceptedFileTypes = acceptedFileTypes.asInstanceOf[js.Any], accessLevel = accessLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUploaderFieldConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileUploaderFieldConfig] (val x: Self) extends AnyVal {
    
    inline def setAcceptedFileTypes(value: StrValues): Self = StObject.set(x, "acceptedFileTypes", value.asInstanceOf[js.Any])
    
    inline def setAcceptedFileTypesVarargs(value: String*): Self = StObject.set(x, "acceptedFileTypes", js.Array(value*))
    
    inline def setAccessLevel(value: StorageAccessLevel): Self = StObject.set(x, "accessLevel", value.asInstanceOf[js.Any])
    
    inline def setIsResumable(value: Boolean): Self = StObject.set(x, "isResumable", value.asInstanceOf[js.Any])
    
    inline def setIsResumableUndefined: Self = StObject.set(x, "isResumable", js.undefined)
    
    inline def setMaxFileCount(value: Integer): Self = StObject.set(x, "maxFileCount", value.asInstanceOf[js.Any])
    
    inline def setMaxFileCountUndefined: Self = StObject.set(x, "maxFileCount", js.undefined)
    
    inline def setMaxSize(value: Integer): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    inline def setShowThumbnails(value: Boolean): Self = StObject.set(x, "showThumbnails", value.asInstanceOf[js.Any])
    
    inline def setShowThumbnailsUndefined: Self = StObject.set(x, "showThumbnails", js.undefined)
  }
}
