package typings
package aclLib.aclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AclStaticNs {
  type MemoryBackend = Backend[js.Array[aclLib.Action]]
  // for mongodb backend
  type MongodbBackend = Backend[aclLib.Callback]
  // for redis backend
  type RedisBackend = Backend[redisLib.redisMod.RedisClient]
}
