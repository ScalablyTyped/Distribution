package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpamResourceTag extends StObject {
  
  /**
    * The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.
    */
  var Key: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the tag.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object IpamResourceTag {
  
  inline def apply(): IpamResourceTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpamResourceTag]
  }
  
  extension [Self <: IpamResourceTag](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
