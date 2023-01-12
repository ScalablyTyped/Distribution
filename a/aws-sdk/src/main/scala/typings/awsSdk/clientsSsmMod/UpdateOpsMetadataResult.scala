package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateOpsMetadataResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the OpsMetadata Object that was updated.
    */
  var OpsMetadataArn: js.UndefOr[typings.awsSdk.clientsSsmMod.OpsMetadataArn] = js.undefined
}
object UpdateOpsMetadataResult {
  
  inline def apply(): UpdateOpsMetadataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOpsMetadataResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateOpsMetadataResult] (val x: Self) extends AnyVal {
    
    inline def setOpsMetadataArn(value: OpsMetadataArn): Self = StObject.set(x, "OpsMetadataArn", value.asInstanceOf[js.Any])
    
    inline def setOpsMetadataArnUndefined: Self = StObject.set(x, "OpsMetadataArn", js.undefined)
  }
}
