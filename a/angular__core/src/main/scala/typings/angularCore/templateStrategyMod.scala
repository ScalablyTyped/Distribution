package typings.angularCore

import typings.angularCore.ngQueryVisitorMod.ClassMetadataMap
import typings.angularCore.queryDefinitionMod.NgQueryDefinition
import typings.angularCore.timingStrategyMod.TimingResult
import typings.angularCore.timingStrategyMod.TimingStrategy
import typings.typescript.mod.CompilerHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templateStrategyMod {
  
  @JSImport("@angular/core/schematics/migrations/static-queries/strategies/template_strategy/template_strategy", "QueryTemplateStrategy")
  @js.native
  class QueryTemplateStrategy protected ()
    extends StObject
       with TimingStrategy {
    def this(projectPath: String, classMetadata: ClassMetadataMap, host: CompilerHost) = this()
    
    /** Analyzes a given directive by determining the timing of all matched view queries. */
    /* private */ var _analyzeDirective: js.Any = js.native
    
    /* private */ var _createDiagnosticsError: js.Any = js.native
    
    /**
      * Gets the timing that has been resolved for a given query when it's used within the
      * specified class declaration. e.g. queries from an inherited class can be used.
      */
    /* private */ var _getQueryTimingFromClass: js.Any = js.native
    
    /* private */ var _getViewQueryUniqueKey: js.Any = js.native
    
    /* private */ var _parseTemplate: js.Any = js.native
    
    /* private */ var analyzedQueries: js.Any = js.native
    
    /* private */ var classMetadata: js.Any = js.native
    
    /* private */ var compiler: js.Any = js.native
    
    /** Detects the timing result for a given query. */
    /* CompleteClass */
    override def detectTiming(query: NgQueryDefinition): TimingResult = js.native
    
    /* private */ var host: js.Any = js.native
    
    /* private */ var metadataResolver: js.Any = js.native
    
    /* private */ var projectPath: js.Any = js.native
    
    /** Sets up the given strategy. Throws if the strategy could not be set up. */
    /* CompleteClass */
    override def setup(): Unit = js.native
  }
}
