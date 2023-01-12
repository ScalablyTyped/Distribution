package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentSummary extends StObject {
  
  /**
    * The timestamp when the environment was created.
    */
  var creationTime: js.Date
  
  /**
    * The target platform for the environment.
    */
  var engineType: EngineType
  
  /**
    * The version of the runtime engine.
    */
  var engineVersion: EngineVersion
  
  /**
    * The Amazon Resource Name (ARN) of a particular runtime environment.
    */
  var environmentArn: Arn
  
  /**
    * The unique identifier of a particular runtime environment.
    */
  var environmentId: Identifier
  
  /**
    * The instance type of the environment.
    */
  var instanceType: String20
  
  /**
    * The name of the environment.
    */
  var name: EntityName
  
  /**
    * The status of the environment
    */
  var status: EnvironmentLifecycle
}
object EnvironmentSummary {
  
  inline def apply(
    creationTime: js.Date,
    engineType: EngineType,
    engineVersion: EngineVersion,
    environmentArn: Arn,
    environmentId: Identifier,
    instanceType: String20,
    name: EntityName,
    status: EnvironmentLifecycle
  ): EnvironmentSummary = {
    val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], engineType = engineType.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any], environmentArn = environmentArn.asInstanceOf[js.Any], environmentId = environmentId.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvironmentSummary] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setEngineType(value: EngineType): Self = StObject.set(x, "engineType", value.asInstanceOf[js.Any])
    
    inline def setEngineVersion(value: EngineVersion): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentArn(value: Arn): Self = StObject.set(x, "environmentArn", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentId(value: Identifier): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
    
    inline def setInstanceType(value: String20): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setName(value: EntityName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: EnvironmentLifecycle): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
