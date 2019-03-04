package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodedValueDomainCodedValues
  extends stdLib.Object {
  /**
    * The value of the code.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CodedValueDomain.html#codedValues)
    */
  var code: java.lang.String | scala.Double
  /**
    * The name of the coded value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CodedValueDomain.html#codedValues)
    */
  var name: java.lang.String
}

object CodedValueDomainCodedValues {
  @scala.inline
  def apply(
    code: java.lang.String | scala.Double,
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    name: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): CodedValueDomainCodedValues = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], constructor = constructor, hasOwnProperty = hasOwnProperty, name = name, propertyIsEnumerable = propertyIsEnumerable)
  
    __obj.asInstanceOf[CodedValueDomainCodedValues]
  }
}

