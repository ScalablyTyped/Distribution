package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.AttachmentsContentConstructor
import typings.arcgisJsApi.esri.AttachmentsContentProperties
import typings.arcgisJsApi.esri.CustomContentConstructor
import typings.arcgisJsApi.esri.CustomContentProperties
import typings.arcgisJsApi.esri.ExpressionContentConstructor
import typings.arcgisJsApi.esri.ExpressionContentProperties
import typings.arcgisJsApi.esri.FieldsContentConstructor
import typings.arcgisJsApi.esri.FieldsContentProperties
import typings.arcgisJsApi.esri.MediaContentConstructor
import typings.arcgisJsApi.esri.MediaContentProperties
import typings.arcgisJsApi.esri.TextContentConstructor
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
  
  @JSGlobal("__esri.content.AttachmentsContent")
  @js.native
  val AttachmentsContent: AttachmentsContentConstructor = js.native
  
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
  
  @JSGlobal("__esri.content.CustomContent")
  @js.native
  val CustomContent: CustomContentConstructor = js.native
  
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
  
  @JSGlobal("__esri.content.ExpressionContent")
  @js.native
  val ExpressionContent: ExpressionContentConstructor = js.native
  
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
  
  @JSGlobal("__esri.content.FieldsContent")
  @js.native
  val FieldsContent: FieldsContentConstructor = js.native
  
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
  
  @JSGlobal("__esri.content.MediaContent")
  @js.native
  val MediaContent: MediaContentConstructor = js.native
  
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
  
  @JSGlobal("__esri.content.TextContent")
  @js.native
  val TextContent: TextContentConstructor = js.native
  
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
