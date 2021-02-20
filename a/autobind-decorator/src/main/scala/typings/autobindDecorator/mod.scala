package typings.autobindDecorator

import org.scalablytyped.runtime.Shortcut
import typings.std.ClassDecorator
import typings.std.MethodDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("autobind-decorator", JSImport.Default)
  @js.native
  val default: ClassDecorator with MethodDecorator = js.native
  
  @JSImport("autobind-decorator", "boundClass")
  @js.native
  val boundClass: ClassDecorator = js.native
  
  @JSImport("autobind-decorator", "boundMethod")
  @js.native
  val boundMethod: MethodDecorator = js.native
  
  type _To = ClassDecorator with MethodDecorator
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ClassDecorator with MethodDecorator = default
}
