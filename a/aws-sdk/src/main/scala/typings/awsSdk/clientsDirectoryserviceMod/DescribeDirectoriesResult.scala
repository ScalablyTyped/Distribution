package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDirectoriesResult extends StObject {
  
  /**
    * The list of DirectoryDescription objects that were retrieved. It is possible that this list contains less than the number of items specified in the Limit member of the request. This occurs if there are less than the requested number of items left to retrieve, or if the limitations of the operation have been exceeded.
    */
  var DirectoryDescriptions: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.DirectoryDescriptions] = js.undefined
  
  /**
    * If not null, more results are available. Pass this value for the NextToken parameter in a subsequent call to DescribeDirectories to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.NextToken] = js.undefined
}
object DescribeDirectoriesResult {
  
  inline def apply(): DescribeDirectoriesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDirectoriesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDirectoriesResult] (val x: Self) extends AnyVal {
    
    inline def setDirectoryDescriptions(value: DirectoryDescriptions): Self = StObject.set(x, "DirectoryDescriptions", value.asInstanceOf[js.Any])
    
    inline def setDirectoryDescriptionsUndefined: Self = StObject.set(x, "DirectoryDescriptions", js.undefined)
    
    inline def setDirectoryDescriptionsVarargs(value: DirectoryDescription*): Self = StObject.set(x, "DirectoryDescriptions", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
