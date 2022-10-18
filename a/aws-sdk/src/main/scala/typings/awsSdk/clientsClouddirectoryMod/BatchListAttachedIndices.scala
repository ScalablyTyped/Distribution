package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchListAttachedIndices extends StObject {
  
  /**
    * The maximum number of results to retrieve.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.undefined
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  
  /**
    * A reference to the object that has indices attached.
    */
  var TargetReference: ObjectReference
}
object BatchListAttachedIndices {
  
  inline def apply(TargetReference: ObjectReference): BatchListAttachedIndices = {
    val __obj = js.Dynamic.literal(TargetReference = TargetReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchListAttachedIndices]
  }
  
  extension [Self <: BatchListAttachedIndices](x: Self) {
    
    inline def setMaxResults(value: NumberResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTargetReference(value: ObjectReference): Self = StObject.set(x, "TargetReference", value.asInstanceOf[js.Any])
  }
}
