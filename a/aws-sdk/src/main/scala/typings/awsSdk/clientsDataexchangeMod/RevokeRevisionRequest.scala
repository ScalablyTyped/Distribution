package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevokeRevisionRequest extends StObject {
  
  /**
    * The unique identifier for a data set.
    */
  var DataSetId: string
  
  /**
    * The unique identifier for a revision.
    */
  var RevisionId: string
  
  /**
    * A required comment to inform subscribers of the reason their access to the revision was revoked.
    */
  var RevocationComment: stringMin10Max512
}
object RevokeRevisionRequest {
  
  inline def apply(DataSetId: string, RevisionId: string, RevocationComment: stringMin10Max512): RevokeRevisionRequest = {
    val __obj = js.Dynamic.literal(DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any], RevocationComment = RevocationComment.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeRevisionRequest]
  }
  
  extension [Self <: RevokeRevisionRequest](x: Self) {
    
    inline def setDataSetId(value: string): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    inline def setRevisionId(value: string): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    inline def setRevocationComment(value: stringMin10Max512): Self = StObject.set(x, "RevocationComment", value.asInstanceOf[js.Any])
  }
}
