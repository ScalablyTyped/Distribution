package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait geotriggersInfoFeatureFilterConstructor
  extends StObject
     with /**
  * Description of spatial and attribute filters that will be applied to Feature data.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FeatureFilter.html)
  */
Instantiable0[geotriggersInfoFeatureFilter]
     with Instantiable1[
      /* properties */ geotriggersInfoFeatureFilterProperties, 
      geotriggersInfoFeatureFilter
    ] {
  
  def fromJSON(json: Any): geotriggersInfoFeatureFilter = js.native
}
