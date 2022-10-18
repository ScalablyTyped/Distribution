package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetSourceEntry extends StObject {
  
  /**
    * The S3 bucket that's part of the source of the asset.
    */
  var Bucket: string
  
  /**
    * The name of the object in Amazon S3 for the asset.
    */
  var Key: string
}
object AssetSourceEntry {
  
  inline def apply(Bucket: string, Key: string): AssetSourceEntry = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetSourceEntry]
  }
  
  extension [Self <: AssetSourceEntry](x: Self) {
    
    inline def setBucket(value: string): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setKey(value: string): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
  }
}
