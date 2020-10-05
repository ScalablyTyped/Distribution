package typings.angularCore.anon

import typings.angularCore.r3SymbolsMod.SchemaMetadata
import typings.angularCore.r3SymbolsMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Exports[T] extends js.Object {
  /** List of components to bootstrap. */
  var bootstrap: js.UndefOr[js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]] = js.native
  /** List of components, directives, and pipes declared by this module. */
  var declarations: js.UndefOr[js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]] = js.native
  /**
    * List of modules, `ModuleWithProviders`, components, directives, or pipes exported by this
    * module.
    */
  var exports: js.UndefOr[js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]] = js.native
  /** Unique ID for the module that is used with `getModuleFactory`. */
  var id: js.UndefOr[String | Null] = js.native
  /** List of modules or `ModuleWithProviders` imported by this module. */
  var imports: js.UndefOr[js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]] = js.native
  /** The set of schemas that declare elements to be allowed in the NgModule. */
  var schemas: js.UndefOr[js.Array[SchemaMetadata] | Null] = js.native
  /** Token representing the module. Used by DI. */
  var `type`: T = js.native
}

object Exports {
  @scala.inline
  def apply[T](`type`: T): Exports[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exports[T]]
  }
  @scala.inline
  implicit class ExportsOps[Self <: Exports[_], T] (val x: Self with Exports[T]) extends AnyVal {
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
    def setType(value: T): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setBootstrapVarargs(value: Type[js.Any]*): Self = this.set("bootstrap", js.Array(value :_*))
    @scala.inline
    def setBootstrapFunction0(value: () => js.Array[Type[_]]): Self = this.set("bootstrap", js.Any.fromFunction0(value))
    @scala.inline
    def setBootstrap(value: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]): Self = this.set("bootstrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBootstrap: Self = this.set("bootstrap", js.undefined)
    @scala.inline
    def setDeclarationsVarargs(value: Type[js.Any]*): Self = this.set("declarations", js.Array(value :_*))
    @scala.inline
    def setDeclarationsFunction0(value: () => js.Array[Type[_]]): Self = this.set("declarations", js.Any.fromFunction0(value))
    @scala.inline
    def setDeclarations(value: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]): Self = this.set("declarations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeclarations: Self = this.set("declarations", js.undefined)
    @scala.inline
    def setExportsVarargs(value: Type[js.Any]*): Self = this.set("exports", js.Array(value :_*))
    @scala.inline
    def setExportsFunction0(value: () => js.Array[Type[_]]): Self = this.set("exports", js.Any.fromFunction0(value))
    @scala.inline
    def setExports(value: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]): Self = this.set("exports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExports: Self = this.set("exports", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    @scala.inline
    def setImportsVarargs(value: Type[js.Any]*): Self = this.set("imports", js.Array(value :_*))
    @scala.inline
    def setImportsFunction0(value: () => js.Array[Type[_]]): Self = this.set("imports", js.Any.fromFunction0(value))
    @scala.inline
    def setImports(value: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]): Self = this.set("imports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImports: Self = this.set("imports", js.undefined)
    @scala.inline
    def setSchemasVarargs(value: SchemaMetadata*): Self = this.set("schemas", js.Array(value :_*))
    @scala.inline
    def setSchemas(value: js.Array[SchemaMetadata]): Self = this.set("schemas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemas: Self = this.set("schemas", js.undefined)
    @scala.inline
    def setSchemasNull: Self = this.set("schemas", null)
  }
  
}

