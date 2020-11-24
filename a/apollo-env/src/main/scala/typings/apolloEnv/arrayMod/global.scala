package typings.apolloEnv.arrayMod

import typings.apolloEnv.apolloEnvNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  trait Array[T] extends js.Object {
    
    def flat[U](): Array[U] = js.native
    @JSName("flat")
    def flat_1[U](depth: `1`): Array[U] = js.native
  }
}
