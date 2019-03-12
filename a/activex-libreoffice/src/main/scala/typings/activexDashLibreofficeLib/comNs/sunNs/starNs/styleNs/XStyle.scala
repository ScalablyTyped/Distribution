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
    acquire: () => scala.Unit,
    getName: () => java.lang.String,
    getParentStyle: () => java.lang.String,
    isInUse: () => scala.Boolean,
    isUserDefined: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setName: java.lang.String => scala.Unit,
    setParentStyle: java.lang.String => scala.Unit
  ): XStyle = {
    val __obj = js.Dynamic.literal(Name = Name, ParentStyle = ParentStyle, acquire = js.Any.fromFunction0(acquire), getName = js.Any.fromFunction0(getName), getParentStyle = js.Any.fromFunction0(getParentStyle), isInUse = js.Any.fromFunction0(isInUse), isUserDefined = js.Any.fromFunction0(isUserDefined), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setName = js.Any.fromFunction1(setName), setParentStyle = js.Any.fromFunction1(setParentStyle))
  
    __obj.asInstanceOf[XStyle]
  }
}

