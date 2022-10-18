package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineageConfiguration extends StObject {
  
  /**
    * Specifies whether data lineage is enabled for the crawler. Valid values are:   ENABLE: enables data lineage for the crawler   DISABLE: disables data lineage for the crawler  
    */
  var CrawlerLineageSettings: js.UndefOr[typings.awsSdk.clientsGlueMod.CrawlerLineageSettings] = js.undefined
}
object LineageConfiguration {
  
  inline def apply(): LineageConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineageConfiguration]
  }
  
  extension [Self <: LineageConfiguration](x: Self) {
    
    inline def setCrawlerLineageSettings(value: CrawlerLineageSettings): Self = StObject.set(x, "CrawlerLineageSettings", value.asInstanceOf[js.Any])
    
    inline def setCrawlerLineageSettingsUndefined: Self = StObject.set(x, "CrawlerLineageSettings", js.undefined)
  }
}
