package typings.activexDao.DAO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  /* private */ @JSName("DAO.Error_typekey")
  var DAODotError_typekey: Error
  
  val Description: String
  
  val HelpContext: Double
  
  val HelpFile: String
  
  val Number: Double
  
  val Source: String
}
object Error {
  
  inline def apply(
    DAODotError_typekey: Error,
    Description: String,
    HelpContext: Double,
    HelpFile: String,
    Number: Double,
    Source: String
  ): Error = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], HelpContext = HelpContext.asInstanceOf[js.Any], HelpFile = HelpFile.asInstanceOf[js.Any], Number = Number.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.Error_typekey")(DAODotError_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    inline def setDAODotError_typekey(value: Error): Self = StObject.set(x, "DAO.Error_typekey", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setHelpContext(value: Double): Self = StObject.set(x, "HelpContext", value.asInstanceOf[js.Any])
    
    inline def setHelpFile(value: String): Self = StObject.set(x, "HelpFile", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "Number", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
  }
}
