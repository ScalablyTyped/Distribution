package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeThesaurusRequest extends StObject {
  
  /**
    * The identifier of the thesaurus you want to get information on.
    */
  var Id: ThesaurusId
  
  /**
    * The identifier of the index for the thesaurus.
    */
  var IndexId: typings.awsSdk.clientsKendraMod.IndexId
}
object DescribeThesaurusRequest {
  
  inline def apply(Id: ThesaurusId, IndexId: IndexId): DescribeThesaurusRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeThesaurusRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeThesaurusRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: ThesaurusId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
  }
}
