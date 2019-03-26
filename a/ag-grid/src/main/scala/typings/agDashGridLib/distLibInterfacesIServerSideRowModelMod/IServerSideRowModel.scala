package typings
package agDashGridLib.distLibInterfacesIServerSideRowModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IServerSideRowModel
  extends agDashGridLib.distLibInterfacesIRowModelMod.IRowModel {
  def addToCache(route: js.Array[java.lang.String], items: js.Array[_], index: scala.Double): scala.Unit = js.native
  def getBlockState(): js.Any = js.native
  def purgeCache(): scala.Unit = js.native
  def purgeCache(route: js.Array[java.lang.String]): scala.Unit = js.native
  def removeFromCache(route: js.Array[java.lang.String], items: js.Array[_]): scala.Unit = js.native
}

