package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSettingsResult extends StObject {
  
  /**
    * The identifier of the directory.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.DirectoryId] = js.undefined
  
  /**
    * If not null, token that indicates that more results are available. Pass this value for the NextToken parameter in a subsequent call to DescribeSettings to retrieve the next set of items. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.NextToken] = js.undefined
  
  /**
    * The list of SettingEntry objects that were retrieved. It is possible that this list contains less than the number of items specified in the Limit member of the request. This occurs if there are less than the requested number of items left to retrieve, or if the limitations of the operation have been exceeded.
    */
  var SettingEntries: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.SettingEntries] = js.undefined
}
object DescribeSettingsResult {
  
  inline def apply(): DescribeSettingsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSettingsResult]
  }
  
  extension [Self <: DescribeSettingsResult](x: Self) {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSettingEntries(value: SettingEntries): Self = StObject.set(x, "SettingEntries", value.asInstanceOf[js.Any])
    
    inline def setSettingEntriesUndefined: Self = StObject.set(x, "SettingEntries", js.undefined)
    
    inline def setSettingEntriesVarargs(value: SettingEntry*): Self = StObject.set(x, "SettingEntries", js.Array(value*))
  }
}
