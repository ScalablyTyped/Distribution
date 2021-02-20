package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.LineChartMediaInfo
import typings.arcgisJsApi.esri.LineChartMediaInfoConstructor
import typings.arcgisJsApi.esri.LineChartMediaInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineChartMediaInfoMod extends Shortcut {
  
  @JSImport("esri/popup/content/LineChartMediaInfo", JSImport.Namespace)
  @js.native
  val ^ : LineChartMediaInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/content/LineChartMediaInfo", JSImport.Namespace)
  @js.native
  /**
    * A `LineChartMediaInfo` is a type of chart media element that represents a line chart displayed within a popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-LineChartMediaInfo.html)
    */
  class Class () extends LineChartMediaInfo {
    def this(properties: LineChartMediaInfoProperties) = this()
  }
  
  type _To = LineChartMediaInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `lineChartMediaInfoMod.foo` */
  override def _to: LineChartMediaInfoConstructor = ^
}
