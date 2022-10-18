package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOriginAccessControlsResult extends StObject {
  
  /**
    * A list of origin access controls.
    */
  var OriginAccessControlList: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.OriginAccessControlList] = js.undefined
}
object ListOriginAccessControlsResult {
  
  inline def apply(): ListOriginAccessControlsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOriginAccessControlsResult]
  }
  
  extension [Self <: ListOriginAccessControlsResult](x: Self) {
    
    inline def setOriginAccessControlList(value: OriginAccessControlList): Self = StObject.set(x, "OriginAccessControlList", value.asInstanceOf[js.Any])
    
    inline def setOriginAccessControlListUndefined: Self = StObject.set(x, "OriginAccessControlList", js.undefined)
  }
}
