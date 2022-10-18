package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ExpressionInfo
import typings.arcgisJsApi.esri.ExpressionInfoConstructor
import typings.arcgisJsApi.esri.ExpressionInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriFormExpressionInfoMod extends Shortcut {
  
  @JSImport("esri/form/ExpressionInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ExpressionInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/form/ExpressionInfo", JSImport.Namespace)
  @js.native
  /**
    * The `ExpressionInfo` class defines [visibility expressions](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-Element.html#visibilityExpression) used to control [FieldElement](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html) and [GroupElement](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-GroupElement.html) visibility within a [FormTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-ExpressionInfo.html)
    */
  open class Class ()
    extends StObject
       with ExpressionInfo {
    def this(properties: ExpressionInfoProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & ExpressionInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriFormExpressionInfoMod.foo` */
  override def _to: js.Object & ExpressionInfoConstructor = ^
}
