package typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNamed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a template for a style (aka style sheet). */
trait XStyle extends XNamed {
  /** @returns the name of the parent style, probably empty. */
  var ParentStyle: String
  /** @returns the name of the parent style, probably empty. */
  def getParentStyle(): String
  /** @returns `TRUE` if this type is used in the document. */
  def isInUse(): Boolean
  /** identifies a style as defined by the user. */
  def isUserDefined(): Boolean
  /** sets the name of the parent style. */
  def setParentStyle(aParentStyle: String): Unit
}

object XStyle {
  @scala.inline
  def apply(
    Name: String,
    ParentStyle: String,
    acquire: () => Unit,
    getName: () => String,
    getParentStyle: () => String,
    isInUse: () => Boolean,
    isUserDefined: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setName: String => Unit,
    setParentStyle: String => Unit
  ): XStyle = {
    val __obj = js.Dynamic.literal(Name = Name, ParentStyle = ParentStyle, acquire = js.Any.fromFunction0(acquire), getName = js.Any.fromFunction0(getName), getParentStyle = js.Any.fromFunction0(getParentStyle), isInUse = js.Any.fromFunction0(isInUse), isUserDefined = js.Any.fromFunction0(isUserDefined), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setName = js.Any.fromFunction1(setName), setParentStyle = js.Any.fromFunction1(setParentStyle))
  
    __obj.asInstanceOf[XStyle]
  }
}

