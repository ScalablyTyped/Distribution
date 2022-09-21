package typings.activexDao.DAO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameter extends StObject {
  
  /* private */ @JSName("DAO.Parameter_typekey")
  var DAODotParameter_typekey: Parameter
  
  var Direction: Double
  
  val Name: String
  
  def Properties(Item: String): Property
  def Properties(Item: Double): Property
  @JSName("Properties")
  val Properties_Original: Properties
  
  var Type: Double
  
  var Value: Any
}
object Parameter {
  
  inline def apply(
    DAODotParameter_typekey: Parameter,
    Direction: Double,
    Name: String,
    Properties: Properties,
    Type: Double,
    Value: Any
  ): Parameter = {
    val __obj = js.Dynamic.literal(Direction = Direction.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.Parameter_typekey")(DAODotParameter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameter]
  }
  
  extension [Self <: Parameter](x: Self) {
    
    inline def setDAODotParameter_typekey(value: Parameter): Self = StObject.set(x, "DAO.Parameter_typekey", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: Double): Self = StObject.set(x, "Direction", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Properties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
