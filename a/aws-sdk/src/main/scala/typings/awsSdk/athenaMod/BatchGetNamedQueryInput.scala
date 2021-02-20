package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetNamedQueryInput extends StObject {
  
  /**
    * An array of query IDs.
    */
  var NamedQueryIds: NamedQueryIdList = js.native
}
object BatchGetNamedQueryInput {
  
  @scala.inline
  def apply(NamedQueryIds: NamedQueryIdList): BatchGetNamedQueryInput = {
    val __obj = js.Dynamic.literal(NamedQueryIds = NamedQueryIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetNamedQueryInput]
  }
  
  @scala.inline
  implicit class BatchGetNamedQueryInputMutableBuilder[Self <: BatchGetNamedQueryInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamedQueryIds(value: NamedQueryIdList): Self = StObject.set(x, "NamedQueryIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedQueryIdsVarargs(value: NamedQueryId*): Self = StObject.set(x, "NamedQueryIds", js.Array(value :_*))
  }
}
