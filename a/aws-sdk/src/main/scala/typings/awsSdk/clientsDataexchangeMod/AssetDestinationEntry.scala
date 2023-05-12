package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetDestinationEntry extends StObject {
  
  /**
    * The unique identifier for the asset.
    */
  var AssetId: Id
  
  /**
    * The Amazon S3 bucket that is the destination for the asset.
    */
  var Bucket: _String
  
  /**
    * The name of the object in Amazon S3 for the asset.
    */
  var Key: js.UndefOr[_String] = js.undefined
}
object AssetDestinationEntry {
  
  inline def apply(AssetId: Id, Bucket: _String): AssetDestinationEntry = {
    val __obj = js.Dynamic.literal(AssetId = AssetId.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetDestinationEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssetDestinationEntry] (val x: Self) extends AnyVal {
    
    inline def setAssetId(value: Id): Self = StObject.set(x, "AssetId", value.asInstanceOf[js.Any])
    
    inline def setBucket(value: _String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setKey(value: _String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
  }
}
