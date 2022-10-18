package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIncomingTypedLinksRequest extends StObject {
  
  /**
    * The consistency level to execute the request at.
    */
  var ConsistencyLevel: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.ConsistencyLevel] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the directory where you want to list the typed links.
    */
  var DirectoryArn: Arn
  
  /**
    * Provides range filters for multiple attributes. When providing ranges to typed link selection, any inexact ranges must be specified at the end. Any attributes that do not have a range specified are presumed to match the entire range.
    */
  var FilterAttributeRanges: js.UndefOr[TypedLinkAttributeRangeList] = js.undefined
  
  /**
    * Filters are interpreted in the order of the attributes on the typed link facet, not the order in which they are supplied to any API calls.
    */
  var FilterTypedLink: js.UndefOr[TypedLinkSchemaAndFacetName] = js.undefined
  
  /**
    * The maximum number of results to retrieve.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.undefined
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  
  /**
    * Reference that identifies the object whose attributes will be listed.
    */
  var ObjectReference: typings.awsSdk.clientsClouddirectoryMod.ObjectReference
}
object ListIncomingTypedLinksRequest {
  
  inline def apply(DirectoryArn: Arn, ObjectReference: ObjectReference): ListIncomingTypedLinksRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], ObjectReference = ObjectReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIncomingTypedLinksRequest]
  }
  
  extension [Self <: ListIncomingTypedLinksRequest](x: Self) {
    
    inline def setConsistencyLevel(value: ConsistencyLevel): Self = StObject.set(x, "ConsistencyLevel", value.asInstanceOf[js.Any])
    
    inline def setConsistencyLevelUndefined: Self = StObject.set(x, "ConsistencyLevel", js.undefined)
    
    inline def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
    inline def setFilterAttributeRanges(value: TypedLinkAttributeRangeList): Self = StObject.set(x, "FilterAttributeRanges", value.asInstanceOf[js.Any])
    
    inline def setFilterAttributeRangesUndefined: Self = StObject.set(x, "FilterAttributeRanges", js.undefined)
    
    inline def setFilterAttributeRangesVarargs(value: TypedLinkAttributeRange*): Self = StObject.set(x, "FilterAttributeRanges", js.Array(value*))
    
    inline def setFilterTypedLink(value: TypedLinkSchemaAndFacetName): Self = StObject.set(x, "FilterTypedLink", value.asInstanceOf[js.Any])
    
    inline def setFilterTypedLinkUndefined: Self = StObject.set(x, "FilterTypedLink", js.undefined)
    
    inline def setMaxResults(value: NumberResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setObjectReference(value: ObjectReference): Self = StObject.set(x, "ObjectReference", value.asInstanceOf[js.Any])
  }
}
