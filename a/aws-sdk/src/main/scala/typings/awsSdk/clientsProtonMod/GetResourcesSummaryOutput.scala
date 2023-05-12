package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourcesSummaryOutput extends StObject {
  
  /**
    * Summary counts of each Proton resource type.
    */
  var counts: CountsSummary
}
object GetResourcesSummaryOutput {
  
  inline def apply(counts: CountsSummary): GetResourcesSummaryOutput = {
    val __obj = js.Dynamic.literal(counts = counts.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourcesSummaryOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResourcesSummaryOutput] (val x: Self) extends AnyVal {
    
    inline def setCounts(value: CountsSummary): Self = StObject.set(x, "counts", value.asInstanceOf[js.Any])
  }
}
