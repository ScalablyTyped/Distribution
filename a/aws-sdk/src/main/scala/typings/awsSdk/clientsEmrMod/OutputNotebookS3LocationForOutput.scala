package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputNotebookS3LocationForOutput extends StObject {
  
  /**
    * The Amazon S3 bucket that stores the notebook execution output.
    */
  var Bucket: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The key to the Amazon S3 location that stores the notebook execution output.
    */
  var Key: js.UndefOr[UriString] = js.undefined
}
object OutputNotebookS3LocationForOutput {
  
  inline def apply(): OutputNotebookS3LocationForOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputNotebookS3LocationForOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutputNotebookS3LocationForOutput] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: XmlStringMaxLen256): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "Bucket", js.undefined)
    
    inline def setKey(value: UriString): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
  }
}
