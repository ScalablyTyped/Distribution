package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-templating", "ModuleAnalyzer")
@js.native
class ModuleAnalyzer () extends js.Object {
  /**
      * Analyzes a module.
      * @param moduleId The id of the module to analyze.
      * @param moduleInstance The module instance to analyze.
      * @param mainResourceKey The name of the main resource.
      * @return The ResouceModule representing the analysis.
      */
  def analyze(moduleId: java.lang.String, moduleInstance: js.Any): ResourceModule = js.native
  /**
      * Analyzes a module.
      * @param moduleId The id of the module to analyze.
      * @param moduleInstance The module instance to analyze.
      * @param mainResourceKey The name of the main resource.
      * @return The ResouceModule representing the analysis.
      */
  def analyze(moduleId: java.lang.String, moduleInstance: js.Any, mainResourceKey: java.lang.String): ResourceModule = js.native
  /**
      * Retrieves the ResourceModule analysis for a previously analyzed module.
      * @param moduleId The id of the module to lookup.
      * @return The ResouceModule if found, undefined otherwise.
      */
  def getAnalysis(moduleId: java.lang.String): ResourceModule = js.native
}

