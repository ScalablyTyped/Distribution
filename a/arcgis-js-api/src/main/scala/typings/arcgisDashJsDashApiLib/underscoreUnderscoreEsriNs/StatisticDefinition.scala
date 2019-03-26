package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatisticDefinition
  extends Accessor
     with JSONSupport {
  /**
    * Defines the field for which statistics will be calculated. This can be service field names or SQL expressions. See the snippets below for examples.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#onStatisticField)
    */
  var onStatisticField: java.lang.String = js.native
  /**
    * Specifies the output field name for the requested statistic. Output field names can only contain alpha-numeric characters and an underscore. If no output field name is specified, the server assigns a field name to the returned statistic field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#outStatisticFieldName)
    */
  var outStatisticFieldName: java.lang.String = js.native
  /**
    * Defines the type of statistic.  **Possible Values:** count | sum | min | max | avg | stddev | var
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#statisticType)
    */
  var statisticType: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.count | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.sum | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.min | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.max | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.avg | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.stddev | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`var` = js.native
}

@JSGlobal("__esri.StatisticDefinition")
@js.native
class StatisticDefinitionCls () extends StatisticDefinition {
  def this(properties: StatisticDefinitionProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

