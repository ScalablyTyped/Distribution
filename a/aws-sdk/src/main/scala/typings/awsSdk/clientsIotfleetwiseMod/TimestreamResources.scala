package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimestreamResources extends StObject {
  
  /**
    * The name of the registered Amazon Timestream database.
    */
  var timestreamDatabaseName: TimestreamDatabaseName
  
  /**
    * The name of the registered Amazon Timestream database table.
    */
  var timestreamTableName: TimestreamTableName
}
object TimestreamResources {
  
  inline def apply(timestreamDatabaseName: TimestreamDatabaseName, timestreamTableName: TimestreamTableName): TimestreamResources = {
    val __obj = js.Dynamic.literal(timestreamDatabaseName = timestreamDatabaseName.asInstanceOf[js.Any], timestreamTableName = timestreamTableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimestreamResources]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimestreamResources] (val x: Self) extends AnyVal {
    
    inline def setTimestreamDatabaseName(value: TimestreamDatabaseName): Self = StObject.set(x, "timestreamDatabaseName", value.asInstanceOf[js.Any])
    
    inline def setTimestreamTableName(value: TimestreamTableName): Self = StObject.set(x, "timestreamTableName", value.asInstanceOf[js.Any])
  }
}
