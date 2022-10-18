package typings.awsSdk.clientsGlacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVaultOutput extends StObject {
  
  /**
    * The URI of the vault that was created.
    */
  var location: js.UndefOr[String] = js.undefined
}
object CreateVaultOutput {
  
  inline def apply(): CreateVaultOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVaultOutput]
  }
  
  extension [Self <: CreateVaultOutput](x: Self) {
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
