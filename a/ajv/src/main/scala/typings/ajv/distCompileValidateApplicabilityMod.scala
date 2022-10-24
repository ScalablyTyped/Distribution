package typings.ajv

import typings.ajv.distCompileMod.SchemaObjCxt
import typings.ajv.distCompileRulesMod.JSONType
import typings.ajv.distCompileRulesMod.Rule
import typings.ajv.distCompileRulesMod.RuleGroup
import typings.ajv.distTypesMod.AnySchemaObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCompileValidateApplicabilityMod {
  
  @JSImport("ajv/dist/compile/validate/applicability", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def schemaHasRulesForType(param0: SchemaObjCxt, `type`: JSONType): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("schemaHasRulesForType")(param0.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def shouldUseGroup(schema: AnySchemaObject, group: RuleGroup): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldUseGroup")(schema.asInstanceOf[js.Any], group.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def shouldUseRule(schema: AnySchemaObject, rule: Rule): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldUseRule")(schema.asInstanceOf[js.Any], rule.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
}
