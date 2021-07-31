package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNamedQueryInput extends StObject {
  
  /**
    * The unique ID of the query to delete.
    */
  var NamedQueryId: typings.awsSdk.athenaMod.NamedQueryId
}
object DeleteNamedQueryInput {
  
  @scala.inline
  def apply(NamedQueryId: NamedQueryId): DeleteNamedQueryInput = {
    val __obj = js.Dynamic.literal(NamedQueryId = NamedQueryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNamedQueryInput]
  }
  
  @scala.inline
  implicit class DeleteNamedQueryInputMutableBuilder[Self <: DeleteNamedQueryInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamedQueryId(value: NamedQueryId): Self = StObject.set(x, "NamedQueryId", value.asInstanceOf[js.Any])
  }
}
