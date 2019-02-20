package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used on client side to access a {@link ContentResultSet} remote optimized.
  *
  * The {@link CachedContentResultSet} will not load every single property or even row just in that moment you ask for it, but load the data for some rows
  * beforehand.
  *
  * Every time when a new package of data is loaded, the so far loaded data will be released, so the cash will not grow and grow and grow.
  */
trait CachedContentResultSet extends ContentResultSet

