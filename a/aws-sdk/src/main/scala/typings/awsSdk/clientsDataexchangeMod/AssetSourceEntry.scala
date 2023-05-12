package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetSourceEntry extends StObject {
  
  /**
    * The Amazon S3 bucket that's part of the source of the asset.
    */
  var Bucket: _String
  
  /**
    * The name of the object in Amazon S3 for the asset.
    */
  var Key: _String
}
object AssetSourceEntry {
  
  inline def apply(Bucket: _String, Key: _String): AssetSourceEntry = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetSourceEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssetSourceEntry] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: _String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setKey(value: _String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
  }
}
