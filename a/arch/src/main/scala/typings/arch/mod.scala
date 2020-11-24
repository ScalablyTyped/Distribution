package typings.arch

import typings.arch.archStrings.x64
import typings.arch.archStrings.x86
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("arch", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(): x64 | x86 = js.native
}
