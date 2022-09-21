package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterOptions extends StObject {
  
  var clusters: js.Array[ClusterType]
  
  var schedule: js.UndefOr[String] = js.undefined
}
object ClusterOptions {
  
  inline def apply(clusters: js.Array[ClusterType]): ClusterOptions = {
    val __obj = js.Dynamic.literal(clusters = clusters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterOptions]
  }
  
  extension [Self <: ClusterOptions](x: Self) {
    
    inline def setClusters(value: js.Array[ClusterType]): Self = StObject.set(x, "clusters", value.asInstanceOf[js.Any])
    
    inline def setClustersVarargs(value: ClusterType*): Self = StObject.set(x, "clusters", js.Array(value*))
    
    inline def setSchedule(value: String): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
  }
}
