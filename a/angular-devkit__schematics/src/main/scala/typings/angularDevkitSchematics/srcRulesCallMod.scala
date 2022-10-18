package typings.angularDevkitSchematics

import typings.angularDevkitCore.mod.BaseException
import typings.angularDevkitSchematics.srcEngineInterfaceMod.Rule
import typings.angularDevkitSchematics.srcEngineInterfaceMod.SchematicContext
import typings.angularDevkitSchematics.srcEngineInterfaceMod.Source
import typings.angularDevkitSchematics.srcTreeInterfaceMod.Tree
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRulesCallMod {
  
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
  
  inline def callRule(rule: Rule, input: Tree, context: SchematicContext): Observable_[Tree] = (^.asInstanceOf[js.Dynamic].applyDynamic("callRule")(rule.asInstanceOf[js.Any], input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Observable_[Tree]]
  inline def callRule(rule: Rule, input: Observable_[Tree], context: SchematicContext): Observable_[Tree] = (^.asInstanceOf[js.Dynamic].applyDynamic("callRule")(rule.asInstanceOf[js.Any], input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Observable_[Tree]]
  
  inline def callSource(source: Source, context: SchematicContext): Observable_[Tree] = (^.asInstanceOf[js.Dynamic].applyDynamic("callSource")(source.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Observable_[Tree]]
}
