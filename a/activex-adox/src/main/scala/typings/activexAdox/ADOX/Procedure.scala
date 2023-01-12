package typings.activexAdox.ADOX

import typings.activexAdodb.ADODB.Command
import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Procedure extends StObject {
  
  /* private */ @JSName("ADOX.Procedure_typekey")
  var ADOXDotProcedure_typekey: Procedure
  
  var Command: typings.activexAdodb.ADODB.Command
  
  val DateCreated: VarDate | Null
  
  val DateModified: VarDate | Null
  
  val Name: String
}
object Procedure {
  
  inline def apply(ADOXDotProcedure_typekey: Procedure, Command: Command, Name: String): Procedure = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], DateCreated = null, DateModified = null)
    __obj.updateDynamic("ADOX.Procedure_typekey")(ADOXDotProcedure_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Procedure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Procedure] (val x: Self) extends AnyVal {
    
    inline def setADOXDotProcedure_typekey(value: Procedure): Self = StObject.set(x, "ADOX.Procedure_typekey", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: Command): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
    
    inline def setDateCreated(value: VarDate): Self = StObject.set(x, "DateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateCreatedNull: Self = StObject.set(x, "DateCreated", null)
    
    inline def setDateModified(value: VarDate): Self = StObject.set(x, "DateModified", value.asInstanceOf[js.Any])
    
    inline def setDateModifiedNull: Self = StObject.set(x, "DateModified", null)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
