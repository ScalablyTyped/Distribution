package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.AccessObject")
@js.native
class AccessObject protected () extends js.Object {
  var `Access.AccessObject_typekey`: AccessObject = js.native
  val Attributes: scala.Double = js.native
  val CurrentView: AcCurrentView = js.native
  val DateCreated: stdLib.VarDate = js.native
  val DateModified: stdLib.VarDate = js.native
  var FullName: java.lang.String = js.native
  val IsLoaded: scala.Boolean = js.native
  val IsWeb: scala.Boolean = js.native
  val Name: java.lang.String = js.native
  val Parent: js.Any = js.native
  @JSName("Properties")
  val Properties_Original: AccessObjectProperties = js.native
  val Type: AcObjectType = js.native
  val _Name: java.lang.String = js.native
  def GetDependencyInfo(): DependencyInfo = js.native
  def IsDependentUpon(ObjectType: AcObjectType, ObjectName: java.lang.String): scala.Boolean = js.native
  def IsMemberSafe(dispid: scala.Double): scala.Boolean = js.native
  def Properties(Index: java.lang.String): AccessObjectProperty = js.native
  def Properties(Index: scala.Double): AccessObjectProperty = js.native
}

