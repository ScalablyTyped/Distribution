package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparkConnectorTarget extends StObject {
  
  /**
    * Additional connection options for the connector.
    */
  var AdditionalOptions: js.UndefOr[typings.awsSdk.clientsGlueMod.AdditionalOptions] = js.undefined
  
  /**
    * The name of a connection for an Apache Spark connector.
    */
  var ConnectionName: EnclosedInStringProperty
  
  /**
    * The type of connection, such as marketplace.spark or custom.spark, designating a connection to an Apache Spark data store.
    */
  var ConnectionType: EnclosedInStringProperty
  
  /**
    * The name of an Apache Spark connector.
    */
  var ConnectorName: EnclosedInStringProperty
  
  /**
    * The nodes that are inputs to the data target.
    */
  var Inputs: OneInput
  
  /**
    * The name of the data target.
    */
  var Name: NodeName
  
  /**
    * Specifies the data schema for the custom spark target.
    */
  var OutputSchemas: js.UndefOr[GlueSchemas] = js.undefined
}
object SparkConnectorTarget {
  
  inline def apply(
    ConnectionName: EnclosedInStringProperty,
    ConnectionType: EnclosedInStringProperty,
    ConnectorName: EnclosedInStringProperty,
    Inputs: OneInput,
    Name: NodeName
  ): SparkConnectorTarget = {
    val __obj = js.Dynamic.literal(ConnectionName = ConnectionName.asInstanceOf[js.Any], ConnectionType = ConnectionType.asInstanceOf[js.Any], ConnectorName = ConnectorName.asInstanceOf[js.Any], Inputs = Inputs.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparkConnectorTarget]
  }
  
  extension [Self <: SparkConnectorTarget](x: Self) {
    
    inline def setAdditionalOptions(value: AdditionalOptions): Self = StObject.set(x, "AdditionalOptions", value.asInstanceOf[js.Any])
    
    inline def setAdditionalOptionsUndefined: Self = StObject.set(x, "AdditionalOptions", js.undefined)
    
    inline def setConnectionName(value: EnclosedInStringProperty): Self = StObject.set(x, "ConnectionName", value.asInstanceOf[js.Any])
    
    inline def setConnectionType(value: EnclosedInStringProperty): Self = StObject.set(x, "ConnectionType", value.asInstanceOf[js.Any])
    
    inline def setConnectorName(value: EnclosedInStringProperty): Self = StObject.set(x, "ConnectorName", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: OneInput): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: NodeId*): Self = StObject.set(x, "Inputs", js.Array(value*))
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutputSchemas(value: GlueSchemas): Self = StObject.set(x, "OutputSchemas", value.asInstanceOf[js.Any])
    
    inline def setOutputSchemasUndefined: Self = StObject.set(x, "OutputSchemas", js.undefined)
    
    inline def setOutputSchemasVarargs(value: GlueSchema*): Self = StObject.set(x, "OutputSchemas", js.Array(value*))
  }
}
