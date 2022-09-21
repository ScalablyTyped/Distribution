package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateNamedQueryInput extends StObject {
  
  /**
    * The query description.
    */
  var Description: js.UndefOr[NamedQueryDescriptionString] = js.undefined
  
  /**
    * The name of the query.
    */
  var Name: NameString
  
  /**
    * The unique identifier (UUID) of the query.
    */
  var NamedQueryId: typings.awsSdk.athenaMod.NamedQueryId
  
  /**
    * The contents of the query with all query statements.
    */
  var QueryString: typings.awsSdk.athenaMod.QueryString
}
object UpdateNamedQueryInput {
  
  inline def apply(Name: NameString, NamedQueryId: NamedQueryId, QueryString: QueryString): UpdateNamedQueryInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], NamedQueryId = NamedQueryId.asInstanceOf[js.Any], QueryString = QueryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNamedQueryInput]
  }
  
  extension [Self <: UpdateNamedQueryInput](x: Self) {
    
    inline def setDescription(value: NamedQueryDescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNamedQueryId(value: NamedQueryId): Self = StObject.set(x, "NamedQueryId", value.asInstanceOf[js.Any])
    
    inline def setQueryString(value: QueryString): Self = StObject.set(x, "QueryString", value.asInstanceOf[js.Any])
  }
}
