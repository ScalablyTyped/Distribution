package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureTypeProperties extends js.Object {
  /**
    * Domains associated with the feature type. It is an object where the name of each property corresponds with the name of a field containing a domain. If a field's domain is an instance of [InheritedDomain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-InheritedDomain.html), the application will use the domain defined for the field from the layer. If the domain is an instance of [CodedValueDomain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CodedValueDomain.html) or [RangeDomain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html) then the domain is defined specifically for the given feature type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureType.html#domains)
    */
  var domains: js.UndefOr[js.Any] = js.native
  /**
    * The feature type identifier.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureType.html#id)
    */
  var id: js.UndefOr[Double | String] = js.native
  /**
    * The feature type name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureType.html#name)
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Array of [feature templates](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html) associated with the feature type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureType.html#templates)
    */
  var templates: js.UndefOr[js.Array[FeatureTemplateProperties]] = js.native
}

object FeatureTypeProperties {
  @scala.inline
  def apply(): FeatureTypeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureTypeProperties]
  }
  @scala.inline
  implicit class FeatureTypePropertiesOps[Self <: FeatureTypeProperties] (val x: Self) extends AnyVal {
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
    def setDomains(value: js.Any): Self = this.set("domains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomains: Self = this.set("domains", js.undefined)
    @scala.inline
    def setId(value: Double | String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTemplatesVarargs(value: FeatureTemplateProperties*): Self = this.set("templates", js.Array(value :_*))
    @scala.inline
    def setTemplates(value: js.Array[FeatureTemplateProperties]): Self = this.set("templates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplates: Self = this.set("templates", js.undefined)
  }
  
}

