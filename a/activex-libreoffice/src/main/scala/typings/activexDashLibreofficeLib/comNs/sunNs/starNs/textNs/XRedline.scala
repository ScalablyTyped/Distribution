package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** enables creation of redlines (change tracking). */
trait XRedline extends js.Object {
  /**
    * @param RedlineType  Valid type names are:    Insert - marks an insertion    Delete - marks an deletion    Format - marks an attribute change    {@link T
    * @param RedlineProperties contains the following parameters [readonly, property] string RedlineAuthor; [readonly, property] {@link com.sun.star.util.Date
    */
  def makeRedline(
    RedlineType: java.lang.String,
    RedlineProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues
  ): scala.Unit
}

