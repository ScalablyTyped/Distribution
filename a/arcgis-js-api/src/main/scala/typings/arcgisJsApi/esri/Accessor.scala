package typings.arcgisJsApi.esri

import typings.arcgisJsApi.GroupKey
import typings.arcgisJsApi.HashMap
import typings.arcgisJsApi.IHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accessor extends StObject {
  
  /* protected */ def _get(propertyName: String): Any = js.native
  /* protected */ @JSName("_get")
  def _get_T_T[T](propertyName: String): T = js.native
  
  /* protected */ def _set[T](propertyName: String, value: T): this.type = js.native
  
  def addHandles[T](handles: js.Array[IHandle]): scala.Unit = js.native
  def addHandles[T](handles: js.Array[IHandle], groupKey: GroupKey[T]): scala.Unit = js.native
  def addHandles[T](handles: IHandle): scala.Unit = js.native
  def addHandles[T](handles: IHandle, groupKey: GroupKey[T]): scala.Unit = js.native
  
  var declaredClass: String = js.native
  
  def destroy(): scala.Unit = js.native
  
  var destroyed: Boolean = js.native
  
  def get(propertyName: String): Any = js.native
  @JSName("get")
  def get_T_T[T](propertyName: String): T = js.native
  
  def hasHandles[T](): Boolean = js.native
  def hasHandles[T](groupKey: GroupKey[T]): Boolean = js.native
  
  var initialized: Boolean = js.native
  
  /* protected */ def notifyChange(propertyName: String): scala.Unit = js.native
  
  def own(handles: js.Array[IHandle]): scala.Unit = js.native
  /**
  		 * @deprecated Since 4.25. Use addHandles(), removeHandles() and hasHandles() instead.
  		 */
  def own(handles: IHandle): scala.Unit = js.native
  
  def removeHandles[T](): scala.Unit = js.native
  def removeHandles[T](groupKey: GroupKey[T]): scala.Unit = js.native
  
  def set(props: HashMap[Any]): this.type = js.native
  def set[T](propertyName: String, value: T): this.type = js.native
  
  def watch(path: String, callback: WatchCallback): WatchHandle = js.native
  def watch(path: String, callback: WatchCallback, sync: Boolean): WatchHandle = js.native
  def watch(path: js.Array[String], callback: WatchCallback): WatchHandle = js.native
  def watch(path: js.Array[String], callback: WatchCallback, sync: Boolean): WatchHandle = js.native
}
