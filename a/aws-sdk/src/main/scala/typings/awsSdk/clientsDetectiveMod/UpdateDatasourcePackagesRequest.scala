package typings.awsSdk.clientsDetectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDatasourcePackagesRequest extends StObject {
  
  /**
    * The data source package start for the behavior graph.
    */
  var DatasourcePackages: DatasourcePackageList
  
  /**
    * The ARN of the behavior graph.
    */
  var GraphArn: typings.awsSdk.clientsDetectiveMod.GraphArn
}
object UpdateDatasourcePackagesRequest {
  
  inline def apply(DatasourcePackages: DatasourcePackageList, GraphArn: GraphArn): UpdateDatasourcePackagesRequest = {
    val __obj = js.Dynamic.literal(DatasourcePackages = DatasourcePackages.asInstanceOf[js.Any], GraphArn = GraphArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDatasourcePackagesRequest]
  }
  
  extension [Self <: UpdateDatasourcePackagesRequest](x: Self) {
    
    inline def setDatasourcePackages(value: DatasourcePackageList): Self = StObject.set(x, "DatasourcePackages", value.asInstanceOf[js.Any])
    
    inline def setDatasourcePackagesVarargs(value: DatasourcePackage*): Self = StObject.set(x, "DatasourcePackages", js.Array(value*))
    
    inline def setGraphArn(value: GraphArn): Self = StObject.set(x, "GraphArn", value.asInstanceOf[js.Any])
  }
}
