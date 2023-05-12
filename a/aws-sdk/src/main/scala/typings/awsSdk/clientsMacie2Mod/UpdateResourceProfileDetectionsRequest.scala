package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResourceProfileDetectionsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the S3 bucket that the request applies to.
    */
  var resourceArn: string
  
  /**
    * An array of objects, one for each custom data identifier or managed data identifier that detected the type of sensitive data to start excluding or including in the bucket's score. To start including all sensitive data types in the score, don't specify any values for this array.
    */
  var suppressDataIdentifiers: js.UndefOr[listOfSuppressDataIdentifier] = js.undefined
}
object UpdateResourceProfileDetectionsRequest {
  
  inline def apply(resourceArn: string): UpdateResourceProfileDetectionsRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResourceProfileDetectionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateResourceProfileDetectionsRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: string): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setSuppressDataIdentifiers(value: listOfSuppressDataIdentifier): Self = StObject.set(x, "suppressDataIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setSuppressDataIdentifiersUndefined: Self = StObject.set(x, "suppressDataIdentifiers", js.undefined)
    
    inline def setSuppressDataIdentifiersVarargs(value: SuppressDataIdentifier*): Self = StObject.set(x, "suppressDataIdentifiers", js.Array(value*))
  }
}
