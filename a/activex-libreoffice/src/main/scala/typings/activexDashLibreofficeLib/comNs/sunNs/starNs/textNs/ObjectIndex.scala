package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of object indexes within a document.
  * @see com.sun.star.text.BaseIndex
  */
trait ObjectIndex extends BaseIndex {
  /** Determines if external embedded objects are included in the office. */
  var CreateFromOtherEmbeddedObjects: scala.Boolean
  /** Determines if star office calc objects are included in the office. */
  var CreateFromStarCalc: scala.Boolean
  /** Determines if star office chart objects are included in the office. */
  var CreateFromStarChart: scala.Boolean
  /** Determines if star office draw objects are included in the office. */
  var CreateFromStarDraw: scala.Boolean
  /** Determines if star office image objects are included in the office. */
  var CreateFromStarImage: scala.Boolean
  /** Determines if star office math objects are included in the office. */
  var CreateFromStarMath: scala.Boolean
}

