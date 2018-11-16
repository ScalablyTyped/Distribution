package typings
package aclLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object aclMod {
  type MemoryBackend = Backend[js.Array[aclLib.Action]]
  type MongodbBackend = Backend[aclLib.Callback]
  type RedisBackend = Backend[redisLib.redisMod.RedisClient]
}
