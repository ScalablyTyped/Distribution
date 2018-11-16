package typings
package aclLib.aclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedisBackendStatic
  extends ScalablyTyped.runtime.Instantiable2[
      /* redis */ redisLib.redisMod.RedisClient, 
      /* prefix */ java.lang.String, 
      RedisBackend
    ]
     with ScalablyTyped.runtime.Instantiable1[/* redis */ redisLib.redisMod.RedisClient, RedisBackend]

