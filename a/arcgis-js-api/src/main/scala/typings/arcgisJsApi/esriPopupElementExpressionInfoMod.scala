package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ElementExpressionInfo
import typings.arcgisJsApi.esri.ElementExpressionInfoConstructor
import typings.arcgisJsApi.esri.ElementExpressionInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriPopupElementExpressionInfoMod extends Shortcut {
  
  @JSImport("esri/popup/ElementExpressionInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ElementExpressionInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/ElementExpressionInfo", JSImport.Namespace)
  @js.native
  /**
    * Defines an [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression used to create an [ExpressionContent](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ExpressionContent.html) element in a [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ElementExpressionInfo.html)
    */
  open class Class ()
    extends StObject
       with ElementExpressionInfo {
    def this(properties: ElementExpressionInfoProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & ElementExpressionInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriPopupElementExpressionInfoMod.foo` */
  override def _to: js.Object & ElementExpressionInfoConstructor = ^
}
