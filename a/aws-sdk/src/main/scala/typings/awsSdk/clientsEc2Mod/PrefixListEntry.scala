package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrefixListEntry extends StObject {
  
  /**
    * The CIDR block.
    */
  var Cidr: js.UndefOr[String] = js.undefined
  
  /**
    * The description.
    */
  var Description: js.UndefOr[String] = js.undefined
}
object PrefixListEntry {
  
  inline def apply(): PrefixListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrefixListEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrefixListEntry] (val x: Self) extends AnyVal {
    
    inline def setCidr(value: String): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    inline def setCidrUndefined: Self = StObject.set(x, "Cidr", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
  }
}
