package typings.acl.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AclStatic
  extends Instantiable1[/* backend */ Backend[js.Any], Acl]
     with Instantiable2[/* backend */ Backend[js.Any], /* logger */ Logger, Acl]
     with Instantiable3[
      /* backend */ Backend[js.Any], 
      js.UndefOr[/* logger */ Logger], 
      /* options */ Option, 
      Acl
    ] {
  
  val memoryBackend: MemoryBackendStatic = js.native
  
  val mongodbBackend: MongodbBackendStatic = js.native
  
  val redisBackend: RedisBackendStatic = js.native
}
