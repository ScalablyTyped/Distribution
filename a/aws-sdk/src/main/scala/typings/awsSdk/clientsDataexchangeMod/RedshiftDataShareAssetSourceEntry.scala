package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedshiftDataShareAssetSourceEntry extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the datashare asset.
    */
  var DataShareArn: _String
}
object RedshiftDataShareAssetSourceEntry {
  
  inline def apply(DataShareArn: _String): RedshiftDataShareAssetSourceEntry = {
    val __obj = js.Dynamic.literal(DataShareArn = DataShareArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftDataShareAssetSourceEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RedshiftDataShareAssetSourceEntry] (val x: Self) extends AnyVal {
    
    inline def setDataShareArn(value: _String): Self = StObject.set(x, "DataShareArn", value.asInstanceOf[js.Any])
  }
}
