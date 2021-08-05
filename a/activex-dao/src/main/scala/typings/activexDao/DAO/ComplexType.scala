package typings.activexDao.DAO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComplexType extends StObject {
  
  /* private */ @JSName("DAO.ComplexType_typekey")
  var DAODotComplexType_typekey: ComplexType
  
  def Fields(Item: String): Field
  def Fields(Item: Double): Field
  @JSName("Fields")
  val Fields_Original: Fields
}
object ComplexType {
  
  inline def apply(DAODotComplexType_typekey: ComplexType, Fields: Fields): ComplexType = {
    val __obj = js.Dynamic.literal(Fields = Fields.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.ComplexType_typekey")(DAODotComplexType_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplexType]
  }
  
  extension [Self <: ComplexType](x: Self) {
    
    inline def setDAODotComplexType_typekey(value: ComplexType): Self = StObject.set(x, "DAO.ComplexType_typekey", value.asInstanceOf[js.Any])
    
    inline def setFields(value: Fields): Self = StObject.set(x, "Fields", value.asInstanceOf[js.Any])
  }
}
