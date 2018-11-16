package typings
package asenvLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asenv", JSImport.Namespace)
@js.native
object asenvMod extends js.Object {
  def getEnv(): java.lang.String = js.native
  def isDevelopment(): scala.Boolean = js.native
  def isProduction(): scala.Boolean = js.native
  def isTest(): scala.Boolean = js.native
  def setEnv(env: java.lang.String): scala.Unit = js.native
  def unlessProduction(handle: js.Function0[_]): js.Any = js.native
}

