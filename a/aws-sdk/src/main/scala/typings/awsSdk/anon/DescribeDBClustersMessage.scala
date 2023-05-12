package typings.awsSdk.anon

import typings.awsSdk.clientsRdsMod.Boolean
import typings.awsSdk.clientsRdsMod.Filter
import typings.awsSdk.clientsRdsMod.FilterList
import typings.awsSdk.clientsRdsMod.IntegerOptional
import typings.awsSdk.clientsRdsMod.String
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/rds.DescribeDBClustersMessage & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeDBClustersMessage extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The user-supplied DB cluster identifier or the Amazon Resource Name (ARN) of the DB cluster. If this parameter is specified, information from only the specific DB cluster is returned. This parameter isn't case-sensitive. Constraints:   If supplied, must match an existing DBClusterIdentifier.  
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * A filter that specifies one or more DB clusters to describe. Supported filters:    clone-group-id - Accepts clone group identifiers. The results list only includes information about the DB clusters associated with these clone groups.    db-cluster-id - Accepts DB cluster identifiers and DB cluster Amazon Resource Names (ARNs). The results list only includes information about the DB clusters identified by these ARNs.    db-cluster-resource-id - Accepts DB cluster resource identifiers. The results list will only include information about the DB clusters identified by these DB cluster resource identifiers.    domain - Accepts Active Directory directory IDs. The results list only includes information about the DB clusters associated with these domains.    engine - Accepts engine names. The results list only includes information about the DB clusters for these engines.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * Optional Boolean parameter that specifies whether the output includes information about clusters shared from other Amazon Web Services accounts.
    */
  var IncludeShared: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An optional pagination token provided by a previous DescribeDBClusters request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so you can retrieve the remaining results. Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
}
object DescribeDBClustersMessage {
  
  inline def apply(): DescribeDBClustersMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDBClustersMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDBClustersMessage] (val x: Self) extends AnyVal {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDBClusterIdentifierUndefined: Self = StObject.set(x, "DBClusterIdentifier", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setIncludeShared(value: Boolean): Self = StObject.set(x, "IncludeShared", value.asInstanceOf[js.Any])
    
    inline def setIncludeSharedUndefined: Self = StObject.set(x, "IncludeShared", js.undefined)
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
  }
}
