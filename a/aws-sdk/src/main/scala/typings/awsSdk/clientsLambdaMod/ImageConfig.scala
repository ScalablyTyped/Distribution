package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageConfig extends StObject {
  
  /**
    * Specifies parameters that you want to pass in with ENTRYPOINT.
    */
  var Command: js.UndefOr[StringList] = js.undefined
  
  /**
    * Specifies the entry point to their application, which is typically the location of the runtime executable.
    */
  var EntryPoint: js.UndefOr[StringList] = js.undefined
  
  /**
    * Specifies the working directory.
    */
  var WorkingDirectory: js.UndefOr[typings.awsSdk.clientsLambdaMod.WorkingDirectory] = js.undefined
}
object ImageConfig {
  
  inline def apply(): ImageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageConfig] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: StringList): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "Command", js.undefined)
    
    inline def setCommandVarargs(value: String*): Self = StObject.set(x, "Command", js.Array(value*))
    
    inline def setEntryPoint(value: StringList): Self = StObject.set(x, "EntryPoint", value.asInstanceOf[js.Any])
    
    inline def setEntryPointUndefined: Self = StObject.set(x, "EntryPoint", js.undefined)
    
    inline def setEntryPointVarargs(value: String*): Self = StObject.set(x, "EntryPoint", js.Array(value*))
    
    inline def setWorkingDirectory(value: WorkingDirectory): Self = StObject.set(x, "WorkingDirectory", value.asInstanceOf[js.Any])
    
    inline def setWorkingDirectoryUndefined: Self = StObject.set(x, "WorkingDirectory", js.undefined)
  }
}
