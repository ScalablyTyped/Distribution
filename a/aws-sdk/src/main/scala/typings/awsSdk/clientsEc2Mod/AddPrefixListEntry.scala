package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddPrefixListEntry extends StObject {
  
  /**
    * The CIDR block.
    */
  var Cidr: String
  
  /**
    * A description for the entry. Constraints: Up to 255 characters in length.
    */
  var Description: js.UndefOr[String] = js.undefined
}
object AddPrefixListEntry {
  
  inline def apply(Cidr: String): AddPrefixListEntry = {
    val __obj = js.Dynamic.literal(Cidr = Cidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddPrefixListEntry]
  }
  
  extension [Self <: AddPrefixListEntry](x: Self) {
    
    inline def setCidr(value: String): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
  }
}
