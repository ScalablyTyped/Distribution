package typings.angularCore.anon

import typings.angularCore.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Declarations extends js.Object {
  /** List of components, directives, and pipes declared by this module. */
  var declarations: js.UndefOr[js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]] = js.native
  /**
    * List of modules, `ModuleWithProviders`, components, directives, or pipes exported by this
    * module.
    */
  var exports: js.UndefOr[js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]] = js.native
  /** List of modules or `ModuleWithProviders` imported by this module. */
  var imports: js.UndefOr[js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]] = js.native
}

object Declarations {
  @scala.inline
  def apply(): Declarations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Declarations]
  }
  @scala.inline
  implicit class DeclarationsOps[Self <: Declarations] (val x: Self) extends AnyVal {
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
    def setImportsVarargs(value: Type[js.Any]*): Self = this.set("imports", js.Array(value :_*))
    @scala.inline
    def setImportsFunction0(value: () => js.Array[Type[_]]): Self = this.set("imports", js.Any.fromFunction0(value))
    @scala.inline
    def setImports(value: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]): Self = this.set("imports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImports: Self = this.set("imports", js.undefined)
  }
  
}

