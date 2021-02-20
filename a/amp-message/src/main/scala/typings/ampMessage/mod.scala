package typings.ampMessage

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("amp-message", JSImport.Namespace)
  @js.native
  class ^ protected () extends Message {
    def this(args: js.Array[Buffer]) = this()
    def this(args: Buffer) = this()
  }
  
  @js.native
  trait Message extends StObject {
    
    def inspect(): String = js.native
    
    def pop(): js.UndefOr[Buffer] = js.native
    
    def push(items: Buffer*): Double = js.native
    
    def shift(): js.UndefOr[Buffer] = js.native
    
    def toBuffer(): Buffer = js.native
    
    def unshift(items: Buffer*): Double = js.native
  }
  object Message {
    
    @scala.inline
    def apply(
      inspect: () => String,
      pop: () => js.UndefOr[Buffer],
      push: /* repeated */ Buffer => Double,
      shift: () => js.UndefOr[Buffer],
      toBuffer: () => Buffer,
      unshift: /* repeated */ Buffer => Double
    ): Message = {
      val __obj = js.Dynamic.literal(inspect = js.Any.fromFunction0(inspect), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), shift = js.Any.fromFunction0(shift), toBuffer = js.Any.fromFunction0(toBuffer), unshift = js.Any.fromFunction1(unshift))
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInspect(value: () => String): Self = StObject.set(x, "inspect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPop(value: () => js.UndefOr[Buffer]): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPush(value: /* repeated */ Buffer => Double): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShift(value: () => js.UndefOr[Buffer]): Self = StObject.set(x, "shift", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToBuffer(value: () => Buffer): Self = StObject.set(x, "toBuffer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnshift(value: /* repeated */ Buffer => Double): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
    }
  }
}
