package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Handles extends Accessor {
  
  def add(handles: js.Array[WatchHandle]): Unit = js.native
  def add(handles: js.Array[WatchHandle], key: js.Any): Unit = js.native
  def add(handles: Collection[WatchHandle]): Unit = js.native
  def add(handles: Collection[WatchHandle], key: js.Any): Unit = js.native
  /**
    * Adds a group of handles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Handles.html#add)
    */
  def add(handles: WatchHandle): Unit = js.native
  def add(handles: WatchHandle, key: js.Any): Unit = js.native
  
  /**
    * Returns true if a group exists for the provided key, false otherwise.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Handles.html#has)
    */
  def has(key: js.Any): Boolean = js.native
  
  /**
    * Removes a group of handles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Handles.html#remove)
    */
  def remove(): Unit = js.native
  def remove(key: js.Any): Unit = js.native
  
  /**
    * Removes all handles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Handles.html#removeAll)
    */
  def removeAll(): Unit = js.native
}
