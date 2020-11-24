package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.collapsed
import typings.arcgisJsApi.arcgisJsApiStrings.expanded
import typings.arcgisJsApi.arcgisJsApiStrings.group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupElementProperties extends ElementMixinProperties {
  
  /**
    * An array of [field elements](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html) to display as grouped.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-GroupElement.html#elements)
    */
  var elements: js.UndefOr[js.Array[FieldElementProperties]] = js.native
  
  /**
    * Defines if the group should be expanded or collapsed when the form is initially displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-GroupElement.html#initialState)
    */
  var initialState: js.UndefOr[collapsed | expanded] = js.native
  
  /**
    * The type of the [element](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-Element.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-GroupElement.html#type)
    */
  var `type`: js.UndefOr[group] = js.native
}
object GroupElementProperties {
  
  @scala.inline
  def apply(): GroupElementProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupElementProperties]
  }
  
  @scala.inline
  implicit class GroupElementPropertiesOps[Self <: GroupElementProperties] (val x: Self) extends AnyVal {
    
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
    def setElementsVarargs(value: FieldElementProperties*): Self = this.set("elements", js.Array(value :_*))
    
    @scala.inline
    def setElements(value: js.Array[FieldElementProperties]): Self = this.set("elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElements: Self = this.set("elements", js.undefined)
    
    @scala.inline
    def setInitialState(value: collapsed | expanded): Self = this.set("initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    
    @scala.inline
    def setType(value: group): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
