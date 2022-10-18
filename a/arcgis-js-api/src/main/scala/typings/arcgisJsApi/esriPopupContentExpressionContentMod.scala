package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ExpressionContent
import typings.arcgisJsApi.esri.ExpressionContentConstructor
import typings.arcgisJsApi.esri.ExpressionContentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriPopupContentExpressionContentMod extends Shortcut {
  
  @JSImport("esri/popup/content/ExpressionContent", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ExpressionContentConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/content/ExpressionContent", JSImport.Namespace)
  @js.native
  /**
    * An ExpressionContent element allows you to define a popup content element with an [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ExpressionContent.html)
    */
  open class Class ()
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
  
  type _To = js.Object & ExpressionContentConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriPopupContentExpressionContentMod.foo` */
  override def _to: js.Object & ExpressionContentConstructor = ^
}
