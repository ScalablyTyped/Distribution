package typings
package atlassianDashCrowdDashClientLib.libModelsValidationDashFactorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("atlassian-crowd-client/lib/models/validation-factors", JSImport.Namespace)
@js.native
class namespaced protected () extends ValidationFactors {
  def this(validationFactorPairs: js.Any) = this()
  /* CompleteClass */
  override val validationFactors: js.Any = js.native
  /* CompleteClass */
  override def toCrowd(): ValidationFactorsObj = js.native
}

@JSImport("atlassian-crowd-client/lib/models/validation-factors", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  def fromCrowd(
    validationFactorsObj: atlassianDashCrowdDashClientLib.libModelsValidationDashFactorsMod.ValidationFactorsObj
  ): atlassianDashCrowdDashClientLib.libModelsValidationDashFactorsMod.ValidationFactors = js.native
}

