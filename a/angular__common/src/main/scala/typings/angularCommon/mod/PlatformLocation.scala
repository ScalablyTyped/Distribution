package typings.angularCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "PlatformLocation")
@js.native
abstract class PlatformLocation () extends StObject {
  
  def back(): Unit = js.native
  
  def forward(): Unit = js.native
  
  def getBaseHrefFromDOM(): String = js.native
  
  def getState(): js.Any = js.native
  
  def hash: String = js.native
  
  def hostname: String = js.native
  
  def href: String = js.native
  
  def onHashChange(fn: LocationChangeListener): Unit = js.native
  
  def onPopState(fn: LocationChangeListener): Unit = js.native
  
  def pathname: String = js.native
  
  def port: String = js.native
  
  def protocol: String = js.native
  
  def pushState(state: js.Any, title: String, url: String): Unit = js.native
  
  def replaceState(state: js.Any, title: String, url: String): Unit = js.native
  
  def search: String = js.native
}
