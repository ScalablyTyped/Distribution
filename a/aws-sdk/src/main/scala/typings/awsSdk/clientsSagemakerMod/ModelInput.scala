package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelInput extends StObject {
  
  /**
    * The input configuration object for the model.
    */
  var DataInputConfig: typings.awsSdk.clientsSagemakerMod.DataInputConfig
}
object ModelInput {
  
  inline def apply(DataInputConfig: DataInputConfig): ModelInput = {
    val __obj = js.Dynamic.literal(DataInputConfig = DataInputConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelInput] (val x: Self) extends AnyVal {
    
    inline def setDataInputConfig(value: DataInputConfig): Self = StObject.set(x, "DataInputConfig", value.asInstanceOf[js.Any])
  }
}
