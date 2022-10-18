package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDirectoryRequest extends StObject {
  
  /**
    * The name of the Directory. Should be unique per account, per region.
    */
  var Name: DirectoryName
  
  /**
    * The Amazon Resource Name (ARN) of the published schema that will be copied into the data Directory. For more information, see arns.
    */
  var SchemaArn: Arn
}
object CreateDirectoryRequest {
  
  inline def apply(Name: DirectoryName, SchemaArn: Arn): CreateDirectoryRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDirectoryRequest]
  }
  
  extension [Self <: CreateDirectoryRequest](x: Self) {
    
    inline def setName(value: DirectoryName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSchemaArn(value: Arn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
  }
}
