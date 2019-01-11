package typings
package atAngularCoreLib.srcProfileWtfUnderscoreImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/profile/wtf_impl", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createScope(signature: java.lang.String): js.Any = js.native
  def createScope(signature: java.lang.String, flags: js.Any): js.Any = js.native
  def detectWTF(): scala.Boolean = js.native
  def endTimeRange(range: atAngularCoreLib.srcProfileWtfUnderscoreImplMod.Range): scala.Unit = js.native
  def leave[T](scope: atAngularCoreLib.srcProfileWtfUnderscoreImplMod.Scope): T = js.native
  def leave[T](scope: atAngularCoreLib.srcProfileWtfUnderscoreImplMod.Scope, returnValue: T): T = js.native
  @JSName("leave")
  def leave_TUnit[T](scope: atAngularCoreLib.srcProfileWtfUnderscoreImplMod.Scope): scala.Unit = js.native
  def startTimeRange(rangeType: java.lang.String, action: java.lang.String): atAngularCoreLib.srcProfileWtfUnderscoreImplMod.Range = js.native
}

