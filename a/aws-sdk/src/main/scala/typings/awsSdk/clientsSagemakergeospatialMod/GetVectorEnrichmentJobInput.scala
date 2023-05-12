package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVectorEnrichmentJobInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Vector Enrichment job.
    */
  var Arn: VectorEnrichmentJobArn
}
object GetVectorEnrichmentJobInput {
  
  inline def apply(Arn: VectorEnrichmentJobArn): GetVectorEnrichmentJobInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVectorEnrichmentJobInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetVectorEnrichmentJobInput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: VectorEnrichmentJobArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
