package typings.angularFeatureFlags.mod.featureflags

import typings.angular.mod.IHttpPromise
import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureFlagsService extends js.Object {
  def set(flagsPromise: IHttpPromise[js.Array[FlagData]] | IPromise[js.Array[FlagData]]): Unit = js.native
}

