package typings
package adoneLib.glossesStdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "string_decoder")
@js.native
object stringUnderscoreDecoderNs extends js.Object {
  @js.native
  class StringDecoder ()
    extends nodeLib.stringUnderscoreDecoderMod.StringDecoder {
    def this(encoding: java.lang.String) = this()
  }
  
  @js.native
  class StringDecoderCls ()
    extends nodeLib.stringUnderscoreDecoderMod.NodeStringDecoder {
    def this(encoding: java.lang.String) = this()
  }
  
  @js.native
  object StringDecoder
    extends org.scalablytyped.runtime.Instantiable0[nodeLib.stringUnderscoreDecoderMod.NodeStringDecoder]
       with org.scalablytyped.runtime.Instantiable1[
          /* encoding */ java.lang.String, 
          nodeLib.stringUnderscoreDecoderMod.NodeStringDecoder
        ]
  
}

