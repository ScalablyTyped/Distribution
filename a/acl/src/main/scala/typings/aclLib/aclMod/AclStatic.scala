package typings
package aclLib.aclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AclStatic
  extends ScalablyTyped.runtime.Instantiable3[/* backend */ Backend[js.Any], /* logger */ Logger, /* options */ Option, Acl]
     with ScalablyTyped.runtime.Instantiable2[/* backend */ Backend[js.Any], /* logger */ Logger, Acl]
     with ScalablyTyped.runtime.Instantiable1[/* backend */ Backend[js.Any], Acl] {
  var memoryBackend: MemoryBackendStatic = js.native
  var mongodbBackend: MongodbBackendStatic = js.native
  var redisBackend: RedisBackendStatic = js.native
}

