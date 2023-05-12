package typings.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAppInstanceBotResponse extends StObject {
  
  /**
    * The detials of the AppInstanceBot.
    */
  var AppInstanceBot: js.UndefOr[typings.awsSdk.clientsChimesdkidentityMod.AppInstanceBot] = js.undefined
}
object DescribeAppInstanceBotResponse {
  
  inline def apply(): DescribeAppInstanceBotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAppInstanceBotResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAppInstanceBotResponse] (val x: Self) extends AnyVal {
    
    inline def setAppInstanceBot(value: AppInstanceBot): Self = StObject.set(x, "AppInstanceBot", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceBotUndefined: Self = StObject.set(x, "AppInstanceBot", js.undefined)
  }
}
