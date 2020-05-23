package typings.angularCore.ngQueryVisitorMod

import typings.angularCore.ngComponentTemplateMod.ResolvedTemplate
import typings.typescript.mod.ClassDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassMetadata extends js.Object {
  /** List of class declarations that derive from the given class. */
  var derivedClasses: js.Array[ClassDeclaration]
  /** List of property names that declare an Angular input within the given class. */
  var ngInputNames: js.Array[String]
  /** Super class of the given class. */
  var superClass: ClassDeclaration | Null
  /** Component template that belongs to that class if present. */
  var template: js.UndefOr[ResolvedTemplate] = js.undefined
}

object ClassMetadata {
  @scala.inline
  def apply(
    derivedClasses: js.Array[ClassDeclaration],
    ngInputNames: js.Array[String],
    superClass: ClassDeclaration = null,
    template: ResolvedTemplate = null
  ): ClassMetadata = {
    val __obj = js.Dynamic.literal(derivedClasses = derivedClasses.asInstanceOf[js.Any], ngInputNames = ngInputNames.asInstanceOf[js.Any], superClass = superClass.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassMetadata]
  }
}

