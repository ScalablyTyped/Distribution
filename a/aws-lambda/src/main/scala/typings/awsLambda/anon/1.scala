package typings.awsLambda.anon

import typings.awsLambda.awsLambdaStrings.Close
import typings.awsLambda.triggerLexV2Mod.LevV2DialogActionWithoutSlot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`
  extends StObject
     with LevV2DialogActionWithoutSlot {
  
  var `type`: Close
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Close")
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setType(value: Close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
