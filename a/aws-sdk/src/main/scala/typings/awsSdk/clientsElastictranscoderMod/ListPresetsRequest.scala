package typings.awsSdk.clientsElastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPresetsRequest extends StObject {
  
  /**
    * To list presets in chronological order by the date and time that they were created, enter true. To list presets in reverse chronological order, enter false.
    */
  var Ascending: js.UndefOr[typings.awsSdk.clientsElastictranscoderMod.Ascending] = js.undefined
  
  /**
    * When Elastic Transcoder returns more than one page of results, use pageToken in subsequent GET requests to get each successive page of results. 
    */
  var PageToken: js.UndefOr[Id] = js.undefined
}
object ListPresetsRequest {
  
  inline def apply(): ListPresetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPresetsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPresetsRequest] (val x: Self) extends AnyVal {
    
    inline def setAscending(value: Ascending): Self = StObject.set(x, "Ascending", value.asInstanceOf[js.Any])
    
    inline def setAscendingUndefined: Self = StObject.set(x, "Ascending", js.undefined)
    
    inline def setPageToken(value: Id): Self = StObject.set(x, "PageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "PageToken", js.undefined)
  }
}
