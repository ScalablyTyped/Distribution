package typings.angularCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Registry extends StObject {
  
  var registry: js.UndefOr[String] = js.undefined
  
  var usingYarn: js.UndefOr[Boolean] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
}
object Registry {
  
  inline def apply(): Registry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Registry]
  }
  
  extension [Self <: Registry](x: Self) {
    
    inline def setRegistry(value: String): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
    
    inline def setUsingYarn(value: Boolean): Self = StObject.set(x, "usingYarn", value.asInstanceOf[js.Any])
    
    inline def setUsingYarnUndefined: Self = StObject.set(x, "usingYarn", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
