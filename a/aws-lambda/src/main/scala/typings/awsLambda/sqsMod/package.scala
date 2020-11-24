package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object sqsMod {
  
  type SQSHandler = typings.awsLambda.handlerMod.Handler[typings.awsLambda.sqsMod.SQSEvent, scala.Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.awsLambdaStrings.String
    - typings.awsLambda.awsLambdaStrings.Number
    - typings.awsLambda.awsLambdaStrings.Binary
    - java.lang.String
  */
  type SQSMessageAttributeDataType = typings.awsLambda.sqsMod._SQSMessageAttributeDataType | java.lang.String
  
  type SQSMessageAttributes = org.scalablytyped.runtime.StringDictionary[typings.awsLambda.sqsMod.SQSMessageAttribute]
}
