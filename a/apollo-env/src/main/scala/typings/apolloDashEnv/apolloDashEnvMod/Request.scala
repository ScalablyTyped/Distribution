package typings.apolloDashEnv.apolloDashEnvMod

import typings.apolloDashEnv.libFetchFetchMod.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env", "Request")
@js.native
class Request protected ()
  extends typings.apolloDashEnv.libFetchMod.Request {
  def this(input: String) = this()
  def this(input: typings.apolloDashEnv.libFetchFetchMod.Request) = this()
  def this(input: String, init: RequestInit) = this()
  def this(input: typings.apolloDashEnv.libFetchFetchMod.Request, init: RequestInit) = this()
}

