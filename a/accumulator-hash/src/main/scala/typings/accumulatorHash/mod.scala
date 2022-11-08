package typings.accumulatorHash

import typings.node.bufferMod.global.Buffer
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Hash and xor to generate unique byte strings.
    *
    * @example
    * import State = require('accumulator-hash')
    *
    * const input = Buffer.from('hello, world!')
    * const state = new State()
    *
    * const a = state.hash(input)
    * const b = state.hash(input)
    * const c = state.hash(input)
    *
    * // a !== b !== c
    */
  @JSImport("accumulator-hash", JSImport.Namespace)
  @js.native
  /**
    * Instantiate a new state.
    *
    * @param init Can be supplied to initialise the state buffer. If it is not supplied, a random `init`
    * buffer is generated.
    */
  open class ^ ()
    extends StObject
       with RollingHash {
    def this(init: ArrayLike[Double]) = this()
  }
  
  /**
    * Hash and xor to generate unique byte strings.
    *
    * @example
    * import State = require('accumulator-hash')
    *
    * const input = Buffer.from('hello, world!')
    * const state = new State()
    *
    * const a = state.hash(input)
    * const b = state.hash(input)
    * const c = state.hash(input)
    *
    * // a !== b !== c
    */
  @js.native
  trait RollingHash extends StObject {
    
    def hash(data: js.typedarray.Uint8Array): Buffer | js.typedarray.Uint8Array = js.native
    /**
      * Hash some data.
      */
    def hash(data: Buffer): Buffer | js.typedarray.Uint8Array = js.native
  }
}
