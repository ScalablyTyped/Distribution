package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object connectContactFlowMod {
  
  type ConnectContactFlowCallback = typings.awsLambda.handlerMod.Callback[typings.awsLambda.connectContactFlowMod.ConnectContactFlowResult]
  
  type ConnectContactFlowHandler = typings.awsLambda.handlerMod.Handler[
    typings.awsLambda.connectContactFlowMod.ConnectContactFlowEvent, 
    typings.awsLambda.connectContactFlowMod.ConnectContactFlowResult
  ]
  
  type ConnectContactFlowResult = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null]
}
