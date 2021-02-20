package typings.asyncBusboy

import org.scalablytyped.runtime.Shortcut
import typings.asyncBusboy.anon.Fields
import typings.busboy.busboy.BusboyConfig
import typings.node.NodeJS.ReadableStream
import typings.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("async-busboy", JSImport.Namespace)
  @js.native
  val ^ : AsyncBusboy = js.native
  
  type AsyncBusboy = js.Function2[/* req */ IncomingMessage, /* options */ js.UndefOr[Options], js.Promise[Fields]]
  
  @js.native
  trait Options extends BusboyConfig {
    
    def onFile(fieldname: String, file: ReadableStream, filename: String, encoding: String, mimetype: String): Unit = js.native
  }
  object Options {
    
    @scala.inline
    def apply(onFile: (String, ReadableStream, String, String, String) => Unit): Options = {
      val __obj = js.Dynamic.literal(onFile = js.Any.fromFunction5(onFile))
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnFile(value: (String, ReadableStream, String, String, String) => Unit): Self = StObject.set(x, "onFile", js.Any.fromFunction5(value))
    }
  }
  
  type _To = AsyncBusboy
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: AsyncBusboy = ^
}
