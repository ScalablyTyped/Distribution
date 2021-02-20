package typings.amapJsSdk.AMap

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvancedInfoWindow extends EventBindable {
  
  def close(): Unit = js.native
  
  def getContent(): String = js.native
  
  def getIsOpen(): Boolean = js.native
  
  def getPosition(): LngLat = js.native
  
  def open(map: Map, pos: LngLat): Unit = js.native
  
  def setContent(content: String): Unit = js.native
  def setContent(content: HTMLElement): Unit = js.native
  
  def setPosition(lnglat: LngLat): Unit = js.native
}
