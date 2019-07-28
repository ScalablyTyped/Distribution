package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoreDefinitionVersion extends js.Object {
  /**
    * A list of cores in the core definition version.
    */
  var Cores: js.UndefOr[__listOfCore] = js.undefined
}

object CoreDefinitionVersion {
  @scala.inline
  def apply(Cores: __listOfCore = null): CoreDefinitionVersion = {
    val __obj = js.Dynamic.literal()
    if (Cores != null) __obj.updateDynamic("Cores")(Cores)
    __obj.asInstanceOf[CoreDefinitionVersion]
  }
}

