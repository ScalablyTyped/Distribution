package typings.awsSdk.clientsCodegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Repository extends StObject {
  
  /**
    * The name of the S3 bucket used for associating a new S3 repository. It must begin with codeguru-reviewer-. 
    */
  var BucketName: S3BucketName
  
  /**
    * The name of the repository in the S3 bucket.
    */
  var Name: typings.awsSdk.clientsCodegurureviewerMod.Name
}
object S3Repository {
  
  inline def apply(BucketName: S3BucketName, Name: Name): S3Repository = {
    val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Repository]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3Repository] (val x: Self) extends AnyVal {
    
    inline def setBucketName(value: S3BucketName): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
