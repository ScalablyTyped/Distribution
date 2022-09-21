package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AclConfiguration extends StObject {
  
  /**
    * The Amazon S3 canned ACL that Athena should specify when storing query results. Currently the only supported canned ACL is BUCKET_OWNER_FULL_CONTROL. If a query runs in a workgroup and the workgroup overrides client-side settings, then the Amazon S3 canned ACL specified in the workgroup's settings is used for all queries that run in the workgroup. For more information about Amazon S3 canned ACLs, see Canned ACL in the Amazon S3 User Guide.
    */
  var S3AclOption: typings.awsSdk.athenaMod.S3AclOption
}
object AclConfiguration {
  
  inline def apply(S3AclOption: S3AclOption): AclConfiguration = {
    val __obj = js.Dynamic.literal(S3AclOption = S3AclOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[AclConfiguration]
  }
  
  extension [Self <: AclConfiguration](x: Self) {
    
    inline def setS3AclOption(value: S3AclOption): Self = StObject.set(x, "S3AclOption", value.asInstanceOf[js.Any])
  }
}
