package typings.autobindDecorator

import typings.std.ClassDecorator
import typings.std.MethodDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("autobind-decorator", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val boundClass: ClassDecorator = js.native
  
  val boundMethod: MethodDecorator = js.native
  
  val default: ClassDecorator with MethodDecorator = js.native
}
