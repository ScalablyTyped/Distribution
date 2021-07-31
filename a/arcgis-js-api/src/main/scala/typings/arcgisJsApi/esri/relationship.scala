package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object contains a helper method for creating a renderer for exploring the relationship between two numeric attributes.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html)
  */
trait relationship extends StObject {
  
  /**
    * Generates a relationship renderer (bivariate choropleth) based on a set of competing numeric fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)
    */
  def createRenderer(params: relationshipCreateRendererParams): js.Promise[relationshipRendererResult]
  
  /**
    * Updates a relationship renderer (bivariate choropleth) generated from [createRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer) based on the given input parameters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#updateRenderer)
    */
  def updateRenderer(params: relationshipUpdateRendererParams): js.Promise[UniqueValueRenderer]
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
  implicit class relationshipMutableBuilder[Self <: relationship] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateRenderer(value: relationshipCreateRendererParams => js.Promise[relationshipRendererResult]): Self = StObject.set(x, "createRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateRenderer(value: relationshipUpdateRendererParams => js.Promise[UniqueValueRenderer]): Self = StObject.set(x, "updateRenderer", js.Any.fromFunction1(value))
  }
}
