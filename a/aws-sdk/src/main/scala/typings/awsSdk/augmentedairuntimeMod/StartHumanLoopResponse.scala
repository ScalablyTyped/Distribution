package typings.awsSdk.augmentedairuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartHumanLoopResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the human loop.
    */
  var HumanLoopArn: js.UndefOr[typings.awsSdk.augmentedairuntimeMod.HumanLoopArn] = js.undefined
}
object StartHumanLoopResponse {
  
  @scala.inline
  def apply(): StartHumanLoopResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartHumanLoopResponse]
  }
  
  @scala.inline
  implicit class StartHumanLoopResponseMutableBuilder[Self <: StartHumanLoopResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHumanLoopArn(value: HumanLoopArn): Self = StObject.set(x, "HumanLoopArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanLoopArnUndefined: Self = StObject.set(x, "HumanLoopArn", js.undefined)
  }
}
