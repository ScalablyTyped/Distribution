package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemovePrefixListEntry extends StObject {
  
  /**
    * The CIDR block.
    */
  var Cidr: String
}
object RemovePrefixListEntry {
  
  inline def apply(Cidr: String): RemovePrefixListEntry = {
    val __obj = js.Dynamic.literal(Cidr = Cidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovePrefixListEntry]
  }
  
  extension [Self <: RemovePrefixListEntry](x: Self) {
    
    inline def setCidr(value: String): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
  }
}
