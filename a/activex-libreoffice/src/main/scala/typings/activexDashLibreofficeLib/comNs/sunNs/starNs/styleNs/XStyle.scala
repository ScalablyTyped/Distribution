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

