package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAddonResponse extends StObject {
  
  var addon: js.UndefOr[Addon] = js.undefined
}
object DescribeAddonResponse {
  
  inline def apply(): DescribeAddonResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAddonResponse]
  }
  
  extension [Self <: DescribeAddonResponse](x: Self) {
    
    inline def setAddon(value: Addon): Self = StObject.set(x, "addon", value.asInstanceOf[js.Any])
    
    inline def setAddonUndefined: Self = StObject.set(x, "addon", js.undefined)
  }
}
