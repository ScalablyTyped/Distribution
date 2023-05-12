package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportAssetFromSignedUrlJobErrorDetails extends StObject {
  
  /**
    * Details about the job error.
    */
  var AssetName: typings.awsSdk.clientsDataexchangeMod.AssetName
}
object ImportAssetFromSignedUrlJobErrorDetails {
  
  inline def apply(AssetName: AssetName): ImportAssetFromSignedUrlJobErrorDetails = {
    val __obj = js.Dynamic.literal(AssetName = AssetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportAssetFromSignedUrlJobErrorDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportAssetFromSignedUrlJobErrorDetails] (val x: Self) extends AnyVal {
    
    inline def setAssetName(value: AssetName): Self = StObject.set(x, "AssetName", value.asInstanceOf[js.Any])
  }
}
