package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.RangeDomain
import typings.arcgisJsApi.esri.RangeDomainConstructor
import typings.arcgisJsApi.esri.RangeDomainProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportRangeDomainMod extends Shortcut {
  
  @JSImport("esri/layers/support/RangeDomain", JSImport.Namespace)
  @js.native
  val ^ : js.Object & RangeDomainConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/RangeDomain", JSImport.Namespace)
  @js.native
  /**
    * Range domains specify a valid [minimum](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html#minValue) and [maximum](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html#maxValue) valid value that can be stored in numeric and date [fields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#type).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html)
    */
  open class Class ()
    extends StObject
       with RangeDomain {
    def this(properties: RangeDomainProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & RangeDomainConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersSupportRangeDomainMod.foo` */
  override def _to: js.Object & RangeDomainConstructor = ^
}
