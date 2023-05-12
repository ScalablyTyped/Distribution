package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVectorEnrichmentJobInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Vector Enrichment job being deleted.
    */
  var Arn: VectorEnrichmentJobArn
}
object DeleteVectorEnrichmentJobInput {
  
  inline def apply(Arn: VectorEnrichmentJobArn): DeleteVectorEnrichmentJobInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVectorEnrichmentJobInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteVectorEnrichmentJobInput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: VectorEnrichmentJobArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
