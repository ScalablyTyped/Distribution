package typings.angularCore.ngQueryVisitorMod

import typings.angularCore.ngComponentTemplateMod.ResolvedTemplate
import typings.typescript.mod.ClassDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassMetadata extends js.Object {
  /** List of class declarations that derive from the given class. */
  var derivedClasses: js.Array[ClassDeclaration] = js.native
  /** List of property names that declare an Angular input within the given class. */
  var ngInputNames: js.Array[String] = js.native
  /** Super class of the given class. */
  var superClass: ClassDeclaration | Null = js.native
  /** Component template that belongs to that class if present. */
  var template: js.UndefOr[ResolvedTemplate] = js.native
}

object ClassMetadata {
  @scala.inline
  def apply(derivedClasses: js.Array[ClassDeclaration], ngInputNames: js.Array[String]): ClassMetadata = {
    val __obj = js.Dynamic.literal(derivedClasses = derivedClasses.asInstanceOf[js.Any], ngInputNames = ngInputNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassMetadata]
  }
  @scala.inline
  implicit class ClassMetadataOps[Self <: ClassMetadata] (val x: Self) extends AnyVal {
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
    def setDerivedClassesVarargs(value: ClassDeclaration*): Self = this.set("derivedClasses", js.Array(value :_*))
    @scala.inline
    def setDerivedClasses(value: js.Array[ClassDeclaration]): Self = this.set("derivedClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def setNgInputNamesVarargs(value: String*): Self = this.set("ngInputNames", js.Array(value :_*))
    @scala.inline
    def setNgInputNames(value: js.Array[String]): Self = this.set("ngInputNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuperClass(value: ClassDeclaration): Self = this.set("superClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuperClassNull: Self = this.set("superClass", null)
    @scala.inline
    def setTemplate(value: ResolvedTemplate): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
  
}

