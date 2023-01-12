package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddAssociationRequest extends StObject {
  
  /**
    * The type of association. The following are suggested uses for each type. Amazon SageMaker places no restrictions on their use.   ContributedTo - The source contributed to the destination or had a part in enabling the destination. For example, the training data contributed to the training job.   AssociatedWith - The source is connected to the destination. For example, an approval workflow is associated with a model deployment.   DerivedFrom - The destination is a modification of the source. For example, a digest output of a channel input for a processing job is derived from the original inputs.   Produced - The source generated the destination. For example, a training job produced a model artifact.  
    */
  var AssociationType: js.UndefOr[AssociationEdgeType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the destination.
    */
  var DestinationArn: AssociationEntityArn
  
  /**
    * The ARN of the source.
    */
  var SourceArn: AssociationEntityArn
}
object AddAssociationRequest {
  
  inline def apply(DestinationArn: AssociationEntityArn, SourceArn: AssociationEntityArn): AddAssociationRequest = {
    val __obj = js.Dynamic.literal(DestinationArn = DestinationArn.asInstanceOf[js.Any], SourceArn = SourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddAssociationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddAssociationRequest] (val x: Self) extends AnyVal {
    
    inline def setAssociationType(value: AssociationEdgeType): Self = StObject.set(x, "AssociationType", value.asInstanceOf[js.Any])
    
    inline def setAssociationTypeUndefined: Self = StObject.set(x, "AssociationType", js.undefined)
    
    inline def setDestinationArn(value: AssociationEntityArn): Self = StObject.set(x, "DestinationArn", value.asInstanceOf[js.Any])
    
    inline def setSourceArn(value: AssociationEntityArn): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
  }
}
