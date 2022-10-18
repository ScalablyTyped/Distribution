package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptBootstrapActionConfig extends StObject {
  
  /**
    * A list of command line arguments to pass to the bootstrap action script.
    */
  var Args: js.UndefOr[XmlStringList] = js.undefined
  
  /**
    * Location in Amazon S3 of the script to run during a bootstrap action.
    */
  var Path: XmlString
}
object ScriptBootstrapActionConfig {
  
  inline def apply(Path: XmlString): ScriptBootstrapActionConfig = {
    val __obj = js.Dynamic.literal(Path = Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptBootstrapActionConfig]
  }
  
  extension [Self <: ScriptBootstrapActionConfig](x: Self) {
    
    inline def setArgs(value: XmlStringList): Self = StObject.set(x, "Args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "Args", js.undefined)
    
    inline def setArgsVarargs(value: XmlString*): Self = StObject.set(x, "Args", js.Array(value*))
    
    inline def setPath(value: XmlString): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
  }
}
