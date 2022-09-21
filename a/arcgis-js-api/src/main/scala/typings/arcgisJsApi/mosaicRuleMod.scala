package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.MosaicRule
import typings.arcgisJsApi.esri.MosaicRuleConstructor
import typings.arcgisJsApi.esri.MosaicRuleProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mosaicRuleMod extends Shortcut {
  
  @JSImport("esri/layers/support/MosaicRule", JSImport.Namespace)
  @js.native
  val ^ : js.Object & MosaicRuleConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/MosaicRule", JSImport.Namespace)
  @js.native
  /**
    * Specifies the mosaic rule when defining how individual images should be mosaicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html)
    */
  open class Class ()
    extends StObject
       with MosaicRule {
    def this(properties: MosaicRuleProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & MosaicRuleConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mosaicRuleMod.foo` */
  override def _to: js.Object & MosaicRuleConstructor = ^
}
