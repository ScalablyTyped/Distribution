package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.LineOfSightAnalysisProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.LineOfSightAnalysis")
@js.native
/**
  * LineOfSightAnalysis computes the line of sight from a single observer position towards a set of targets.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysis.html)
  */
open class LineOfSightAnalysisCls ()
  extends StObject
     with typings.arcgisJsApi.esri.LineOfSightAnalysis {
  def this(properties: LineOfSightAnalysisProperties) = this()
}
