package typings.awsLambda.anon

import typings.awsLambda.awsLambdaStrings.Delegate
import typings.awsLambda.triggerLexV2Mod.LevV2DialogActionWithoutSlot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3`
  extends StObject
     with LevV2DialogActionWithoutSlot {
  
  var `type`: Delegate
}
object `3` {
  
  inline def apply(): `3` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Delegate")
    __obj.asInstanceOf[`3`]
  }
  
  extension [Self <: `3`](x: Self) {
    
    inline def setType(value: Delegate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
