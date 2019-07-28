package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitSubmodulesConfig extends js.Object {
  /**
    *  Set to true to fetch Git submodules for your AWS CodeBuild build project. 
    */
  var fetchSubmodules: WrapperBoolean
}

object GitSubmodulesConfig {
  @scala.inline
  def apply(fetchSubmodules: WrapperBoolean): GitSubmodulesConfig = {
    val __obj = js.Dynamic.literal(fetchSubmodules = fetchSubmodules)
  
    __obj.asInstanceOf[GitSubmodulesConfig]
  }
}

