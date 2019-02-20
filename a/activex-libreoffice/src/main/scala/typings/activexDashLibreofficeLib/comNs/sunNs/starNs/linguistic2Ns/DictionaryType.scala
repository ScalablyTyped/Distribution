package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DictionaryType extends js.Object

/**
  * describes the type of a personal dictionary.
  *
  * This defines the type of a dictionary. It may be positive or negative. A positive dictionary may hold only positive entries (words defined to be
  * correct for spell checking) and a negative one only negative entries (words defined to be reported as incorrect by the spell checker).
  * @see com.sun.star.linguistic2.XDictionary
  * @see com.sun.star.linguistic2.XDictionaryEntry
  */
@JSGlobal("com.sun.star.linguistic2.DictionaryType")
@js.native
object DictionaryType extends js.Object {
  /** @deprecated Deprecated */
  @js.native
  sealed trait MIXED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.DictionaryType
  
  /** all entries in the dictionary are negative. */
  @js.native
  sealed trait NEGATIVE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.DictionaryType
  
  /** all entries in the dictionary are positive. */
  @js.native
  sealed trait POSITIVE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.DictionaryType
  
  /* 2 */ val MIXED: MIXED with scala.Double = js.native
  /* 1 */ val NEGATIVE: NEGATIVE with scala.Double = js.native
  /* 0 */ val POSITIVE: POSITIVE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.DictionaryType with scala.Double
  ] = js.native
}

