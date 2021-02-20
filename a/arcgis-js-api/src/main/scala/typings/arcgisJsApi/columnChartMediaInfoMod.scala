package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ColumnChartMediaInfo
import typings.arcgisJsApi.esri.ColumnChartMediaInfoConstructor
import typings.arcgisJsApi.esri.ColumnChartMediaInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnChartMediaInfoMod extends Shortcut {
  
  @JSImport("esri/popup/content/ColumnChartMediaInfo", JSImport.Namespace)
  @js.native
  val ^ : ColumnChartMediaInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/content/ColumnChartMediaInfo", JSImport.Namespace)
  @js.native
  /**
    * A `ColumnChartMediaInfo` is a type of chart media element that represents a column chart displayed within a popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ColumnChartMediaInfo.html)
    */
  class Class () extends ColumnChartMediaInfo {
    def this(properties: ColumnChartMediaInfoProperties) = this()
  }
  
  type _To = ColumnChartMediaInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `columnChartMediaInfoMod.foo` */
  override def _to: ColumnChartMediaInfoConstructor = ^
}
