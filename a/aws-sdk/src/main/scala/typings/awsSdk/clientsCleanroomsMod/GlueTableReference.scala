package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlueTableReference extends StObject {
  
  /**
    * The name of the database the AWS Glue table belongs to.
    */
  var databaseName: GlueResourceName
  
  /**
    * The name of the AWS Glue table.
    */
  var tableName: GlueResourceName
}
object GlueTableReference {
  
  inline def apply(databaseName: GlueResourceName, tableName: GlueResourceName): GlueTableReference = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlueTableReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlueTableReference] (val x: Self) extends AnyVal {
    
    inline def setDatabaseName(value: GlueResourceName): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: GlueResourceName): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}
