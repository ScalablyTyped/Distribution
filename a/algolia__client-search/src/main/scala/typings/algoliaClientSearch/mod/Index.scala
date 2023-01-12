package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Index extends StObject {
  
  /**
    * Index creation date. (ISO-8601 format)
    */
  val createdAt: String
  
  /**
    * Number of bytes of the index in minified format.
    */
  val dataSize: Double
  
  /**
    * Number of records contained in the index
    */
  val entries: Double
  
  /**
    * Number of bytes of the index binary file.
    */
  val fileSize: Double
  
  /**
    * Last build time in seconds.
    */
  val lastBuildTimeS: Double
  
  /**
    * Index name.
    */
  val name: String
  
  /**
    * Number of pending indexing operations.
    */
  val numberOfPendingTasks: Double
  
  /**
    * A boolean which says whether the index has pending tasks.
    */
  val pendingTask: Boolean
  
  /**
    * Only present if the index is a replica.
    * Contains the name of the related primary index.
    */
  val primary: js.UndefOr[String] = js.undefined
  
  /**
    * Only present if the index is a primary index with replicas.
    * Contains the names of all linked replicas.
    */
  val replicas: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Date of last update. (ISO-8601 format)
    */
  val updatedAt: String
}
object Index {
  
  inline def apply(
    createdAt: String,
    dataSize: Double,
    entries: Double,
    fileSize: Double,
    lastBuildTimeS: Double,
    name: String,
    numberOfPendingTasks: Double,
    pendingTask: Boolean,
    updatedAt: String
  ): Index = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], dataSize = dataSize.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], lastBuildTimeS = lastBuildTimeS.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], numberOfPendingTasks = numberOfPendingTasks.asInstanceOf[js.Any], pendingTask = pendingTask.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setDataSize(value: Double): Self = StObject.set(x, "dataSize", value.asInstanceOf[js.Any])
    
    inline def setEntries(value: Double): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    inline def setLastBuildTimeS(value: Double): Self = StObject.set(x, "lastBuildTimeS", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNumberOfPendingTasks(value: Double): Self = StObject.set(x, "numberOfPendingTasks", value.asInstanceOf[js.Any])
    
    inline def setPendingTask(value: Boolean): Self = StObject.set(x, "pendingTask", value.asInstanceOf[js.Any])
    
    inline def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setReplicas(value: js.Array[String]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    inline def setReplicasUndefined: Self = StObject.set(x, "replicas", js.undefined)
    
    inline def setReplicasVarargs(value: String*): Self = StObject.set(x, "replicas", js.Array(value*))
    
    inline def setUpdatedAt(value: String): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
