package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuerySchemaVersionMetadataInput extends StObject {
  
  /**
    * Maximum number of results required per page. If the value is not supplied, this will be defaulted to 25 per page.
    */
  var MaxResults: js.UndefOr[QuerySchemaVersionMetadataMaxResults] = js.undefined
  
  /**
    * Search key-value pairs for metadata, if they are not provided all the metadata information will be fetched.
    */
  var MetadataList: js.UndefOr[typings.awsSdk.clientsGlueMod.MetadataList] = js.undefined
  
  /**
    * A continuation token, if this is a continuation call.
    */
  var NextToken: js.UndefOr[SchemaRegistryTokenString] = js.undefined
  
  /**
    * A wrapper structure that may contain the schema name and Amazon Resource Name (ARN).
    */
  var SchemaId: js.UndefOr[typings.awsSdk.clientsGlueMod.SchemaId] = js.undefined
  
  /**
    * The unique version ID of the schema version.
    */
  var SchemaVersionId: js.UndefOr[SchemaVersionIdString] = js.undefined
  
  /**
    * The version number of the schema.
    */
  var SchemaVersionNumber: js.UndefOr[typings.awsSdk.clientsGlueMod.SchemaVersionNumber] = js.undefined
}
object QuerySchemaVersionMetadataInput {
  
  inline def apply(): QuerySchemaVersionMetadataInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuerySchemaVersionMetadataInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QuerySchemaVersionMetadataInput] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: QuerySchemaVersionMetadataMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMetadataList(value: MetadataList): Self = StObject.set(x, "MetadataList", value.asInstanceOf[js.Any])
    
    inline def setMetadataListUndefined: Self = StObject.set(x, "MetadataList", js.undefined)
    
    inline def setMetadataListVarargs(value: MetadataKeyValuePair*): Self = StObject.set(x, "MetadataList", js.Array(value*))
    
    inline def setNextToken(value: SchemaRegistryTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSchemaId(value: SchemaId): Self = StObject.set(x, "SchemaId", value.asInstanceOf[js.Any])
    
    inline def setSchemaIdUndefined: Self = StObject.set(x, "SchemaId", js.undefined)
    
    inline def setSchemaVersionId(value: SchemaVersionIdString): Self = StObject.set(x, "SchemaVersionId", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersionIdUndefined: Self = StObject.set(x, "SchemaVersionId", js.undefined)
    
    inline def setSchemaVersionNumber(value: SchemaVersionNumber): Self = StObject.set(x, "SchemaVersionNumber", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersionNumberUndefined: Self = StObject.set(x, "SchemaVersionNumber", js.undefined)
  }
}
