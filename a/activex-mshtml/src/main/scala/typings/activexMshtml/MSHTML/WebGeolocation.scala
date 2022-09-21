package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGeolocation extends StObject {
  
  /* private */ @JSName("MSHTML.WebGeolocation_typekey")
  var MSHTMLDotWebGeolocation_typekey: WebGeolocation = js.native
  
  def clearWatch(watchId: Double): Unit = js.native
  
  def getCurrentPosition(successCallback: Any): Unit = js.native
  def getCurrentPosition(successCallback: Any, errorCallback: Any): Unit = js.native
  def getCurrentPosition(successCallback: Any, errorCallback: Any, options: Any): Unit = js.native
  def getCurrentPosition(successCallback: Any, errorCallback: Unit, options: Any): Unit = js.native
  
  def watchPosition(successCallback: Any): Double = js.native
  def watchPosition(successCallback: Any, errorCallback: Any): Double = js.native
  def watchPosition(successCallback: Any, errorCallback: Any, options: Any): Double = js.native
  def watchPosition(successCallback: Any, errorCallback: Unit, options: Any): Double = js.native
}
