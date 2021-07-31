package typings.amapJsApiDriving

import typings.amapJsApiDriving.AMap.Driving.SearchStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object amapJsApiDrivingStrings {
  
  @js.native
  sealed trait all extends StObject
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait base extends StObject
  @scala.inline
  def base: base = "base".asInstanceOf[base]
  
  @js.native
  sealed trait complete
    extends StObject
       with SearchStatus
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  
  @js.native
  sealed trait end extends StObject
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait error
    extends StObject
       with SearchStatus
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait no_data
    extends StObject
       with SearchStatus
  @scala.inline
  def no_data: no_data = "no_data".asInstanceOf[no_data]
  
  @js.native
  sealed trait start extends StObject
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait waypoint extends StObject
  @scala.inline
  def waypoint: waypoint = "waypoint".asInstanceOf[waypoint]
}
