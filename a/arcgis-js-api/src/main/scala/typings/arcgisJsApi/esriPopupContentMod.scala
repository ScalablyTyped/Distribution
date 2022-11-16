package typings.arcgisJsApi

import typings.arcgisJsApi.esri.AttachmentsContent
import typings.arcgisJsApi.esri.AttachmentsContentProperties
import typings.arcgisJsApi.esri.CustomContent
import typings.arcgisJsApi.esri.CustomContentProperties
import typings.arcgisJsApi.esri.ExpressionContent
import typings.arcgisJsApi.esri.ExpressionContentProperties
import typings.arcgisJsApi.esri.FieldsContent
import typings.arcgisJsApi.esri.FieldsContentProperties
import typings.arcgisJsApi.esri.MediaContent
import typings.arcgisJsApi.esri.MediaContentProperties
import typings.arcgisJsApi.esri.RelationshipContent
import typings.arcgisJsApi.esri.RelationshipContentProperties
import typings.arcgisJsApi.esri.TextContent
import typings.arcgisJsApi.esri.TextContentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriPopupContentMod {
  
  object AttachmentsContent {
    
    @JSImport("esri/popup/content", "AttachmentsContent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.AttachmentsContent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.AttachmentsContent]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/content", "AttachmentsContent")
  @js.native
  /**
    * An `AttachmentsContent` popup element represents an attachment element associated with a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html)
    */
  open class AttachmentsContentCls ()
    extends StObject
       with AttachmentsContent {
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
    
    @JSImport("esri/popup/content", "CustomContent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.CustomContent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.CustomContent]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/content", "CustomContent")
  @js.native
  /**
    * A `CustomContent` popup element is used to provide a way to customize the [popup's](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-CustomContent.html)
    */
  open class CustomContentCls ()
    extends StObject
       with CustomContent {
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
    
    @JSImport("esri/popup/content", "ExpressionContent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ExpressionContent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ExpressionContent]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/content", "ExpressionContent")
  @js.native
  /**
    * An ExpressionContent element allows you to define a popup content element with an [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ExpressionContent.html)
    */
  open class ExpressionContentCls ()
    extends StObject
       with ExpressionContent {
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
    
    @JSImport("esri/popup/content", "FieldsContent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.FieldsContent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.FieldsContent]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/content", "FieldsContent")
  @js.native
  /**
    * A `FieldsContent` popup element represents the [FieldInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html) associated with a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-FieldsContent.html)
    */
  open class FieldsContentCls ()
    extends StObject
       with FieldsContent {
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
    
    @JSImport("esri/popup/content", "MediaContent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.MediaContent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.MediaContent]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/content", "MediaContent")
  @js.native
  /**
    * A `MediaContent` popup element contains an individual or array of chart and/or image media elements to display within a popup's content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-MediaContent.html)
    */
  open class MediaContentCls ()
    extends StObject
       with MediaContent {
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
    
    @JSImport("esri/popup/content", "RelationshipContent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.RelationshipContent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.RelationshipContent]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/content", "RelationshipContent")
  @js.native
  /**
    * A `RelationshipContent` popup element represents a relationship element associated with a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-RelationshipContent.html)
    */
  open class RelationshipContentCls ()
    extends StObject
       with RelationshipContent {
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
    
    @JSImport("esri/popup/content", "TextContent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.TextContent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.TextContent]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/content", "TextContent")
  @js.native
  /**
    * A `TextContent` popup element is used to define descriptive text as an element within a [PopupTemplate's](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-TextContent.html)
    */
  open class TextContentCls ()
    extends StObject
       with TextContent {
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
