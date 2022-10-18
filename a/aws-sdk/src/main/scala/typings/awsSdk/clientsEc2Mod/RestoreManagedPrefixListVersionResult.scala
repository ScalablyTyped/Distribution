package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreManagedPrefixListVersionResult extends StObject {
  
  /**
    * Information about the prefix list.
    */
  var PrefixList: js.UndefOr[ManagedPrefixList] = js.undefined
}
object RestoreManagedPrefixListVersionResult {
  
  inline def apply(): RestoreManagedPrefixListVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreManagedPrefixListVersionResult]
  }
  
  extension [Self <: RestoreManagedPrefixListVersionResult](x: Self) {
    
    inline def setPrefixList(value: ManagedPrefixList): Self = StObject.set(x, "PrefixList", value.asInstanceOf[js.Any])
    
    inline def setPrefixListUndefined: Self = StObject.set(x, "PrefixList", js.undefined)
  }
}
