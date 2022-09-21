package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.geotriggersInfoExpressionInfo
import typings.arcgisJsApi.esri.geotriggersInfoExpressionInfoConstructor
import typings.arcgisJsApi.esri.geotriggersInfoExpressionInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geotriggersInfoExpressionInfoMod extends Shortcut {
  
  @JSImport("esri/webdoc/geotriggersInfo/ExpressionInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Object & geotriggersInfoExpressionInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webdoc/geotriggersInfo/ExpressionInfo", JSImport.Namespace)
  @js.native
  /**
    * Defines a script expression that can be used to compute values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-ExpressionInfo.html)
    */
  open class Class ()
    extends StObject
       with geotriggersInfoExpressionInfo {
    def this(properties: geotriggersInfoExpressionInfoProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & geotriggersInfoExpressionInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `geotriggersInfoExpressionInfoMod.foo` */
  override def _to: js.Object & geotriggersInfoExpressionInfoConstructor = ^
}
