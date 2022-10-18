package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListObjectsOutput extends StObject {
  
  /**
    * All of the keys (up to 1,000) rolled up in a common prefix count as a single return when calculating the number of returns.  A response can contain CommonPrefixes only if you specify a delimiter. CommonPrefixes contains all (if there are any) keys between Prefix and the next occurrence of the string specified by the delimiter.  CommonPrefixes lists keys that act like subdirectories in the directory specified by Prefix. For example, if the prefix is notes/ and the delimiter is a slash (/) as in notes/summer/july, the common prefix is notes/summer/. All of the keys that roll up into a common prefix count as a single return when calculating the number of returns.
    */
  var CommonPrefixes: js.UndefOr[CommonPrefixList] = js.undefined
  
  /**
    * Metadata about each object returned.
    */
  var Contents: js.UndefOr[ObjectList] = js.undefined
  
  /**
    * Causes keys that contain the same string between the prefix and the first occurrence of the delimiter to be rolled up into a single result element in the CommonPrefixes collection. These rolled-up keys are not returned elsewhere in the response. Each rolled-up result counts as only one return against the MaxKeys value.
    */
  var Delimiter: js.UndefOr[typings.awsSdk.clientsS3Mod.Delimiter] = js.undefined
  
  /**
    * Encoding type used by Amazon S3 to encode object keys in the response.
    */
  var EncodingType: js.UndefOr[typings.awsSdk.clientsS3Mod.EncodingType] = js.undefined
  
  /**
    * A flag that indicates whether Amazon S3 returned all of the results that satisfied the search criteria.
    */
  var IsTruncated: js.UndefOr[typings.awsSdk.clientsS3Mod.IsTruncated] = js.undefined
  
  /**
    * Indicates where in the bucket listing begins. Marker is included in the response if it was sent with the request.
    */
  var Marker: js.UndefOr[typings.awsSdk.clientsS3Mod.Marker] = js.undefined
  
  /**
    * The maximum number of keys returned in the response body.
    */
  var MaxKeys: js.UndefOr[typings.awsSdk.clientsS3Mod.MaxKeys] = js.undefined
  
  /**
    * The bucket name.
    */
  var Name: js.UndefOr[BucketName] = js.undefined
  
  /**
    * When response is truncated (the IsTruncated element value in the response is true), you can use the key name in this field as marker in the subsequent request to get next set of objects. Amazon S3 lists objects in alphabetical order Note: This element is returned only if you have delimiter request parameter specified. If response does not include the NextMarker and it is truncated, you can use the value of the last Key in the response as the marker in the subsequent request to get the next set of object keys.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.clientsS3Mod.NextMarker] = js.undefined
  
  /**
    * Keys that begin with the indicated prefix.
    */
  var Prefix: js.UndefOr[typings.awsSdk.clientsS3Mod.Prefix] = js.undefined
}
object ListObjectsOutput {
  
  inline def apply(): ListObjectsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListObjectsOutput]
  }
  
  extension [Self <: ListObjectsOutput](x: Self) {
    
    inline def setCommonPrefixes(value: CommonPrefixList): Self = StObject.set(x, "CommonPrefixes", value.asInstanceOf[js.Any])
    
    inline def setCommonPrefixesUndefined: Self = StObject.set(x, "CommonPrefixes", js.undefined)
    
    inline def setCommonPrefixesVarargs(value: CommonPrefix*): Self = StObject.set(x, "CommonPrefixes", js.Array(value*))
    
    inline def setContents(value: ObjectList): Self = StObject.set(x, "Contents", value.asInstanceOf[js.Any])
    
    inline def setContentsUndefined: Self = StObject.set(x, "Contents", js.undefined)
    
    inline def setContentsVarargs(value: Object*): Self = StObject.set(x, "Contents", js.Array(value*))
    
    inline def setDelimiter(value: Delimiter): Self = StObject.set(x, "Delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "Delimiter", js.undefined)
    
    inline def setEncodingType(value: EncodingType): Self = StObject.set(x, "EncodingType", value.asInstanceOf[js.Any])
    
    inline def setEncodingTypeUndefined: Self = StObject.set(x, "EncodingType", js.undefined)
    
    inline def setIsTruncated(value: IsTruncated): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    inline def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxKeys(value: MaxKeys): Self = StObject.set(x, "MaxKeys", value.asInstanceOf[js.Any])
    
    inline def setMaxKeysUndefined: Self = StObject.set(x, "MaxKeys", js.undefined)
    
    inline def setName(value: BucketName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
  }
}
