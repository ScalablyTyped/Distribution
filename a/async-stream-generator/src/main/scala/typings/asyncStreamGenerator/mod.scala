package typings.asyncStreamGenerator

import typings.node.streamMod.Readable
import typings.std.AsyncIterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(generator: AsyncIterableIterator[Any]): Readable = ^.asInstanceOf[js.Dynamic].apply(generator.asInstanceOf[js.Any]).asInstanceOf[Readable]
  
  @JSImport("async-stream-generator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
