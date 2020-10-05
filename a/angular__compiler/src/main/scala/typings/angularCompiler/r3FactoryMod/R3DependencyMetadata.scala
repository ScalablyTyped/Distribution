package typings.angularCompiler.r3FactoryMod

import typings.angularCompiler.outputAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait R3DependencyMetadata extends js.Object {
  /**
    * If an @Attribute decorator is present, this is the literal type of the attribute name, or
    * the unknown type if no literal type is available (e.g. the attribute name is an expression).
    * Will be null otherwise.
    */
  var attribute: Expression | Null = js.native
  /**
    * Whether the dependency has an @Host qualifier.
    */
  var host: Boolean = js.native
  /**
    * Whether the dependency has an @Optional qualifier.
    */
  var optional: Boolean = js.native
  /**
    * An enum indicating whether this dependency has special meaning to Angular and needs to be
    * injected specially.
    */
  var resolved: R3ResolvedDependencyType = js.native
  /**
    * Whether the dependency has an @Self qualifier.
    */
  var self: Boolean = js.native
  /**
    * Whether the dependency has an @SkipSelf qualifier.
    */
  var skipSelf: Boolean = js.native
  /**
    * An expression representing the token or value to be injected.
    */
  var token: Expression = js.native
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
  @scala.inline
  implicit class R3DependencyMetadataOps[Self <: R3DependencyMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHost(value: Boolean): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolved(value: R3ResolvedDependencyType): Self = this.set("resolved", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelf(value: Boolean): Self = this.set("self", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkipSelf(value: Boolean): Self = this.set("skipSelf", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: Expression): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttribute(value: Expression): Self = this.set("attribute", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributeNull: Self = this.set("attribute", null)
  }
  
}

