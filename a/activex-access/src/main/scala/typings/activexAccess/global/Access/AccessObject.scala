package typings.activexAccess.global.Access

import typings.activexAccess.Access.AcCurrentView
import typings.activexAccess.Access.AcObjectType
import typings.activexAccess.Access.AccessObjectProperties
import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Access.AccessObject")
@js.native
/* private */ class AccessObject ()
  extends StObject
     with typings.activexAccess.Access.AccessObject {
  
  /* private */ /* CompleteClass */
  @JSName("Access.AccessObject_typekey")
  var AccessDotAccessObject_typekey: typings.activexAccess.Access.AccessObject = js.native
  
  /* CompleteClass */
  override val Attributes: Double = js.native
  
  /* CompleteClass */
  override val CurrentView: AcCurrentView = js.native
  
  /* CompleteClass */
  override val DateCreated: VarDate = js.native
  
  /* CompleteClass */
  override val DateModified: VarDate = js.native
  
  /* CompleteClass */
  var FullName: String = js.native
  
  /* CompleteClass */
  override def GetDependencyInfo(): typings.activexAccess.Access.DependencyInfo = js.native
  
  /* CompleteClass */
  override def IsDependentUpon(ObjectType: AcObjectType, ObjectName: String): Boolean = js.native
  
  /* CompleteClass */
  override val IsLoaded: Boolean = js.native
  
  /* CompleteClass */
  override def IsMemberSafe(dispid: Double): Boolean = js.native
  
  /* CompleteClass */
  override val IsWeb: Boolean = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override def Properties(Index: String): typings.activexAccess.Access.AccessObjectProperty = js.native
  /* CompleteClass */
  override def Properties(Index: Double): typings.activexAccess.Access.AccessObjectProperty = js.native
  /* CompleteClass */
  @JSName("Properties")
  override val Properties_Original: AccessObjectProperties = js.native
  
  /* CompleteClass */
  override val Type: AcObjectType = js.native
  
  /* CompleteClass */
  override val _Name: String = js.native
}
