package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Evented extends StObject {
  
  /**
  		 * Emits an event on the instance.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Evented.html#emit)
  		 */
  def emit(`type`: String): Boolean = js.native
  def emit(`type`: String, event: Any): Boolean = js.native
  
  /**
  		 * Indicates whether there is an event listener on the instance that matches the provided event name.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Evented.html#hasEventListener)
  		 */
  def hasEventListener(`type`: String): Boolean = js.native
  
  /**
  		 * Registers an event handler on the instance.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Evented.html#on)
  		 */
  def on(`type`: String, listener: EventHandler): IHandle = js.native
  def on(`type`: js.Array[String], listener: EventHandler): IHandle = js.native
}
