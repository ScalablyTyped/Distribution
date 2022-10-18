package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartProjectSessionRequest extends StObject {
  
  /**
    * A value that, if true, enables you to take control of a session, even if a different client is currently accessing the project.
    */
  var AssumeControl: js.UndefOr[typings.awsSdk.clientsDatabrewMod.AssumeControl] = js.undefined
  
  /**
    * The name of the project to act upon.
    */
  var Name: ProjectName
}
object StartProjectSessionRequest {
  
  inline def apply(Name: ProjectName): StartProjectSessionRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartProjectSessionRequest]
  }
  
  extension [Self <: StartProjectSessionRequest](x: Self) {
    
    inline def setAssumeControl(value: AssumeControl): Self = StObject.set(x, "AssumeControl", value.asInstanceOf[js.Any])
    
    inline def setAssumeControlUndefined: Self = StObject.set(x, "AssumeControl", js.undefined)
    
    inline def setName(value: ProjectName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
