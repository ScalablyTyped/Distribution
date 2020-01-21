package typings.amapJsApiGeolocation

import typings.amapJsApiGeolocation.AMap.Geolocation.ButtonPosition
import typings.amapJsApiGeolocation.AMap.Geolocation.LocationType
import typings.amapJsApiGeolocation.AMap.Geolocation.SearchStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object amapJsApiGeolocationStrings {
  @js.native
  sealed trait LB extends ButtonPosition
  
  @js.native
  sealed trait LT extends ButtonPosition
  
  @js.native
  sealed trait RB extends ButtonPosition
  
  @js.native
  sealed trait RT extends ButtonPosition
  
  @js.native
  sealed trait all extends js.Object
  
  @js.native
  sealed trait base extends js.Object
  
  @js.native
  sealed trait complete extends SearchStatus
  
  @js.native
  sealed trait error extends SearchStatus
  
  @js.native
  sealed trait html5 extends LocationType
  
  @js.native
  sealed trait ip extends LocationType
  
  @js.native
  sealed trait sdk extends LocationType
  
  @scala.inline
  def LB: LB = "LB".asInstanceOf[LB]
  @scala.inline
  def LT: LT = "LT".asInstanceOf[LT]
  @scala.inline
  def RB: RB = "RB".asInstanceOf[RB]
  @scala.inline
  def RT: RT = "RT".asInstanceOf[RT]
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def base: base = "base".asInstanceOf[base]
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def html5: html5 = "html5".asInstanceOf[html5]
  @scala.inline
  def ip: ip = "ip".asInstanceOf[ip]
  @scala.inline
  def sdk: sdk = "sdk".asInstanceOf[sdk]
}

