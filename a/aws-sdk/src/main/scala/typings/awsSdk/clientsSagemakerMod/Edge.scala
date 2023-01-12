package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Edge extends StObject {
  
  /**
    * The type of the Association(Edge) between the source and destination. For example ContributedTo, Produced, or DerivedFrom.
    */
  var AssociationType: js.UndefOr[AssociationEdgeType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the destination lineage entity of the directed edge.
    */
  var DestinationArn: js.UndefOr[AssociationEntityArn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the source lineage entity of the directed edge.
    */
  var SourceArn: js.UndefOr[AssociationEntityArn] = js.undefined
}
object Edge {
  
  inline def apply(): Edge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Edge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Edge] (val x: Self) extends AnyVal {
    
    inline def setAssociationType(value: AssociationEdgeType): Self = StObject.set(x, "AssociationType", value.asInstanceOf[js.Any])
    
    inline def setAssociationTypeUndefined: Self = StObject.set(x, "AssociationType", js.undefined)
    
    inline def setDestinationArn(value: AssociationEntityArn): Self = StObject.set(x, "DestinationArn", value.asInstanceOf[js.Any])
    
    inline def setDestinationArnUndefined: Self = StObject.set(x, "DestinationArn", js.undefined)
    
    inline def setSourceArn(value: AssociationEntityArn): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    inline def setSourceArnUndefined: Self = StObject.set(x, "SourceArn", js.undefined)
  }
}
