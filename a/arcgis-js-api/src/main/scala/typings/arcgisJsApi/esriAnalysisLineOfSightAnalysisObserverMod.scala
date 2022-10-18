package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.LineOfSightAnalysisObserver
import typings.arcgisJsApi.esri.LineOfSightAnalysisObserverConstructor
import typings.arcgisJsApi.esri.LineOfSightAnalysisObserverProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriAnalysisLineOfSightAnalysisObserverMod extends Shortcut {
  
  @JSImport("esri/analysis/LineOfSightAnalysisObserver", JSImport.Namespace)
  @js.native
  val ^ : js.Object & LineOfSightAnalysisObserverConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/analysis/LineOfSightAnalysisObserver", JSImport.Namespace)
  @js.native
  /**
    * The LineOfSightAnalysisObserver represents an observer of a [LineOfSightAnalysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysis.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysisObserver.html)
    */
  open class Class ()
    extends StObject
       with LineOfSightAnalysisObserver {
    def this(properties: LineOfSightAnalysisObserverProperties) = this()
  }
  
  type _To = js.Object & LineOfSightAnalysisObserverConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriAnalysisLineOfSightAnalysisObserverMod.foo` */
  override def _to: js.Object & LineOfSightAnalysisObserverConstructor = ^
}
