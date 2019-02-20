package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContentCreationError extends js.Object

/** Codes for content creation errors. */
@JSGlobal("com.sun.star.ucb.ContentCreationError")
@js.native
object ContentCreationError extends js.Object {
  /** Provider was unable to create the content instance. */
  @js.native
  sealed trait CONTENT_CREATION_FAILED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentCreationError
  
  /** Creation of content identifier failed. */
  @js.native
  sealed trait IDENTIFIER_CREATION_FAILED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentCreationError
  
  /** @deprecated Deprecated */
  @js.native
  sealed trait NO_CONTENT_BROKER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentCreationError
  
  /** No {@link Content} Provider for given content identifier available. */
  @js.native
  sealed trait NO_CONTENT_PROVIDER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentCreationError
  
  /** @deprecated Deprecated */
  @js.native
  sealed trait NO_IDENTIFIER_FACTORY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentCreationError
  
  /**
    * Unknown.
    *
    * An unknown I/O error has occurred.
    */
  @js.native
  sealed trait UNKNOWN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentCreationError
  
  /* 5 */ val CONTENT_CREATION_FAILED: CONTENT_CREATION_FAILED with scala.Double = js.native
  /* 3 */ val IDENTIFIER_CREATION_FAILED: IDENTIFIER_CREATION_FAILED with scala.Double = js.native
  /* 1 */ val NO_CONTENT_BROKER: NO_CONTENT_BROKER with scala.Double = js.native
  /* 4 */ val NO_CONTENT_PROVIDER: NO_CONTENT_PROVIDER with scala.Double = js.native
  /* 2 */ val NO_IDENTIFIER_FACTORY: NO_IDENTIFIER_FACTORY with scala.Double = js.native
  /* 0 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentCreationError with scala.Double
  ] = js.native
}

