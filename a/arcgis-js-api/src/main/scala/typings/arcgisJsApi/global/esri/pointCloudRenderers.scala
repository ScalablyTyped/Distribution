package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.PointCloudClassBreaksRendererProperties
import typings.arcgisJsApi.esri.PointCloudRGBRendererProperties
import typings.arcgisJsApi.esri.PointCloudStretchRendererProperties
import typings.arcgisJsApi.esri.PointCloudUniqueValueRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * A convenience module for importing [PointCloudRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html) classes when developing with [TypeScript](https://developers.arcgis.com/javascript/latest/typescript-setup/).
	 *
	 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-pointCloudRenderers.html)
	 */
object pointCloudRenderers {
  
  object PointCloudClassBreaksRenderer {
    
    @JSGlobal("__esri.pointCloudRenderers.PointCloudClassBreaksRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.PointCloudClassBreaksRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.PointCloudClassBreaksRenderer]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.pointCloudRenderers.PointCloudClassBreaksRenderer")
  @js.native
  /**
  		 * This class defines the color of each point in a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html) based on the value of a numeric attribute.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html)
  		 */
  open class PointCloudClassBreaksRendererCls ()
    extends StObject
       with typings.arcgisJsApi.esri.PointCloudClassBreaksRenderer {
    def this(properties: PointCloudClassBreaksRendererProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  object PointCloudRGBRenderer {
    
    @JSGlobal("__esri.pointCloudRenderers.PointCloudRGBRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.PointCloudRGBRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.PointCloudRGBRenderer]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.pointCloudRenderers.PointCloudRGBRenderer")
  @js.native
  /**
  		 * PointCloudRGBRenderer defines the color of each point in a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html) based on the value of a color attribute.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRGBRenderer.html)
  		 */
  open class PointCloudRGBRendererCls ()
    extends StObject
       with typings.arcgisJsApi.esri.PointCloudRGBRenderer {
    def this(properties: PointCloudRGBRendererProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  object PointCloudStretchRenderer {
    
    @JSGlobal("__esri.pointCloudRenderers.PointCloudStretchRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.PointCloudStretchRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.PointCloudStretchRenderer]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.pointCloudRenderers.PointCloudStretchRenderer")
  @js.native
  /**
  		 * PointCloudStretchRenderer defines the color of each point in a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html) based on the value of a numeric attribute.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html)
  		 */
  open class PointCloudStretchRendererCls ()
    extends StObject
       with typings.arcgisJsApi.esri.PointCloudStretchRenderer {
    def this(properties: PointCloudStretchRendererProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  object PointCloudUniqueValueRenderer {
    
    @JSGlobal("__esri.pointCloudRenderers.PointCloudUniqueValueRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.PointCloudUniqueValueRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.PointCloudUniqueValueRenderer]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.pointCloudRenderers.PointCloudUniqueValueRenderer")
  @js.native
  /**
  		 * PointCloudUniqueValueRenderer allows you to colorize points in a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html) based on an attribute value.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html)
  		 */
  open class PointCloudUniqueValueRendererCls ()
    extends StObject
       with typings.arcgisJsApi.esri.PointCloudUniqueValueRenderer {
    def this(properties: PointCloudUniqueValueRendererProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
}
