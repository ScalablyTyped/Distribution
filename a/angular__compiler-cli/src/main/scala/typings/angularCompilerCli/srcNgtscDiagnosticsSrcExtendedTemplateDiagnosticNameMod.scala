package typings.angularCompilerCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscDiagnosticsSrcExtendedTemplateDiagnosticNameMod {
  
  @js.native
  sealed trait ExtendedTemplateDiagnosticName extends StObject
  @JSImport("@angular/compiler-cli/src/ngtsc/diagnostics/src/extended_template_diagnostic_name", "ExtendedTemplateDiagnosticName")
  @js.native
  object ExtendedTemplateDiagnosticName extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ExtendedTemplateDiagnosticName & String] = js.native
    
    @js.native
    sealed trait INVALID_BANANA_IN_BOX
      extends StObject
         with ExtendedTemplateDiagnosticName
    /* "invalidBananaInBox" */ val INVALID_BANANA_IN_BOX: typings.angularCompilerCli.srcNgtscDiagnosticsSrcExtendedTemplateDiagnosticNameMod.ExtendedTemplateDiagnosticName.INVALID_BANANA_IN_BOX & String = js.native
    
    @js.native
    sealed trait MISSING_CONTROL_FLOW_DIRECTIVE
      extends StObject
         with ExtendedTemplateDiagnosticName
    /* "missingControlFlowDirective" */ val MISSING_CONTROL_FLOW_DIRECTIVE: typings.angularCompilerCli.srcNgtscDiagnosticsSrcExtendedTemplateDiagnosticNameMod.ExtendedTemplateDiagnosticName.MISSING_CONTROL_FLOW_DIRECTIVE & String = js.native
    
    @js.native
    sealed trait MISSING_NGFOROF_LET
      extends StObject
         with ExtendedTemplateDiagnosticName
    /* "missingNgForOfLet" */ val MISSING_NGFOROF_LET: typings.angularCompilerCli.srcNgtscDiagnosticsSrcExtendedTemplateDiagnosticNameMod.ExtendedTemplateDiagnosticName.MISSING_NGFOROF_LET & String = js.native
    
    @js.native
    sealed trait NULLISH_COALESCING_NOT_NULLABLE
      extends StObject
         with ExtendedTemplateDiagnosticName
    /* "nullishCoalescingNotNullable" */ val NULLISH_COALESCING_NOT_NULLABLE: typings.angularCompilerCli.srcNgtscDiagnosticsSrcExtendedTemplateDiagnosticNameMod.ExtendedTemplateDiagnosticName.NULLISH_COALESCING_NOT_NULLABLE & String = js.native
    
    @js.native
    sealed trait OPTIONAL_CHAIN_NOT_NULLABLE
      extends StObject
         with ExtendedTemplateDiagnosticName
    /* "optionalChainNotNullable" */ val OPTIONAL_CHAIN_NOT_NULLABLE: typings.angularCompilerCli.srcNgtscDiagnosticsSrcExtendedTemplateDiagnosticNameMod.ExtendedTemplateDiagnosticName.OPTIONAL_CHAIN_NOT_NULLABLE & String = js.native
    
    @js.native
    sealed trait SUFFIX_NOT_SUPPORTED
      extends StObject
         with ExtendedTemplateDiagnosticName
    /* "suffixNotSupported" */ val SUFFIX_NOT_SUPPORTED: typings.angularCompilerCli.srcNgtscDiagnosticsSrcExtendedTemplateDiagnosticNameMod.ExtendedTemplateDiagnosticName.SUFFIX_NOT_SUPPORTED & String = js.native
    
    @js.native
    sealed trait TEXT_ATTRIBUTE_NOT_BINDING
      extends StObject
         with ExtendedTemplateDiagnosticName
    /* "textAttributeNotBinding" */ val TEXT_ATTRIBUTE_NOT_BINDING: typings.angularCompilerCli.srcNgtscDiagnosticsSrcExtendedTemplateDiagnosticNameMod.ExtendedTemplateDiagnosticName.TEXT_ATTRIBUTE_NOT_BINDING & String = js.native
  }
}
