package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureType
  extends Accessor
     with JSONSupport {
  /**
    * Domains associated with the feature type. It is an object where the name of each property corresponds with the name of a field containing a domain. If a field's domain is an instance of [InheritedDomain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-InheritedDomain.html), the application will use the domain defined for the field from the layer. If the domain is an instance of [CodedValueDomain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CodedValueDomain.html) or [RangeDomain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html) then the domain is defined specifically for the given feature type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureType.html#domains)
    */
  var domains: js.Any = js.native
  /**
    * The feature type identifier.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureType.html#id)
    */
  var id: Double | String = js.native
  /**
    * The feature type name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureType.html#name)
    */
  var name: String = js.native
  /**
    * Array of [feature templates](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html) associated with the feature type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureType.html#templates)
    */
  var templates: js.Array[FeatureTemplate] = js.native
}

@JSGlobal("__esri.FeatureType")
@js.native
object FeatureType extends TopLevel[FeatureTypeConstructor]

