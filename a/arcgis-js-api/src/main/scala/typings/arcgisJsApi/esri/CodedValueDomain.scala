package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`coded-value`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodedValueDomain extends Domain {
  /**
    * An array of the coded values in the domain. See the object specification table below for the properties each item in the array should contain.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CodedValueDomain.html#codedValues)
    */
  var codedValues: js.Array[CodedValueDomainCodedValues] = js.native
  @JSName("type")
  val type_CodedValueDomain: `coded-value` = js.native
  /**
    * Returns the name of the coded-value associated with the specified code.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CodedValueDomain.html#getName)
    *
    * @param code The code associated with the desired name.
    *
    */
  def getName(code: String): String = js.native
  def getName(code: Double): String = js.native
}

