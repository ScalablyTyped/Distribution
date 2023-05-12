package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputNotebookS3LocationFromInput extends StObject {
  
  /**
    * The Amazon S3 bucket that stores the notebook execution output.
    */
  var Bucket: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The key to the Amazon S3 location that stores the notebook execution output.
    */
  var Key: js.UndefOr[UriString] = js.undefined
}
object OutputNotebookS3LocationFromInput {
  
  inline def apply(): OutputNotebookS3LocationFromInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputNotebookS3LocationFromInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutputNotebookS3LocationFromInput] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: XmlStringMaxLen256): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "Bucket", js.undefined)
    
    inline def setKey(value: UriString): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
  }
}
