package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetNamedQueryInput extends StObject {
  
  /**
    * An array of query IDs.
    */
  var NamedQueryIds: NamedQueryIdList
}
object BatchGetNamedQueryInput {
  
  inline def apply(NamedQueryIds: NamedQueryIdList): BatchGetNamedQueryInput = {
    val __obj = js.Dynamic.literal(NamedQueryIds = NamedQueryIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetNamedQueryInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetNamedQueryInput] (val x: Self) extends AnyVal {
    
    inline def setNamedQueryIds(value: NamedQueryIdList): Self = StObject.set(x, "NamedQueryIds", value.asInstanceOf[js.Any])
    
    inline def setNamedQueryIdsVarargs(value: NamedQueryId*): Self = StObject.set(x, "NamedQueryIds", js.Array(value*))
  }
}
