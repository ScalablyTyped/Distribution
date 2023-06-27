package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.AttachmentsContentProperties
import typings.arcgisJsApi.esri.CustomContentProperties
import typings.arcgisJsApi.esri.ExpressionContentProperties
import typings.arcgisJsApi.esri.FieldsContentProperties
import typings.arcgisJsApi.esri.MediaContentProperties
import typings.arcgisJsApi.esri.RelationshipContentProperties
import typings.arcgisJsApi.esri.TextContentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * A convenience module for importing [Content](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-Content.html) classes when developing with [TypeScript](https://developers.arcgis.com/javascript/latest/typescript-setup/).
	 *
	 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content.html)
	 */
object content {
  
  object AttachmentsContent {
    
    @JSGlobal("__esri.content.AttachmentsContent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.AttachmentsContent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.AttachmentsContent]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.content.AttachmentsContent")
  @js.native
  /**
  		 * An `AttachmentsContent` popup element represents an attachment element associated with a feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html)
  		 */
  open class AttachmentsContentCls ()
    extends StObject
       with typings.arcgisJsApi.esri.AttachmentsContent {
    def this(properties: AttachmentsContentProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  object CustomContent {
    
    @JSGlobal("__esri.content.CustomContent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.CustomContent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.CustomContent]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.content.CustomContent")
  @js.native
  /**
  		 * A `CustomContent` popup element is used to provide a way to customize the [popup's](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) content.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-CustomContent.html)
  		 */
  open class CustomContentCls ()
    extends StObject
       with typings.arcgisJsApi.esri.CustomContent {
    def this(properties: CustomContentProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  object ExpressionContent {
    
    @JSGlobal("__esri.content.ExpressionContent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ExpressionContent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ExpressionContent]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.content.ExpressionContent")
  @js.native
  /**
  		 * An ExpressionContent element allows you to define a popup content element with an [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ExpressionContent.html)
  		 */
  open class ExpressionContentCls ()
    extends StObject
       with typings.arcgisJsApi.esri.ExpressionContent {
    def this(properties: ExpressionContentProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  object FieldsContent {
    
    @JSGlobal("__esri.content.FieldsContent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.FieldsContent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.FieldsContent]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.content.FieldsContent")
  @js.native
  /**
  		 * A `FieldsContent` popup element represents the [FieldInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html) associated with a feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-FieldsContent.html)
  		 */
  open class FieldsContentCls ()
    extends StObject
       with typings.arcgisJsApi.esri.FieldsContent {
    def this(properties: FieldsContentProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  object MediaContent {
    
    @JSGlobal("__esri.content.MediaContent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.MediaContent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.MediaContent]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.content.MediaContent")
  @js.native
  /**
  		 * A `MediaContent` popup element contains an individual or array of chart and/or image media elements to display within a popup's content.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-MediaContent.html)
  		 */
  open class MediaContentCls ()
    extends StObject
       with typings.arcgisJsApi.esri.MediaContent {
    def this(properties: MediaContentProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  object RelationshipContent {
    
    @JSGlobal("__esri.content.RelationshipContent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.RelationshipContent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.RelationshipContent]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.content.RelationshipContent")
  @js.native
  /**
  		 * A `RelationshipContent` popup element represents a relationship element associated with a feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-RelationshipContent.html)
  		 */
  open class RelationshipContentCls ()
    extends StObject
       with typings.arcgisJsApi.esri.RelationshipContent {
    def this(properties: RelationshipContentProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  object TextContent {
    
    @JSGlobal("__esri.content.TextContent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.TextContent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.TextContent]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.content.TextContent")
  @js.native
  /**
  		 * A `TextContent` popup element is used to define descriptive text as an element within a [PopupTemplate's](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) content.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-TextContent.html)
  		 */
  open class TextContentCls ()
    extends StObject
       with typings.arcgisJsApi.esri.TextContent {
    def this(properties: TextContentProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
}
