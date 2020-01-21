package typings.angularCompiler.r3FactoryMod

import typings.angularCompiler.outputAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3DependencyMetadata extends js.Object {
  /**
    * Whether the dependency has an @Host qualifier.
    */
  var host: Boolean
  /**
    * Whether the dependency has an @Optional qualifier.
    */
  var optional: Boolean
  /**
    * An enum indicating whether this dependency has special meaning to Angular and needs to be
    * injected specially.
    */
  var resolved: R3ResolvedDependencyType
  /**
    * Whether the dependency has an @Self qualifier.
    */
  var self: Boolean
  /**
    * Whether the dependency has an @SkipSelf qualifier.
    */
  var skipSelf: Boolean
  /**
    * An expression representing the token or value to be injected.
    */
  var token: Expression
}

object R3DependencyMetadata {
  @scala.inline
  def apply(
    host: Boolean,
    optional: Boolean,
    resolved: R3ResolvedDependencyType,
    self: Boolean,
    skipSelf: Boolean,
    token: Expression
  ): R3DependencyMetadata = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any], skipSelf = skipSelf.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[R3DependencyMetadata]
  }
}

