package typings.activexAdodb.ADODB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  /* private */ @JSName("ADODB.Error_typekey")
  var ADODBDotError_typekey: Error
  
  val Description: String
  
  val HelpContext: Double
  
  val HelpFile: String
  
  val NativeError: Double
  
  val Number: Double
  
  val SQLState: String
  
  val Source: String
}
object Error {
  
  inline def apply(
    ADODBDotError_typekey: Error,
    Description: String,
    HelpContext: Double,
    HelpFile: String,
    NativeError: Double,
    Number: Double,
    SQLState: String,
    Source: String
  ): Error = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], HelpContext = HelpContext.asInstanceOf[js.Any], HelpFile = HelpFile.asInstanceOf[js.Any], NativeError = NativeError.asInstanceOf[js.Any], Number = Number.asInstanceOf[js.Any], SQLState = SQLState.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.updateDynamic("ADODB.Error_typekey")(ADODBDotError_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    inline def setADODBDotError_typekey(value: Error): Self = StObject.set(x, "ADODB.Error_typekey", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setHelpContext(value: Double): Self = StObject.set(x, "HelpContext", value.asInstanceOf[js.Any])
    
    inline def setHelpFile(value: String): Self = StObject.set(x, "HelpFile", value.asInstanceOf[js.Any])
    
    inline def setNativeError(value: Double): Self = StObject.set(x, "NativeError", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "Number", value.asInstanceOf[js.Any])
    
    inline def setSQLState(value: String): Self = StObject.set(x, "SQLState", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
  }
}
