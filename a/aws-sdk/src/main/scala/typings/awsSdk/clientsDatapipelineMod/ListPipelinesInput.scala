package typings.awsSdk.clientsDatapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPipelinesInput extends StObject {
  
  /**
    * The starting point for the results to be returned. For the first call, this value should be empty. As long as there are more results, continue to call ListPipelines with the marker value from the previous call to retrieve the next set of results.
    */
  var marker: js.UndefOr[String] = js.undefined
}
object ListPipelinesInput {
  
  inline def apply(): ListPipelinesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPipelinesInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPipelinesInput] (val x: Self) extends AnyVal {
    
    inline def setMarker(value: String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
  }
}
