package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAssociationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the destination.
    */
  var DestinationArn: AssociationEntityArn
  
  /**
    * The ARN of the source.
    */
  var SourceArn: AssociationEntityArn
}
object DeleteAssociationRequest {
  
  inline def apply(DestinationArn: AssociationEntityArn, SourceArn: AssociationEntityArn): DeleteAssociationRequest = {
    val __obj = js.Dynamic.literal(DestinationArn = DestinationArn.asInstanceOf[js.Any], SourceArn = SourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAssociationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAssociationRequest] (val x: Self) extends AnyVal {
    
    inline def setDestinationArn(value: AssociationEntityArn): Self = StObject.set(x, "DestinationArn", value.asInstanceOf[js.Any])
    
    inline def setSourceArn(value: AssociationEntityArn): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
  }
}
