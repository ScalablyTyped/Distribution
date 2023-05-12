package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EngineConfiguration extends StObject {
  
  /**
    * Contains additional notebook engine MAP&lt;string, string&gt; parameter mappings in the form of key-value pairs. To specify an Athena notebook that the Jupyter server will download and serve, specify a value for the StartSessionRequest$NotebookVersion field, and then add a key named NotebookId to AdditionalConfigs that has the value of the Athena notebook ID.
    */
  var AdditionalConfigs: js.UndefOr[ParametersMap] = js.undefined
  
  /**
    * The number of DPUs to use for the coordinator. A coordinator is a special executor that orchestrates processing work and manages other executors in a notebook session. The default is 1.
    */
  var CoordinatorDpuSize: js.UndefOr[typings.awsSdk.clientsAthenaMod.CoordinatorDpuSize] = js.undefined
  
  /**
    * The default number of DPUs to use for executors. An executor is the smallest unit of compute that a notebook session can request from Athena. The default is 1.
    */
  var DefaultExecutorDpuSize: js.UndefOr[typings.awsSdk.clientsAthenaMod.DefaultExecutorDpuSize] = js.undefined
  
  /**
    * The maximum number of DPUs that can run concurrently.
    */
  var MaxConcurrentDpus: typings.awsSdk.clientsAthenaMod.MaxConcurrentDpus
}
object EngineConfiguration {
  
  inline def apply(MaxConcurrentDpus: MaxConcurrentDpus): EngineConfiguration = {
    val __obj = js.Dynamic.literal(MaxConcurrentDpus = MaxConcurrentDpus.asInstanceOf[js.Any])
    __obj.asInstanceOf[EngineConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EngineConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAdditionalConfigs(value: ParametersMap): Self = StObject.set(x, "AdditionalConfigs", value.asInstanceOf[js.Any])
    
    inline def setAdditionalConfigsUndefined: Self = StObject.set(x, "AdditionalConfigs", js.undefined)
    
    inline def setCoordinatorDpuSize(value: CoordinatorDpuSize): Self = StObject.set(x, "CoordinatorDpuSize", value.asInstanceOf[js.Any])
    
    inline def setCoordinatorDpuSizeUndefined: Self = StObject.set(x, "CoordinatorDpuSize", js.undefined)
    
    inline def setDefaultExecutorDpuSize(value: DefaultExecutorDpuSize): Self = StObject.set(x, "DefaultExecutorDpuSize", value.asInstanceOf[js.Any])
    
    inline def setDefaultExecutorDpuSizeUndefined: Self = StObject.set(x, "DefaultExecutorDpuSize", js.undefined)
    
    inline def setMaxConcurrentDpus(value: MaxConcurrentDpus): Self = StObject.set(x, "MaxConcurrentDpus", value.asInstanceOf[js.Any])
  }
}
