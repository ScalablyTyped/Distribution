package typings.alipayjssdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshAvailable extends StObject {
  
  /** 是否可刷新。可通过ap.allowPullDownRefresh()设置此返回值 */
  var refreshAvailable: Boolean
}
object RefreshAvailable {
  
  inline def apply(refreshAvailable: Boolean): RefreshAvailable = {
    val __obj = js.Dynamic.literal(refreshAvailable = refreshAvailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshAvailable]
  }
  
  extension [Self <: RefreshAvailable](x: Self) {
    
    inline def setRefreshAvailable(value: Boolean): Self = StObject.set(x, "refreshAvailable", value.asInstanceOf[js.Any])
  }
}
