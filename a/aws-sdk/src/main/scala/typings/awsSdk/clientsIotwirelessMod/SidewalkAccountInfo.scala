package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SidewalkAccountInfo extends StObject {
  
  /**
    * The Sidewalk Amazon ID.
    */
  var AmazonId: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.AmazonId] = js.undefined
  
  /**
    * The Sidewalk application server private key.
    */
  var AppServerPrivateKey: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.AppServerPrivateKey] = js.undefined
}
object SidewalkAccountInfo {
  
  inline def apply(): SidewalkAccountInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SidewalkAccountInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SidewalkAccountInfo] (val x: Self) extends AnyVal {
    
    inline def setAmazonId(value: AmazonId): Self = StObject.set(x, "AmazonId", value.asInstanceOf[js.Any])
    
    inline def setAmazonIdUndefined: Self = StObject.set(x, "AmazonId", js.undefined)
    
    inline def setAppServerPrivateKey(value: AppServerPrivateKey): Self = StObject.set(x, "AppServerPrivateKey", value.asInstanceOf[js.Any])
    
    inline def setAppServerPrivateKeyUndefined: Self = StObject.set(x, "AppServerPrivateKey", js.undefined)
  }
}
