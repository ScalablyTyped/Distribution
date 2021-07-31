package typings.activexAdox.ADOX

import typings.activexAdodb.ADODB.Command
import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait View extends StObject {
  
  @JSName("ADOX.View_typekey")
  var ADOXDotView_typekey: View
  
  var Command: typings.activexAdodb.ADODB.Command
  
  val DateCreated: VarDate
  
  val DateModified: VarDate
  
  val Name: String
}
object View {
  
  @scala.inline
  def apply(
    ADOXDotView_typekey: View,
    Command: Command,
    DateCreated: VarDate,
    DateModified: VarDate,
    Name: String
  ): View = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], DateCreated = DateCreated.asInstanceOf[js.Any], DateModified = DateModified.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.updateDynamic("ADOX.View_typekey")(ADOXDotView_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[View]
  }
  
  @scala.inline
  implicit class ViewMutableBuilder[Self <: View] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setADOXDotView_typekey(value: View): Self = StObject.set(x, "ADOX.View_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommand(value: Command): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateCreated(value: VarDate): Self = StObject.set(x, "DateCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateModified(value: VarDate): Self = StObject.set(x, "DateModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
