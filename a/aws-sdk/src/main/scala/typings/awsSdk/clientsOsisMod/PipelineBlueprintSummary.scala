package typings.awsSdk.clientsOsisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelineBlueprintSummary extends StObject {
  
  /**
    * The name of the blueprint.
    */
  var BlueprintName: js.UndefOr[String] = js.undefined
}
object PipelineBlueprintSummary {
  
  inline def apply(): PipelineBlueprintSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineBlueprintSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PipelineBlueprintSummary] (val x: Self) extends AnyVal {
    
    inline def setBlueprintName(value: String): Self = StObject.set(x, "BlueprintName", value.asInstanceOf[js.Any])
    
    inline def setBlueprintNameUndefined: Self = StObject.set(x, "BlueprintName", js.undefined)
  }
}
