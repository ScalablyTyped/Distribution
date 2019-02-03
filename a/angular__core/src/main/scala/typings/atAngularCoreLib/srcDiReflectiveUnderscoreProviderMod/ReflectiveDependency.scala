package typings
package atAngularCoreLib.srcDiReflectiveUnderscoreProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/di/reflective_provider", "ReflectiveDependency")
@js.native
class ReflectiveDependency protected () extends js.Object {
  def this(key: atAngularCoreLib.srcDiReflectiveUnderscoreKeyMod.ReflectiveKey, optional: scala.Boolean) = this()
  def this(key: atAngularCoreLib.srcDiReflectiveUnderscoreKeyMod.ReflectiveKey, optional: scala.Boolean, visibility: atAngularCoreLib.srcDiMetadataMod.Self) = this()
  def this(key: atAngularCoreLib.srcDiReflectiveUnderscoreKeyMod.ReflectiveKey, optional: scala.Boolean, visibility: atAngularCoreLib.srcDiMetadataMod.SkipSelf) = this()
  var key: atAngularCoreLib.srcDiReflectiveUnderscoreKeyMod.ReflectiveKey = js.native
  var optional: scala.Boolean = js.native
  var visibility: atAngularCoreLib.srcDiMetadataMod.Self | atAngularCoreLib.srcDiMetadataMod.SkipSelf | scala.Null = js.native
}

/* static members */
@JSImport("@angular/core/src/di/reflective_provider", "ReflectiveDependency")
@js.native
object ReflectiveDependency extends js.Object {
  def fromKey(key: atAngularCoreLib.srcDiReflectiveUnderscoreKeyMod.ReflectiveKey): atAngularCoreLib.srcDiReflectiveUnderscoreProviderMod.ReflectiveDependency = js.native
}

