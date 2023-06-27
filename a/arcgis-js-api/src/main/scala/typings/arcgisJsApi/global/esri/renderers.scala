package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ClassBreaksRendererProperties
import typings.arcgisJsApi.esri.DictionaryRendererProperties
import typings.arcgisJsApi.esri.DotDensityRendererProperties
import typings.arcgisJsApi.esri.HeatmapRendererProperties
import typings.arcgisJsApi.esri.PieChartRendererProperties
import typings.arcgisJsApi.esri.SimpleRendererProperties
import typings.arcgisJsApi.esri.UniqueValueRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * A convenience module for importing [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html) classes when developing with [TypeScript](https://developers.arcgis.com/javascript/latest/typescript-setup/).
	 *
	 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers.html)
	 */
object renderers {
  
  object ClassBreaksRenderer {
    
    @JSGlobal("__esri.renderers.ClassBreaksRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ClassBreaksRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ClassBreaksRenderer]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.renderers.ClassBreaksRenderer")
  @js.native
  /**
  		 * ClassBreaksRenderer defines the symbol of each feature in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) based on the value of a numeric attribute.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html)
  		 */
  open class ClassBreaksRendererCls ()
    extends StObject
       with typings.arcgisJsApi.esri.ClassBreaksRenderer {
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
    var visualVariables: js.Array[typings.arcgisJsApi.esri.VisualVariable] = js.native
  }
  
  object DictionaryRenderer {
    
    @JSGlobal("__esri.renderers.DictionaryRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.DictionaryRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.DictionaryRenderer]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.renderers.DictionaryRenderer")
  @js.native
  /**
  		 * Dictionary Renderer is used to symbolize layers using a dictionary of [CIMSymbols](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html) configured with multiple attributes.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html)
  		 */
  open class DictionaryRendererCls ()
    extends StObject
       with typings.arcgisJsApi.esri.DictionaryRenderer {
    def this(properties: DictionaryRendererProperties) = this()
    
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
    var visualVariables: js.Array[typings.arcgisJsApi.esri.VisualVariable] = js.native
  }
  
  object DotDensityRenderer {
    
    @JSGlobal("__esri.renderers.DotDensityRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.DotDensityRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.DotDensityRenderer]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.renderers.DotDensityRenderer")
  @js.native
  /**
  		 * DotDensityRenderer allows you to create dot density visualizations for polygon layers.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html)
  		 */
  open class DotDensityRendererCls ()
    extends StObject
       with typings.arcgisJsApi.esri.DotDensityRenderer {
    def this(properties: DotDensityRendererProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  object HeatmapRenderer {
    
    @JSGlobal("__esri.renderers.HeatmapRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.HeatmapRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.HeatmapRenderer]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.renderers.HeatmapRenderer")
  @js.native
  /**
  		 * The HeatmapRenderer uses [kernel density](https://pro.arcgis.com/en/pro-app/2.8/tool-reference/spatial-analyst/how-kernel-density-works.htm) to render point features in [FeatureLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [CSVLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [GeoJSONLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html) and [OGCFeatureLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html) as a raster surface.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html)
  		 */
  open class HeatmapRendererCls ()
    extends StObject
       with typings.arcgisJsApi.esri.HeatmapRenderer {
    def this(properties: HeatmapRendererProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  object PieChartRenderer {
    
    @JSGlobal("__esri.renderers.PieChartRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.PieChartRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.PieChartRenderer]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.renderers.PieChartRenderer")
  @js.native
  /**
  		 * PieChartRenderer allows you to create a pie chart for each feature in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html)
  		 */
  open class PieChartRendererCls ()
    extends StObject
       with typings.arcgisJsApi.esri.PieChartRenderer {
    def this(properties: PieChartRendererProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  object SimpleRenderer {
    
    @JSGlobal("__esri.renderers.SimpleRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.SimpleRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.SimpleRenderer]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.renderers.SimpleRenderer")
  @js.native
  /**
  		 * SimpleRenderer renders all features in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) with one [Symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-SimpleRenderer.html)
  		 */
  open class SimpleRendererCls ()
    extends StObject
       with typings.arcgisJsApi.esri.SimpleRenderer {
    def this(properties: SimpleRendererProperties) = this()
    
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
    var visualVariables: js.Array[typings.arcgisJsApi.esri.VisualVariable] = js.native
  }
  
  object UniqueValueRenderer {
    
    @JSGlobal("__esri.renderers.UniqueValueRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.UniqueValueRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.UniqueValueRenderer]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.renderers.UniqueValueRenderer")
  @js.native
  /**
  		 * UniqueValueRenderer allows you to symbolize features in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) based on one or more categorical attributes.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html)
  		 */
  open class UniqueValueRendererCls ()
    extends StObject
       with typings.arcgisJsApi.esri.UniqueValueRenderer {
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
    var visualVariables: js.Array[typings.arcgisJsApi.esri.VisualVariable] = js.native
  }
}
