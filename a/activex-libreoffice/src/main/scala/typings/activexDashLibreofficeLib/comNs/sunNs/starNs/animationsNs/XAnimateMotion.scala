package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for animation by defining motion on a path.
  * @see http://www.w3.org/TR/smil20/animation.html#edef-animateMotion
  */
trait XAnimateMotion extends XAnimate {
  /** Specifies the origin of motion for the animation. The values and semantics of this attribute are dependent upon the used animation engine. */
  var Origin: js.Any
  /**
    * Specifies an optional path. ;  If a path is used, the {@link From} , {@link To} and {@link By} members are ignored. The value type of the path depends
    * on the used rendering system. Possible types maybe a svg:d path encoded in a string.
    */
  var Path: js.Any
}

