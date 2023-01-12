package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerConfigurationDescription extends StObject {
  
  /**
    * The revision of the worker configuration.
    */
  var revision: js.UndefOr[long] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the worker configuration.
    */
  var workerConfigurationArn: js.UndefOr[string] = js.undefined
}
object WorkerConfigurationDescription {
  
  inline def apply(): WorkerConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerConfigurationDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkerConfigurationDescription] (val x: Self) extends AnyVal {
    
    inline def setRevision(value: long): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
    
    inline def setWorkerConfigurationArn(value: string): Self = StObject.set(x, "workerConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setWorkerConfigurationArnUndefined: Self = StObject.set(x, "workerConfigurationArn", js.undefined)
  }
}
