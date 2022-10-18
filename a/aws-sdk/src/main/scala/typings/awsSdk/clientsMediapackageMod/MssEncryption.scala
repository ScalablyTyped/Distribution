package typings.awsSdk.clientsMediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MssEncryption extends StObject {
  
  var SpekeKeyProvider: typings.awsSdk.clientsMediapackageMod.SpekeKeyProvider
}
object MssEncryption {
  
  inline def apply(SpekeKeyProvider: SpekeKeyProvider): MssEncryption = {
    val __obj = js.Dynamic.literal(SpekeKeyProvider = SpekeKeyProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[MssEncryption]
  }
  
  extension [Self <: MssEncryption](x: Self) {
    
    inline def setSpekeKeyProvider(value: SpekeKeyProvider): Self = StObject.set(x, "SpekeKeyProvider", value.asInstanceOf[js.Any])
  }
}
