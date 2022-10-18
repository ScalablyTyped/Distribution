package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityRecognizerEntityList extends StObject {
  
  /**
    * Specifies the Amazon S3 location where the entity list is located. The URI must be in the same region as the API endpoint that you are calling.
    */
  var S3Uri: typings.awsSdk.clientsComprehendMod.S3Uri
}
object EntityRecognizerEntityList {
  
  inline def apply(S3Uri: S3Uri): EntityRecognizerEntityList = {
    val __obj = js.Dynamic.literal(S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityRecognizerEntityList]
  }
  
  extension [Self <: EntityRecognizerEntityList](x: Self) {
    
    inline def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
  }
}
