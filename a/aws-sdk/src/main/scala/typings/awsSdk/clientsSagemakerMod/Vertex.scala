package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Vertex extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the lineage entity resource.
    */
  var Arn: js.UndefOr[AssociationEntityArn] = js.undefined
  
  /**
    * The type of resource of the lineage entity.
    */
  var LineageType: js.UndefOr[typings.awsSdk.clientsSagemakerMod.LineageType] = js.undefined
  
  /**
    * The type of the lineage entity resource. For example: DataSet, Model, Endpoint, etc...
    */
  var Type: js.UndefOr[String40] = js.undefined
}
object Vertex {
  
  inline def apply(): Vertex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Vertex]
  }
  
  extension [Self <: Vertex](x: Self) {
    
    inline def setArn(value: AssociationEntityArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setLineageType(value: LineageType): Self = StObject.set(x, "LineageType", value.asInstanceOf[js.Any])
    
    inline def setLineageTypeUndefined: Self = StObject.set(x, "LineageType", js.undefined)
    
    inline def setType(value: String40): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
