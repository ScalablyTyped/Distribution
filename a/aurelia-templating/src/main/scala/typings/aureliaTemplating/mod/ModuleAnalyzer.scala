package typings.aureliaTemplating.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-templating", "ModuleAnalyzer")
@js.native
/**
  * Creates an instance of ModuleAnalyzer.
  */
class ModuleAnalyzer () extends js.Object {
  /**
    * Analyzes a module.
    * @param moduleId The id of the module to analyze.
    * @param moduleInstance The module instance to analyze.
    * @param mainResourceKey The name of the main resource.
    * @return The ResouceModule representing the analysis.
    */
  def analyze(moduleId: String, moduleInstance: js.Any): ResourceModule = js.native
  def analyze(moduleId: String, moduleInstance: js.Any, mainResourceKey: String): ResourceModule = js.native
  /**
    * Retrieves the ResourceModule analysis for a previously analyzed module.
    * @param moduleId The id of the module to lookup.
    * @return The ResouceModule if found, undefined otherwise.
    */
  def getAnalysis(moduleId: String): ResourceModule = js.native
}

