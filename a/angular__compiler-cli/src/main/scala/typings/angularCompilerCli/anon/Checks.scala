package typings.angularCompilerCli.anon

import org.scalablytyped.runtime.TopLevel
import typings.angularCompilerCli.publicOptionsMod.DiagnosticCategoryLabel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checks extends StObject {
  
  /**
    * A map of each extended template diagnostic's name to its category. This can be expanded in
    * the future with more information for each check or for additional diagnostics not part of the
    * extended template diagnostics system.
    */
  var checks: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ Name in @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/diagnostics/src/extended_template_diagnostic_name.ExtendedTemplateDiagnosticName ]:? @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/core/api/src/public_options.DiagnosticCategoryLabel}
    */ typings.angularCompilerCli.angularCompilerCliStrings.Checks & TopLevel[Any]
  ] = js.undefined
  
  /**
    * The category to use for configurable diagnostics which are not overridden by `checks`. Uses
    * `warning` by default.
    */
  var defaultCategory: js.UndefOr[DiagnosticCategoryLabel] = js.undefined
}
object Checks {
  
  inline def apply(): Checks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Checks]
  }
  
  extension [Self <: Checks](x: Self) {
    
    inline def setChecks(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ Name in @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/diagnostics/src/extended_template_diagnostic_name.ExtendedTemplateDiagnosticName ]:? @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/core/api/src/public_options.DiagnosticCategoryLabel}
      */ typings.angularCompilerCli.angularCompilerCliStrings.Checks & TopLevel[Any]
    ): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
    
    inline def setChecksUndefined: Self = StObject.set(x, "checks", js.undefined)
    
    inline def setDefaultCategory(value: DiagnosticCategoryLabel): Self = StObject.set(x, "defaultCategory", value.asInstanceOf[js.Any])
    
    inline def setDefaultCategoryUndefined: Self = StObject.set(x, "defaultCategory", js.undefined)
  }
}
