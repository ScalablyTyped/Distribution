package typings.activexAccess.Access

import typings.activexDao.DAO.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessProperty extends StObject {
  
  /* private */ @JSName("Access._AccessProperty_typekey")
  var AccessDot_AccessProperty_typekey: AccessProperty
  
  val Application: typings.activexAccess.Access.Application
  
  val Category: Double
  
  val Inherited: Boolean
  
  def IsMemberSafe(dispid: Double): Boolean
  
  var Name: String
  
  val Parent: Any
  
  def Properties(Item: String): Property
  def Properties(Item: Double): Property
  @JSName("Properties")
  val Properties_Original: typings.activexDao.DAO.Properties
  
  var Type: Double
  
  var Value: Any
}
object AccessProperty {
  
  inline def apply(
    AccessDot_AccessProperty_typekey: AccessProperty,
    Application: Application,
    Category: Double,
    Inherited: Boolean,
    IsMemberSafe: Double => Boolean,
    Name: String,
    Parent: Any,
    Properties: typings.activexDao.DAO.Properties,
    Type: Double,
    Value: Any
  ): AccessProperty = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Category = Category.asInstanceOf[js.Any], Inherited = Inherited.asInstanceOf[js.Any], IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Access._AccessProperty_typekey")(AccessDot_AccessProperty_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessProperty] (val x: Self) extends AnyVal {
    
    inline def setAccessDot_AccessProperty_typekey(value: AccessProperty): Self = StObject.set(x, "Access._AccessProperty_typekey", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCategory(value: Double): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setInherited(value: Boolean): Self = StObject.set(x, "Inherited", value.asInstanceOf[js.Any])
    
    inline def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: typings.activexDao.DAO.Properties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
