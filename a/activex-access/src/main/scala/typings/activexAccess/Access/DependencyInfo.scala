package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DependencyInfo extends StObject {
  
  @JSName("Access.DependencyInfo_typekey")
  var AccessDotDependencyInfo_typekey: DependencyInfo = js.native
  
  def Dependants(Index: String): AccessObject = js.native
  def Dependants(Index: Double): AccessObject = js.native
  @JSName("Dependants")
  val Dependants_Original: DependencyObjects = js.native
  
  def Dependencies(Index: String): AccessObject = js.native
  def Dependencies(Index: Double): AccessObject = js.native
  @JSName("Dependencies")
  val Dependencies_Original: DependencyObjects = js.native
  
  def InsufficientPermissions(Index: String): AccessObject = js.native
  def InsufficientPermissions(Index: Double): AccessObject = js.native
  @JSName("InsufficientPermissions")
  val InsufficientPermissions_Original: DependencyObjects = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  def OutOfDateObjects(Index: String): AccessObject = js.native
  def OutOfDateObjects(Index: Double): AccessObject = js.native
  @JSName("OutOfDateObjects")
  val OutOfDateObjects_Original: DependencyObjects = js.native
  
  val Parent: js.Any = js.native
  
  def UnsupportedObjects(Index: String): AccessObject = js.native
  def UnsupportedObjects(Index: Double): AccessObject = js.native
  @JSName("UnsupportedObjects")
  val UnsupportedObjects_Original: DependencyObjects = js.native
}
