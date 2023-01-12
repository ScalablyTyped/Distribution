package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArchiveS3Settings extends StObject {
  
  /**
    * Specify the canned ACL to apply to each S3 request. Defaults to none.
    */
  var CannedAcl: js.UndefOr[S3CannedAcl] = js.undefined
}
object ArchiveS3Settings {
  
  inline def apply(): ArchiveS3Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArchiveS3Settings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArchiveS3Settings] (val x: Self) extends AnyVal {
    
    inline def setCannedAcl(value: S3CannedAcl): Self = StObject.set(x, "CannedAcl", value.asInstanceOf[js.Any])
    
    inline def setCannedAclUndefined: Self = StObject.set(x, "CannedAcl", js.undefined)
  }
}
