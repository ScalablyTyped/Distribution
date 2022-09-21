package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildingLevel
  extends StObject
     with Accessor {
  
  /**
    * List of all the values which are allowed for the filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingLevel.html#allowedValues)
    */
  val allowedValues: js.Array[Double] = js.native
  
  /**
    * Removes the filter by setting [enabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingLevel.html#enabled) to `false`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingLevel.html#clear)
    */
  def clear(): scala.Unit = js.native
  
  /**
    * Whether the filter is enabled.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingLevel.html#enabled)
    */
  val enabled: Boolean = js.native
  
  /**
    * If the field that is used for filtering has a coded value domain, the label for the value can be used to be displayed in a tooltip or in the widget UI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingLevel.html#getValueLabel)
    */
  def getValueLabel(value: Double): String | Any = js.native
  
  /**
    * Whether the next value can be selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingLevel.html#hasNext)
    */
  val hasNext: Boolean = js.native
  
  /**
    * Whether the previous value can be selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingLevel.html#hasPrevious)
    */
  val hasPrevious: Boolean = js.native
  
  /**
    * The maximum value allowed for the filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingLevel.html#max)
    */
  val max: Double = js.native
  
  /**
    * The minimum value allowed for the filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingLevel.html#min)
    */
  val min: Double = js.native
  
  /**
    * Selects the next value, if available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingLevel.html#next)
    */
  def next(): scala.Unit = js.native
  
  /**
    * Selects the previous value, if available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingLevel.html#previous)
    */
  def previous(): scala.Unit = js.native
  
  /**
    * Selects the specified value for the filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingLevel.html#select)
    */
  def select(value: Double): scala.Unit = js.native
  
  /**
    * The value which is currently set on the filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingLevel.html#value)
    */
  val value: Double = js.native
}
