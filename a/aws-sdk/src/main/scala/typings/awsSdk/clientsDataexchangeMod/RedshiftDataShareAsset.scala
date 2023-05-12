package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedshiftDataShareAsset extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the datashare asset.
    */
  var Arn: _String
}
object RedshiftDataShareAsset {
  
  inline def apply(Arn: _String): RedshiftDataShareAsset = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftDataShareAsset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RedshiftDataShareAsset] (val x: Self) extends AnyVal {
    
    inline def setArn(value: _String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
