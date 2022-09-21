package typings.angularDevkitSchematics

import typings.angularDevkitCore.mod.BaseException
import typings.angularDevkitSchematics.interfaceMod.Rule
import typings.angularDevkitSchematics.interfaceMod.SchematicContext
import typings.angularDevkitSchematics.interfaceMod.Source
import typings.angularDevkitSchematics.treeInterfaceMod.Tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object callMod {
  
  @JSImport("@angular-devkit/schematics/src/rules/call", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/schematics/src/rules/call", "InvalidRuleResultException")
  @js.native
  open class InvalidRuleResultException () extends BaseException {
    def this(value: js.Object) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/rules/call", "InvalidSourceResultException")
  @js.native
  open class InvalidSourceResultException () extends BaseException {
    def this(value: js.Object) = this()
  }
  
  inline def callRule(
    rule: Rule,
    input: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<Tree> */ Any,
    context: SchematicContext
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("callRule")(rule.asInstanceOf[js.Any], input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def callRule(rule: Rule, input: Tree, context: SchematicContext): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("callRule")(rule.asInstanceOf[js.Any], input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def callSource(source: Source, context: SchematicContext): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("callSource")(source.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
}
