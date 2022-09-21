package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.LineOfSightAnalysisTarget
import typings.arcgisJsApi.esri.LineOfSightAnalysisTargetConstructor
import typings.arcgisJsApi.esri.LineOfSightAnalysisTargetProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineOfSightAnalysisTargetMod extends Shortcut {
  
  @JSImport("esri/analysis/LineOfSightAnalysisTarget", JSImport.Namespace)
  @js.native
  val ^ : js.Object & LineOfSightAnalysisTargetConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/analysis/LineOfSightAnalysisTarget", JSImport.Namespace)
  @js.native
  /**
    * The LineOfSightAnalysisTarget represents a target of a [LineOfSightAnalysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysis.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysisTarget.html)
    */
  open class Class ()
    extends StObject
       with LineOfSightAnalysisTarget {
    def this(properties: LineOfSightAnalysisTargetProperties) = this()
  }
  
  type _To = js.Object & LineOfSightAnalysisTargetConstructor
  
  /* This means you don't have to write `^`, but can instead just say `lineOfSightAnalysisTargetMod.foo` */
  override def _to: js.Object & LineOfSightAnalysisTargetConstructor = ^
}
