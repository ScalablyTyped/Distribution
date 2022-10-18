package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerConfigurationRevisionSummary extends StObject {
  
  /**
    * The time that a worker configuration revision was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of a worker configuration revision.
    */
  var description: js.UndefOr[string] = js.undefined
  
  /**
    * The revision of a worker configuration.
    */
  var revision: js.UndefOr[long] = js.undefined
}
object WorkerConfigurationRevisionSummary {
  
  inline def apply(): WorkerConfigurationRevisionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerConfigurationRevisionSummary]
  }
  
  extension [Self <: WorkerConfigurationRevisionSummary](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDescription(value: string): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setRevision(value: long): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
  }
}
