package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClustersRequest extends StObject {
  
  /**
    * A list of up to 100 cluster names or full cluster Amazon Resource Name (ARN) entries. If you do not specify a cluster, the default cluster is assumed.
    */
  var clusters: js.UndefOr[StringList] = js.undefined
  
  /**
    * Determines whether to include additional information about the clusters in the response. If this field is omitted, this information isn't included. If ATTACHMENTS is specified, the attachments for the container instances or tasks within the cluster are included, for example the capacity providers. If SETTINGS is specified, the settings for the cluster are included. If CONFIGURATIONS is specified, the configuration for the cluster is included. If STATISTICS is specified, the task and service count is included, separated by launch type. If TAGS is specified, the metadata tags associated with the cluster are included.
    */
  var include: js.UndefOr[ClusterFieldList] = js.undefined
}
object DescribeClustersRequest {
  
  inline def apply(): DescribeClustersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClustersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeClustersRequest] (val x: Self) extends AnyVal {
    
    inline def setClusters(value: StringList): Self = StObject.set(x, "clusters", value.asInstanceOf[js.Any])
    
    inline def setClustersUndefined: Self = StObject.set(x, "clusters", js.undefined)
    
    inline def setClustersVarargs(value: String*): Self = StObject.set(x, "clusters", js.Array(value*))
    
    inline def setInclude(value: ClusterFieldList): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: ClusterField*): Self = StObject.set(x, "include", js.Array(value*))
  }
}
