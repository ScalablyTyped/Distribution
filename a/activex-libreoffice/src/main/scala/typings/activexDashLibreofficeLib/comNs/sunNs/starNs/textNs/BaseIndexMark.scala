package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is a {@link TextRange} which is explicitly marked as an index entry. This is the base service of index marks for {@link DocumentIndex} , {@link
  * ContentIndex} , and {@link UserIndex} .
  */
trait BaseIndexMark extends TextContent {
  /**
    * the string that will be inserted into the corresponding index. If AlternativeText is empty then the string that is marked by the {@link TextRange} is
    * inserted into the index.
    */
  var AlternativeText: java.lang.String
}

