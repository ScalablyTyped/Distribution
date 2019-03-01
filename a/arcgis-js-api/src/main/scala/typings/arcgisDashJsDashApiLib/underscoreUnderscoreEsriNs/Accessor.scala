package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.Accessor")
@js.native
class Accessor () extends js.Object {
  def this(obj: js.Any) = this()
  var declaredClass: java.lang.String = js.native
  var destroyed: scala.Boolean = js.native
  var initialized: scala.Boolean = js.native
  /* protected */ def _get(propertyName: java.lang.String): js.Any = js.native
  @JSName("_get")
  /* protected */ def _get_TT[T](propertyName: java.lang.String): T = js.native
  /* protected */ def _set[T](propertyName: java.lang.String, value: T): this.type = js.native
  def destroy(): scala.Unit = js.native
  def get(propertyName: java.lang.String): js.Any = js.native
  @JSName("get")
  def get_TT[T](propertyName: java.lang.String): T = js.native
  /* protected */ def notifyChange(propertyName: java.lang.String): scala.Unit = js.native
  def set(props: arcgisDashJsDashApiLib.HashMap[_]): this.type = js.native
  def set[T](propertyName: java.lang.String, value: T): this.type = js.native
  def watch(path: java.lang.String, callback: WatchCallback): WatchHandle = js.native
  def watch(path: java.lang.String, callback: WatchCallback, sync: scala.Boolean): WatchHandle = js.native
  def watch(path: js.Array[java.lang.String], callback: WatchCallback): WatchHandle = js.native
  def watch(path: js.Array[java.lang.String], callback: WatchCallback, sync: scala.Boolean): WatchHandle = js.native
}

