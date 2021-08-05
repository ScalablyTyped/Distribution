package typings.activexLibreoffice.com_.sun.star.frame

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides information about a supported command
  * @see XDispatchInformationProvider
  * @see Controller
  * @since OOo 2.0
  */
trait DispatchInformation extends StObject {
  
  /** command URL of a supported command. */
  var Command: String
  
  /**
    * group identifier to which the supported command belong.
    * @see CommandGroup
    */
  var GroupId: Double
}
object DispatchInformation {
  
  inline def apply(Command: String, GroupId: Double): DispatchInformation = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DispatchInformation]
  }
  
  extension [Self <: DispatchInformation](x: Self) {
    
    inline def setCommand(value: String): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
    
    inline def setGroupId(value: Double): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
  }
}
