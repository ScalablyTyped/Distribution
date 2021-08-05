package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DependencyInfo extends StObject {
  
  /* private */ @JSName("Access.DependencyInfo_typekey")
  var AccessDotDependencyInfo_typekey: DependencyInfo
  
  def Dependants(Index: String): AccessObject
  def Dependants(Index: Double): AccessObject
  @JSName("Dependants")
  val Dependants_Original: DependencyObjects
  
  def Dependencies(Index: String): AccessObject
  def Dependencies(Index: Double): AccessObject
  @JSName("Dependencies")
  val Dependencies_Original: DependencyObjects
  
  def InsufficientPermissions(Index: String): AccessObject
  def InsufficientPermissions(Index: Double): AccessObject
  @JSName("InsufficientPermissions")
  val InsufficientPermissions_Original: DependencyObjects
  
  def IsMemberSafe(dispid: Double): Boolean
  
  def OutOfDateObjects(Index: String): AccessObject
  def OutOfDateObjects(Index: Double): AccessObject
  @JSName("OutOfDateObjects")
  val OutOfDateObjects_Original: DependencyObjects
  
  val Parent: js.Any
  
  def UnsupportedObjects(Index: String): AccessObject
  def UnsupportedObjects(Index: Double): AccessObject
  @JSName("UnsupportedObjects")
  val UnsupportedObjects_Original: DependencyObjects
}
object DependencyInfo {
  
  inline def apply(
    AccessDotDependencyInfo_typekey: DependencyInfo,
    Dependants: DependencyObjects,
    Dependencies: DependencyObjects,
    InsufficientPermissions: DependencyObjects,
    IsMemberSafe: Double => Boolean,
    OutOfDateObjects: DependencyObjects,
    Parent: js.Any,
    UnsupportedObjects: DependencyObjects
  ): DependencyInfo = {
    val __obj = js.Dynamic.literal(Dependants = Dependants.asInstanceOf[js.Any], Dependencies = Dependencies.asInstanceOf[js.Any], InsufficientPermissions = InsufficientPermissions.asInstanceOf[js.Any], IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), OutOfDateObjects = OutOfDateObjects.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], UnsupportedObjects = UnsupportedObjects.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.DependencyInfo_typekey")(AccessDotDependencyInfo_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyInfo]
  }
  
  extension [Self <: DependencyInfo](x: Self) {
    
    inline def setAccessDotDependencyInfo_typekey(value: DependencyInfo): Self = StObject.set(x, "Access.DependencyInfo_typekey", value.asInstanceOf[js.Any])
    
    inline def setDependants(value: DependencyObjects): Self = StObject.set(x, "Dependants", value.asInstanceOf[js.Any])
    
    inline def setDependencies(value: DependencyObjects): Self = StObject.set(x, "Dependencies", value.asInstanceOf[js.Any])
    
    inline def setInsufficientPermissions(value: DependencyObjects): Self = StObject.set(x, "InsufficientPermissions", value.asInstanceOf[js.Any])
    
    inline def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
    
    inline def setOutOfDateObjects(value: DependencyObjects): Self = StObject.set(x, "OutOfDateObjects", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setUnsupportedObjects(value: DependencyObjects): Self = StObject.set(x, "UnsupportedObjects", value.asInstanceOf[js.Any])
  }
}
