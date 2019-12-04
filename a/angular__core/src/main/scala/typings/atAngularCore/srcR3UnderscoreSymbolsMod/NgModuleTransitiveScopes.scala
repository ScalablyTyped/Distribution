package typings.atAngularCore.srcR3UnderscoreSymbolsMod

import typings.atAngularCore.Anon_Directives
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the expansion of an `NgModule` into its scopes.
  *
  * A scope is a set of directives and pipes that are visible in a particular context. Each
  * `NgModule` has two scopes. The `compilation` scope is the set of directives and pipes that will
  * be recognized in the templates of components declared by the module. The `exported` scope is the
  * set of directives and pipes exported by a module (that is, module B's exported scope gets added
  * to module A's compilation scope when module A imports B).
  */
trait NgModuleTransitiveScopes extends js.Object {
  var compilation: Anon_Directives
  var exported: Anon_Directives
  var schemas: js.Array[SchemaMetadata] | Null
}

object NgModuleTransitiveScopes {
  @scala.inline
  def apply(compilation: Anon_Directives, exported: Anon_Directives, schemas: js.Array[SchemaMetadata] = null): NgModuleTransitiveScopes = {
    val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any])
    if (schemas != null) __obj.updateDynamic("schemas")(schemas.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgModuleTransitiveScopes]
  }
}

