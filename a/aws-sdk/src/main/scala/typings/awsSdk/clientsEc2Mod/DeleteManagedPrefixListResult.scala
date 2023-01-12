package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteManagedPrefixListResult extends StObject {
  
  /**
    * Information about the prefix list.
    */
  var PrefixList: js.UndefOr[ManagedPrefixList] = js.undefined
}
object DeleteManagedPrefixListResult {
  
  inline def apply(): DeleteManagedPrefixListResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteManagedPrefixListResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteManagedPrefixListResult] (val x: Self) extends AnyVal {
    
    inline def setPrefixList(value: ManagedPrefixList): Self = StObject.set(x, "PrefixList", value.asInstanceOf[js.Any])
    
    inline def setPrefixListUndefined: Self = StObject.set(x, "PrefixList", js.undefined)
  }
}
