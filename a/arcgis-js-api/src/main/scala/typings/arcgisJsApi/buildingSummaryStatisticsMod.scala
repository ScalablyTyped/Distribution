package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.BuildingSummaryStatistics
import typings.arcgisJsApi.esri.BuildingSummaryStatisticsConstructor
import typings.arcgisJsApi.esri.BuildingSummaryStatisticsProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildingSummaryStatisticsMod extends Shortcut {
  
  @JSImport("esri/layers/support/BuildingSummaryStatistics", JSImport.Namespace)
  @js.native
  val ^ : BuildingSummaryStatisticsConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/BuildingSummaryStatistics", JSImport.Namespace)
  @js.native
  /**
    * Contains statistics about the fields in all sublayers of a [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html)
    */
  class Class () extends BuildingSummaryStatistics {
    def this(properties: BuildingSummaryStatisticsProperties) = this()
  }
  
  type _To = BuildingSummaryStatisticsConstructor
  
  /* This means you don't have to write `^`, but can instead just say `buildingSummaryStatisticsMod.foo` */
  override def _to: BuildingSummaryStatisticsConstructor = ^
}
