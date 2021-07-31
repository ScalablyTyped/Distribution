package typings.assertionError

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import typings.assertionError.anon.ShowDiff
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("assertion-error", JSImport.Namespace)
  @js.native
  val ^ : js.Object & AssertionErrorConstructor = js.native
  
  type AssertionError[T] = Error & T & ShowDiff
  
  @js.native
  trait AssertionErrorConstructor
    extends StObject
       with Instantiable1[/* message */ String, AssertionError[js.Object]]
       with Instantiable2[/* message */ String, /* props */ js.Object, AssertionError[js.Object]]
       with Instantiable3[
          /* message */ String, 
          (/* props */ js.Object) | (/* props */ Unit), 
          /* ssf */ js.Function, 
          AssertionError[js.Object]
        ]
  
  type _To = js.Object & AssertionErrorConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & AssertionErrorConstructor = ^
}
