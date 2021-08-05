package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceIPAddress extends StObject {
  
  var sourceIPAddress: String
}
object SourceIPAddress {
  
  inline def apply(sourceIPAddress: String): SourceIPAddress = {
    val __obj = js.Dynamic.literal(sourceIPAddress = sourceIPAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceIPAddress]
  }
  
  extension [Self <: SourceIPAddress](x: Self) {
    
    inline def setSourceIPAddress(value: String): Self = StObject.set(x, "sourceIPAddress", value.asInstanceOf[js.Any])
  }
}
