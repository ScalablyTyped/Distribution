package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Function for generating attribute statistics in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) based on values returned from a given field.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html)
  */
trait summaryStatistics extends js.Object {
  /**
    * Returns an object containing various statistics describing a set of values returned from a field (or expression) in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html#summaryStatistics)
    *
    * @param params See the table below for details of each parameter.
    * @param params.layer The layer from which to generate statistics for the given `field`.
    * @param params.field The name of the numeric field for which the summary statistics will be generated. This property is ignored if a `valueExpression` is used.
    * @param params.valueExpression An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a number. This expression can reference field values using the `$feature` global variable. This property overrides the `field` property and therefore is used instead of an input `field` value.
    * @param params.sqlExpression A SQL expression evaluating to a number.
    * @param params.sqlWhere A SQL where clause used to filter features for the statistics query. For example, this is useful in situations where you want to avoid dividing by zero as is the case with creating a predominance visualization.
    * @param params.normalizationField The field by which to normalize the values returned from the given `field`.
    * @param params.minValue The minimum bounding value for the statistics calculation. Use this in conjunction with `maxValue` to generate statistics between lower and upper bounds.
    * @param params.maxValue The maximum bounding value for the statistics calculation. Use this in conjunction with `minValue` to generate statistics between lower and upper bounds.
    * @param params.view A [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) or [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance is required when a `valueExpression` is specified.
    * @param params.features A subset of features for which to calculate the statistics.
    *
    */
  def summaryStatistics(params: summaryStatisticsSummaryStatisticsParams): IPromise[SummaryStatisticsResult]
}

object summaryStatistics {
  @scala.inline
  def apply(summaryStatistics: summaryStatisticsSummaryStatisticsParams => IPromise[SummaryStatisticsResult]): summaryStatistics = {
    val __obj = js.Dynamic.literal(summaryStatistics = js.Any.fromFunction1(summaryStatistics))
  
    __obj.asInstanceOf[summaryStatistics]
  }
}

