package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionDefinitionVersion extends js.Object {
  /**
    * The default configuration that applies to all Lambda functions in this function definition version. Individual Lambda functions can override these settings.
    */
  var DefaultConfig: js.UndefOr[FunctionDefaultConfig] = js.undefined
  /**
    * A list of Lambda functions in this function definition version.
    */
  var Functions: js.UndefOr[__listOfFunction] = js.undefined
}

object FunctionDefinitionVersion {
  @scala.inline
  def apply(DefaultConfig: FunctionDefaultConfig = null, Functions: __listOfFunction = null): FunctionDefinitionVersion = {
    val __obj = js.Dynamic.literal()
    if (DefaultConfig != null) __obj.updateDynamic("DefaultConfig")(DefaultConfig)
    if (Functions != null) __obj.updateDynamic("Functions")(Functions)
    __obj.asInstanceOf[FunctionDefinitionVersion]
  }
}

