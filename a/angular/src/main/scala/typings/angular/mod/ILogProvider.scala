package typings.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILogProvider extends IServiceProvider {
  def debugEnabled(): Boolean = js.native
  def debugEnabled(enabled: Boolean): ILogProvider = js.native
}

