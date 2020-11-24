package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object snsMod {
  
  type SNSHandler = typings.awsLambda.handlerMod.Handler[typings.awsLambda.snsMod.SNSEvent, scala.Unit]
  
  type SNSMessageAttributes = org.scalablytyped.runtime.StringDictionary[typings.awsLambda.snsMod.SNSMessageAttribute]
}
