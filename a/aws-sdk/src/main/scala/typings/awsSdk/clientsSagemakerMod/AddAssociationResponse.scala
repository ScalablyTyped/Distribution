package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddAssociationResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the destination.
    */
  var DestinationArn: js.UndefOr[AssociationEntityArn] = js.undefined
  
  /**
    * The ARN of the source.
    */
  var SourceArn: js.UndefOr[AssociationEntityArn] = js.undefined
}
object AddAssociationResponse {
  
  inline def apply(): AddAssociationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddAssociationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddAssociationResponse] (val x: Self) extends AnyVal {
    
    inline def setDestinationArn(value: AssociationEntityArn): Self = StObject.set(x, "DestinationArn", value.asInstanceOf[js.Any])
    
    inline def setDestinationArnUndefined: Self = StObject.set(x, "DestinationArn", js.undefined)
    
    inline def setSourceArn(value: AssociationEntityArn): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    inline def setSourceArnUndefined: Self = StObject.set(x, "SourceArn", js.undefined)
  }
}
