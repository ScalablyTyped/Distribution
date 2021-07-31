package typings.amapJsApiPlaceSearch

import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.SearchStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object amapJsApiPlaceSearchStrings {
  
  @js.native
  sealed trait default extends StObject
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait CINEMA extends StObject
  @scala.inline
  def CINEMA: CINEMA = "CINEMA".asInstanceOf[CINEMA]
  
  @js.native
  sealed trait DINING extends StObject
  @scala.inline
  def DINING: DINING = "DINING".asInstanceOf[DINING]
  
  @js.native
  sealed trait HOTEL extends StObject
  @scala.inline
  def HOTEL: HOTEL = "HOTEL".asInstanceOf[HOTEL]
  
  @js.native
  sealed trait SCENIC extends StObject
  @scala.inline
  def SCENIC: SCENIC = "SCENIC".asInstanceOf[SCENIC]
  
  @js.native
  sealed trait all extends StObject
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait base extends StObject
  @scala.inline
  def base: base = "base".asInstanceOf[base]
  
  @js.native
  sealed trait click extends StObject
  @scala.inline
  def click: click = "click".asInstanceOf[click]
  
  @js.native
  sealed trait complete
    extends StObject
       with SearchStatus
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  
  @js.native
  sealed trait error
    extends StObject
       with SearchStatus
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait infoWindowClick extends StObject
  @scala.inline
  def infoWindowClick: infoWindowClick = "infoWindowClick".asInstanceOf[infoWindowClick]
  
  @js.native
  sealed trait listElementClick extends StObject
  @scala.inline
  def listElementClick: listElementClick = "listElementClick".asInstanceOf[listElementClick]
  
  @js.native
  sealed trait listElementDetroyed extends StObject
  @scala.inline
  def listElementDetroyed: listElementDetroyed = "listElementDetroyed".asInstanceOf[listElementDetroyed]
  
  @js.native
  sealed trait markerClick extends StObject
  @scala.inline
  def markerClick: markerClick = "markerClick".asInstanceOf[markerClick]
  
  @js.native
  sealed trait markerDestoryed extends StObject
  @scala.inline
  def markerDestoryed: markerDestoryed = "markerDestoryed".asInstanceOf[markerDestoryed]
  
  @js.native
  sealed trait newpc extends StObject
  @scala.inline
  def newpc: newpc = "newpc".asInstanceOf[newpc]
  
  @js.native
  sealed trait no_data
    extends StObject
       with SearchStatus
  @scala.inline
  def no_data: no_data = "no_data".asInstanceOf[no_data]
  
  @js.native
  sealed trait renderComplete extends StObject
  @scala.inline
  def renderComplete: renderComplete = "renderComplete".asInstanceOf[renderComplete]
  
  @js.native
  sealed trait selectChanged extends StObject
  @scala.inline
  def selectChanged: selectChanged = "selectChanged".asInstanceOf[selectChanged]
  
  @js.native
  sealed trait willClear extends StObject
  @scala.inline
  def willClear: willClear = "willClear".asInstanceOf[willClear]
}
