package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schemes extends Object {
  /**
    * Includes the primary labeling scheme suggested for the input layer's clusters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-clusters.html#Schemes)
    */
  var primaryScheme: Scheme = js.native
  /**
    * Includes secondary labeling schemes suggested for the input layer's clusters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-clusters.html#Schemes)
    */
  var secondarySchemes: js.Array[Scheme] = js.native
}

object Schemes {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    primaryScheme: Scheme,
    propertyIsEnumerable: PropertyKey => Boolean,
    secondarySchemes: js.Array[Scheme]
  ): Schemes = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), primaryScheme = primaryScheme.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), secondarySchemes = secondarySchemes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schemes]
  }
  @scala.inline
  implicit class SchemesOps[Self <: Schemes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPrimaryScheme(value: Scheme): Self = this.set("primaryScheme", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecondarySchemesVarargs(value: Scheme*): Self = this.set("secondarySchemes", js.Array(value :_*))
    @scala.inline
    def setSecondarySchemes(value: js.Array[Scheme]): Self = this.set("secondarySchemes", value.asInstanceOf[js.Any])
  }
  
}

