package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishSchemaResponse extends StObject {
  
  /**
    * The ARN that is associated with the published schema. For more information, see arns.
    */
  var PublishedSchemaArn: js.UndefOr[Arn] = js.undefined
}
object PublishSchemaResponse {
  
  inline def apply(): PublishSchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishSchemaResponse]
  }
  
  extension [Self <: PublishSchemaResponse](x: Self) {
    
    inline def setPublishedSchemaArn(value: Arn): Self = StObject.set(x, "PublishedSchemaArn", value.asInstanceOf[js.Any])
    
    inline def setPublishedSchemaArnUndefined: Self = StObject.set(x, "PublishedSchemaArn", js.undefined)
  }
}
