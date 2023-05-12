package typings.awsSdk.clientsInternetmonitorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Network extends StObject {
  
  /**
    * The internet provider name or network name.
    */
  var ASName: String
  
  /**
    * The Autonomous System Number (ASN) of the internet provider or network.
    */
  var ASNumber: Long
}
object Network {
  
  inline def apply(ASName: String, ASNumber: Long): Network = {
    val __obj = js.Dynamic.literal(ASName = ASName.asInstanceOf[js.Any], ASNumber = ASNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Network]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Network] (val x: Self) extends AnyVal {
    
    inline def setASName(value: String): Self = StObject.set(x, "ASName", value.asInstanceOf[js.Any])
    
    inline def setASNumber(value: Long): Self = StObject.set(x, "ASNumber", value.asInstanceOf[js.Any])
  }
}
