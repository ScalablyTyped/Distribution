package typings.amapJsApiPlaceSearch.anon

import typings.amapJsApi.AMap.Marker
import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.SelectChangeEventData
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListElements extends StObject {
  
  var listElements: js.Array[HTMLElement]
  
  var markers: js.Array[Marker[Any]]
  
  var result: js.Array[SelectChangeEventData]
}
object ListElements {
  
  inline def apply(
    listElements: js.Array[HTMLElement],
    markers: js.Array[Marker[Any]],
    result: js.Array[SelectChangeEventData]
  ): ListElements = {
    val __obj = js.Dynamic.literal(listElements = listElements.asInstanceOf[js.Any], markers = markers.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListElements]
  }
  
  extension [Self <: ListElements](x: Self) {
    
    inline def setListElements(value: js.Array[HTMLElement]): Self = StObject.set(x, "listElements", value.asInstanceOf[js.Any])
    
    inline def setListElementsVarargs(value: HTMLElement*): Self = StObject.set(x, "listElements", js.Array(value*))
    
    inline def setMarkers(value: js.Array[Marker[Any]]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    inline def setMarkersVarargs(value: Marker[Any]*): Self = StObject.set(x, "markers", js.Array(value*))
    
    inline def setResult(value: js.Array[SelectChangeEventData]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultVarargs(value: SelectChangeEventData*): Self = StObject.set(x, "result", js.Array(value*))
  }
}
