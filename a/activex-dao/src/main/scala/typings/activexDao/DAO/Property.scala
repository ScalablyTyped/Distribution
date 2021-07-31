package typings.activexDao.DAO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Property extends StObject {
  
  @JSName("DAO.Property_typekey")
  var DAODotProperty_typekey: Property
  
  val Inherited: Boolean
  
  var Name: String
  
  def Properties(Item: String): Property
  def Properties(Item: Double): Property
  @JSName("Properties")
  val Properties_Original: Properties
  
  var Type: Double
  
  var Value: js.Any
}
object Property {
  
  @scala.inline
  def apply(
    DAODotProperty_typekey: Property,
    Inherited: Boolean,
    Name: String,
    Properties: Properties,
    Type: Double,
    Value: js.Any
  ): Property = {
    val __obj = js.Dynamic.literal(Inherited = Inherited.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.Property_typekey")(DAODotProperty_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Property]
  }
  
  @scala.inline
  implicit class PropertyMutableBuilder[Self <: Property] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDAODotProperty_typekey(value: Property): Self = StObject.set(x, "DAO.Property_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInherited(value: Boolean): Self = StObject.set(x, "Inherited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: Properties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
