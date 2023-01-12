package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDisksResult extends StObject {
  
  /**
    * An array of objects containing information about all block storage disks.
    */
  var disks: js.UndefOr[DiskList] = js.undefined
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetDisks request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GetDisksResult {
  
  inline def apply(): GetDisksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDisksResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDisksResult] (val x: Self) extends AnyVal {
    
    inline def setDisks(value: DiskList): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    inline def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
    
    inline def setDisksVarargs(value: Disk*): Self = StObject.set(x, "disks", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
