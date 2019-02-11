package typings
package aclLib.aclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AclStatic
  extends org.scalablytyped.runtime.Instantiable1[
      /* backend */ aclLib.aclMod.AclStaticNs.Backend[js.Any], 
      aclLib.aclMod.AclStaticNs.Acl
    ]
     with org.scalablytyped.runtime.Instantiable2[
      /* backend */ aclLib.aclMod.AclStaticNs.Backend[js.Any], 
      /* logger */ aclLib.aclMod.AclStaticNs.Logger, 
      aclLib.aclMod.AclStaticNs.Acl
    ]
     with org.scalablytyped.runtime.Instantiable3[
      /* backend */ aclLib.aclMod.AclStaticNs.Backend[js.Any], 
      /* logger */ aclLib.aclMod.AclStaticNs.Logger, 
      /* options */ aclLib.aclMod.AclStaticNs.Option, 
      aclLib.aclMod.AclStaticNs.Acl
    ] {
  val memoryBackend: aclLib.aclMod.AclStaticNs.MemoryBackendStatic = js.native
  val mongodbBackend: aclLib.aclMod.AclStaticNs.MongodbBackendStatic = js.native
  val redisBackend: aclLib.aclMod.AclStaticNs.RedisBackendStatic = js.native
}

