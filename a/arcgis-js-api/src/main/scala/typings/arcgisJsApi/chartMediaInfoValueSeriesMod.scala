package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ChartMediaInfoValueSeries
import typings.arcgisJsApi.esri.ChartMediaInfoValueSeriesConstructor
import typings.arcgisJsApi.esri.ChartMediaInfoValueSeriesProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chartMediaInfoValueSeriesMod extends Shortcut {
  
  @JSImport("esri/popup/content/support/ChartMediaInfoValueSeries", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ChartMediaInfoValueSeriesConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/content/support/ChartMediaInfoValueSeries", JSImport.Namespace)
  @js.native
  class Class ()
    extends StObject
       with ChartMediaInfoValueSeries {
    def this(properties: ChartMediaInfoValueSeriesProperties) = this()
  }
  
  type _To = js.Object & ChartMediaInfoValueSeriesConstructor
  
  /* This means you don't have to write `^`, but can instead just say `chartMediaInfoValueSeriesMod.foo` */
  override def _to: js.Object & ChartMediaInfoValueSeriesConstructor = ^
}
