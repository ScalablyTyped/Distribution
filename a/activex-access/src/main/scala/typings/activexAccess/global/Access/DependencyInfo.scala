package typings.activexAccess.global.Access

import typings.activexAccess.Access.DependencyObjects
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Access.DependencyInfo")
@js.native
class DependencyInfo protected ()
  extends StObject
     with typings.activexAccess.Access.DependencyInfo {
  
  /* CompleteClass */
  @JSName("Access.DependencyInfo_typekey")
  var AccessDotDependencyInfo_typekey: typings.activexAccess.Access.DependencyInfo = js.native
  
  /* CompleteClass */
  override def Dependants(Index: String): typings.activexAccess.Access.AccessObject = js.native
  /* CompleteClass */
  override def Dependants(Index: Double): typings.activexAccess.Access.AccessObject = js.native
  /* CompleteClass */
  @JSName("Dependants")
  override val Dependants_Original: DependencyObjects = js.native
  
  /* CompleteClass */
  override def Dependencies(Index: String): typings.activexAccess.Access.AccessObject = js.native
  /* CompleteClass */
  override def Dependencies(Index: Double): typings.activexAccess.Access.AccessObject = js.native
  /* CompleteClass */
  @JSName("Dependencies")
  override val Dependencies_Original: DependencyObjects = js.native
  
  /* CompleteClass */
  override def InsufficientPermissions(Index: String): typings.activexAccess.Access.AccessObject = js.native
  /* CompleteClass */
  override def InsufficientPermissions(Index: Double): typings.activexAccess.Access.AccessObject = js.native
  /* CompleteClass */
  @JSName("InsufficientPermissions")
  override val InsufficientPermissions_Original: DependencyObjects = js.native
  
  /* CompleteClass */
  override def IsMemberSafe(dispid: Double): Boolean = js.native
  
  /* CompleteClass */
  override def OutOfDateObjects(Index: String): typings.activexAccess.Access.AccessObject = js.native
  /* CompleteClass */
  override def OutOfDateObjects(Index: Double): typings.activexAccess.Access.AccessObject = js.native
  /* CompleteClass */
  @JSName("OutOfDateObjects")
  override val OutOfDateObjects_Original: DependencyObjects = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override def UnsupportedObjects(Index: String): typings.activexAccess.Access.AccessObject = js.native
  /* CompleteClass */
  override def UnsupportedObjects(Index: Double): typings.activexAccess.Access.AccessObject = js.native
  /* CompleteClass */
  @JSName("UnsupportedObjects")
  override val UnsupportedObjects_Original: DependencyObjects = js.native
}
