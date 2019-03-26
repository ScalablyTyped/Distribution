package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

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
  /**
    * The domain type. This value is always `coded-value`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CodedValueDomain.html#type)
    */
  @JSName("type")
  val type_CodedValueDomain: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`coded-value` = js.native
  /**
    * Returns the name of the coded-value associated with the specified code.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CodedValueDomain.html#getName)
    *
    * @param code The code associated with the desired name.
    *
    */
  def getName(code: java.lang.String): java.lang.String = js.native
  def getName(code: scala.Double): java.lang.String = js.native
}

@JSGlobal("__esri.CodedValueDomain")
@js.native
class CodedValueDomainCls () extends CodedValueDomain {
  def this(properties: CodedValueDomainProperties) = this()
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

