package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ClassBreaksRenderer
import typings.arcgisJsApi.esri.ClassBreaksRendererProperties
import typings.arcgisJsApi.esri.FlowRenderer
import typings.arcgisJsApi.esri.FlowRendererProperties
import typings.arcgisJsApi.esri.RasterColormapRenderer
import typings.arcgisJsApi.esri.RasterColormapRendererProperties
import typings.arcgisJsApi.esri.RasterShadedReliefRenderer
import typings.arcgisJsApi.esri.RasterShadedReliefRendererProperties
import typings.arcgisJsApi.esri.RasterStretchRenderer
import typings.arcgisJsApi.esri.RasterStretchRendererProperties
import typings.arcgisJsApi.esri.UniqueValueRenderer
import typings.arcgisJsApi.esri.UniqueValueRendererProperties
import typings.arcgisJsApi.esri.VectorFieldRenderer
import typings.arcgisJsApi.esri.VectorFieldRendererProperties
import typings.arcgisJsApi.esri.VisualVariable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRasterRenderersMod {
  
  object ClassBreaksRenderer {
    
    @JSImport("esri/rasterRenderers", "ClassBreaksRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ClassBreaksRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ClassBreaksRenderer]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rasterRenderers", "ClassBreaksRenderer")
  @js.native
  /**
  		 * ClassBreaksRenderer defines the symbol of each feature in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) based on the value of a numeric attribute.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html)
  		 */
  open class ClassBreaksRendererCls ()
    extends StObject
       with ClassBreaksRenderer {
    def this(properties: ClassBreaksRendererProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
    
    /**
    		 * An array of [VisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html) objects.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-mixins-VisualVariablesMixin.html#visualVariables)
    		 */
    /* CompleteClass */
    var visualVariables: js.Array[VisualVariable] = js.native
  }
  
  object FlowRenderer {
    
    @JSImport("esri/rasterRenderers", "FlowRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.FlowRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.FlowRenderer]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rasterRenderers", "FlowRenderer")
  @js.native
  /**
  		 * The FlowRenderer allows you to visualize your raster data with animated streamlines.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html)
  		 */
  open class FlowRendererCls ()
    extends StObject
       with FlowRenderer {
    def this(properties: FlowRendererProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  object RasterColormapRenderer {
    
    @JSImport("esri/rasterRenderers", "RasterColormapRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
    		 * Creates a new instance [RasterColormapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterColormapRenderer.html) from an array of color maps where pixel values with its corresponding RGB color values specified.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterColormapRenderer.html#createFromColormap)
    		 */
    inline def createFromColormap(colormap: js.Array[js.Array[Double]]): typings.arcgisJsApi.esri.RasterColormapRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromColormap")(colormap.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.RasterColormapRenderer]
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.RasterColormapRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.RasterColormapRenderer]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rasterRenderers", "RasterColormapRenderer")
  @js.native
  /**
  		 * The RasterColormapRenderer defines the symbology to display raster data based on specific colors, aiding in visual analysis of the data.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterColormapRenderer.html)
  		 */
  open class RasterColormapRendererCls ()
    extends StObject
       with RasterColormapRenderer {
    def this(properties: RasterColormapRendererProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  object RasterShadedReliefRenderer {
    
    @JSImport("esri/rasterRenderers", "RasterShadedReliefRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.RasterShadedReliefRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.RasterShadedReliefRenderer]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rasterRenderers", "RasterShadedReliefRenderer")
  @js.native
  /**
  		 * RasterShadedReliefRenderer produces a grayscale or colored 3D representation of the surface on an [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html) or [ImageryTileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html), with the sun's relative position taken into account for shading the image.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html)
  		 */
  open class RasterShadedReliefRendererCls ()
    extends StObject
       with RasterShadedReliefRenderer {
    def this(properties: RasterShadedReliefRendererProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  object RasterStretchRenderer {
    
    @JSImport("esri/rasterRenderers", "RasterStretchRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.RasterStretchRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.RasterStretchRenderer]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rasterRenderers", "RasterStretchRenderer")
  @js.native
  /**
  		 * RasterStretchRenderer defines the symbology with a gradual ramp of colors for each pixel in a [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html), [ImageryTileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html), and [WCSLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html) based on the pixel value.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html)
  		 */
  open class RasterStretchRendererCls ()
    extends StObject
       with RasterStretchRenderer {
    def this(properties: RasterStretchRendererProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  object UniqueValueRenderer {
    
    @JSImport("esri/rasterRenderers", "UniqueValueRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.UniqueValueRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.UniqueValueRenderer]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rasterRenderers", "UniqueValueRenderer")
  @js.native
  /**
  		 * UniqueValueRenderer allows you to symbolize features in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) based on one or more categorical attributes.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html)
  		 */
  open class UniqueValueRendererCls ()
    extends StObject
       with UniqueValueRenderer {
    def this(properties: UniqueValueRendererProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
    
    /**
    		 * An array of [VisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html) objects.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-mixins-VisualVariablesMixin.html#visualVariables)
    		 */
    /* CompleteClass */
    var visualVariables: js.Array[VisualVariable] = js.native
  }
  
  object VectorFieldRenderer {
    
    @JSImport("esri/rasterRenderers", "VectorFieldRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.VectorFieldRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.VectorFieldRenderer]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rasterRenderers", "VectorFieldRenderer")
  @js.native
  /**
  		 * The VectorFieldRenderer allows you to display your raster data with vector symbols.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html)
  		 */
  open class VectorFieldRendererCls ()
    extends StObject
       with VectorFieldRenderer {
    def this(properties: VectorFieldRendererProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
}
