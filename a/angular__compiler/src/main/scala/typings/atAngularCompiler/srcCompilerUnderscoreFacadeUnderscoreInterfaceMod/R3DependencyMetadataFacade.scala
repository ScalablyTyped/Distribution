package typings.atAngularCompiler.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3DependencyMetadataFacade extends js.Object {
  var host: Boolean
  var optional: Boolean
  var resolved: R3ResolvedDependencyType
  var self: Boolean
  var skipSelf: Boolean
  var token: js.Any
}

object R3DependencyMetadataFacade {
  @scala.inline
  def apply(
    host: Boolean,
    optional: Boolean,
    resolved: R3ResolvedDependencyType,
    self: Boolean,
    skipSelf: Boolean,
    token: js.Any
  ): R3DependencyMetadataFacade = {
    val __obj = js.Dynamic.literal(host = host, optional = optional, resolved = resolved, self = self, skipSelf = skipSelf, token = token)
  
    __obj.asInstanceOf[R3DependencyMetadataFacade]
  }
}

