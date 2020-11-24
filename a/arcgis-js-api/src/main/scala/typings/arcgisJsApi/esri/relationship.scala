package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object contains a helper method for creating a renderer for exploring the relationship between two numeric attributes.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html)
  */
@js.native
trait relationship extends js.Object {
  
  /**
    * Generates a relationship renderer (bivariate choropleth) based on a set of competing numeric fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)
    */
  def createRenderer(params: relationshipCreateRendererParams): js.Promise[relationshipRendererResult] = js.native
  
  /**
    * Updates a relationship renderer (bivariate choropleth) generated from [createRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer) based on the given input parameters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#updateRenderer)
    */
  def updateRenderer(params: relationshipUpdateRendererParams): js.Promise[UniqueValueRenderer] = js.native
}
object relationship {
  
  @scala.inline
  def apply(
    createRenderer: relationshipCreateRendererParams => js.Promise[relationshipRendererResult],
    updateRenderer: relationshipUpdateRendererParams => js.Promise[UniqueValueRenderer]
  ): relationship = {
    val __obj = js.Dynamic.literal(createRenderer = js.Any.fromFunction1(createRenderer), updateRenderer = js.Any.fromFunction1(updateRenderer))
    __obj.asInstanceOf[relationship]
  }
  
  @scala.inline
  implicit class relationshipOps[Self <: relationship] (val x: Self) extends AnyVal {
    
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
    def setCreateRenderer(value: relationshipCreateRendererParams => js.Promise[relationshipRendererResult]): Self = this.set("createRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateRenderer(value: relationshipUpdateRendererParams => js.Promise[UniqueValueRenderer]): Self = this.set("updateRenderer", js.Any.fromFunction1(value))
  }
}
