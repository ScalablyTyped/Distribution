package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscCoreApiSrcPublicOptionsMod.BazelAndG3Options
import typings.angularCompilerCli.srcNgtscCoreApiSrcPublicOptionsMod.DiagnosticOptions
import typings.angularCompilerCli.srcNgtscCoreApiSrcPublicOptionsMod.I18nOptions
import typings.angularCompilerCli.srcNgtscCoreApiSrcPublicOptionsMod.LegacyNgcOptions
import typings.angularCompilerCli.srcNgtscCoreApiSrcPublicOptionsMod.MiscOptions
import typings.angularCompilerCli.srcNgtscCoreApiSrcPublicOptionsMod.NgcCompatibilityOptions
import typings.angularCompilerCli.srcNgtscCoreApiSrcPublicOptionsMod.StrictTemplateOptions
import typings.angularCompilerCli.srcNgtscCoreApiSrcPublicOptionsMod.TargetOptions
import typings.typescript.mod.CompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscCoreApiSrcOptionsMod {
  
  trait InternalOptions extends StObject
  
  trait NgCompilerOptions
    extends StObject
       with CompilerOptions
       with LegacyNgcOptions
       with BazelAndG3Options
       with DiagnosticOptions
       with NgcCompatibilityOptions
       with StrictTemplateOptions
       with TestOnlyOptions
       with I18nOptions
       with TargetOptions
       with InternalOptions
       with MiscOptions
  object NgCompilerOptions {
    
    inline def apply(): NgCompilerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NgCompilerOptions]
    }
  }
  
  trait TestOnlyOptions extends StObject {
    
    /**
      * Enable the Language Service APIs for template type-checking for tests.
      */
    var _enableTemplateTypeChecker: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An option to enable ngtsc's internal performance tracing.
      *
      * This should be a path to a JSON file where trace information will be written. This is sensitive
      * to the compiler's working directory, and should likely be an absolute path.
      *
      * This is currently not exposed to users as the trace format is still unstable.
      */
    var tracePerformance: js.UndefOr[String] = js.undefined
  }
  object TestOnlyOptions {
    
    inline def apply(): TestOnlyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TestOnlyOptions]
    }
    
    extension [Self <: TestOnlyOptions](x: Self) {
      
      inline def setTracePerformance(value: String): Self = StObject.set(x, "tracePerformance", value.asInstanceOf[js.Any])
      
      inline def setTracePerformanceUndefined: Self = StObject.set(x, "tracePerformance", js.undefined)
      
      inline def set_enableTemplateTypeChecker(value: Boolean): Self = StObject.set(x, "_enableTemplateTypeChecker", value.asInstanceOf[js.Any])
      
      inline def set_enableTemplateTypeCheckerUndefined: Self = StObject.set(x, "_enableTemplateTypeChecker", js.undefined)
    }
  }
}
