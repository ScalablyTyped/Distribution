package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InferredWorkloadSaving extends StObject {
  
  /**
    * An object that describes the estimated monthly savings amount possible by adopting Compute Optimizer recommendations for a given resource. This is based on the On-Demand instance pricing.
    */
  var estimatedMonthlySavings: js.UndefOr[EstimatedMonthlySavings] = js.undefined
  
  /**
    * The applications that might be running on the instance as inferred by Compute Optimizer. Compute Optimizer can infer if one of the following applications might be running on the instance:    AmazonEmr - Infers that Amazon EMR might be running on the instance.    ApacheCassandra - Infers that Apache Cassandra might be running on the instance.    ApacheHadoop - Infers that Apache Hadoop might be running on the instance.    Memcached - Infers that Memcached might be running on the instance.    NGINX - Infers that NGINX might be running on the instance.    PostgreSql - Infers that PostgreSQL might be running on the instance.    Redis - Infers that Redis might be running on the instance.    Kafka - Infers that Kafka might be running on the instance.    SQLServer - Infers that SQLServer might be running on the instance.  
    */
  var inferredWorkloadTypes: js.UndefOr[InferredWorkloadTypes] = js.undefined
}
object InferredWorkloadSaving {
  
  inline def apply(): InferredWorkloadSaving = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InferredWorkloadSaving]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InferredWorkloadSaving] (val x: Self) extends AnyVal {
    
    inline def setEstimatedMonthlySavings(value: EstimatedMonthlySavings): Self = StObject.set(x, "estimatedMonthlySavings", value.asInstanceOf[js.Any])
    
    inline def setEstimatedMonthlySavingsUndefined: Self = StObject.set(x, "estimatedMonthlySavings", js.undefined)
    
    inline def setInferredWorkloadTypes(value: InferredWorkloadTypes): Self = StObject.set(x, "inferredWorkloadTypes", value.asInstanceOf[js.Any])
    
    inline def setInferredWorkloadTypesUndefined: Self = StObject.set(x, "inferredWorkloadTypes", js.undefined)
    
    inline def setInferredWorkloadTypesVarargs(value: InferredWorkloadType*): Self = StObject.set(x, "inferredWorkloadTypes", js.Array(value*))
  }
}
