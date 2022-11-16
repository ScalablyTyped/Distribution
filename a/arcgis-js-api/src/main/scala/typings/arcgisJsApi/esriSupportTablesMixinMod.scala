package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Collection
import typings.arcgisJsApi.esri.Layer
import typings.arcgisJsApi.esri.TablesMixin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriSupportTablesMixinMod {
  
  @JSImport("esri/support/TablesMixin", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with TablesMixin {
    
    /**
      * Returns a table based on the given table ID.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-TablesMixin.html#findTableById)
      */
    /* CompleteClass */
    override def findTableById(tableId: String): Layer = js.native
    
    /**
      * A collection of [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) instances that are tables saved in a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) and/or a [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html).
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-TablesMixin.html#tables)
      */
    /* CompleteClass */
    var tables: Collection[Layer] = js.native
  }
}
