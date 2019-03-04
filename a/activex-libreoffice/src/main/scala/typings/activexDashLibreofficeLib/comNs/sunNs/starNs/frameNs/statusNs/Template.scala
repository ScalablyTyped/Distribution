package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.statusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains an association between a style name and a value.
  * @since OOo 2.0
  */
trait Template extends js.Object {
  /** specifies a style name. */
  var StyleName: java.lang.String
  /** specifies a value that is bound to the style name. */
  var Value: scala.Double
}

object Template {
  @scala.inline
  def apply(StyleName: java.lang.String, Value: scala.Double): Template = {
    val __obj = js.Dynamic.literal(StyleName = StyleName, Value = Value)
  
    __obj.asInstanceOf[Template]
  }
}

