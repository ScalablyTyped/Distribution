package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerConfigurationRevisionDescription extends StObject {
  
  /**
    * The time that the worker configuration was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the worker configuration revision.
    */
  var description: js.UndefOr[string] = js.undefined
  
  /**
    * Base64 encoded contents of the connect-distributed.properties file.
    */
  var propertiesFileContent: js.UndefOr[SyntheticWorkerConfigurationRevisionDescriptionString] = js.undefined
  
  /**
    * The description of a revision of the worker configuration.
    */
  var revision: js.UndefOr[long] = js.undefined
}
object WorkerConfigurationRevisionDescription {
  
  inline def apply(): WorkerConfigurationRevisionDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerConfigurationRevisionDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkerConfigurationRevisionDescription] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDescription(value: string): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setPropertiesFileContent(value: SyntheticWorkerConfigurationRevisionDescriptionString): Self = StObject.set(x, "propertiesFileContent", value.asInstanceOf[js.Any])
    
    inline def setPropertiesFileContentUndefined: Self = StObject.set(x, "propertiesFileContent", js.undefined)
    
    inline def setRevision(value: long): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
  }
}
