package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ColorRamp
import typings.arcgisJsApi.esri.ColorRampConstructor
import typings.arcgisJsApi.esri.ColorRampProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportColorRampMod extends Shortcut {
  
  @JSImport("esri/rest/support/ColorRamp", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ColorRampConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/ColorRamp", JSImport.Namespace)
  @js.native
  /**
    * A ColorRamp object is used to specify a range of colors that are applied to a group of symbols or pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ColorRamp.html)
    */
  open class Class ()
    extends StObject
       with ColorRamp {
    def this(properties: ColorRampProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & ColorRampConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportColorRampMod.foo` */
  override def _to: js.Object & ColorRampConstructor = ^
}
