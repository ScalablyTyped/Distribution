package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a template for a style (aka style sheet). */
trait XStyle
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed {
  /** @returns the name of the parent style, probably empty. */
  var ParentStyle: java.lang.String
  /** @returns the name of the parent style, probably empty. */
  def getParentStyle(): java.lang.String
  /** @returns `TRUE` if this type is used in the document. */
  def isInUse(): scala.Boolean
  /** identifies a style as defined by the user. */
  def isUserDefined(): scala.Boolean
  /** sets the name of the parent style. */
  def setParentStyle(aParentStyle: java.lang.String): scala.Unit
}

object XStyle {
  @scala.inline
  def apply(
    Name: java.lang.String,
    ParentStyle: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getName: js.Function0[java.lang.String],
    getParentStyle: js.Function0[java.lang.String],
    isInUse: js.Function0[scala.Boolean],
    isUserDefined: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit],
    setParentStyle: js.Function1[java.lang.String, scala.Unit]
  ): XStyle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("ParentStyle")(ParentStyle)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getParentStyle")(getParentStyle)
    __obj.updateDynamic("isInUse")(isInUse)
    __obj.updateDynamic("isUserDefined")(isUserDefined)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setName")(setName)
    __obj.updateDynamic("setParentStyle")(setParentStyle)
    __obj.asInstanceOf[XStyle]
  }
}

