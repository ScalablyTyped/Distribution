package typings.awsLambda.anon

import typings.awsLambda.awsLambdaStrings.ConfirmIntent
import typings.awsLambda.triggerLexV2Mod.LevV2DialogActionWithoutSlot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`
  extends StObject
     with LevV2DialogActionWithoutSlot {
  
  var `type`: ConfirmIntent
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ConfirmIntent")
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `2`] (val x: Self) extends AnyVal {
    
    inline def setType(value: ConfirmIntent): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
