package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociationSummary extends StObject {
  
  /**
    * The type of the association.
    */
  var AssociationType: js.UndefOr[AssociationEdgeType] = js.undefined
  
  var CreatedBy: js.UndefOr[UserContext] = js.undefined
  
  /**
    * When the association was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the destination.
    */
  var DestinationArn: js.UndefOr[AssociationEntityArn] = js.undefined
  
  /**
    * The name of the destination.
    */
  var DestinationName: js.UndefOr[ExperimentEntityName] = js.undefined
  
  /**
    * The destination type.
    */
  var DestinationType: js.UndefOr[String256] = js.undefined
  
  /**
    * The ARN of the source.
    */
  var SourceArn: js.UndefOr[AssociationEntityArn] = js.undefined
  
  /**
    * The name of the source.
    */
  var SourceName: js.UndefOr[ExperimentEntityName] = js.undefined
  
  /**
    * The source type.
    */
  var SourceType: js.UndefOr[String256] = js.undefined
}
object AssociationSummary {
  
  inline def apply(): AssociationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociationSummary] (val x: Self) extends AnyVal {
    
    inline def setAssociationType(value: AssociationEdgeType): Self = StObject.set(x, "AssociationType", value.asInstanceOf[js.Any])
    
    inline def setAssociationTypeUndefined: Self = StObject.set(x, "AssociationType", js.undefined)
    
    inline def setCreatedBy(value: UserContext): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDestinationArn(value: AssociationEntityArn): Self = StObject.set(x, "DestinationArn", value.asInstanceOf[js.Any])
    
    inline def setDestinationArnUndefined: Self = StObject.set(x, "DestinationArn", js.undefined)
    
    inline def setDestinationName(value: ExperimentEntityName): Self = StObject.set(x, "DestinationName", value.asInstanceOf[js.Any])
    
    inline def setDestinationNameUndefined: Self = StObject.set(x, "DestinationName", js.undefined)
    
    inline def setDestinationType(value: String256): Self = StObject.set(x, "DestinationType", value.asInstanceOf[js.Any])
    
    inline def setDestinationTypeUndefined: Self = StObject.set(x, "DestinationType", js.undefined)
    
    inline def setSourceArn(value: AssociationEntityArn): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    inline def setSourceArnUndefined: Self = StObject.set(x, "SourceArn", js.undefined)
    
    inline def setSourceName(value: ExperimentEntityName): Self = StObject.set(x, "SourceName", value.asInstanceOf[js.Any])
    
    inline def setSourceNameUndefined: Self = StObject.set(x, "SourceName", js.undefined)
    
    inline def setSourceType(value: String256): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
  }
}
