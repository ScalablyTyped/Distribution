package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskContactDefinition extends StObject {
  
  /** The task description */
  val description: String
  
  /** The  endpoint to assign to */
  val endpoint: Endpoint
  
  /** A random value */
  val idempotencyToken: String
  
  /** The task name */
  val name: String
  
  /** The linked contact id */
  val previousContactId: js.UndefOr[String] = js.undefined
  
  /** The task references */
  val references: ReferenceDictionary
  
  /** The task scheduled time */
  val scheduledTime: Double
}
object TaskContactDefinition {
  
  inline def apply(
    description: String,
    endpoint: Endpoint,
    idempotencyToken: String,
    name: String,
    references: ReferenceDictionary,
    scheduledTime: Double
  ): TaskContactDefinition = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], idempotencyToken = idempotencyToken.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], scheduledTime = scheduledTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskContactDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskContactDefinition] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEndpoint(value: Endpoint): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyToken(value: String): Self = StObject.set(x, "idempotencyToken", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPreviousContactId(value: String): Self = StObject.set(x, "previousContactId", value.asInstanceOf[js.Any])
    
    inline def setPreviousContactIdUndefined: Self = StObject.set(x, "previousContactId", js.undefined)
    
    inline def setReferences(value: ReferenceDictionary): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    inline def setScheduledTime(value: Double): Self = StObject.set(x, "scheduledTime", value.asInstanceOf[js.Any])
  }
}
