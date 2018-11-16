package typings
package apolloDashUtilitiesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-utilities/lib/util/environment", JSImport.Namespace)
@js.native
object libUtilEnvironmentMod extends js.Object {
  def getEnv(): js.UndefOr[java.lang.String] = js.native
  def isDevelopment(): scala.Boolean = js.native
  def isEnv(env: java.lang.String): scala.Boolean = js.native
  def isProduction(): scala.Boolean = js.native
  def isTest(): scala.Boolean = js.native
}

