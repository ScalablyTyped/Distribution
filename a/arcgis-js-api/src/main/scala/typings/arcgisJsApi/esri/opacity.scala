package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This object contains a helper method for generating data-driven visualizations with continuous opacity based on data returned from a field value or expression in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-opacity.html)
  */
trait opacity extends js.Object {
  /**
    * This method generates an opacity visual variable with default alpha values optimally mapped to data values based on the statistics queried for the indicated field or expression.  There are several ways this method may be called. The most common case is by providing a `layer` and a `field`. This is the scenario where the statistics of the data aren't well known and the user doesn't know the which alpha values to map to data values. You can optionally use a `valueExpression` instead of a field to visualize features based on a numeric value returned from a script executed at runtime.  The other options are provided for convenience for more involved custom visualization authoring applications. For example, if you already generated statistics in another operation, you can pass the stats in the `statistics` parameter to avoid making an extra call to the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-opacity.html#createVisualVariable)
    *
    * @param params Input parameters for generating an opacity visual variable based on data returned from a given field or expression. See the table below for details of each parameter.
    * @param params.layer The layer for which the visual variable is generated.
    * @param params.field The name of the field whose data will be queried for statistics and used for the basis of the data-driven visualization. This property is ignored if a `valueExpression` is used.
    * @param params.normalizationField The name of the field to normalize the values of the given `field`. Providing a normalization field helps minimize some visualization errors and standardizes the data so all features are visualized with minimal bias due to area differences or count variation. This option is commonly used when visualizing densities.
    * @param params.valueExpression An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a number. This expression can reference field values using the `$feature` global variable. This property overrides the `field` property and therefore is used instead of an input `field` value.
    * @param params.valueExpressionTitle Text describing the value returned from the `valueExpression`. This is used by the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget.
    * @param params.sqlExpression A SQL expression evaluating to a number.
    * @param params.sqlWhere A SQL where clause used to filter features for the statistics query. For example, this is useful in situations where you want to avoid dividing by zero as is the case with creating a predominance visualization.
    * @param params.legendOptions Provides options for setting a title to a field when an expression is provided instead of a field name. This title will represent the field in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    * @param params.statistics A statistics object generated from the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html) function. If statistics for the field have already been generated, then pass the object here to avoid making a second statistics query to the server.
    * @param params.minValue A custom minimum value set by the user. Use this in conjunction with `maxValue` to generate statistics between lower and upper bounds. This will be the lowest stop in the returned visual variable.
    * @param params.maxValue A custom maximum value set by the user. Use this in conjunction with `minValue` to generate statistics between lower and upper bounds. This will be the uppermost stop in the returned visual variable.
    * @param params.view A [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) or [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance is required when a `valueExpression` is specified.
    * @param params.signal Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    */
  def createVisualVariable(params: opacityCreateVisualVariableParams): js.Promise[opacityVisualVariableResult]
}

object opacity {
  @scala.inline
  def apply(createVisualVariable: opacityCreateVisualVariableParams => js.Promise[opacityVisualVariableResult]): opacity = {
    val __obj = js.Dynamic.literal(createVisualVariable = js.Any.fromFunction1(createVisualVariable))
    __obj.asInstanceOf[opacity]
  }
}

