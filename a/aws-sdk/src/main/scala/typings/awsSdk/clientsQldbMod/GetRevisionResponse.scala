package typings.awsSdk.clientsQldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRevisionResponse extends StObject {
  
  /**
    * The proof object in Amazon Ion format returned by a GetRevision request. A proof contains the list of hash values that are required to recalculate the specified digest using a Merkle tree, starting with the specified document revision.
    */
  var Proof: js.UndefOr[ValueHolder] = js.undefined
  
  /**
    * The document revision data object in Amazon Ion format.
    */
  var Revision: ValueHolder
}
object GetRevisionResponse {
  
  inline def apply(Revision: ValueHolder): GetRevisionResponse = {
    val __obj = js.Dynamic.literal(Revision = Revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRevisionResponse]
  }
  
  extension [Self <: GetRevisionResponse](x: Self) {
    
    inline def setProof(value: ValueHolder): Self = StObject.set(x, "Proof", value.asInstanceOf[js.Any])
    
    inline def setProofUndefined: Self = StObject.set(x, "Proof", js.undefined)
    
    inline def setRevision(value: ValueHolder): Self = StObject.set(x, "Revision", value.asInstanceOf[js.Any])
  }
}
