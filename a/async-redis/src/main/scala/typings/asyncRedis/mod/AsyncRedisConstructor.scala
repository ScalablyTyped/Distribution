package typings.asyncRedis.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.redis.mod.ClientOpts
import typings.redis.mod.RedisClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncRedisConstructor
  extends Instantiable0[Promisified[RedisClient]]
     with Instantiable1[
      (/* options */ ClientOpts) | (/* port */ Double) | (/* unix_socket */ String), 
      Promisified[RedisClient]
    ]
     with Instantiable2[
      (/* port */ Double) | (/* unix_socket */ String), 
      (/* options */ ClientOpts) | (/* host */ String), 
      Promisified[RedisClient]
    ]
     with Instantiable3[
      /* port */ Double, 
      js.UndefOr[/* host */ String], 
      /* options */ ClientOpts, 
      Promisified[RedisClient]
    ] {
  
  def createClient(): Promisified[RedisClient] = js.native
  def createClient(options: ClientOpts): Promisified[RedisClient] = js.native
  def createClient(port: Double): Promisified[RedisClient] = js.native
  def createClient(port: Double, host: js.UndefOr[scala.Nothing], options: ClientOpts): Promisified[RedisClient] = js.native
  def createClient(port: Double, host: String): Promisified[RedisClient] = js.native
  def createClient(port: Double, host: String, options: ClientOpts): Promisified[RedisClient] = js.native
  def createClient(unix_socket: String): Promisified[RedisClient] = js.native
  def createClient(unix_socket: String, options: ClientOpts): Promisified[RedisClient] = js.native
  
  def decorate(client: RedisClient): Promisified[RedisClient] = js.native
}
