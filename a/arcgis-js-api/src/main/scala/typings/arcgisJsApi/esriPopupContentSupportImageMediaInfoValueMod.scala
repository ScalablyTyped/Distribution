package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ImageMediaInfoValue
import typings.arcgisJsApi.esri.ImageMediaInfoValueConstructor
import typings.arcgisJsApi.esri.ImageMediaInfoValueProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriPopupContentSupportImageMediaInfoValueMod extends Shortcut {
  
  @JSImport("esri/popup/content/support/ImageMediaInfoValue", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ImageMediaInfoValueConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/content/support/ImageMediaInfoValue", JSImport.Namespace)
  @js.native
  /**
    * The `ImageMediaInfoValue` class contains information for popups regarding how images should be retrieved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ImageMediaInfoValue.html)
    */
  open class Class ()
    extends StObject
       with ImageMediaInfoValue {
    def this(properties: ImageMediaInfoValueProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & ImageMediaInfoValueConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriPopupContentSupportImageMediaInfoValueMod.foo` */
  override def _to: js.Object & ImageMediaInfoValueConstructor = ^
}
