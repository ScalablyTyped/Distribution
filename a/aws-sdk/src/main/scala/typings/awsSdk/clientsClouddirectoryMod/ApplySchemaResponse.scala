package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplySchemaResponse extends StObject {
  
  /**
    * The applied schema ARN that is associated with the copied schema in the Directory. You can use this ARN to describe the schema information applied on this directory. For more information, see arns.
    */
  var AppliedSchemaArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ARN that is associated with the Directory. For more information, see arns.
    */
  var DirectoryArn: js.UndefOr[Arn] = js.undefined
}
object ApplySchemaResponse {
  
  inline def apply(): ApplySchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplySchemaResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplySchemaResponse] (val x: Self) extends AnyVal {
    
    inline def setAppliedSchemaArn(value: Arn): Self = StObject.set(x, "AppliedSchemaArn", value.asInstanceOf[js.Any])
    
    inline def setAppliedSchemaArnUndefined: Self = StObject.set(x, "AppliedSchemaArn", js.undefined)
    
    inline def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
    inline def setDirectoryArnUndefined: Self = StObject.set(x, "DirectoryArn", js.undefined)
  }
}
