package typings.activexAccess.Access

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessObject extends StObject {
  
  /* private */ @JSName("Access.AccessObject_typekey")
  var AccessDotAccessObject_typekey: AccessObject
  
  val Attributes: Double
  
  val CurrentView: AcCurrentView
  
  val DateCreated: VarDate
  
  val DateModified: VarDate
  
  var FullName: String
  
  def GetDependencyInfo(): DependencyInfo
  
  def IsDependentUpon(ObjectType: AcObjectType, ObjectName: String): Boolean
  
  val IsLoaded: Boolean
  
  def IsMemberSafe(dispid: Double): Boolean
  
  val IsWeb: Boolean
  
  val Name: String
  
  val Parent: Any
  
  def Properties(Index: String): AccessObjectProperty
  def Properties(Index: Double): AccessObjectProperty
  @JSName("Properties")
  val Properties_Original: AccessObjectProperties
  
  val Type: AcObjectType
  
  val _Name: String
}
object AccessObject {
  
  inline def apply(
    AccessDotAccessObject_typekey: AccessObject,
    Attributes: Double,
    CurrentView: AcCurrentView,
    DateCreated: VarDate,
    DateModified: VarDate,
    FullName: String,
    GetDependencyInfo: () => DependencyInfo,
    IsDependentUpon: (AcObjectType, String) => Boolean,
    IsLoaded: Boolean,
    IsMemberSafe: Double => Boolean,
    IsWeb: Boolean,
    Name: String,
    Parent: Any,
    Properties: AccessObjectProperties,
    Type: AcObjectType,
    _Name: String
  ): AccessObject = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], CurrentView = CurrentView.asInstanceOf[js.Any], DateCreated = DateCreated.asInstanceOf[js.Any], DateModified = DateModified.asInstanceOf[js.Any], FullName = FullName.asInstanceOf[js.Any], GetDependencyInfo = js.Any.fromFunction0(GetDependencyInfo), IsDependentUpon = js.Any.fromFunction2(IsDependentUpon), IsLoaded = IsLoaded.asInstanceOf[js.Any], IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), IsWeb = IsWeb.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], _Name = _Name.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.AccessObject_typekey")(AccessDotAccessObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessObject] (val x: Self) extends AnyVal {
    
    inline def setAccessDotAccessObject_typekey(value: AccessObject): Self = StObject.set(x, "Access.AccessObject_typekey", value.asInstanceOf[js.Any])
    
    inline def setAttributes(value: Double): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setCurrentView(value: AcCurrentView): Self = StObject.set(x, "CurrentView", value.asInstanceOf[js.Any])
    
    inline def setDateCreated(value: VarDate): Self = StObject.set(x, "DateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateModified(value: VarDate): Self = StObject.set(x, "DateModified", value.asInstanceOf[js.Any])
    
    inline def setFullName(value: String): Self = StObject.set(x, "FullName", value.asInstanceOf[js.Any])
    
    inline def setGetDependencyInfo(value: () => DependencyInfo): Self = StObject.set(x, "GetDependencyInfo", js.Any.fromFunction0(value))
    
    inline def setIsDependentUpon(value: (AcObjectType, String) => Boolean): Self = StObject.set(x, "IsDependentUpon", js.Any.fromFunction2(value))
    
    inline def setIsLoaded(value: Boolean): Self = StObject.set(x, "IsLoaded", value.asInstanceOf[js.Any])
    
    inline def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
    
    inline def setIsWeb(value: Boolean): Self = StObject.set(x, "IsWeb", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: AccessObjectProperties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setType(value: AcObjectType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def set_Name(value: String): Self = StObject.set(x, "_Name", value.asInstanceOf[js.Any])
  }
}
