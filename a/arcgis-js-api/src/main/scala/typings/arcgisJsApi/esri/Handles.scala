package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Handles extends StObject {
  
  def add(handles: js.Array[WatchHandle]): scala.Unit = js.native
  def add(handles: js.Array[WatchHandle], groupKey: Any): scala.Unit = js.native
  def add(handles: Collection[WatchHandle]): scala.Unit = js.native
  def add(handles: Collection[WatchHandle], groupKey: Any): scala.Unit = js.native
  /**
    * Adds a group of handles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Handles.html#add)
    */
  def add(handles: WatchHandle): scala.Unit = js.native
  def add(handles: WatchHandle, groupKey: Any): scala.Unit = js.native
  
  /**
    * Destroys the object, removing all the handles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Handles.html#destroy)
    */
  def destroy(): scala.Unit = js.native
  
  /**
    * Returns true if a group exists for the provided group key, false otherwise.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Handles.html#has)
    */
  def has(groupKey: Any): Boolean = js.native
  
  /**
    * Removes a group of handles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Handles.html#remove)
    */
  def remove(): scala.Unit = js.native
  def remove(groupKey: Any): scala.Unit = js.native
  
  /**
    * Removes all handles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Handles.html#removeAll)
    */
  def removeAll(): scala.Unit = js.native
}
