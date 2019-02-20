package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TypeDescriptionSearchDepth extends js.Object

/**
  * Defines depths for searching through type description collections.
  * @since OOo 1.1.2
  */
@JSGlobal("com.sun.star.reflection.TypeDescriptionSearchDepth")
@js.native
object TypeDescriptionSearchDepth extends js.Object {
  /** Infinite search depth. Search through all children including direct children, grand children, grand children's children, ... */
  @js.native
  sealed trait INFINITE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs.TypeDescriptionSearchDepth
  
  /** Search only through direct children. */
  @js.native
  sealed trait ONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs.TypeDescriptionSearchDepth
  
  /* -1 */ val INFINITE: INFINITE with scala.Double = js.native
  /* 1 */ val ONE: ONE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs.TypeDescriptionSearchDepth with scala.Double
  ] = js.native
}

