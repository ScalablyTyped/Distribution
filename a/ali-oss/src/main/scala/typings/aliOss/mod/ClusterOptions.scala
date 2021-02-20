package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterOptions extends StObject {
  
  var clusters: js.Array[ClusterType] = js.native
  
  var schedule: js.UndefOr[String] = js.native
}
object ClusterOptions {
  
  @scala.inline
  def apply(clusters: js.Array[ClusterType]): ClusterOptions = {
    val __obj = js.Dynamic.literal(clusters = clusters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterOptions]
  }
  
  @scala.inline
  implicit class ClusterOptionsMutableBuilder[Self <: ClusterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusters(value: js.Array[ClusterType]): Self = StObject.set(x, "clusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClustersVarargs(value: ClusterType*): Self = StObject.set(x, "clusters", js.Array(value :_*))
    
    @scala.inline
    def setSchedule(value: String): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
  }
}
