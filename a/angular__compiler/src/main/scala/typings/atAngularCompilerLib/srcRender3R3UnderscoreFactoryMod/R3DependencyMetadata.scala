package typings
package atAngularCompilerLib.srcRender3R3UnderscoreFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3DependencyMetadata extends js.Object {
  /**
    * Whether the dependency has an @Host qualifier.
    */
  var host: scala.Boolean
  /**
    * Whether the dependency has an @Optional qualifier.
    */
  var optional: scala.Boolean
  /**
    * An enum indicating whether this dependency has special meaning to Angular and needs to be
    * injected specially.
    */
  var resolved: R3ResolvedDependencyType
  /**
    * Whether the dependency has an @Self qualifier.
    */
  var self: scala.Boolean
  /**
    * Whether the dependency has an @SkipSelf qualifier.
    */
  var skipSelf: scala.Boolean
  /**
    * An expression representing the token or value to be injected.
    */
  var token: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression
}

object R3DependencyMetadata {
  @scala.inline
  def apply(
    host: scala.Boolean,
    optional: scala.Boolean,
    resolved: R3ResolvedDependencyType,
    self: scala.Boolean,
    skipSelf: scala.Boolean,
    token: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression
  ): R3DependencyMetadata = {
    val __obj = js.Dynamic.literal(host = host, optional = optional, resolved = resolved, self = self, skipSelf = skipSelf, token = token)
  
    __obj.asInstanceOf[R3DependencyMetadata]
  }
}

