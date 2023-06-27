package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlideProperties extends StObject {
  
  /**
  		 * The basemap of the scene.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#basemap)
  		 */
  var basemap: js.UndefOr[BasemapProperties | String] = js.undefined
  
  /**
  		 * The description of the slide.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#description)
  		 */
  var description: js.UndefOr[SlideDescriptionProperties | String] = js.undefined
  
  /**
  		 * Represents settings that affect the environment in which the WebScene is displayed (such as lighting).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#environment)
  		 */
  var environment: js.UndefOr[SlideEnvironmentProperties] = js.undefined
  
  /**
  		 * Ground properties for this slide.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#ground)
  		 */
  var ground: js.UndefOr[SlideGroundProperties] = js.undefined
  
  /**
  		 * The unique id of a slide within the [slides property](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Presentation.html#slides) of a [Presentation](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Presentation.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#id)
  		 */
  var id: js.UndefOr[String] = js.undefined
  
  /**
  		 * A data URI encoded thumbnail.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#thumbnail)
  		 */
  var thumbnail: js.UndefOr[SlideThumbnailProperties | String] = js.undefined
  
  /**
  		 * The title of the slide.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#title)
  		 */
  var title: js.UndefOr[SlideTitleProperties | String] = js.undefined
  
  /**
  		 * The viewpoint of the slide.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#viewpoint)
  		 */
  var viewpoint: js.UndefOr[ViewpointProperties] = js.undefined
  
  /**
  		 * The visible layers of the scene.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#visibleLayers)
  		 */
  var visibleLayers: js.UndefOr[CollectionProperties[SlideVisibleLayersProperties]] = js.undefined
}
object SlideProperties {
  
  inline def apply(): SlideProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlideProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlideProperties] (val x: Self) extends AnyVal {
    
    inline def setBasemap(value: BasemapProperties | String): Self = StObject.set(x, "basemap", value.asInstanceOf[js.Any])
    
    inline def setBasemapUndefined: Self = StObject.set(x, "basemap", js.undefined)
    
    inline def setDescription(value: SlideDescriptionProperties | String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnvironment(value: SlideEnvironmentProperties): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setGround(value: SlideGroundProperties): Self = StObject.set(x, "ground", value.asInstanceOf[js.Any])
    
    inline def setGroundUndefined: Self = StObject.set(x, "ground", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setThumbnail(value: SlideThumbnailProperties | String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    
    inline def setTitle(value: SlideTitleProperties | String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setViewpoint(value: ViewpointProperties): Self = StObject.set(x, "viewpoint", value.asInstanceOf[js.Any])
    
    inline def setViewpointUndefined: Self = StObject.set(x, "viewpoint", js.undefined)
    
    inline def setVisibleLayers(value: CollectionProperties[SlideVisibleLayersProperties]): Self = StObject.set(x, "visibleLayers", value.asInstanceOf[js.Any])
    
    inline def setVisibleLayersUndefined: Self = StObject.set(x, "visibleLayers", js.undefined)
    
    inline def setVisibleLayersVarargs(value: SlideVisibleLayersProperties*): Self = StObject.set(x, "visibleLayers", js.Array(value*))
  }
}
