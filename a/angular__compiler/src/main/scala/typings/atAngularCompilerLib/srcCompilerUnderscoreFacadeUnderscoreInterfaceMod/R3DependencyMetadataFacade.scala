package typings
package atAngularCompilerLib.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3DependencyMetadataFacade extends js.Object {
  var host: scala.Boolean
  var optional: scala.Boolean
  var resolved: R3ResolvedDependencyType
  var self: scala.Boolean
  var skipSelf: scala.Boolean
  var token: js.Any
}

object R3DependencyMetadataFacade {
  @scala.inline
  def apply(
    host: scala.Boolean,
    optional: scala.Boolean,
    resolved: R3ResolvedDependencyType,
    self: scala.Boolean,
    skipSelf: scala.Boolean,
    token: js.Any
  ): R3DependencyMetadataFacade = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("optional")(optional)
    __obj.updateDynamic("resolved")(resolved)
    __obj.updateDynamic("self")(self)
    __obj.updateDynamic("skipSelf")(skipSelf)
    __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[R3DependencyMetadataFacade]
  }
}

