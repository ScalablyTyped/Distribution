package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListKeyGroupsResult extends StObject {
  
  /**
    * A list of key groups.
    */
  var KeyGroupList: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.KeyGroupList] = js.undefined
}
object ListKeyGroupsResult {
  
  inline def apply(): ListKeyGroupsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListKeyGroupsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListKeyGroupsResult] (val x: Self) extends AnyVal {
    
    inline def setKeyGroupList(value: KeyGroupList): Self = StObject.set(x, "KeyGroupList", value.asInstanceOf[js.Any])
    
    inline def setKeyGroupListUndefined: Self = StObject.set(x, "KeyGroupList", js.undefined)
  }
}
