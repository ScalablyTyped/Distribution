package typings.activexAdodb.ADODB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Error extends StObject {
  
  @JSName("ADODB.Error_typekey")
  var ADODBDotError_typekey: Error = js.native
  
  val Description: String = js.native
  
  val HelpContext: Double = js.native
  
  val HelpFile: String = js.native
  
  val NativeError: Double = js.native
  
  val Number: Double = js.native
  
  val SQLState: String = js.native
  
  val Source: String = js.native
}
object Error {
  
  @scala.inline
  def apply(
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
  implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setADODBDotError_typekey(value: Error): Self = StObject.set(x, "ADODB.Error_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpContext(value: Double): Self = StObject.set(x, "HelpContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpFile(value: String): Self = StObject.set(x, "HelpFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeError(value: Double): Self = StObject.set(x, "NativeError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "Number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSQLState(value: String): Self = StObject.set(x, "SQLState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
  }
}
