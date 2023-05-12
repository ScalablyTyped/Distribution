package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopVectorEnrichmentJobInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Vector Enrichment job.
    */
  var Arn: VectorEnrichmentJobArn
}
object StopVectorEnrichmentJobInput {
  
  inline def apply(Arn: VectorEnrichmentJobArn): StopVectorEnrichmentJobInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopVectorEnrichmentJobInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopVectorEnrichmentJobInput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: VectorEnrichmentJobArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
