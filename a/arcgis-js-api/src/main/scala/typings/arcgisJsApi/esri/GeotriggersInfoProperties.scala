package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeotriggersInfoProperties extends StObject {
  
  /**
    * A list of Geotriggers.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-GeotriggersInfo.html#geotriggers)
    */
  var geotriggers: js.UndefOr[js.Array[GeotriggerProperties]] = js.undefined
}
object GeotriggersInfoProperties {
  
  inline def apply(): GeotriggersInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeotriggersInfoProperties]
  }
  
  extension [Self <: GeotriggersInfoProperties](x: Self) {
    
    inline def setGeotriggers(value: js.Array[GeotriggerProperties]): Self = StObject.set(x, "geotriggers", value.asInstanceOf[js.Any])
    
    inline def setGeotriggersUndefined: Self = StObject.set(x, "geotriggers", js.undefined)
    
    inline def setGeotriggersVarargs(value: GeotriggerProperties*): Self = StObject.set(x, "geotriggers", js.Array(value*))
  }
}
