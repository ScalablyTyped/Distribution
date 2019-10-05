package typings.angularDashFeatureDashFlags.angularMod.featureflags

import typings.angular.angularMod.IHttpPromise
import typings.angular.angularMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureFlagsService extends js.Object {
  def set(flagsPromise: IHttpPromise[js.Array[FlagData]] | IPromise[js.Array[FlagData]]): Unit = js.native
}

