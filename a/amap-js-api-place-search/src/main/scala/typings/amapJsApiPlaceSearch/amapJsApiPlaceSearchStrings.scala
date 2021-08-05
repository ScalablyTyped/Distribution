package typings.amapJsApiPlaceSearch

import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.SearchStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object amapJsApiPlaceSearchStrings {
  
  @js.native
  sealed trait default extends StObject
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait CINEMA extends StObject
  inline def CINEMA: CINEMA = "CINEMA".asInstanceOf[CINEMA]
  
  @js.native
  sealed trait DINING extends StObject
  inline def DINING: DINING = "DINING".asInstanceOf[DINING]
  
  @js.native
  sealed trait HOTEL extends StObject
  inline def HOTEL: HOTEL = "HOTEL".asInstanceOf[HOTEL]
  
  @js.native
  sealed trait SCENIC extends StObject
  inline def SCENIC: SCENIC = "SCENIC".asInstanceOf[SCENIC]
  
  @js.native
  sealed trait all extends StObject
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait base extends StObject
  inline def base: base = "base".asInstanceOf[base]
  
  @js.native
  sealed trait click extends StObject
  inline def click: click = "click".asInstanceOf[click]
  
  @js.native
  sealed trait complete
    extends StObject
       with SearchStatus
  inline def complete: complete = "complete".asInstanceOf[complete]
  
  @js.native
  sealed trait error
    extends StObject
       with SearchStatus
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait infoWindowClick extends StObject
  inline def infoWindowClick: infoWindowClick = "infoWindowClick".asInstanceOf[infoWindowClick]
  
  @js.native
  sealed trait listElementClick extends StObject
  inline def listElementClick: listElementClick = "listElementClick".asInstanceOf[listElementClick]
  
  @js.native
  sealed trait listElementDetroyed extends StObject
  inline def listElementDetroyed: listElementDetroyed = "listElementDetroyed".asInstanceOf[listElementDetroyed]
  
  @js.native
  sealed trait markerClick extends StObject
  inline def markerClick: markerClick = "markerClick".asInstanceOf[markerClick]
  
  @js.native
  sealed trait markerDestoryed extends StObject
  inline def markerDestoryed: markerDestoryed = "markerDestoryed".asInstanceOf[markerDestoryed]
  
  @js.native
  sealed trait newpc extends StObject
  inline def newpc: newpc = "newpc".asInstanceOf[newpc]
  
  @js.native
  sealed trait no_data
    extends StObject
       with SearchStatus
  inline def no_data: no_data = "no_data".asInstanceOf[no_data]
  
  @js.native
  sealed trait renderComplete extends StObject
  inline def renderComplete: renderComplete = "renderComplete".asInstanceOf[renderComplete]
  
  @js.native
  sealed trait selectChanged extends StObject
  inline def selectChanged: selectChanged = "selectChanged".asInstanceOf[selectChanged]
  
  @js.native
  sealed trait willClear extends StObject
  inline def willClear: willClear = "willClear".asInstanceOf[willClear]
}
