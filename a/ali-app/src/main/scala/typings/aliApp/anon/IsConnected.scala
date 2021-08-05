package typings.aliApp.anon

import typings.aliApp.my.NetworkType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsConnected extends StObject {
  
  /** 网络是否可用 */
  var isConnected: Boolean
  
  /** 网络类型值 UNKNOWN / NOTREACHABLE / WIFI / 3G / 2G / 4G / WWAN */
  var networkType: NetworkType
}
object IsConnected {
  
  inline def apply(isConnected: Boolean, networkType: NetworkType): IsConnected = {
    val __obj = js.Dynamic.literal(isConnected = isConnected.asInstanceOf[js.Any], networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsConnected]
  }
  
  extension [Self <: IsConnected](x: Self) {
    
    inline def setIsConnected(value: Boolean): Self = StObject.set(x, "isConnected", value.asInstanceOf[js.Any])
    
    inline def setNetworkType(value: NetworkType): Self = StObject.set(x, "networkType", value.asInstanceOf[js.Any])
  }
}
