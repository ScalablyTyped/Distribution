package typings.amapJsApiGeolocation

import typings.amapJsApiGeolocation.AMap.Geolocation.ButtonPosition
import typings.amapJsApiGeolocation.AMap.Geolocation.LocationType
import typings.amapJsApiGeolocation.AMap.Geolocation.SearchStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object amapJsApiGeolocationStrings {
  
  @js.native
  sealed trait LB extends ButtonPosition
  @scala.inline
  def LB: LB = "LB".asInstanceOf[LB]
  
  @js.native
  sealed trait LT extends ButtonPosition
  @scala.inline
  def LT: LT = "LT".asInstanceOf[LT]
  
  @js.native
  sealed trait RB extends ButtonPosition
  @scala.inline
  def RB: RB = "RB".asInstanceOf[RB]
  
  @js.native
  sealed trait RT extends ButtonPosition
  @scala.inline
  def RT: RT = "RT".asInstanceOf[RT]
  
  @js.native
  sealed trait all extends StObject
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait base extends StObject
  @scala.inline
  def base: base = "base".asInstanceOf[base]
  
  @js.native
  sealed trait complete extends SearchStatus
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  
  @js.native
  sealed trait error extends SearchStatus
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait html5 extends LocationType
  @scala.inline
  def html5: html5 = "html5".asInstanceOf[html5]
  
  @js.native
  sealed trait ip extends LocationType
  @scala.inline
  def ip: ip = "ip".asInstanceOf[ip]
  
  @js.native
  sealed trait sdk extends LocationType
  @scala.inline
  def sdk: sdk = "sdk".asInstanceOf[sdk]
}
