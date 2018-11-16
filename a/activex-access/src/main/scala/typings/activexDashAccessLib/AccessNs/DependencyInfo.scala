package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.DependencyInfo")
@js.native
class DependencyInfo protected () extends js.Object {
  var `Access.DependencyInfo_typekey`: DependencyInfo = js.native
  @JSName("Dependants")
  val Dependants_Original: DependencyObjects = js.native
  @JSName("Dependencies")
  val Dependencies_Original: DependencyObjects = js.native
  @JSName("InsufficientPermissions")
  val InsufficientPermissions_Original: DependencyObjects = js.native
  @JSName("OutOfDateObjects")
  val OutOfDateObjects_Original: DependencyObjects = js.native
  val Parent: js.Any = js.native
  @JSName("UnsupportedObjects")
  val UnsupportedObjects_Original: DependencyObjects = js.native
  def Dependants(Index: java.lang.String): AccessObject = js.native
  def Dependants(Index: scala.Double): AccessObject = js.native
  def Dependencies(Index: java.lang.String): AccessObject = js.native
  def Dependencies(Index: scala.Double): AccessObject = js.native
  def InsufficientPermissions(Index: java.lang.String): AccessObject = js.native
  def InsufficientPermissions(Index: scala.Double): AccessObject = js.native
  def IsMemberSafe(dispid: scala.Double): scala.Boolean = js.native
  def OutOfDateObjects(Index: java.lang.String): AccessObject = js.native
  def OutOfDateObjects(Index: scala.Double): AccessObject = js.native
  def UnsupportedObjects(Index: java.lang.String): AccessObject = js.native
  def UnsupportedObjects(Index: scala.Double): AccessObject = js.native
}

