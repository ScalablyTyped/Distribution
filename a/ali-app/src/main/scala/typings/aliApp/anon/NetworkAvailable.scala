package typings.aliApp.anon

import typings.aliApp.my.NetworkType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkAvailable extends StObject {
  
  /** 网络是否可用 */
  var networkAvailable: Boolean = js.native
  
  /** 网络类型值 UNKNOWN / NOTREACHABLE / WIFI / 3G / 2G / 4G / WWAN */
  var networkType: NetworkType = js.native
}
object NetworkAvailable {
  
  @scala.inline
  def apply(networkAvailable: Boolean, networkType: NetworkType): NetworkAvailable = {
    val __obj = js.Dynamic.literal(networkAvailable = networkAvailable.asInstanceOf[js.Any], networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkAvailable]
  }
  
  @scala.inline
  implicit class NetworkAvailableMutableBuilder[Self <: NetworkAvailable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkAvailable(value: Boolean): Self = StObject.set(x, "networkAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkType(value: NetworkType): Self = StObject.set(x, "networkType", value.asInstanceOf[js.Any])
  }
}
