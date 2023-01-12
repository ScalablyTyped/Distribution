package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreDefinitionVersion extends StObject {
  
  /**
    * A list of cores in the core definition version.
    */
  var Cores: js.UndefOr[listOfCore] = js.undefined
}
object CoreDefinitionVersion {
  
  inline def apply(): CoreDefinitionVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoreDefinitionVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoreDefinitionVersion] (val x: Self) extends AnyVal {
    
    inline def setCores(value: listOfCore): Self = StObject.set(x, "Cores", value.asInstanceOf[js.Any])
    
    inline def setCoresUndefined: Self = StObject.set(x, "Cores", js.undefined)
    
    inline def setCoresVarargs(value: Core*): Self = StObject.set(x, "Cores", js.Array(value*))
  }
}
