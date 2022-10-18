package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3SnapshotAsset extends StObject {
  
  /**
    * The size of the S3 object that is the object.
    */
  var Size: doubleMin0
}
object S3SnapshotAsset {
  
  inline def apply(Size: doubleMin0): S3SnapshotAsset = {
    val __obj = js.Dynamic.literal(Size = Size.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3SnapshotAsset]
  }
  
  extension [Self <: S3SnapshotAsset](x: Self) {
    
    inline def setSize(value: doubleMin0): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
  }
}
