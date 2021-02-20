package typings.angularCore

import typings.angularCore.ngQueryVisitorMod.ClassMetadataMap
import typings.angularCore.timingStrategyMod.TimingStrategy
import typings.typescript.mod.CompilerHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templateStrategyMod {
  
  @JSImport("@angular/core/schematics/migrations/static-queries/strategies/template_strategy/template_strategy", "QueryTemplateStrategy")
  @js.native
  class QueryTemplateStrategy protected () extends TimingStrategy {
    def this(projectPath: String, classMetadata: ClassMetadataMap, host: CompilerHost) = this()
    
    /** Analyzes a given directive by determining the timing of all matched view queries. */
    var _analyzeDirective: js.Any = js.native
    
    var _createDiagnosticsError: js.Any = js.native
    
    /**
      * Gets the timing that has been resolved for a given query when it's used within the
      * specified class declaration. e.g. queries from an inherited class can be used.
      */
    var _getQueryTimingFromClass: js.Any = js.native
    
    var _getViewQueryUniqueKey: js.Any = js.native
    
    var _parseTemplate: js.Any = js.native
    
    var analyzedQueries: js.Any = js.native
    
    var classMetadata: js.Any = js.native
    
    var compiler: js.Any = js.native
    
    var host: js.Any = js.native
    
    var metadataResolver: js.Any = js.native
    
    var projectPath: js.Any = js.native
  }
}
