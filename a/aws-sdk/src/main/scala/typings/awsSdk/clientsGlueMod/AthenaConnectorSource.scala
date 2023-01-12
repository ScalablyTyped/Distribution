package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AthenaConnectorSource extends StObject {
  
  /**
    * The name of the connection that is associated with the connector.
    */
  var ConnectionName: EnclosedInStringProperty
  
  /**
    * The name of the table in the data source.
    */
  var ConnectionTable: js.UndefOr[EnclosedInStringPropertyWithQuote] = js.undefined
  
  /**
    * The type of connection, such as marketplace.athena or custom.athena, designating a connection to an Amazon Athena data store.
    */
  var ConnectionType: EnclosedInStringProperty
  
  /**
    * The name of a connector that assists with accessing the data store in Glue Studio.
    */
  var ConnectorName: EnclosedInStringProperty
  
  /**
    * The name of the data source.
    */
  var Name: NodeName
  
  /**
    * Specifies the data schema for the custom Athena source.
    */
  var OutputSchemas: js.UndefOr[GlueSchemas] = js.undefined
  
  /**
    * The name of the Cloudwatch log group to read from. For example, /aws-glue/jobs/output.
    */
  var SchemaName: EnclosedInStringProperty
}
object AthenaConnectorSource {
  
  inline def apply(
    ConnectionName: EnclosedInStringProperty,
    ConnectionType: EnclosedInStringProperty,
    ConnectorName: EnclosedInStringProperty,
    Name: NodeName,
    SchemaName: EnclosedInStringProperty
  ): AthenaConnectorSource = {
    val __obj = js.Dynamic.literal(ConnectionName = ConnectionName.asInstanceOf[js.Any], ConnectionType = ConnectionType.asInstanceOf[js.Any], ConnectorName = ConnectorName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AthenaConnectorSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AthenaConnectorSource] (val x: Self) extends AnyVal {
    
    inline def setConnectionName(value: EnclosedInStringProperty): Self = StObject.set(x, "ConnectionName", value.asInstanceOf[js.Any])
    
    inline def setConnectionTable(value: EnclosedInStringPropertyWithQuote): Self = StObject.set(x, "ConnectionTable", value.asInstanceOf[js.Any])
    
    inline def setConnectionTableUndefined: Self = StObject.set(x, "ConnectionTable", js.undefined)
    
    inline def setConnectionType(value: EnclosedInStringProperty): Self = StObject.set(x, "ConnectionType", value.asInstanceOf[js.Any])
    
    inline def setConnectorName(value: EnclosedInStringProperty): Self = StObject.set(x, "ConnectorName", value.asInstanceOf[js.Any])
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutputSchemas(value: GlueSchemas): Self = StObject.set(x, "OutputSchemas", value.asInstanceOf[js.Any])
    
    inline def setOutputSchemasUndefined: Self = StObject.set(x, "OutputSchemas", js.undefined)
    
    inline def setOutputSchemasVarargs(value: GlueSchema*): Self = StObject.set(x, "OutputSchemas", js.Array(value*))
    
    inline def setSchemaName(value: EnclosedInStringProperty): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
  }
}
