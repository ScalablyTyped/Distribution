package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.BuildingSummaryStatistics
import typings.arcgisJsApi.esri.BuildingSummaryStatisticsConstructor
import typings.arcgisJsApi.esri.BuildingSummaryStatisticsProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportBuildingSummaryStatisticsMod extends Shortcut {
  
  @JSImport("esri/layers/support/BuildingSummaryStatistics", JSImport.Namespace)
  @js.native
  val ^ : js.Object & BuildingSummaryStatisticsConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/BuildingSummaryStatistics", JSImport.Namespace)
  @js.native
  /**
    * Contains statistics about the fields in all sublayers of a [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html)
    */
  open class Class ()
    extends StObject
       with BuildingSummaryStatistics {
    def this(properties: BuildingSummaryStatisticsProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & BuildingSummaryStatisticsConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersSupportBuildingSummaryStatisticsMod.foo` */
  override def _to: js.Object & BuildingSummaryStatisticsConstructor = ^
}
