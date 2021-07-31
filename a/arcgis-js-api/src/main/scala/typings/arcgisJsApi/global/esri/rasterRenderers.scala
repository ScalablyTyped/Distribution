package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ClassBreaksRendererConstructor
import typings.arcgisJsApi.esri.ClassBreaksRendererProperties
import typings.arcgisJsApi.esri.RasterColormapRendererConstructor
import typings.arcgisJsApi.esri.RasterColormapRendererProperties
import typings.arcgisJsApi.esri.RasterShadedReliefRendererConstructor
import typings.arcgisJsApi.esri.RasterShadedReliefRendererProperties
import typings.arcgisJsApi.esri.RasterStretchRendererConstructor
import typings.arcgisJsApi.esri.RasterStretchRendererProperties
import typings.arcgisJsApi.esri.UniqueValueRendererConstructor
import typings.arcgisJsApi.esri.UniqueValueRendererProperties
import typings.arcgisJsApi.esri.VectorFieldRendererConstructor
import typings.arcgisJsApi.esri.VectorFieldRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A convenience module for importing renderer classes that can be used to render [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html) when developing with [TypeScript](https://developers.arcgis.com/javascript/latest/guide/typescript-setup/index.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rasterRenderers.html)
  */
object rasterRenderers {
  
  @JSGlobal("__esri.rasterRenderers.ClassBreaksRenderer")
  @js.native
  val ClassBreaksRenderer: ClassBreaksRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.rasterRenderers.ClassBreaksRenderer")
  @js.native
  /**
    * ClassBreaksRenderer defines the symbol of each feature in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) based on the value of a numeric attribute.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html)
    */
  class ClassBreaksRendererCls ()
    extends StObject
       with typings.arcgisJsApi.esri.ClassBreaksRenderer {
    def this(properties: ClassBreaksRendererProperties) = this()
    
    /**
      * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /**
      * An array of [VisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html) objects.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-mixins-VisualVariablesMixin.html#visualVariables)
      */
    /* CompleteClass */
    var visualVariables: js.Array[typings.arcgisJsApi.esri.VisualVariable] = js.native
  }
  
  @JSGlobal("__esri.rasterRenderers.RasterColormapRenderer")
  @js.native
  val RasterColormapRenderer: RasterColormapRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.rasterRenderers.RasterColormapRenderer")
  @js.native
  /**
    * The RasterColormapRenderer defines the symbology to display raster data based on specific colors, aiding in visual analysis of the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterColormapRenderer.html)
    */
  class RasterColormapRendererCls ()
    extends StObject
       with typings.arcgisJsApi.esri.RasterColormapRenderer {
    def this(properties: RasterColormapRendererProperties) = this()
    
    /**
      * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
  }
  
  @JSGlobal("__esri.rasterRenderers.RasterShadedReliefRenderer")
  @js.native
  val RasterShadedReliefRenderer: RasterShadedReliefRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.rasterRenderers.RasterShadedReliefRenderer")
  @js.native
  /**
    * RasterShadedReliefRenderer produces a grayscale or colored 3D representation of the surface on an [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html) or [ImageryTileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html), with the sun's relative position taken into account for shading the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html)
    */
  class RasterShadedReliefRendererCls ()
    extends StObject
       with typings.arcgisJsApi.esri.RasterShadedReliefRenderer {
    def this(properties: RasterShadedReliefRendererProperties) = this()
    
    /**
      * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
  }
  
  @JSGlobal("__esri.rasterRenderers.RasterStretchRenderer")
  @js.native
  val RasterStretchRenderer: RasterStretchRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.rasterRenderers.RasterStretchRenderer")
  @js.native
  /**
    * RasterStretchRenderer defines the symbology with a gradual ramp of colors for each pixel in a [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html) based on the pixel value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html)
    */
  class RasterStretchRendererCls ()
    extends StObject
       with typings.arcgisJsApi.esri.RasterStretchRenderer {
    def this(properties: RasterStretchRendererProperties) = this()
    
    /**
      * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
  }
  
  @JSGlobal("__esri.rasterRenderers.UniqueValueRenderer")
  @js.native
  val UniqueValueRenderer: UniqueValueRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.rasterRenderers.UniqueValueRenderer")
  @js.native
  /**
    * UniqueValueRenderer allows you to symbolize features in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) based on one or more matching string attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html)
    */
  class UniqueValueRendererCls ()
    extends StObject
       with typings.arcgisJsApi.esri.UniqueValueRenderer {
    def this(properties: UniqueValueRendererProperties) = this()
    
    /**
      * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /**
      * An array of [VisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html) objects.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-mixins-VisualVariablesMixin.html#visualVariables)
      */
    /* CompleteClass */
    var visualVariables: js.Array[typings.arcgisJsApi.esri.VisualVariable] = js.native
  }
  
  @JSGlobal("__esri.rasterRenderers.VectorFieldRenderer")
  @js.native
  val VectorFieldRenderer: VectorFieldRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.rasterRenderers.VectorFieldRenderer")
  @js.native
  /**
    * The VectorFieldRenderer allows you to display your raster data with vector symbols.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html)
    */
  class VectorFieldRendererCls ()
    extends StObject
       with typings.arcgisJsApi.esri.VectorFieldRenderer {
    def this(properties: VectorFieldRendererProperties) = this()
    
    /**
      * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
  }
}
