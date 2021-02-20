package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PieChartMediaInfo
import typings.arcgisJsApi.esri.PieChartMediaInfoConstructor
import typings.arcgisJsApi.esri.PieChartMediaInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pieChartMediaInfoMod extends Shortcut {
  
  @JSImport("esri/popup/content/PieChartMediaInfo", JSImport.Namespace)
  @js.native
  val ^ : PieChartMediaInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/content/PieChartMediaInfo", JSImport.Namespace)
  @js.native
  /**
    * A `PieChartMediaInfo` is a type of chart media element that represents a pie chart displayed within a popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-PieChartMediaInfo.html)
    */
  class Class () extends PieChartMediaInfo {
    def this(properties: PieChartMediaInfoProperties) = this()
  }
  
  type _To = PieChartMediaInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `pieChartMediaInfoMod.foo` */
  override def _to: PieChartMediaInfoConstructor = ^
}
