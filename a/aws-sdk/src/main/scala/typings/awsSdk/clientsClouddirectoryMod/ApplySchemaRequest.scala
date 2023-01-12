package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplySchemaRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory into which the schema is copied. For more information, see arns.
    */
  var DirectoryArn: Arn
  
  /**
    * Published schema Amazon Resource Name (ARN) that needs to be copied. For more information, see arns.
    */
  var PublishedSchemaArn: Arn
}
object ApplySchemaRequest {
  
  inline def apply(DirectoryArn: Arn, PublishedSchemaArn: Arn): ApplySchemaRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], PublishedSchemaArn = PublishedSchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplySchemaRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplySchemaRequest] (val x: Self) extends AnyVal {
    
    inline def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
    inline def setPublishedSchemaArn(value: Arn): Self = StObject.set(x, "PublishedSchemaArn", value.asInstanceOf[js.Any])
  }
}
