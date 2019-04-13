package typings
package aclLib.aclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AclStatic
  extends org.scalablytyped.runtime.Instantiable1[/* backend */ Backend[js.Any], Acl]
     with org.scalablytyped.runtime.Instantiable2[/* backend */ Backend[js.Any], /* logger */ Logger, Acl]
     with org.scalablytyped.runtime.Instantiable3[/* backend */ Backend[js.Any], /* logger */ Logger, /* options */ Option, Acl] {
  val memoryBackend: MemoryBackendStatic = js.native
  val mongodbBackend: MongodbBackendStatic = js.native
  val redisBackend: RedisBackendStatic = js.native
}

