package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * extends a {@link TextFrame} which shares the same {@link Text} with other {@link ChainedTextFrame} instances that will make the text flow through the
  * chained frames. The text flows in the next frame if there is no space left in the current frame.
  */
trait ChainedTextFrame extends TextFrame {
  /**
    * name of the previous frame in the chain
    *
    * An empty string indicates that there is no previous frame.
    */
  var ChainNextName: java.lang.String
  /**
    * name of the next frame in the chain
    *
    * An empty string indicates that there is no next frame.
    */
  var ChainPrevName: java.lang.String
}

