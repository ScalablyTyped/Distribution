package typings.awsLambda.anon

import typings.awsLambda.awsLambdaStrings.ElicitIntent
import typings.awsLambda.triggerLexV2Mod.LevV2DialogActionWithoutSlot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4`
  extends StObject
     with LevV2DialogActionWithoutSlot {
  
  var `type`: ElicitIntent
}
object `4` {
  
  inline def apply(): `4` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ElicitIntent")
    __obj.asInstanceOf[`4`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `4`] (val x: Self) extends AnyVal {
    
    inline def setType(value: ElicitIntent): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
