package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBackupsResponse extends StObject {
  
  /**
    * An array of backups.
    */
  var Backups: js.UndefOr[typings.awsSdk.clientsFsxMod.Backups] = js.undefined
  
  /**
    * A NextToken value is present if there are more backups than returned in the response. You can use the NextToken value in the subsequent request to fetch the backups. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsFsxMod.NextToken] = js.undefined
}
object DescribeBackupsResponse {
  
  inline def apply(): DescribeBackupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBackupsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeBackupsResponse] (val x: Self) extends AnyVal {
    
    inline def setBackups(value: Backups): Self = StObject.set(x, "Backups", value.asInstanceOf[js.Any])
    
    inline def setBackupsUndefined: Self = StObject.set(x, "Backups", js.undefined)
    
    inline def setBackupsVarargs(value: Backup*): Self = StObject.set(x, "Backups", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
