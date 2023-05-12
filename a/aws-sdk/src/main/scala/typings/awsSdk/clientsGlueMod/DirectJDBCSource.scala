package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectJDBCSource extends StObject {
  
  /**
    * The connection name of the JDBC source.
    */
  var ConnectionName: EnclosedInStringProperty
  
  /**
    * The connection type of the JDBC source.
    */
  var ConnectionType: JDBCConnectionType
  
  /**
    * The database of the JDBC source connection.
    */
  var Database: EnclosedInStringProperty
  
  /**
    * The name of the JDBC source connection.
    */
  var Name: NodeName
  
  /**
    * The temp directory of the JDBC Redshift source.
    */
  var RedshiftTmpDir: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * The table of the JDBC source connection.
    */
  var Table: EnclosedInStringProperty
}
object DirectJDBCSource {
  
  inline def apply(
    ConnectionName: EnclosedInStringProperty,
    ConnectionType: JDBCConnectionType,
    Database: EnclosedInStringProperty,
    Name: NodeName,
    Table: EnclosedInStringProperty
  ): DirectJDBCSource = {
    val __obj = js.Dynamic.literal(ConnectionName = ConnectionName.asInstanceOf[js.Any], ConnectionType = ConnectionType.asInstanceOf[js.Any], Database = Database.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Table = Table.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectJDBCSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectJDBCSource] (val x: Self) extends AnyVal {
    
    inline def setConnectionName(value: EnclosedInStringProperty): Self = StObject.set(x, "ConnectionName", value.asInstanceOf[js.Any])
    
    inline def setConnectionType(value: JDBCConnectionType): Self = StObject.set(x, "ConnectionType", value.asInstanceOf[js.Any])
    
    inline def setDatabase(value: EnclosedInStringProperty): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRedshiftTmpDir(value: EnclosedInStringProperty): Self = StObject.set(x, "RedshiftTmpDir", value.asInstanceOf[js.Any])
    
    inline def setRedshiftTmpDirUndefined: Self = StObject.set(x, "RedshiftTmpDir", js.undefined)
    
    inline def setTable(value: EnclosedInStringProperty): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
  }
}
