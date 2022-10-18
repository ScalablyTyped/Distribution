package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Function extends StObject {
  
  /**
    * The ARN of the Lambda function.
    */
  var FunctionArn: js.UndefOr[string] = js.native
  
  /**
    * The configuration of the Lambda function.
    */
  var FunctionConfiguration: js.UndefOr[typings.awsSdk.clientsGreengrassMod.FunctionConfiguration] = js.native
  
  /**
    * A descriptive or arbitrary ID for the function. This value must be unique within the function definition version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
    */
  var Id: string = js.native
}
