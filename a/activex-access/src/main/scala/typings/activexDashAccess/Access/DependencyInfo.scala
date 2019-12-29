package typings.activexDashAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.DependencyInfo")
@js.native
class DependencyInfo protected () extends js.Object {
  @JSName("Access.DependencyInfo_typekey")
  var AccessDotDependencyInfo_typekey: DependencyInfo = js.native
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
  def Dependants(Index: String): AccessObject = js.native
  def Dependants(Index: Double): AccessObject = js.native
  def Dependencies(Index: String): AccessObject = js.native
  def Dependencies(Index: Double): AccessObject = js.native
  def InsufficientPermissions(Index: String): AccessObject = js.native
  def InsufficientPermissions(Index: Double): AccessObject = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
  def OutOfDateObjects(Index: String): AccessObject = js.native
  def OutOfDateObjects(Index: Double): AccessObject = js.native
  def UnsupportedObjects(Index: String): AccessObject = js.native
  def UnsupportedObjects(Index: Double): AccessObject = js.native
}

